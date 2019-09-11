package com.ttp.webdemo.moduleone.controller;

import com.ttp.webdemo.moduleone.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: demo 页面controller
 * @Author: quanrui.li
 * @Date: 2019/9/3
 */
@Controller
@RequestMapping("/demoIndex")
public class DemoIndexController {

    @Autowired
    private DemoService demoService;

    /**
     * 跳转页面方法
     * @return
     */
    @RequestMapping("/demoView")
    public String demoView() {
        return "demoView";
    }
}
