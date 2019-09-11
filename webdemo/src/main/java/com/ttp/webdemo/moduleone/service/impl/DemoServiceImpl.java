package com.ttp.webdemo.moduleone.service.impl;

import com.ttp.basedemo.moduleone.dto.DemoDTO;
import com.ttp.basedemo.moduleone.remote.DemoRemoteService;
import com.ttp.basedemo.moduleone.remote.client.DemoteRemoteClient;
import com.ttp.webdemo.moduleone.dao.DemoDAO;
import com.ttp.webdemo.moduleone.pojo.po.DemoPO;
import com.ttp.webdemo.moduleone.service.DemoService;
import com.ucarinc.framework.dubbo.config.annotation.UReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: demo service接口实现类
 * @Author: quanrui.li
 * @Date: 2019/9/3
 */
@Service
public class DemoServiceImpl implements DemoService {

//    @UReference(url="dubbo://10.112.17.20:20880?group=dubbo&version=1.0.0")
    @UReference(timeout = 60000)
    DemoRemoteService demoRemoteService;

    @Autowired
    DemoDAO demoDAO;

    @Override
    public List<DemoDTO> getDemoDTO(DemoDTO demoDTO) {
        return DemoteRemoteClient.getDemoDTO(demoRemoteService, demoDTO);
    }

    @Override
    public List<DemoPO> getDemoPOS(DemoPO demoPO) {
        return demoDAO.getDemoPOS(demoPO);
    }
}
