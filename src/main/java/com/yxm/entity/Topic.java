package com.yxm.entity;

/**
 * @ClassName: Topic
 * @Description: 课题表
 * @Author: yxm
 * @Date: 2021/3/13 14:56
 * @Version: 1.0
 **/
public class Topic {
    private int id;
    //课题名称
    private String name;
    private int studentId;
    private int teacherId;
    private int status;
    //选择课题的时间
    private String selectTime;

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentId=" + studentId +
                ", teacherId=" + teacherId +
                ", status=" + status +
                ", selectTime='" + selectTime + '\'' +
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

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSelectTime() {
        return selectTime;
    }

    public void setSelectTime(String selectTime) {
        this.selectTime = selectTime;
    }

    public Topic(int id, String name, int studentId, int teacherId, int status, String selectTime) {
        this.id = id;
        this.name = name;
        this.studentId = studentId;
        this.teacherId = teacherId;
        this.status = status;
        this.selectTime = selectTime;
    }

    public Topic() {
    }
}
