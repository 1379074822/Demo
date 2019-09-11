package com.ttp.basedemo.moduleone.remote;

import com.lucky.base.common.Result;
import com.ttp.basedemo.moduleone.dto.DemoDTO;

import java.util.List;

/**
 * @Description: rpc接口示例
 * @Author: quanrui.li
 * @Date: 2019/9/2
 */
public interface DemoRemoteService {

    /**
     * 获取demoDTO rpc
     * @param demoDTO
     * @return
     */
    Result<List<DemoDTO>> getDemoDTO(DemoDTO demoDTO);
}
