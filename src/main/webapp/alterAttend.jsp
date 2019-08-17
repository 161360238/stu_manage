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
       <style>
        .minibox{
            position: relative;
            width: 100%;
            height: 590px;
            background-color: #cccccc;
        }
        .mini-box{
            position: absolute;
            width: 80%;
            height: 350px;
            background-color: #ffffff;
            top: 100px;
            left: 10%;
        }
        .mini-box li{
            display: inline-block;
            list-style: none;
        }
        .mini-box span{
            position: absolute;
            left: 10%;
            top: 20%;
        }
        .mini-box div{
            position: absolute;
            left: 10%;
            top: 30%;
        }
        .mini-box input{
            position: absolute;
            left: 10%;
            top: 55%;
            width: 80%;
            font-size: 24px;
        }
    </style>
</head>
<body>
		<%
			
			pageContext.setAttribute("stuId",request.getParameter("stuId"));
		%>
<div>
    <header>
        <div class="header">
            <h1>考勤情况</h1>
           <a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16" style="position:absolute;top:14px;left:18px;"></i></a>
        </div>
    </header>
    <div style="height: 2.5rem;"></div>
</div>
<div class="minibox">
    <div class="mini-box">
        <span>修改签到情况</span>
        <form action="${APP_PATH }/attend/alterAttendStatue.do">
		        <div class="mini-box-li">
		        		<input type="hidden" name="stuId" value="${stuId }">
		        		
			            <li><input type="radio" class="radio-la" name="statue" id="detail-1" checked="checked" value="2">
			            	<label for="detail-1" class="group-T-l icon-uniE940">缺勤</label>
			            </li>
			            <li><input type="radio" class="radio-la" name="statue" id="detail-2" value="1">
			            	<label for="detail-2" class="group-T-l icon-uniE940">请假</label>
			            </li>
			            <li><input type="radio" class="radio-la" name="statue" id="detail-3" value="0">
			            	<label for="detail-3" class="group-T-l icon-uniE940">已到</label>
			            </li>
		        </div>
     
	        <input  type="submit" value="确认修改"> 

       </form>
       
    </div>
</div>
</body>
<script type="text/javascript">
	$(function(){
		$("#alter").click(function(){
			alert("已经修改");
		});
	});
</script>
</html>