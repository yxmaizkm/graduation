<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>学生详情</title>
</head>
<body>
    <form class="layui-form" action="" method="">
        <%String oid =request.getParameter("id");%>
        <div class="layui-form-item">
            <label class="layui-form-label">学生ID</label>
            <div class="layui-input-block">
                <input type="text" name="id" disabled style="width:200px;" autocomplete="off" value="<%=oid%>" class="layui-input layui-disabled">
            </div>
        </div>
        <%String name =request.getParameter("name");%>
        <div class="layui-form-item">
            <label class="layui-form-label">学生姓名</label>
            <div class="layui-input-block">
                <input type="text" name="name" style="width:200px;" autocomplete="off" value="<%=name%>" class="layui-input">
            </div>
        </div>
        <%String studentNo =request.getParameter("studentNo");%>
        <div class="layui-form-item">
            <label class="layui-form-label">学号</label>
            <div class="layui-input-block">
                <input type="text" name="studentNo" style="width:200px;" autocomplete="off" value="<%=studentNo%>" class="layui-input">
            </div>
        </div>
        <%String sex =request.getParameter("sex");%>
        <div class="layui-form-item">
            <label class="layui-form-label">性别</label>
            <div class="layui-input-block">
                <input type="radio" name="sex" value="女" title="女">
                <input type="radio" name="sex" value="男" title="男">
            </div>
        </div>
        <%String tel =request.getParameter("tel");%>
        <div class="layui-form-item">
            <label class="layui-form-label">联系方式</label>
            <div class="layui-input-block">
                <input type="text" name="tel" style="width:200px;" autocomplete="off" value="<%=tel%>" class="layui-input">
            </div>
        </div>
        <%String majorId =request.getParameter("majorId");%>
        <div class="layui-form-item">
            <label class="layui-form-label">专业名称</label>
            <div class="layui-input-block">
                <select id="major"  name="majorId" lay-verify="required">
                    <option value="1">电子商务</option>
                    <option value="0">计算机及科学与技术</option>
                    <option value="2">应用数学</option>
                    <option value="3">软件工程</option>
                </select>
            </div>
        </div>
        <%String collegeId =request.getParameter("collegeId");%>
        <div class="layui-form-item">
            <label class="layui-form-label">学院名称</label>
            <div class="layui-input-block">
                <select id="college" name="collegeId" lay-verify="required">
                    <option value="1">文法学院</option>
                    <option value="0">数学与信息工程学院</option>
                    <option value="2">经管学院</option>
                    <option value="3">机电学院</option>
                </select>
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
            form.render();// 因为是动态写入的数据所以需要先渲染表单再进行以下步骤
            let select = 'dd[lay-value=<%=majorId%>]';// 设置value
            $('#major').siblings("div.layui-form-select").find('dl').find(select).click();// 查找点击
            select = 'dd[lay-value=<%=collegeId%>]';//设置value值
            $('#college').siblings("div.layui-form-select").find('dl').find(select).click();// 查找点击
            //回显性别的单选框.
            $("input[name=sex][value=<%=sex%>]").attr("checked", true);
            form.render();// 再次渲染from
            form.on('submit(demo1)', function (data) {
                console.log(data);
                $.ajax({
                    url: "${pageContext.request.contextPath}/manager/student/update",
                    type: "post",
                    dataType: "json",
                    data:{'id':data.field.id,
                        'name':data.field.name,
                        'studentNo':data.field.studentNo,
                        'sex':data.field.sex,
                        'tel':data.field.tel,
                        'majorId':data.field.majorId,
                        'collegeId':data.field.collegeId},
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
