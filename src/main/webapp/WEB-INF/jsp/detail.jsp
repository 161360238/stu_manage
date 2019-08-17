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
  
    
	
    <style>
        .firmD-menu input{
            width: 70%;
            height:20px;
            margin-top: 5px
        }
        .firmD-menu div li{
            border-bottom:none;
        }
    </style>
</head>
<body>
<div>
    <header>
        <div class="header">
            <h1>考勤情况</h1>
            <a href="userPu.html" class="return"><i class="icon-16"></i></a>
        </div>
    </header>
    <div style="height: 2.5rem;"></div>
</div>

<div class="contact">
    <div class="contact-content">
        <div id="detail-only">
            <div>
                <div id="student-queqin" style="width: 100%;height: 30px;background-color: #cccccc">缺勤学生</div>
					     <c:forEach var="item" items="${lackendStudent1 }">
					 		 <a href="javascript:;" onclick="admin_stop('${item.sid }','${kid}'  )" >
				                    <img src="${APP_PATH }/static/images/ts1.jpg">
				                    <span>${item.snum }</span>
				                    <span class="user-name">${item.sname }</span>
				                    <span style="font-size: 12px">(点击修改)</span>
                           </a>
					 	</c:forEach>
				<div id="student-queqin" style="width: 100%;height: 30px;background-color: #cccccc">请假学生</div>
					     <c:forEach var="item" items="${leaveStudent1 }">
					 	  <a href="javascript:;" onclick="admin_stop('${item.sid }','${kid}'  )" >
				                    <img src="${APP_PATH }/static/images/ts1.jpg">
				                    <span>${item.snum }</span>
				                    <span class="user-name">${item.sname }</span>
				                    <span style="font-size: 12px">(点击修改)</span>
                          </a>
					 	</c:forEach>
                <div id="student-yidao" style="width: 100%;height: 30px;background-color: #cccccc">已到学生</div>
                 <c:forEach var="item" items="${attendStudent }">
					 		 <a href="javascript:;" onclick="admin_stop('${item.sid }','${kid}'  )" >
				                    <img src="${APP_PATH }/static/images/ts1.jpg">
				                    <span>${item.snum }</span>
				                    <span class="user-name">${item.sname }</span>
				                    <span style="font-size: 12px">(点击修改)</span>
                             </a>
				 </c:forEach>
            </div>
        </div>
    </div>
</div>


  <!-- 模态框 -->
  <div class="modal fade" id="myModal" aria-hidden="false">
    <div class="modal-dialog">
      <div class="modal-content">
   
        <!-- 模态框头部 -->
        <div class="modal-header">
          <h4 class="modal-title">修改签到状态</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
   
        <!-- 模态框主体 -->
        <div class="modal-body">
          请选择：
            <div class="radio">
			  <label> <input type="radio" name="optionsRadios" id="optionsRadios1" value="0">到勤 </label>
			</div>
			<div class="radio">
			  <label><input type="radio" name="optionsRadios" id="optionsRadios2" value="1"> 请假 </label>
			</div>
			<div class="radio">
			  <label><input type="radio" name="optionsRadios" id="optionsRadios2" value="2"> 缺勤 </label>
			</div>
        </div>
   
        <!-- 模态框底部 -->
        <div class="modal-footer">
         <button type="button" class="btn btn-secondary"   id="submit"  >提交</button>
          <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
        </div>
   
      </div>
    </div>
  </div>



<input type="hidden" id="sid" name="sid">
<input type="hidden" id="kid" name="kid">



</body>
<script type="text/javascript">
	  function admin_stop(sid,kid){
		 $("#myModal").modal();  
		 $("#sid").val(sid);
		 $("#kid").val(kid);
     }
	 
	  $("#submit").click(function(){
		  var statue=$("input[type='radio']:checked").val();
		  var sid=$("#sid").val();
		  var kid=$("#kid").val();
		  $.ajax({ 
			  
          	type:"POST",
          	url: "${APP_PATH}/attend/alterAttendStatue.do",
          	data: {"stuId":sid,"statue":statue,"kid":kid},
          	dataType:"json",
          	success: function(msg){
          		alert("修改成功");
          		window.location.reload();
          	   },
          	  
          	   erreo:function(){
          		   alert("请求失败");
          	   }
				});
	  });
	
</script>
</html>