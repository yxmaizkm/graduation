<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>添加学生</title>
    <script src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css"/>
</head>
<body>
<div class="layui-layout layui-layout-admin">
    <jsp:include page="manager.jsp"/>
    <div class="layui-body">
        <form class="layui-form" id="form1" action="${pageContext.request.contextPath}/manager/addStudent">
            <div class="layui-form-item">
                <label class="layui-form-label">姓名</label>
                <div class="layui-input-block">
                    <input type="text" name="name" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item layui-form-text">
                <label class="layui-form-label">学号</label>
                <div class="layui-input-block">
                    <input name="studentNo" placeholder="请输入学号" class="layui-input"/>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">性别：</label>
                <div class="layui-input-block">
                    <input type="radio" name="sex" value="男" title="男" checked>
                    <input type="radio" name="sex" value="女" title="女">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">学院：</label>
                <div class="layui-input-block">
                    <select name="collegeId" lay-verify="required">
                        <option value=""></option>
                        <option value="0">数学与信息工程学院</option>
                        <option value="1">文法学院</option>
                        <option value="2">经管学院</option>
                        <option value="3">机电学院</option>
                    </select>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">专业：</label>
                <div class="layui-input-block">
                    <select name="majorId" lay-verify="required">
                        <option value=""></option>
                        <option value="0">计算机及科学与技术</option>
                        <option value="1">电子商务</option>
                        <option value="2">应用数学</option>
                        <option value="3">软件工程</option>
                    </select>
                </div>
            </div>
            <div class="layui-form-item layui-form-text">
                <label class="layui-form-label">联系电话</label>
                <div class="layui-input-block">
                    <input name="tel" placeholder="请输入联系电话" class="layui-input"/>
                </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                </div>
            </div>
        </form>
    </div>
</div>
<script>
    layui.use(['form','jquery','layer'],function () {
        let $ = layui.$,form = layui.form,layer = layui.layer;
        //监听提交
        form.on('submit(formDemo)',function (data) {
            $.ajax({
                url: "${pageContext.request.contextPath}/manager/student/add",
                data:data.field,
                type:"post",
                dataType: "text",
                success:function (data) {
                    layer.msg(data,{time:2000,icon:6},
                    function () {
                        //跳转到全部学生的显示界面
                        window.location.href = '${pageContext.request.contextPath}/manager/students'
                    });
                    //$("#form1")[0].reset();//表单重置
                    //form.render();
                },error:function (data) {
                    layer.msg("错误"+data);
                }
            })
            //如果需要使用ajax的话就需要使用到这个，防止form表单自动刷新
            return false;
        });
    })
</script>
</body>
</html>
