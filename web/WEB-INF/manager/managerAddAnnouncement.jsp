<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>公告管理</title>
    <script src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css"/>
</head>
<body>
    <div class="layui-layout layui-layout-admin">
        <jsp:include page="manager.jsp"/>
        <div class="layui-body">
            <form class="layui-form" id="form1" action="${pageContext.request.contextPath}/manager/announce/add">
                <div class="layui-form-item">
                    <label class="layui-form-label">标题</label>
                    <div class="layui-input-block">
                        <input type="text" name="title" required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">内容</label>
                    <div class="layui-input-block">
                        <textarea name="message" placeholder="请输入内容" class="layui-textarea"></textarea>
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
                    url: "${pageContext.request.contextPath}/manager/announce/add",
                    data:data.field,
                    type:"post",
                    dataType: "text",
                    success:function (data) {
                        layer.msg(data,{time:2000,icon:6},
                        function () {
                            window.location.href = '${pageContext.request.contextPath}/manager/announcements';
                        });
                        $("#form1")[0].reset();//表单重置
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
