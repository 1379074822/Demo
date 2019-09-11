package com.ttp.webdemo.moduleone.pojo.po;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 数据库对象示例
 * @Author: quanrui.li
 * @Date: 2019/9/2
 */
@Getter
@Setter
public class DemoPO {

    /**
     * id
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 状态
     */
    private Integer status;
}
