package com.yxm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: ManagerController
 * @Description: 管理员的控制器
 * @Author: yxm
 * @Date: 2021/3/14 23:32
 * @Version: 1.0
 **/
@Controller
public class ManagerController {


    //实现跳转(点击公告添加的时候跳转到公告界面的增加)
    @RequestMapping("/manager/addAnnouncement")
    public String addAnnouncement(){
        return "managerAddAnnouncement";
    }

    //实现跳转(点击公告查看，进行查看公告和删除修改)
    @RequestMapping("/manager/announcements")
    public String announcements(){
        return "managerAnnouncements";
    }

    //实现跳转(点击添加学生)
    @RequestMapping("/manager/addStudent")
    public String addStudent(){
        return "managerAddStudent";
    }

    //实现跳转(点击学生查询，实现学生的查询修改和删除)
    @RequestMapping("/manager/students")
    public String students(){
        return "managerStudents";
    }

    //实现跳转(点击添加老师)
    @RequestMapping("/manager/addTeacher")
    public String addTeacher(){
        return "managerAddTeacher";
    }

    //实现跳转(点击管理老师，实现修改，删除和插叙)
    @RequestMapping("/manager/teachers")
    public String teachers(){
        return "managerTeachers";
    }

    //实现跳转(点击课题审批的时候显示所有的课题)
    @RequestMapping("/manager/topics")
    public String topics(){
        return "managerTopics";
    }
    //实现跳转(点击修改密码的时候显示)
    @RequestMapping("manager/modifyPwd")
    public String modifyPwd(){
        return "managerModifyPwd";
    }

}
