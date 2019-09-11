package com.ttp.basedemo.moduleone.enums;

/**
 * @Description: base枚举示例
 * @Author: quanrui.li
 * @Date: 2019/9/2
 */
public enum  DemoEnums {

    /**
     * 状态枚举
     */
    VALID(1,"有效"),
    INVALID(2,"无效"),
    ;

    /**
     * 构造函数
     * @param index 索引
     * @param name 内容
     */
    DemoEnums(Integer index , String name) {
        this.index = index ;
        this.name = name ;
    }

    /**
     * 索引
     */
    private Integer index ;

    /**
     * 内容
     */
    private String name ;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getNameByIndex(Integer index){
        DemoEnums[] arr = values();
        int len = arr.length;

        for(int i=0 ; i<len ; ++i){
            DemoEnums e = arr[i];
            if(index.compareTo(e.getIndex())==0){
                return e.getName();
            }
        }
        return null ;
    }

    public static DemoEnums getByIndex(Integer index){
        DemoEnums[] arr = values();
        int len = arr.length;

        for(int i=0 ; i<len ; ++i){
            DemoEnums e = arr[i];
            if(index.compareTo(e.getIndex())==0){
                return e ;
            }
        }
        return null ;
    }
}
