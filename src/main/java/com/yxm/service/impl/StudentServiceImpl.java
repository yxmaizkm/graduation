package com.yxm.service.impl;

import com.yxm.dao.StudentDao;
import com.yxm.entity.Student;
import com.yxm.entity.StudentInfo;
import com.yxm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: StudentServiceImpl
 * @Description: 实现接口，具体的代码实现
 * @Author: yxm
 * @Date: 2021/3/23 22:22
 * @Version: 1.0
 **/
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;
    //添加数据
    @Override
    public int addStudent(Student student) {
        return studentDao.addStudent(student);
    }
    //删除数据
    @Override
    public int delStudent(int id) {
        return studentDao.delStudent(id);
    }
    //查询所有的数据
    @Override
    public List<StudentInfo> queryStudents() {
        return studentDao.queryStudents();
    }

    @Override
    public int updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }
}
