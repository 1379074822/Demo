package com.ttp.commondemo.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 业务异常（应当在common系统中，先放在这里）
 * @Author: quanrui.li
 * @Date: 2019/9/2
 */
@Getter
@Setter
public class BizException extends RuntimeException {

    /**
     * 错误信息
     */
    private String message;

    public BizException(String message) {
        this.message = message;
    }


}
