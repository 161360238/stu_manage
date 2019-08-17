<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<div>
    <header>
        <div style="height:50px;width:100%;background-color: #FC605A">
        	<a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16" style="height: 50px;line-height: 50px;font-size: 20px;color:#ffffff"></i></a>
            <span style="width: 100%;height: 50px;line-height: 50px;font-size: 20px;color:#ffffff;margin-left:40%">选择签到班级</span>
        </div>
    </header>
    <div style="height: 2.5rem;"></div>
</div>
<div class="contact">
    <div class="contact-content">
        <div style="padding-top:29px">
        	<c:choose>
        		<c:when test="${msg==0 }">
        			还没有创建班级，请先创建班级
        		</c:when>
        		<c:otherwise>
					<c:forEach var="item" items="${zclasses }">
				 		    <a href="${APP_PATH }/teacher.jsp?zcid=${item.zcid }">
				                 <span class="user-name"> ${item.zcname }</span>
				                  <span style="font-size: 12px">(点击开始签到)</span>
				             </a>
				 		<br>
				 	</c:forEach>
				 </c:otherwise>
			</c:choose>
		</div>
	</div>
</div>
</body>
<script type="text/javascript">
	$(function(){
		
	});
</script>
</html>