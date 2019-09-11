package com.ttp.rpcdemo.moduleone.dao;

import com.ttp.rpcdemo.moduleone.pojo.po.DemoPO;

import java.util.List;

/**
 * @Description: dao层接口示例   xml文件需要以_sql.xml结尾，否则扫包扫描不到
 * @Author: quanrui.li
 * @Date: 2019/9/2
 */
public interface DemoDAO {

    /**
     * 获取po列表
     * @param demoPO
     * @return
     */
    List<DemoPO> getDemoPOS(DemoPO demoPO);

    /**
     * 新增demopo
     * @param demoPO
     * @return
     */
    Integer addDemoPO(DemoPO demoPO);

    /**
     * 更新demopo
     * @param demoPO
     * @return
     */
    Integer updateDemoPO(DemoPO demoPO);

    /**
     * 批量新增demopo
     * @param demoPOS
     * @return
     */
    Integer addDemoPOS(List<DemoPO> demoPOS);

    /**
     * 批量修改demopo
     * @param demoPOS
     * @return
     */
    Integer updateDemoPOS(List<DemoPO> demoPOS);
}
