package com.ttp.webdemo;

import com.ucarinc.framework.boot.UcarincApplication;
import com.ucarinc.framework.boot.autoconfigure.UcarincBootApplication;

/**
 * jar包形式的启动类，需要添加UcarincBootApplication注解（springboot会从该类所在的路径进行扫描），
 * springboot项目的启动配置类
 * @author liuxw
 * @date 2019/3/6
 * @since 1.0
 */
@UcarincBootApplication
public class WebDemoApplication {

    public static void main(String[] args){

        //jar包形式的启动类，是以main为入口的
        UcarincApplication.run(WebDemoApplication.class,args);
    }

}
