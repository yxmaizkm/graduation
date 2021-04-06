package com.yxm.service;

import com.yxm.entity.Student;
import com.yxm.entity.StudentInfo;

import java.util.List;

/**
 * @ClassName: StudentService
 * @Description: student的service的接口
 * @Author: yxm
 * @Date: 2021/3/23 22:18
 * @Version: 1.0
 **/
public interface StudentService {
    //添加数据
    public int addStudent(Student student);
    //删除数据
    public int delStudent(int id);
    //查询所有的数据
    public List<StudentInfo> queryStudents();
    //更新数据
    public int updateStudent(Student student);
}
