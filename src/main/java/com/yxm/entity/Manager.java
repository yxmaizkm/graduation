package com.yxm.entity;

/**
 * @ClassName: Manager
 * @Description: TODO
 * @Author: yxm
 * @Date: 2021/3/11 20:45
 * @Version: 1.0
 **/
public class Manager {
    //管理员的id
    private int id;
    //管理员姓名
    private String name;
    //管理员性别
    private String sex;

    public Manager() {
    }

    public Manager(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
