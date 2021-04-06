package com.yxm.service.impl;

import com.yxm.dao.TeacherDao;
import com.yxm.entity.Teacher;
import com.yxm.entity.TeacherInfo;
import com.yxm.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: TeaccherServiceImpl
 * @Description: TODO
 * @Author: yxm
 * @Date: 2021/3/23 23:12
 * @Version: 1.0
 **/
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public int addTeacher(Teacher teacher) {
        return teacherDao.addTeacher(teacher);
    }

    @Override
    public List<TeacherInfo> queryTeachers() {
        return teacherDao.queryTeachers();
    }

    @Override
    public int delTeacher(int id) {
        return teacherDao.delTeacher(id);
    }
}
