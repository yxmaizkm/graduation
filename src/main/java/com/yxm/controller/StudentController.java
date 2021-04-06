package com.yxm.controller;

import com.yxm.entity.Student;
import com.yxm.entity.StudentInfo;
import com.yxm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: StudentController
 * @Description: TODO
 * @Author: yxm
 * @Date: 2021/3/17 20:26
 * @Version: 1.0
 **/
@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/student/upload")
    public String test(){
        return "studentUploadFiles";
    }

    //在manager界面，添加学生信息
    @RequestMapping("/manager/student/add")
    @ResponseBody
    public String add(Student student){
        int i = studentService.addStudent(student);
        return i + "";
    }
    //在manager界面，显示所有的数据
    @RequestMapping("/manager/student/list")
    @ResponseBody
    public Object list(){
        List<StudentInfo> studentList = studentService.queryStudents();
        //添加键值对
        Map<String,Object> map = new HashMap<>();
        //添加数据
        map.put("code",0);
        map.put("msg","");
        map.put("count",studentList.size());
        map.put("data",studentList);
        //System.out.println(Arrays.toString(studentList));
        return map;
    }
    //在manager界面，删除数据(通过id)
    @RequestMapping("/manager/student/del")
    @ResponseBody
    public String del(@RequestParam("id")int id){
        int i = studentService.delStudent(id);
        return i + "";
    }
    //在manager界面，跳转到Update的界面
    @RequestMapping("/manager/student/toUpdate")
    public String toUpdate(){
        return "managerUpdateStudent";
    }
    //前端ajax命令来更新学生信息
    @RequestMapping("/manager/student/update")
    @ResponseBody
    public String updateAnnouncement(Student student){
        System.out.println("进入");
        System.out.println(student);
        int i = studentService.updateStudent(student);
        return i + "";
    }

}
