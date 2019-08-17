<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
    <script src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script> 
	<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="${APP_PATH }/admin/lib/layui/layui.js" charset="utf-8"></script>
    <link href="${APP_PATH }/static/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/bass.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/index.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/new.css" rel="stylesheet"/>
  
</head>
<body>
	<div>
		<header>
			<div class="header">
				<h1>我发布的动态</h1>
				<!-- <a href="userPu.html" class="return"><i class="icon-16"></i></a> -->
				 <a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16" style="position:absolute;top:14px;left:18px;"></i></a>
			</div>
		</header>	
		<div style="height: 2.5rem;"></div>
	</div>
	<!-- 圈子 circle-->
	<div class="circle">
		<!-- circle-tab -->
		<div class="circle2-head">
		
			<div class="Frjbg">
			
			
			<img src="${APP_PATH }/common/images/Frjbg.jpg">
			</div>
			
			<a href="circle3.html">
			
				<div class="user-img">
				<%-- <img src="${APP_PATH }/common/images/user-img0.jpg"> --%>
				    <c:if test="${activeUser.simage == ''}">
						<img src="${baseurl}common/images/user-img2.png" id="photo">
					</c:if>
					<c:if test="${activeUser.simage != ''}">
						<img src="${baseurl}pics/pictures/${activeUser.simage}" >
					</c:if>	 
				
				</div>
				
				<div class="user-head-d">
					<span>郭小帅</span>
				</div>
			</a>
		</div>
		<!-- circle-content -->
		<ul class="circle-content">
			<li class="tab_content show">
			
			<c:forEach items="${notices }" var="item">
					<div class="circleList-d">
						<div class="circle-d-head">
						<!-- userId -->
						
							<a href="${APP_PATH}/addClass/userDetail.do?userId=${item.oid}" class="commentUser">
								<div class="user-img">
								
							 	<img src="${APP_PATH }/common/images/ts1.jpg"> 
							 <%--  <c:if test="${activeUser.simage == null}">
								<img src="${baseurl}common/images/user-img2.png" id="photo">
							</c:if>
							<c:if test="${activeUser.simage != null}">
								<img src="${baseurl}pics/pictures/${item.timage}" >
							</c:if>	 --%>
								
								</div>
								<div class="user-name-d">
								
									<span id="${item.nid }"></span>
				                        	<script type="text/javascript">
				                        		var oid='${item.oid}';
				                        		
					                        	$("#${item.nid }").load('${APP_PATH}/notice/selectOname.do?oid='+oid);
					                        </script>
									<br>
									
									<span class="issue-time">
									 	<fmt:formatDate value="${item.btime}" pattern="yyyy-MM-dd  HH:mm:ss" />
									</span>
								</div>
							</a>
							
						</div>
						<p class="circle-d-text">${item.ntext}</p>
						<!-- 朋友圈图片 -->
						<ul class="circle-d-img">
							<li><a href="javascript:;"><img src="${APP_PATH }/pics/pictures/${item.nimage}"></a></li>
						</ul>
						
					</div>
			</c:forEach>
			</li>
		</ul>
	</div>
	<a href="${APP_PATH }/circlePublish.jsp" class="comment-btn">
        <i class="icon-uniE93E"></i>
        发圈子
      </a>
	<!-- 引入js资源 -->
	<script type="text/javascript" src="js/zepto.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
	  	$(".like-i").click(function(){
		    $(".like-i").addClass("like-i-active");
	  	});
	});
	</script>
</body>
</html>