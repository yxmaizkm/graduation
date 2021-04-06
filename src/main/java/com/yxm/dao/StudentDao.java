package com.yxm.dao;

import com.yxm.entity.Student;
import com.yxm.entity.StudentInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description //创建student数据交互的接口
 * @Param
 * @return
 **/
public interface StudentDao {

    //添加student的数据
    public int addStudent(Student student);
    //显示数据
    public List<StudentInfo> queryStudents();
    //删除数据
    public int delStudent(@Param("id") int id);
    //更新学生信息
    public int updateStudent(Student student);
}
