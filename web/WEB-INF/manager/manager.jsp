<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>manager</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">manager</div>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    贤心
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退了</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item " >
                    <a href="javascript:;">公告管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="${pageContext.request.contextPath}/manager/addAnnouncement">添加公告</a></dd>
                        <dd><a href="${pageContext.request.contextPath}/manager/announcements">管理公告</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a class="" href="javascript:;">学生管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="${pageContext.request.contextPath}/manager/addStudent">添加学生</a></dd>
                        <dd><a href="${pageContext.request.contextPath}/manager/students">管理学生</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">教师管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="${pageContext.request.contextPath}/manager/addTeacher">添加老师</a></dd>
                        <dd><a href="${pageContext.request.contextPath}/manager/teachers">管理老师</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="${pageContext.request.contextPath}/manager/topics">课题审查</a>
                </li>
                <li class="layui-nav-item">
                    <a href="${pageContext.request.contextPath}/manager/modifyPwd">修改密码</a>
                </li>
            </ul>
        </div>
    </div>
    <!--显示主体的内容-->
    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>
<script src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
<script>
    layui.use(['element','jquery'],function () {
        let element = layui.element,$ = layui.$;
        $(document.body).find('li').each(function(i, obj) {
            $(obj).removeClass("layui-nav-itemed");
        });
        /**
         * 假如当前 Url 是 http// www. liangshunet.
         * com/pub/item.aspx?t=osw7，则截取到的相对路径为：/pub/item.aspx。
         *
         * @returns
         */
        function GetUrlRelativePath() {
            let url = document.location.toString();
            let arrUrl = url.split("//");

            let start = arrUrl[1].indexOf("/");
            let relUrl = arrUrl[1].substring(start);// stop省略，截取从start开始到结尾的所有字符

            if (relUrl.indexOf("?") != -1) {
                relUrl = relUrl.split("?")[0];
            }
            return relUrl;
        }

        /**
         * 选中菜单默认打开
         * @returns
         */
        $(document).ready(function() {
            let url = GetUrlRelativePath();
            let patt1 = new RegExp(url);
            //$(".layui-this").removeClass();
            $(document.body).find('a').each(function(i, obj) {
                let str = $(obj).attr('href');
                if (patt1.test(str)) {
                   // $(obj).parent().addClass("layui-this");
                    if($(obj).parent().is("dd") ){
                        $(obj).closest("li").addClass("layui-nav-itemed");
                    }
                    $(obj).parent().addClass("layui-this");
                }
            });
        });
    });
</script>
</body>
</html>