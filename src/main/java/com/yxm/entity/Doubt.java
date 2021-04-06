package com.yxm.entity;

/**
 * @ClassName: Doubt
 * @Description: 疑问表实体类
 * @Author: yxm
 * @Date: 2021/3/13 14:39
 * @Version: 1.0
 **/
public class Doubt {
    private int id;
    private int studentId;
    private int teacherId;
    //是否已经答疑(0为否1为是)
    private int status;
    private String question;
    private String message;

    @Override
    public String toString() {
        return "Doubt{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", teacherId=" + teacherId +
                ", status=" + status +
                ", question='" + question + '\'' +
                ", message='" + message + '\'' +
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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Doubt(int id, int studentId, int teacherId, int status, String question, String message) {
        this.id = id;
        this.studentId = studentId;
        this.teacherId = teacherId;
        this.status = status;
        this.question = question;
        this.message = message;
    }

    public Doubt() {
    }
}
