package com.yxm.service.impl;

import com.yxm.dao.AnnouncementDao;
import com.yxm.entity.Announcement;
import com.yxm.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: AnnouncementServiceImpl
 * @Description: TODO
 * @Author: yxm
 * @Date: 2021/3/13 20:48
 * @Version: 1.0
 **/
@Service
public class AnnouncementServiceImpl implements AnnouncementService {

    //自动注入
    @Autowired
    private AnnouncementDao announcementDao;

    @Override
    public int addAnnouncement(String title, String message) {
        return announcementDao.addAnnouncement(title,message);
    }

    @Override
    public int delAnnouncement(int id) {
        return announcementDao.delAnnouncement(id);
    }

    @Override
    public int updateAnnouncement(int id, String title, String message) {
        return announcementDao.updateAnnouncement(id,title,message);
    }

    @Override
    public List<Announcement> queryAnnouncements() {
        return announcementDao.queryAnnouncements();
    }

    @Override
    public Announcement queryAnnouncementById(int id) {
        return announcementDao.queryAnnouncementById(id);
    }
}
