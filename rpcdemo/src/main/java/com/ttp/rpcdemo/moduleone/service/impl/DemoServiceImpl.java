package com.ttp.rpcdemo.moduleone.service.impl;

import com.ttp.rpcdemo.moduleone.dao.DemoDAO;
import com.ttp.rpcdemo.moduleone.pojo.po.DemoPO;
import com.ttp.rpcdemo.moduleone.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: service层实现类示例
 * @Author: quanrui.li
 * @Date: 2019/9/2
 */
@Service
public class DemoServiceImpl implements DemoService {

    /**
     * demoDAO层
     */
    @Autowired
    private DemoDAO demoDAO;

    @Override
    public List<DemoPO> getDemoPOS(DemoPO demoPO) {
        return demoDAO.getDemoPOS(demoPO);
    }
}
