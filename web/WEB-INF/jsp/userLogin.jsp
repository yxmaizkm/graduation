<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>登录</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/login/login.css">
</head>
<body style="background-image: url('${pageContext.request.contextPath}/static/images/login.jpg')">
    <div class="clear box layui-main login">
        <form class="layui-form layui-form-pane1" action="${pageContext.request.contextPath}/user/login" method="post">
            <div class="layui-form-item">
                <label class="layui-form-label">用户名：</label>
                <div class="layui-input-block">
                    <input type="text" name="userNo" lay-verify="uname" required
                           placeholder="请输入用户名" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">密码：</label>
                <div class="layui-input-block">
                    <input type="password" name="password" lay-verify="" required
                           placeholder="请输入密码" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">身份：</label>
                <div class="layui-input-block">
                    <input type="radio" name="permission" value="1" title="学生" checked>
                    <input type="radio" name="permission" value="2" title="老师">
                    <input type="radio" name="permission" value="3" title="管理员">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">验证码：</label>
                <div class="layui-input-block">
                    <input type="text" name="yzm"  lay-verify="" required layui-filter="yzm"
                           placeholder="请输入验证码" autocomplete="off" class="layui-input"><br>
                    <a href="javascript:getVerifiCode()"><img alt="验证码" id="yxm_image" src="${pageContext.request.contextPath}/getCaptchaImage"></a>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label"></label>
                <button class="layui-btn layui-btn-normal btn-center" type="submit">登录</button>
                <button class="layui-btn layui-btn-normal btn-center" type="reset">重置</button>
            </div>
        </form>
    </div>

    <script src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
    <script>
        layui.use(['element','form','jquery'], function(){
            let element = layui.element;
            let $ = layui.$;
            let form = layui.form;
            form.render();
            window.getVerifiCode = function () {

            }
        });
    </script>
</body>
</html>