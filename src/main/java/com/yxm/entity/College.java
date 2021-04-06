package com.yxm.entity;

import java.util.Objects;

/**
 * @ClassName: College
 * @Description: 学院的实体类
 * @Author: yxm
 * @Date: 2021/3/21 22:11
 * @Version: 1.0
 **/
public class College {

    //学院id
    private int id;
    //学院的名字
    private String name;

    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        College college = (College) o;
        return id == college.id &&
                Objects.equals(name, college.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public College(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public College() {
    }
}
