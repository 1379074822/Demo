package com.ttp.rpcdemo.moduleone.service;


import com.ttp.rpcdemo.moduleone.pojo.po.DemoPO;

import java.util.List;

/**
 * @Description: service层接口示例
 * @Author: quanrui.li
 * @Date: 2019/9/2
 */
public interface DemoService {

    /**
     * 获取po列表
     * @param demoPO
     * @return
     */
    List<DemoPO> getDemoPOS(DemoPO demoPO);
}
