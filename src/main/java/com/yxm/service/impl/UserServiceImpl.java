package com.yxm.service.impl;

import com.yxm.dao.UserDao;
import com.yxm.entity.User;
import com.yxm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Author: yxm
 * @Date: 2021/3/11 21:58
 * @Version: 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User queryUsers(String userNo, String password,int permission) {
        return userDao.queryUsers(userNo,password,permission);
    }

    @Override
    public int delUser(int id) {
        return userDao.delUser(id);
    }

    @Override
    public int updateUser(String password, int id) {
        return userDao.updateUser(password,id);
    }
}
