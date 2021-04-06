package com.yxm.entity;

/**
 * @ClassName: assignment
 * @Description: 任务书实体类
 * @Author: yxm
 * @Date: 2021/3/13 14:34
 * @Version: 1.0
 **/
public class Assignment {
    private int id;
    //学生id
    private int studentId;
    //管理员的id(负责审查任务书)
    private int managerId;
    //提交的任务书的地址
    private String location;
    //审查的评价
    private String message;
    //是否通过审查
    private int status;

    @Override
    public String toString() {
        return "assignment{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", managerId=" + managerId +
                ", location='" + location + '\'' +
                ", message='" + message + '\'' +
                ", status=" + status +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Assignment(int id, int studentId, int managerId, String location, String message, int status) {
        this.id = id;
        this.studentId = studentId;
        this.managerId = managerId;
        this.location = location;
        this.message = message;
        this.status = status;
    }

    public Assignment() {
    }
}
