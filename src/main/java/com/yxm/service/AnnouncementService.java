package com.yxm.service;

import com.yxm.entity.Announcement;

import java.util.List;

/**
 * @ClassName: AnnouncementService
 * @Description: 公告表的业务逻辑
 * @Author: yxm
 * @Date: 2021/3/13 20:45
 * @Version: 1.0
 **/
public interface AnnouncementService {
    //增加公告
    public int addAnnouncement(String title,String message);
    //删除公告
    public int delAnnouncement(int id);
    //修改公告
    public int updateAnnouncement(int id,String title,String message);
    //查看所有的公告
    public List<Announcement> queryAnnouncements();
    //通过id查询指定的公告信息
    public Announcement queryAnnouncementById(int id);
}
