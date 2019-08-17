<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<h1>添加专业以及班级</h1>
	<!--  <form action="${APP_PATH }/addClass/add.do"> -->
			年份：<input type="text" id="year" name="year" ><br>
			专业：<input type="text" id="major" name="major" ><br>
			班级：<input type="text" id="class1" name="class" ><br>
		<!--  	<input type="submit" value="添加"> -->
		<button id="submit">添加</button>
	<!--  	</form> -->
</body>
<script type="text/javascript">
	$(function(){
		$("#submit").click(function(){
			url='${APP_PATH }/addClass/add.do';
			year=$("#year").val();
			major=$("#major").val();
			class1=$("#class1").val();
			data={"year":year,"major":major,"class":class1};
			
			 $.ajax({
	                type:"GET",
	                url:url,
	                data: data,
	                dataType:'json',
	                success:function(result){
	                    alert(result.extend.msg);
	                },
	                error:function(){    	
	                	 alert("请求失败");
	                },
	        	});
			
		});
	});
</script>
</html>