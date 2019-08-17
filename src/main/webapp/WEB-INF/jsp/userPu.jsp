<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
    <title>个人会员中心</title>
    <link href="${baseurl}common/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/bass.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/index.css" rel="stylesheet"/>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>
	<!-- 个人中心 user-->
	<div class="setBg-box"></div>
	<div class="cy-user">
		<div class="userPu">
			<!-- 头像部分 -->
			<div class="userPu-h">
				<c:if test="${activeUser.simage != ''}">
					<div class="user-h-img"><img src="${baseurl}pics/pictures/${activeUser.simage}"></div>				
				</c:if>
				<c:if test="${activeUser.simage == ''}">
					<div class="user-h-img"><img src="${baseurl}common/images/user-img2.png"></div>				
				</c:if>
				<div class="user-h-text">
					<div class="user-name">${activeUser.username}
						<!-- <a href="userUpgrade.html" class="outsider">
							<div class="bg-iconvip"></div>
							 <span class="icon-vip0"></span> 
							 成为vip 
						</a> -->
					</div>
					<div class="user-association">${activeUser.usercode}</div>
				</div>
			</div>			
			<!-- 头像部分 end-->
			<!-- 资料板块 -->
			<div class="datum-box">
				<ul class="datum-list">	
					<li class="dropdown">
						<a href="${baseurl}AuthenStuInfo.do">
						<h1 data-toggle="dropdown" class="vtitle"><i class="ba-color ba-color7 icon-uniE966"></i>
						<b>信息认证</b><c:if test="${activeUser.status == 2}"><span>已认证</span></c:if><c:if test="${activeUser.status == 1}"><span>未认证</span></c:if></h1>
						</a>
					</li>
					<c:if test="${activeUser.identity == 1 }">
					<li class="dropdown">
						<a href="${baseurl}showMyDetailInfo.do">
						<h1 data-toggle="dropdown" class="vtitle"><i class="ba-color ba-color2 icon-uniE953"></i><b>我的信息</b><span class="icon-uniE926"></span></h1>
						</a>
					</li>
					<li class="dropdown">
						<a href="${baseurl}userMyactivity.do">
			            	<h1 data-toggle="dropdown" class="vtitle">
			            		<i class="ba-color icon-uniE93D"></i>
			            		<b>我的活动</b>
			            		<span class="icon-uniE926"></span>
			            	</h1>
			            </a>
			        </li>
			        </c:if>
					<li class="dropdown">
						<a href="${baseurl}reset.do">
							<h1 data-toggle="dropdown" class="vtitle">
								<i class="ba-color ba-color3 icon-uniE901"></i>
								<b>设置</b>
								<span class="icon-uniE926"></span>
							</h1>
						</a>
					</li>
				</ul>				
			</div>
			<!-- 资料板块 end-->
		</div>
	</div>
	<!-- 个人中心 user end-->
	<!-- 引用的js文件 -->
	<script src="${baseurl}common/js/custom.js"></script>
	<script type="text/javascript" src="${baseurl}common/js/jquery.min.js"> </script>
	<script type="text/javascript" src=""></script>
	<script type="text/javascript">
		$(function(){
			 $("#wode").attr("class","nav-tab-item nav-active");
		});
	</script>
</body>
</html>