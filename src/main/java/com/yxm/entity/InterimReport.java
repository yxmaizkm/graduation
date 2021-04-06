package com.yxm.entity;

/**
 * @ClassName: InterimReport
 * @Description: 中期报告表的实体类
 * @Author: yxm
 * @Date: 2021/3/13 14:44
 * @Version: 1.0
 **/
public class InterimReport {
    private int id;
    private int studentId;
    private int teacherId;
    //上传文档的地址
    private String location;
    //老师的评价
    private String message;

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

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
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

    @Override
    public String toString() {
        return "InterimReport{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", teacherId=" + teacherId +
                ", location='" + location + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public InterimReport(int id, int studentId, int teacherId, String location, String message) {
        this.id = id;
        this.studentId = studentId;
        this.teacherId = teacherId;
        this.location = location;
        this.message = message;
    }

    public InterimReport() {
    }
}
