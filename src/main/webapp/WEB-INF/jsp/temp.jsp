<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
		pageContext.setAttribute("APP_PATH",request.getContextPath());
		
	%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
    <title>我的班级</title>
    <link href="${APP_PATH}/common/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${APP_PATH}/common/css/bass.css" rel="stylesheet"/>
    <link href="${APP_PATH}/common/css/index.css" rel="stylesheet"/>
</head>
<body>
<div>
        <header>
            <div class="header" style="position:relative;">
                <h1>提示信息</h1>
                <a href="#" class="return" onclick="javascript:history.back(-2);"><i class="icon-16" style="position:absolute;top:14px;left:18px;"></i></a>
            </div>
        </header>
        <div style="height: 2.5rem;"></div>
    </div>
	<h1>请先去认证信息</h1>
	<!-- <p>联系管理员后，说明问题，管理员会在24小时内回复并解决问题，谢谢合作</p> -->
</body>
</html>