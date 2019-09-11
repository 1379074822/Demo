package com.ttp.commondemo.annotation;

import com.alibaba.fastjson.JSON;
import com.lucky.base.common.RemoteResultException;
import com.lucky.base.common.Result;
import com.ttp.commondemo.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;

/**
 * @Description: remoteAOP（应该在公共common中）
 * @Author: quanrui.li
 * @Date: 2019/9/2
 */
@Aspect
@Component
@Slf4j
public class UServiceMethodAspect {

    @Pointcut("@annotation(com.ttp.commondemo.annotation.UServiceMethod)")
    public void methodPointcut() {
    }

    /**
     * 拦截所有标记为RemoteResult的方法，统一处理异常返回
     * @param point
     * @return
     * @throws Throwable
     */
    @Around(value = "methodPointcut()")
    public Object methodPointcut(ProceedingJoinPoint point) throws Throwable {
        Object result = new Object();

        try {
            result = point.proceed(point.getArgs());
            return result;
        } catch (Throwable e) {
            Throwable cause = e.getCause();

            if (cause == null) {
                cause = e;
            }
            if (cause instanceof InvocationTargetException) {
                cause = ((InvocationTargetException) cause).getTargetException();
            }

            if (cause instanceof RemoteResultException) {
                log.error("远程调用{}失败,我是中间人,入参:{},错误信息:{}",
                        point.getSignature().getName(), JSON.toJSONString(point.getArgs()), cause.getMessage());
                result = Result.fail(Result.STATUS_400, cause.getMessage());
            } else if (cause instanceof BizException) {
                log.error("远程调用{}失败,入参:{},错误信息:{}",
                        point.getSignature().getName(), JSON.toJSONString(point.getArgs()), cause.getMessage());
                result = Result.fail(Result.STATUS_400, cause.getMessage());
            } else {
                log.error("远程调用{}失败,入参:{},错误信息:{}",
                        point.getSignature(), JSON.toJSONString(point.getArgs()), cause.getMessage(), cause);
                result = Result.fail(Result.STATUS_500, "系统异常");
            }
            return result;
        } finally {
            try {
                log.info("【REMOTE CALL,remote:{}】arguments:{},result:{}",
                        point.getSignature(), JSON.toJSONString(point.getArgs()), JSON.toJSONString(result));
            } catch (Throwable e) {
                log.error("print result exception.", e);
            }
        }
    }
}
