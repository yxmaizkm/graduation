package com.yxm.entity;

/**
 * @ClassName: Major
 * @Description: 专业的实体类
 * @Author: yxm
 * @Date: 2021/3/21 22:09
 * @Version: 1.0
 **/
public class Major {

    //专业id
    private int id;
    //专业的名字
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Major{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Major(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Major() {
    }
}
