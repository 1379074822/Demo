package com.ttp.webdemo.moduleone.controller;

import com.ttp.basedemo.moduleone.dto.DemoDTO;
import com.ttp.webdemo.moduleone.pojo.po.DemoPO;
import com.ttp.webdemo.moduleone.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: demo 业务controller
 * @Author: quanrui.li
 * @Date: 2019/9/3
 */
@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {

    /**
     * demo逻辑层
     */
    @Autowired
    DemoService demoService;

    /**
     * controller示例，这里需要配合全局异常捕获（目前没写）
     * @param demoDTO
     * @return
     */
    @RequestMapping("/getDemoDTO.do_")
    public List<DemoDTO> getDemoDTO(DemoDTO demoDTO) {
        try {
            return demoService.getDemoDTO(demoDTO);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return null;
    }

    @RequestMapping("/getDemoPO.do_")
    public List<DemoPO> getDemoPO(DemoPO demoPO) {
        return demoService.getDemoPOS(demoPO);
    }
}
