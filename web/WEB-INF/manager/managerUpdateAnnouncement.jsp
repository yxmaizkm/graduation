<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>更新公告</title>
</head>
<body>
<form class="layui-form" action="${pageContext.request.contextPath}/manager/announce/update" method="post">
    <%String oid =request.getParameter("id");%>
    <input type="hidden" name="id" value="<%=oid%>" class="layui-input">

    <div class="layui-form-item">
        <label class="layui-form-label">公告ID</label>
        <div class="layui-input-block">
            <input type="text" name="id" disabled style="width:200px;" autocomplete="off" value="<%=oid%>" class="layui-input layui-disabled">
        </div>
    </div>
    <%String title =request.getParameter("title");%>
    <div class="layui-form-item">
        <label class="layui-form-label">标题</label>
        <div class="layui-input-block">
            <input type="text" name="title" style="width:200px;" autocomplete="off" value="<%=title%>" class="layui-input">
        </div>
    </div>
    <%String message =request.getParameter("message");%>
    <div class="layui-form-item">
        <label class="layui-form-label">内容</label>
        <div class="layui-input-block">
            <input type="text" name="message" style="width:200px;" autocomplete="off" value="<%=message%>" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-filter="demo1" lay-submit >立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
<script>
    layui.use(['form','jquery'], function () {
        let form = layui.form,$ = layui.$;
        form.on('submit(demo1)', function (data) {
            $.ajax({
                url: "${pageContext.request.contextPath}/manager/announce/update",
                type: "post",
                dataType: "json",
                data:{'id':data.field.id,'title':data.field.title,
                    'message':data.field.message},
                success: function (res) {
                    let json=JSON.parse(res);
                    //console.log(json);
                    if (json == "1") {
                       layer.msg("编辑成功！",{icon: 6},
                       function () {
                            window.location.reload();
                       });//成功表情
                    } else {
                        layer.msg("编辑失败！",{icon: 5});//失败的表情
                    }
                }
            });
            return false;
        });

    });
</script>
</body>
</html>
