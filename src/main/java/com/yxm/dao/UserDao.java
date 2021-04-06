package com.yxm.dao;

import com.yxm.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: UserDao
 * @Description: user的数据库交互
 * @Author: yxm
 * @Date: 2021/3/11 21:27
 * @Version: 1.0
 **/
public interface UserDao {
    //根据用户的账户和密码查询是否存在用户
    public User queryUsers(@Param("userNo") String userNo, @Param("password") String password,@Param("permission") int permission);
    //添加用户，因为使用了触发器，也就是在添加student的时候就会自动的添加相应的数据进去的。所以这里就不进行了
    //删除用户(通过id)
    public int delUser(@Param("id") int id);
    //修改用户密码
    public int updateUser(@Param("password")String password,@Param("id")int id);
}
