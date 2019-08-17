<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%
		pageContext.setAttribute("APP_PATH",request.getContextPath());
	%>
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-2.2.3.js"></script>
	<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>Document</title>
    <link href="${APP_PATH }/static/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${APP_PATH }/static/css/bass.css" rel="stylesheet"/>
    <link href="${APP_PATH }/static/css/index.css" rel="stylesheet"/>
  
</head>
<body>
<div>
    <header>
        <div style="height:50px;width:100%;background-color: #FC605A">
        	<a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16" style="height: 50px;line-height: 50px;font-size: 20px;color:#ffffff"></i></a>
            <span style="width: 100%;height: 50px;line-height: 50px;font-size: 20px;color:#ffffff;margin-left:40%">我加入的班级</span>
        </div>
    </header>
    <div style="height: 2.5rem;"></div>
</div>
    <div class="contact">
    
    
    <c:choose>
    	<c:when test="${msg == 0 }">
    		你还没有加入班级	
    	</c:when>
    	
    	<c:otherwise>
	        <div class="contact-content">
	                <div>
	                    <c:forEach var="item" items="${zclass }">
					 		     <a href="${APP_PATH }/addClass/zclassDetail2.do?id=${item.zcid}">
					                 <span class="user-name"> ${item.zcname }</span>
					                  <span style="font-size: 12px">(点击查看成员)</span>
					             </a>
					 		<br>
					 	</c:forEach>
	                    
	                </div>
	        </div>
	     </c:otherwise>
     </c:choose>
    </div>
    

    
 <!--  <input type="hidden" name="pnum"> -->
</body>
<script type="text/javascript">

	function admin_stop(rid,rnum,rpnum){    //宿舍id 与宿舍能容纳的人数
		var rids="#"+rid;
		var pnum=$(rids).text();    //当前已经选择的人数
		//alert(pnum);
		//alert(rpnum)
		 if(pnum<rpnum){
			$("#myModal").modal();
			$("#submit").click(function(){
				$.ajax({ 
		          	type:"POST",
		          	url: "${APP_PATH}/room/chooseRoom.do",
		          	data: {"rid":rid,"rnum":rnum},
		          	dataType:"json",
		          	success: function(msg){
		          		if(msg.code==100){
		          			alert("选择宿舍成功");
			          		window.location.reload();	
		          		}
		          	   },
		          	  
		          	   erreo:function(){
		          		   alert("请求失败");
		          	   }
						});	
			})
			
		}else{
			alert("这个宿舍人数已经达到上限");
		} 
		 
	}





</script>
</html>