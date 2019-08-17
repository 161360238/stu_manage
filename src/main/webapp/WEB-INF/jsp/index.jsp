<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
    <title>学生登录首页</title>
    <link href="${baseurl}common/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/bass.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/index.css" rel="stylesheet"/>
</head>
<body>
	<!--头部导航栏开始-->
		<div>
			<header>
				<div class="header">
					<a href="#" class="returnA">
					<h1 class="htitle">平顶山学院</h1></a>										
				</div>
			</header>
			<div style="height: 2.5rem;"></div>
		</div>
	<!--头部导航栏结束-->
	<!--尾部导航栏开始-->
	<jsp:include page="header.jsp"></jsp:include>
	
	<!--尾部导航栏结束-->
	<div class="all_box">
		<!-- 轮播图 -->
	    <div class="m-slider" id="slider">
		    <div class="ks_dbox ks_ts">
		         <div class="ks_wrap">
		           <img src="${baseurl}common/images/j-banner03.jpg">
		         </div>
		         <div class="ks_wrap">
		           <img src="${baseurl}common/images/j-banner02.jpg">
		         </div>
		         <div class="ks_wrap">
		           <img src="${baseurl}common/images/j-banner03.jpg">
		         </div>
		    </div>
		    <div class="ks-circles"><ul class="ks_wt"></ul></div>
	    </div>
	    <!-- 轮播图 end-->
	    <!-- 功能板块 -->
	    <div class="big_button">
	    	<div class="big_left">
	    		<div class="big_left_p"><a href="${activeUser.menus[0].url}"><span class="icon-uniE92C"></span><h3>${activeUser.menus[0].text}</h3></a></div>
	    		<div class="big_left_p2"><a href=" ${activeUser.menus[1].url} "><h3>${activeUser.menus[1].text}</h3></a></div>
	    		<div class="ind-bar"></div>
	    	</div>
	    	<div class="big_right">
				<div class="big_rigt_p plate_a fl">
					<a href=" ${activeUser.menus[2].url}"><span class="icon-17"></span><h3>${activeUser.menus[2].text}</h3></a>
					<div class="ind-bar2"></div>
				</div>
				<div class="big_rigt_p plate_b fr">
					<a href=" ${activeUser.menus[3].url}"><span class="icon--01"></span><h3>${activeUser.menus[3].text}</h3></a>
					<div class="ind-bar3"></div>
				</div>
				<div class="big_rigt_p plate_c fl">
					<a href=" ${activeUser.menus[4].url}"><span class="icon-uniE932"></span><h3>${activeUser.menus[4].text}</h3></a>
					<div class="ind-bar2"></div>
				</div>
				<div class="big_rigt_p plate_d fr" >
					<a href=" ${activeUser.menus[5].url}"><span class="icon-uniE93B"></span><h3>${activeUser.menus[5].text}</h3></a>
					<div class="ind-bar3"></div>
				</div>
				<div class="cl"></div>
			</div>
	    </div>	 
	    <!-- 协会活动列表 -->
		<div class="dynamic-list activity-list">
			<div class="dynamic-list-head">
				<i class="dynamic-i-l icon-uniE93D"></i>
				<b>院系活动</b>
				<a href="#"><i class="dynamic-i-r icon-uniE906 fr"></i></a>
			</div>
			<ul class="eventreminder">
				<li>  		
		    		<a href="${baseurl}activity.do">
		    			<div class="A-cimg">
                                <img src="${baseurl}common/images/hd1.jpg">                              
                                <span class="i-activity p-number">26人报名</span>
                                <span class="activity-s activity-s-1">正在报名</span>
		    			</div>
	                    <div class="eventreminder-list">
	                        <p class="activity-h1">招募活动</p>
	                        <p class="activity-TimeXh"><span class="fr">5分钟前</span> <span class="event-xh">科技楼6楼-609实验室</span></p>
	                    </div>  
					</a>
				</li>  									
	        </ul>
		</div>
	    <!-- 协会活动列表 end-->	   
    <!-- 引入js资源 -->
    <script type="text/javascript" src="${baseurl}common/js/zepto.min.js"></script>
  	<script type="text/javascript" src="${baseurl}common/js/zepto.kslider.js"></script>
    <script type="text/javascript">
	  $(function(){
	     //slider
	      $('#slider').slider({
	        className: 'slider_box',
	        tick: 4000 //播放间隔
	     });
	     var imgPieces=$('.m-slider').find('.ks_wrap');
	     for(var i=0;i<imgPieces.length;i++){
	       $('.ks_wt').append('<li></li>');
	       $('.ks_wt').find('li').eq(0).addClass('active');
	     }	  	
	     $("#souye").attr("class","nav-tab-item nav-active");
	     
	  });
	</script> 
</body>
</html>