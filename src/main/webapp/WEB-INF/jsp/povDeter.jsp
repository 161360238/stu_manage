<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
   <title>贫困认定</title>
    <link href="${baseurl}common/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/bass.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/index.css" rel="stylesheet"/>
</head>
<body>
	<div>
		<header>
			<div class="header" style="position:relative;">
				<h1>贫困认定入口</h1>
				<a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16" style="position:absolute;top:14px;left:18px;"></i></a>
			</div>
		</header>	
		<div style="height: 2.5rem;"></div>
	</div>
	<div class="sign-out">
    	<a href="${baseurl}Stu1povDetermination.do" class="btn btn-max btn-red">大一贫困认定入口</a>
    </div>
	<div class="sign-out">
    	<a href="${baseurl}Stu2povDetermination.do" class="btn btn-max btn-red">大二及以上贫困认定入口</a>
    </div>
</body>
</html>