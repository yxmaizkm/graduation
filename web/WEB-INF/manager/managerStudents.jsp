<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>管理学生</title>
</head>
<body>
<div class="layui-layout layui-layout-admin">
    <jsp:include page="manager.jsp"/>
    <div class="layui-body">
        <table id="demo" lay-filter="test"></table>
    </div>
</div>
<script type="text/html" id="btn">
    <button class="layui-btn layui-btn-sm" lay-event="update">编辑</button>
    <button class="layui-btn layui-btn-sm" lay-event="delete">删除</button>
</script>
<script>
    layui.use(['table','layer'], function(){
        let table = layui.table,layer = layui.layer,$ = layui.$;

        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 312
            ,url: '${pageContext.request.contextPath}/manager/student/list' //数据接口
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'id', title: 'ID', sort: true, fixed: 'left'}
                ,{field: 'name', title: '姓名'}
                ,{field: 'studentNo', title: '学号'}
                ,{field: 'sex', title: '性别'}
                ,{field: 'tel', title: '联系方式'}
                ,{field: 'major', title: '专业'}
                ,{field: 'college', title: '学院'}
                ,{field: '', title: '操作',  toolbar:'#btn'}
                ,{field:'majorId', title: 'majorId', hide:true}
                ,{field:'collegeId', title: 'collegeId', hide:true}
            ]]
        });
        //添加监听事件
        table.on("tool(test)",function (obj) {
            let data = obj.data;//获取对应的数据
            let layEvent = obj.event;
            if(layEvent === 'update'){
                $.ajax({
                    type : "POST",
                    url : "${pageContext.request.contextPath}/manager/student/toUpdate",
                    data : {
                        id:data.id,
                        name:data.name,
                        studentNo:data.studentNo,
                        sex:data.sex,
                        tel:data.tel,
                        major:data.major,
                        college:data.college,
                        majorId:data.majorId,
                        collegeId:data.collegeId
                    },
                    dataType: 'html', // html or text 都可以
                    success : function(result) {
                        layer.open({
                            type: 1, // 这里为 1   0:信息框,默认 1:页面层 2:iframe层 3:加载层 4:tips层
                            title: '更新学生信息',
                            skin: 'layui-layer-rim',
                            area : ['400px', '500px'],
                            content:result // 将返回值(页面路径)存入此
                        });
                    }
                });
            }else if(layEvent === 'delete'){
                layer.confirm('您确定要删除吗？', {
                    btn: ['确定','取消'] //按钮
                }, function(){
                    $.ajax({
                        type : "POST",
                        url : "${pageContext.request.contextPath}/manager/student/delete",
                        data : {
                            id:data.id,
                        },
                        dataType:'text',
                        success:function (result) {
                            if(result == '1'){
                                layer.msg('删除成功',{time:2000,icon:6},function () {
                                    window.location.reload();
                                });
                            }else {
                                layer.msg('删除失败',{time:2000,icon:5},function () {
                                    window.location.reload();
                                });
                            }
                        }
                    });
                });
            }
        })

    });
</script>
</body>
</html>
