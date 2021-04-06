package com.yxm.controller;

import com.mysql.cj.util.StringUtils;
import com.yxm.entity.User;
import com.yxm.service.UserService;
import com.yxm.util.CaptchaImageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @ClassName: UserController
 * @Description: 用户的Controller
 * @Author: yxm
 * @Date: 2021/3/12 10:46
 * @Version: 1.0
 **/
@Controller
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    //用户登录
    @RequestMapping("/user/login")
    public String login(@RequestParam("userNo") String userNo,@RequestParam("password") String password,@RequestParam("permission") int permission){
        //System.out.println(userNo+"："+password);
        //先进行检测数据是否为空的情况
        if(StringUtils.isNullOrEmpty(userNo) || StringUtils.isNullOrEmpty(password)){
            return "";
        }
        User user = userService.queryUsers(userNo, password,permission);
        if(user != null) {
            if (permission == 3) {
                return "manager";
            }
            if (permission == 2) {
                return "teacher";
            }
            if (permission == 1) {
                return "student";
            }
        }
        return "userLogin";

    }
    //获取验证码
    @RequestMapping("/getCaptchaImage")
    @ResponseBody
    public void getCaptchaImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("test");
        CaptchaImageUtils utils = new CaptchaImageUtils();
        BufferedImage image = utils.getImage();//获取图片
        request.getSession().setAttribute("text",utils.getText());//将验证码的文本存储
        utils.output(image,response.getOutputStream());
    }
}
