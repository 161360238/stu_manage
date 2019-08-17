<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%
		pageContext.setAttribute("APP_PATH",request.getContextPath());
	%>
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-2.2.3.js"></script>
	<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>签到</title>
    <link href="${APP_PATH }/static/fonts/iconfont.css" rel="stylesheet"/>
     <link href="${APP_PATH }/common/css/bass.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/index.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/new.css" rel="stylesheet"/>
</head>
<body>
<div>
    <header>
        <div style="height:50px;width:100%;background-color: #FC605A">
        	<a href="#"  class="return" onclick="javascript:history.back(-1);" ><i class="icon-16" style="height: 50px;line-height: 50px;font-size: 20px;color:#ffffff"></i></a>
            <span style="width: 100%;height: 50px;line-height: 50px;font-size: 20px;color:#ffffff;margin-left:40%">学生签到</span>
        </div>
    </header>
    <div style="height: 2.5rem;"></div>
</div>
	<div class="jumbotron">
	  <h1>请输入签到码： </h1>
	</div>
	<form action="/stu_manage/attend/attend.do" method="POST">
		<input type="text" class="form-control"  placeholder="签到码" aria-describedby="sizing-addon2" name="stu_code2">
		<br>
		<input type="submit" class="btn btn-success btn-lg" style="width: 90%;margin:20px 5%" value="签到">
	</form>
	<h1>${sessionScope.QD_image }</h1>
</body>
</html>