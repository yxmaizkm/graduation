<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>公告详情</title>
</head>
<body>
<form class="layui-form" action="" method="">
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
            <input type="text" name="title" disabled style="width:200px;" autocomplete="off" value="<%=title%>" class="layui-input">
        </div>
    </div>
    <%String message =request.getParameter("message");%>
    <div class="layui-form-item">
        <label class="layui-form-label">内容</label>
        <div class="layui-input-block">
            <input type="text" name="message" disabled style="width:200px;" autocomplete="off" value="<%=message%>" class="layui-input">
        </div>
    </div>

</form>
</body>
</html>
