package com.yxm.service;

import com.yxm.entity.User;

/**
 * @ClassName: UserService
 * @Description: user的逻辑
 * @Author: yxm
 * @Date: 2021/3/11 21:56
 * @Version: 1.0
 **/
public interface UserService {

    //通过账号和密码进行登录
    public User queryUsers(String userNo,String password,int permission);
    //删除用户
    public int delUser(int id);
    //修改用户密码
    public int updateUser(String password, int id);
}
