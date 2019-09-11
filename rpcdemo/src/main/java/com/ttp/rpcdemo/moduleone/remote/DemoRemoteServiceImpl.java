package com.ttp.rpcdemo.moduleone.remote;

import com.lucky.base.common.Result;
import com.ttp.basedemo.moduleone.dto.DemoDTO;
import com.ttp.basedemo.moduleone.remote.DemoRemoteService;
import com.ttp.commondemo.annotation.UServiceMethod;
import com.ttp.commondemo.exception.BizException;
import com.ttp.rpcdemo.moduleone.dao.DemoDAO;
import com.ttp.rpcdemo.moduleone.pojo.po.DemoPO;
import com.ttp.rpcdemo.moduleone.service.DemoService;
import com.ucarinc.framework.dubbo.config.annotation.UService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: rpc接口实现示例
 * @Author: quanrui.li
 * @Date: 2019/9/2
 */
@UService(timeout = 60000)
public class DemoRemoteServiceImpl implements DemoRemoteService {

    /**
     * demo逻辑层
     */
    @Autowired
    private DemoService demoService;

    @Override
    @UServiceMethod
    public Result<List<DemoDTO>> getDemoDTO(DemoDTO demoDTO) {
        if (demoDTO.getId() == null) {
            throw new BizException("id不能为空！");
        }
        DemoPO demoPO = new DemoPO();
        demoPO.setId(demoDTO.getId());
        return Result.success(pos2dtos(demoService.getDemoPOS(demoPO)));
    }

    private List<DemoDTO> pos2dtos(List<DemoPO> demoPOS) {
        List<DemoDTO> demoDTOS = new ArrayList<>();
        for (DemoPO demoPO : demoPOS) {
            DemoDTO demoDTO = new DemoDTO();
            demoDTO.setId(demoPO.getId());
            demoDTO.setName(demoPO.getName());
            demoDTO.setStatus(demoPO.getStatus());
            demoDTOS.add(demoDTO);
        }
        return demoDTOS;
    }
}
