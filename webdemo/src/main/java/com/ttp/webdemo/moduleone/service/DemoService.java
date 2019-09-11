package com.ttp.webdemo.moduleone.service;

import com.ttp.basedemo.moduleone.dto.DemoDTO;
import com.ttp.webdemo.moduleone.pojo.po.DemoPO;

import java.util.List;

/**
 * @Description: demo service接口
 * @Author: quanrui.li
 * @Date: 2019/9/3
 */
public interface DemoService {

    /**
     * 获取demoDTO
     * @param demoDTO
     * @return
     */
    List<DemoDTO> getDemoDTO(DemoDTO demoDTO);

    /**
     * 获取po列表
     * @param demoPO
     * @return
     */
    List<DemoPO> getDemoPOS(DemoPO demoPO);
}
