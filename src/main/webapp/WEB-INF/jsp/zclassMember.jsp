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
    
    
     <link href="${APP_PATH }/common/css/bass.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/index.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/new.css" rel="stylesheet"/>
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-2.2.3.js"></script>
</head>
<body>
<div>
    <header>
        <div style="height:50px;width:100%;background-color: #FC605A">
        	<a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16" style="height: 50px;line-height: 50px;font-size: 20px;color:#ffffff"></i></a>
            <span style="width: 100%;height: 50px;line-height: 50px;font-size: 20px;color:#ffffff;margin-left:40%">班级成员</span>
        </div>
    </header>
    <div style="height: 2.5rem;"></div>
</div>

<div class="contact">
    <div class="contact-content">
        <div >
            <c:forEach var="item" items="${msg }">
                <a href="${APP_PATH }/addClass/stuDetail.do?stuId=${item.sid}" >
                    <%--  <img src="${APP_PATH }/static/images/ts1.jpg"> --%>
                    <div class="user-name" style="font-size: 18px;color:#FC605A">${item.sname }</div>
                    <div>${item.sgrade }级${item.smajor } ${item.cname }</div>
                </a>
            </c:forEach>

        </div>
    </div>
</div>
</body>
</html>