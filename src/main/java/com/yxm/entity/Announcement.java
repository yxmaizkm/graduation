package com.yxm.entity;

import java.util.Date;

/**
 * @ClassName: announcement
 * @Description: 公告表的实体类
 * @Author: yxm
 * @Date: 2021/3/13 14:32
 * @Version: 1.0
 **/
public class Announcement {
    private int id;
    //标题
    private String title;
    //主体
    private String message;
    //创建时间
    private Date createTime;

    public Announcement() {
    }

    public Announcement(int id, String title, String message,Date createTime) {
        this.id = id;
        this.title = title;
        this.message = message;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
