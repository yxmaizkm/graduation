package com.yxm.entity;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author: yxm
 * @Date: 2021/3/11 20:45
 * @Version: 1.0
 **/
public class User {
    //用户id
    private int id;
    //用户的账号（设置学生是学号，老师是教师的编号）
    private String userNo;
    //密码
    private String password;
    //权限的级别(管理员是3老师是2学生是1)
    private String permission;

    public User() {
    }

    public User(int id, String userNo, String password, String permission) {
        this.id = id;
        this.userNo = userNo;
        this.password = password;
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userNo='" + userNo + '\'' +
                ", password='" + password + '\'' +
                ", permission='" + permission + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
