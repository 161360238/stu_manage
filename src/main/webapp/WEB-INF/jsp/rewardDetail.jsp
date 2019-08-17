<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
    <title>供应详情页</title>
    <link href="${baseurl}common/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/bass.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/index.css" rel="stylesheet"/>
</head>
<body>
	<div>
        <header>
            <div class="header" style="positon:relative;">
                <h1>详情</h1>
                <a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16"  style="position:absolute;top:14px;left:18px;"></i></a>
            </div>
        </header>   
        <div style="height: 2.5rem;"></div>
    </div>	
	<div class="supplyDetails">
		<div class="sD-head">
			<!-- <span class="btn btn-green">供应</span> -->
			<h2>${detailInfo.rdesc }</h2>
			
		</div>
		<div class="sD-intro">
			<span class="intro-t">内容介绍：</span>
			<p>	${detailInfo.rother}<br><br>				
				<span class="supply-time">时间： <fmt:formatDate value="${detailInfo.rtime}" pattern="yyyy-MM-dd"/></span>
				<br><br>
				<span class="supply-time">加分：${detailInfo.rscore}</span>
			</p>
		</div>		
		
		<!-- <div class="sD-contact">
			<span class="intro-t">联系方式：</span>
			<p><i class="icon-uniE953"></i>&nbsp;联系人：郭小帅</p>
			<p><i class="icon-14"></i>&nbsp;电话：13112224413</p>
			<p><i class="icon-uniE95C"></i>&nbsp;邮箱：1079832313@qq.com</p>
			<p><i class="icon-uniE902"></i>&nbsp;地点：广州市番禺区市桥</p>
		</div> -->
	</div>
</body>
</html>