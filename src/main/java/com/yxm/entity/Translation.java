package com.yxm.entity;

/**
 * @ClassName: Translation
 * @Description: 外文翻译实体类
 * @Author: yxm
 * @Date: 2021/3/13 14:59
 * @Version: 1.0
 **/
public class Translation {
    private int id;
    private int studentId;
    private int teacherId;
    private int status;
    //原文上传的文件地址
    private String sourceLocation;
    //译文上传的地址
    private String translateLocation;
    private String message;

    @Override
    public String toString() {
        return "Translation{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", teacherId=" + teacherId +
                ", status=" + status +
                ", sourceLocation='" + sourceLocation + '\'' +
                ", translateLocation='" + translateLocation + '\'' +
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

    public String getSourceLocation() {
        return sourceLocation;
    }

    public void setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    public String getTranslateLocation() {
        return translateLocation;
    }

    public void setTranslateLocation(String translateLocation) {
        this.translateLocation = translateLocation;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Translation(int id, int studentId, int teacherId, int status, String sourceLocation, String translateLocation, String message) {
        this.id = id;
        this.studentId = studentId;
        this.teacherId = teacherId;
        this.status = status;
        this.sourceLocation = sourceLocation;
        this.translateLocation = translateLocation;
        this.message = message;
    }

    public Translation() {
    }
}
