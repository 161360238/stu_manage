<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%
		pageContext.setAttribute("APP_PATH",request.getContextPath());
	%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>Document</title>
    <link href="${APP_PATH }/static/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${APP_PATH }/static/css/bass.css" rel="stylesheet"/>
    <link href="${APP_PATH }/static/css/index.css" rel="stylesheet"/>
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-2.2.3.js"></script>
</head>
<body>
	<h1>学生签到</h1>
	<form action="/stu_manage/attend/attend.do" method="POST">
		<input type="text" name="stu_code2">
		<input type="submit" value="签到">
	</form>
	<h1>${sessionScope.QD_image }</h1>
</body>
</html>