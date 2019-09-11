package com.ttp.rpcdemo.moduleone.dao.impl;

import com.ttp.rpcdemo.moduleone.dao.DemoDAO;
import com.ttp.rpcdemo.moduleone.pojo.po.DemoPO;
import com.ucarinc.framework.autoconfigure.ubatis.dao.BaseUbatisDaoImpl;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: dao层实现类示例
 * @Author: quanrui.li
 * @Date: 2019/9/2
 */
@Repository
public class DemoDAOImpl extends BaseUbatisDaoImpl implements DemoDAO {

    /**
     * 与xml中的namespace对应
     */
    private static final String SQL_PREFIX = "demo." ;

    @Override
    public List<DemoPO> getDemoPOS(DemoPO demoPO) {
        return this.queryForList(SQL_PREFIX + "getDemoPOS", demoPO);
    }

    @Override
    public Integer addDemoPO(DemoPO demoPO) {
        return (Integer) this.insert(SQL_PREFIX + "addDemoPO", demoPO);
    }

    @Override
    public Integer updateDemoPO(DemoPO demoPO) {
        return this.update(SQL_PREFIX + "updateDemoPO", demoPO);
    }

    @Override
    public Integer addDemoPOS(List<DemoPO> demoPOS) {
        return this.batchInsert(SQL_PREFIX + "addDemoPO", demoPOS);
    }

    @Override
    public Integer updateDemoPOS(List<DemoPO> demoPOS) {
        return this.batchUpdate(SQL_PREFIX + "updateDemoPO", demoPOS);
    }
}
