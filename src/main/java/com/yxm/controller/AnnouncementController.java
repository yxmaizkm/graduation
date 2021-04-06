package com.yxm.controller;

import com.yxm.entity.Announcement;
import com.yxm.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: AnnouncementController
 * @Description: TODO
 * @Author: yxm
 * @Date: 2021/3/13 20:53
 * @Version: 1.0
 **/
@Controller
public class AnnouncementController {

    @Autowired
    private AnnouncementService announcementService;

    //添加公告
    @RequestMapping("/manager/announce/add")
    @ResponseBody
    public String addAnnouncement(@RequestParam("title")String title,@RequestParam("message")String message){
        /*System.out.println(title + "   " + message);*/
        announcementService.addAnnouncement(title,message);
        return "200";
    }
    //查询公告
    @RequestMapping("/manager/announce/list")
    @ResponseBody
    public Object announcements() {
        List<Announcement> announcements = announcementService.queryAnnouncements();
        //添加键值对
        Map<String,Object> map = new HashMap<>();
        //添加数据
        map.put("code",0);
        map.put("msg","");
        map.put("count",announcements.size());
        map.put("data",announcements);
        return map;
    }

    //前端的ajax命令，弹出修改界面
    @RequestMapping("/manager/announce/toUpdate")
    public String announcement() {
        return "managerUpdateAnnouncement" ;
    }

    //前端ajax命令来更新公告信息
    @RequestMapping("/manager/announce/update")
    @ResponseBody
    public String updateAnnouncement(@RequestParam("id")int id,@RequestParam("title")String title,@RequestParam("message")String message){
        int i = announcementService.updateAnnouncement(id, title, message);
        return i + "";
    }

    //前端ajax命令，弹出详情界面
    @RequestMapping("/manager/announce/detail")
    public String detailAnnouncement(){
        return "managerAnnouncement";
    }

    //前端的ajax命令，用于根据id进行删除某个公告
    @RequestMapping("/manager/announce/delete")
    @ResponseBody
    public String deleteAnnouncement(@RequestParam("id")int id){
        int i = announcementService.delAnnouncement(id);
        //删除成功的时候返回的数据是1
        return i + "";
    }

}
