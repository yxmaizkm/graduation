package com.yxm.dao;

import com.yxm.entity.Teacher;
import com.yxm.entity.TeacherInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
 * @Description teacher数据交互
 * @Param
 * @return
 **/
public interface TeacherDao {
    //添加教师信息
    public int addTeacher(Teacher teacher);
    //显示所有的数据信息
    public List<TeacherInfo> queryTeachers();
    //删除数据(通过id)
    public int delTeacher(@Param("id") int id);
}
