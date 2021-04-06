package com.yxm.controller;

import com.yxm.entity.Teacher;
import com.yxm.entity.TeacherInfo;
import com.yxm.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: TeacherController
 * @Description: TODO
 * @Author: yxm
 * @Date: 2021/3/21 21:45
 * @Version: 1.0
 **/
@Controller
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    //添加数据
    @RequestMapping("/manager/teacher/add")
    @ResponseBody
    public String add(Teacher teacher){
        int i = teacherService.addTeacher(teacher);
        return i + "";
    }
    //显示所有的数据
    @RequestMapping("/manager/teacher/list")
    @ResponseBody
    public Object list(){
        List<TeacherInfo> teacherList = teacherService.queryTeachers();
        //添加键值对
        Map<String,Object> map = new HashMap<>();
        //添加数据
        map.put("code",0);
        map.put("msg","");
        map.put("count",teacherList.size());
        map.put("data",teacherList);
        return map;
    }
    @RequestMapping("/manager/teacher/del")
    @ResponseBody
    public String del(@RequestParam("id")int id){
        int i = teacherService.delTeacher(id);
        return i + "";
    }

}
