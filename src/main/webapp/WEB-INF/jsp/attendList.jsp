<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%
		pageContext.setAttribute("APP_PATH",request.getContextPath());
	%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
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
<div>
    <header>
        <div style="height:50px;width:100%;background-color: #FC605A">
        	<a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16" style="height: 50px;line-height: 50px;font-size: 20px;color:#ffffff"></i></a>
            <span style="width: 100%;height: 50px;line-height: 50px;font-size: 20px;color:#ffffff;margin-left:40%">签到列表</span>
        </div>
    </header>
    <div style="height: 2.5rem;"></div>
</div>
<div class="contact">
    <div class="contact-content">
        <div>
        	<c:choose>
        		<c:when test="${msg1==0 }">
        		<br>
        			还没有签到记录，要先签到才有记录。
        		</c:when>
        		<c:otherwise>
		            <c:forEach var="item" items="${msg }">
		                <a href="${APP_PATH }/attend/showDetail2.do?cid=${item.extend.cid }&kid=${item.extend.kid }">
		                    <div><span style="font-size: 16px" class="user-name">签到时间：
		                     
		                     <fmt:formatDate value="${item.extend.date }" type="date" dateStyle="full"/>
		                     </span></div>
		                    
		                    <div>
		                    <span style="font-size: 16px" class="user-name">请假： ${item.extend.leave }人</span>
		                    <span style="font-size: 16px" class="user-name">缺勤： ${item.extend.lack }人</span>
		                    <span style="font-size: 16px" class="user-name">到勤： ${item.extend.attend }人</span>
		                  	</div>
		                    
		                </a>
		            </c:forEach>
		        </c:otherwise>
	        </c:choose>
            
        </div>
    </div>
</div>
</div>
</body>
</html>