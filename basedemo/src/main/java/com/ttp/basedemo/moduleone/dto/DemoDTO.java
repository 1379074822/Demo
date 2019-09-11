package com.ttp.basedemo.moduleone.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Description: DTO示例
 * @Author: quanrui.li
 * @Date: 2019/9/2
 */
@Getter
@Setter
public class DemoDTO implements Serializable {

    /**
     * 序列化id
     */
    private static final long serialVersionUID = -6061653378226582725L;

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
