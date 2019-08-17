<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
    <title>我的班级</title>
    <link href="${baseurl}common/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/bass.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/index.css" rel="stylesheet"/>
</head>
<body>
 	<jsp:include page="header.jsp"></jsp:include>
 	
 	<header>
		<div class="header" style="position:relative;">
			<h1>班级成员</h1>
			<a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16" style="position:absolute;top:14px;left:18px;"></i></a>
		</div>
		</header>	
		<div style="height: 2.5rem;"></div>
	
	
	<div class="Member">
		<div class="contact">
			<div class="contact-search">
	        	<i class="icon-uniE90F"></i>
	        	<input type="search" placeholder="搜索">
	         </div>
		</div>
		<!-- 名单列表 -->
		<ul class="MemberList">
		 <c:forEach items="${stuList}" var="stu">    
			<li>
				<a href="#">
					<img src="${baseurl}pics/pictures/${stu.simage}">
					<div class="ML-txt">
						<b>${stu.sname} <!-- <i class="icon-vip6"></i> --></b>
						<p>${stu.snum}</p>
					</div>
					<em class="icon-uniE926"></em>
				</a>
			</li>
		 </c:forEach>   				
		</ul>	
   </div>
   <script type="text/javascript" src="${baseurl}common/js/jquery.min.js"> </script>
   <script type="text/javascript">
   	$(function(){
   		$("#banji").attr("class","nav-tab-item nav-active");
   	});
   
   </script>
   
</body>
</html>