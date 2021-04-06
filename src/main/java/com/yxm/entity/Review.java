package com.yxm.entity;

/**
 * @ClassName: Review
 * @Description: 文献综述实体类
 * @Author: yxm
 * @Date: 2021/3/13 14:55
 * @Version: 1.0
 **/
public class Review {
    private int id;
    private int studentId;
    private int teacherId;
    private int status;
    private String location;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
        return "Review{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", teacherId=" + teacherId +
                ", status=" + status +
                ", location='" + location + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public Review(int id, int studentId, int teacherId, int status, String location, String message) {
        this.id = id;
        this.studentId = studentId;
        this.teacherId = teacherId;
        this.status = status;
        this.location = location;
        this.message = message;
    }

    public Review() {
    }
}
