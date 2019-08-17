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
    <title>Document</title>
    <link href="${APP_PATH }/static/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${APP_PATH }/static/css/bass.css" rel="stylesheet"/>
    <link href="${APP_PATH }/static/css/index.css" rel="stylesheet"/>
  
</head>
<body>
<div>
       <header>
            <div class="header" style="position:relative;">
                <h1>选择签到班级</h1>
                <a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16" style="position:absolute;top:14px;left:18px;"></i></a>
            </div>
        </header>
        <div style="height: 2.5rem;"></div>
    </div>
	<br> <br>
    <div class="contact">
        <div class="contact-content">
        	<c:choose>
        		<c:when test="${msg == 0 }">
        			你还没有加入上课班级
        		</c:when>
        		<c:otherwise>
	                <div>
	                    <c:forEach var="item" items="${zclass }">
					 		     <a href="${APP_PATH }/attend/setZcid.do?id=${item.zcid}">
					                 <span class="user-name"> ${item.zcname }</span>
					                  <span style="font-size: 12px">(点击进入签到)</span>
					             </a>
					 		<br>
					 	</c:forEach>
	                    
	                </div>
	              </c:otherwise>
               </c:choose>
        </div>
    </div>
    

    
 <!--  <input type="hidden" name="pnum"> -->
</body>
<script type="text/javascript">

	
</script>
</html>