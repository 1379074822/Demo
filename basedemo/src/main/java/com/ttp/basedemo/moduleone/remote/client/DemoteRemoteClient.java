package com.ttp.basedemo.moduleone.remote.client;

import com.lucky.base.common.RemoteResultException;
import com.lucky.base.common.Result;
import com.ttp.basedemo.moduleone.dto.DemoDTO;
import com.ttp.basedemo.moduleone.remote.DemoRemoteService;

import java.util.List;

/**
 * @Description: rpc调用客户端
 * @Author: quanrui.li
 * @Date: 2019/9/2
 */
public class DemoteRemoteClient {

    /**
     * 获取demoDTO rpc客户端
     * @param demoRemoteService
     * @param demoDTO
     * @return
     */
    public static List<DemoDTO> getDemoDTO(DemoRemoteService demoRemoteService, DemoDTO demoDTO) {
        Result<List<DemoDTO>> result = demoRemoteService.getDemoDTO(demoDTO);
        if (result.getStatus() == Result.STATUS_SUCCESS) {
            return result.getRe();
        }
        throw new RemoteResultException(result.getMsg());
    }

}
