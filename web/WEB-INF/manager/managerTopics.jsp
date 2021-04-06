<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>课题审查</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
</head>
<body>
<div class="layui-layout layui-layout-admin">
    <jsp:include page="manager.jsp"/>
    <div class="layui-body">
        <table id="demo" lay-filter="test"></table>
    </div>
</div>


<script type="text/html" id="btn">
    <button class="layui-btn layui-btn-normal layui-btn-sm" lay-event="detail">查看</button>
    <button class="layui-btn layui-btn-sm" lay-event="update">编辑</button>
</script>
<script>
    layui.use(['table','layer'], function(){
        let table = layui.table,layer = layui.layer;

        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 312
            ,url: '${pageContext.request.contextPath}/manager/announcements' //数据接口
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}
                ,{field: 'title', title: '标题', width:80, sort: true}
                ,{field: 'date', title: '创建时间', width: 177}
                ,{field: '', title: '操作', width: 177,  toolbar:'#btn'}
            ]]
        });
        //添加监听事件
        table.on("tool(test)",function (obj) {
            console.log(obj);
            let layEvent = obj.event;
            if(layEvent === 'detail'){
                layer.msg('detail');
            }else if(layEvent === 'update'){
                layer.msg('update');
            }
        })

    });
</script>
</body>
</html>
