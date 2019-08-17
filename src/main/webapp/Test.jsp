<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	pageContext.setAttribute("APP_PATH",request.getContextPath());
%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript"
	src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link
	href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	
</head>
 <body>
 <h1>班级列表</h1>
	
	
	<a id="detail_show2" href="/stu_manage/addClass/selectZclass.do">班级创建成功，点击查看我创建的班级：</a>
	<div id="clist"></div>
	<c:forEach var="item" items="${zclasses}">
 			<c:out value="班级名称: ${item.zcname}"></c:out>
 		<br>
 	</c:forEach>
 
	${requestScope.names }
 </body>
 
 <script type="text/javascript">
	var tid = '<%=session.getAttribute("session_tid")%>';
	url='${APP_PATH }/addClass/selectZclass.do';
		$(function(){
			/* 	alert("执行");
			 	 $.ajax({
		                type:"GET",
		                url:url,
		                data: {"tid":tid},
		                dataType:'json',
		                success:function(result){
		                	var emps = result.extend.msg;
		                  //  alert("获取成功");
		                /* 	$.each(emps,function(index,item){
		        				var checkBoxTd = $("<div></div><br>").attr("value",item.zcname).text(item.zcname);
		        				$("#clist").append(checkBoxTd);
		        			});	 */
		     /*            },
		                error:function(){    	
		                	 alert("请求失败");
		                },
		        	}); 
				 */ 
			
		});		
</script>
</html>
