<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%
		pageContext.setAttribute("APP_PATH",request.getContextPath());
		session.setAttribute("clid", "123");
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
	<h1>宿舍添加页面</h1>
	
		输入宿舍号：<input type="text" name="rnum" id="rnum"><br>
		宿舍容纳人数：<input type="text" name="rpnum" id="rpnum"><br>
		宿舍简介：<input type="text" name="rsign" id="rsign">
		是否为混寝：<br>
		<div id="wrap">
			<input type="radio" name="ismix" value="1"/>是<br>
			<input type="radio" name="ismix" value="0"/>否<br>
		</div>
		<button id="add">添加宿舍</button><br>
		
		<button id="select">查看本院系所有宿舍</button>
		<button id="select2">查看本院系可以分配的宿舍</button><br><br>
		输入宿舍号：<input type="text" name="rnum" id="rnum2">
		<button id="selectByRnum">根据宿舍号查询宿舍</button>
		输入班级ID：<input type="text" name="cid" id="cid">
		<button id="addRoomToC">把宿舍分配给班级</button>
</body>
<script type="text/javascript">
$(function(){
	$("#add").click(function(){
		var rnum=$("#rnum").val();
		var rpnum=$("#rpnum").val();
		var rsign=$("#rsign").val();
		var ismix= $('#wrap input[name="ismix"]:checked ').val();
		var url="${APP_PATH}/room/addRoom.do";
		var data={"rnum":rnum,"rpnum":rpnum,"rsign":rsign,"ismix":ismix};
		$.ajax({
			type:"GET",
			url:url,
			data:data,
			dataType:'json',
			success:function(result){
				alert(result.msg);
			},
			error:function(){
				alert("请求失败");
			}
		});
	});
	
	$("#select").click(function(){
			var clid=${clid};
			var url="${APP_PATH}/room/selectRoomByClid.do";
			var data={"clid":clid};
			$.ajax({
				type:"GET",
				url:url,
				data:data,
				dataType:'json',
				success:function(result){
					alert("请求成功");
				},
				error:function(){
					alert("请求失败");
				},
			});
	});
	
	$("#select2").click(function(){
		var clid=${clid};
		var url="${APP_PATH}/room/selectRoomByClid2.do";
		var data={"clid":clid,"cid":"11111111111111111111111111111111"};
		$.ajax({
			type:"GET",
			url:url,
			data:data,
			dataType:'json',
			success:function(result){
				alert("请求成功");
			},
			error:function(){
				alert("请求失败");
			},
		});
});
	
	
	$("#selectByRnum").click(function(){
		var clid=${clid};
		var url="${APP_PATH}/room/selectByRnum.do";
		var rnum=$("#rnum2").val();
		var data={"rnum":rnum};
		
		$.ajax({
			type:"GET",
			url:url,
			data:data,
			dataType:'json',
			success:function(result){
				alert("请求成功");
			},
			error:function(){
				alert("请求失败");
			},
		});
});
	
	$("#addRoomToC").click(function(){
		var clid=${clid};
		var url="${APP_PATH}/room/addRoomToC.do";
		var rnum=$("#rnum2").val();
		var cid=$("#cid").val();
		var data={"rnum":rnum,"cid":cid};
		
		$.ajax({
			type:"GET",
			url:url,
			data:data,
			dataType:'json',
			success:function(result){
				alert("请求成功");
			},
			error:function(){
				alert("请求失败");
			},
		});
});
});

</script>
</html>