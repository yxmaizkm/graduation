package com.yxm.dao;

import com.yxm.entity.Announcement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: AnnouncementDao
 * @Description: 公告表的数据交互层接口
 * @Author: yxm
 * @Date: 2021/3/13 20:15
 * @Version: 1.0
 **/
public interface AnnouncementDao {
    //添加公告
    public int addAnnouncement(@Param("title")String title, @Param("message")String message);
    //删除公告
    public int delAnnouncement(@Param("id")int id);
    //修改
    public int updateAnnouncement(@Param("id")int id,@Param("title")String title,@Param("message")String message);
    //获取公告列表
    public List<Announcement> queryAnnouncements();
    //通过id查询指定用户的信息
    public Announcement queryAnnouncementById(@Param("id")int id);
}
