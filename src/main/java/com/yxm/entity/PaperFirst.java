package com.yxm.entity;

/**
 * @ClassName: PaperFirst
 * @Description: 论文初版
 * @Author: yxm
 * @Date: 2021/3/13 14:54
 * @Version: 1.0
 **/
public class PaperFirst {
    private int id;
    private int studentId;
    private int teacherId;
    private String location;

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

    @Override
    public String toString() {
        return "PaperFirst{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", teacherId=" + teacherId +
                ", location='" + location + '\'' +
                '}';
    }

    public PaperFirst(int id, int studentId, int teacherId, String location) {
        this.id = id;
        this.studentId = studentId;
        this.teacherId = teacherId;
        this.location = location;
    }

    public PaperFirst() {
    }
}
