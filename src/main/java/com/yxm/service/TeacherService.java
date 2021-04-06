package com.yxm.service;

import com.yxm.entity.Teacher;
import com.yxm.entity.TeacherInfo;

import java.util.List;

/*
 * @Description teacher的业务层
 * @Param 
 * @return 
 **/
public interface TeacherService {
    //添加数据
    public int addTeacher(Teacher teacher);
    //读取所有的数据信息
    public List<TeacherInfo> queryTeachers();
    //删除数据(通过id的形式)
    public int delTeacher(int id);
}
