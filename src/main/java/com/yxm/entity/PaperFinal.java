package com.yxm.entity;

import java.util.Date;

/**
 * @ClassName: PaperFinal
 * @Description: 论文提交终版实体类
 * @Author: yxm
 * @Date: 2021/3/13 14:51
 * @Version: 1.0
 **/
public class PaperFinal {
    private int id;
    private int studentId;
    private int teacherId;
    private int status;
    private String location;
    //论文提交的时间
    private Date uploadTime;
    private String message;
    //写作检查
    private String writeMessage;
    //格式检查
    private String formatMessage;

    @Override
    public String toString() {
        return "PaperFinal{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", teacherId=" + teacherId +
                ", status=" + status +
                ", location='" + location + '\'' +
                ", uploadTime=" + uploadTime +
                ", message='" + message + '\'' +
                ", writeMessage='" + writeMessage + '\'' +
                ", formatMessage='" + formatMessage + '\'' +
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getWriteMessage() {
        return writeMessage;
    }

    public void setWriteMessage(String writeMessage) {
        this.writeMessage = writeMessage;
    }

    public String getFormatMessage() {
        return formatMessage;
    }

    public void setFormatMessage(String formatMessage) {
        this.formatMessage = formatMessage;
    }

    public PaperFinal(int id, int studentId, int teacherId, int status, String location, Date uploadTime, String message, String writeMessage, String formatMessage) {
        this.id = id;
        this.studentId = studentId;
        this.teacherId = teacherId;
        this.status = status;
        this.location = location;
        this.uploadTime = uploadTime;
        this.message = message;
        this.writeMessage = writeMessage;
        this.formatMessage = formatMessage;
    }

    public PaperFinal() {
    }
}
