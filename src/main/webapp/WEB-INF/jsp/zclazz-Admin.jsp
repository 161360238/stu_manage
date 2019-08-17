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
    <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>Document</title>
    <script src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script> 
	<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	  <script src="${APP_PATH }/static/js/lib/jquery.confirm-1.1.js"></script>
    <link href="${APP_PATH }/static/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/bass.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/index.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/new.css" rel="stylesheet"/>
  
</head>
<body>
<div>
    <header>
        <div style="height:50px;width:100%;background-color: #FC605A">
        	<a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16" style="height: 50px;line-height: 50px;font-size: 20px;color:#ffffff"></i></a>
            <span style="width: 100%;height: 50px;line-height: 50px;font-size: 20px;color:#ffffff;margin-left:40%">班级管理</span>
        </div>
    </header>
    <div style="height: 2.5rem;"></div>
</div>
    <div class="contact">
        <div class="contact-content">
                <div style="padding-top:29px">
                
                <c:choose>
                	<c:when test="${msg==0 }">
                		还没有创建班级，请先创建班级
                	</c:when>
                	<c:otherwise>
	                    <c:forEach var="item" items="${zclasses }">
	                        <div>
	                            <span class="user-name" style="width:100px;display:inline-block"> ${item.zcname }</span>
		                            <div class="btn-group pull-right" role="group" >
									  <a href="${APP_PATH }/addClass/zclassDetail.do?id=${item.zcid}" type="button" class="btn btn-default">查看成员</a>
									  <a href="javascript:;" onclick="admin_start('${item.zcid}')" type="button" class="btn btn-default" id="example">删除班级</a>
									</div>
	                       
	                        </div>
	                        <hr>
	                        <br>
	                    </c:forEach>
	                 </c:otherwise>
	             </c:choose>
                    
                </div>
        </div>
    </div>
        <script src="${APP_PATH}/admin/lib/layui/layui.js" charset="utf-8"></script>
        <script src="${APP_PATH}/admin/js/x-layui.js" charset="utf-8"></script>
<script>
        layui.use( 'layer', function(){
      	  var layer = layui.layer;
        });
           
           
            /*启用*/
            function admin_start(zcid){
                layer.confirm('确认删除该班级吗？',function(index){
                    //发异步把用户状态进行更改
                      $.ajax({
					   type: "GET",
					   url: "${APP_PATH}/addClass/delZclazzByZcid.do",
					   data: {"zcid":zcid},
					   success: function(msg){
						   layer.msg('已经删除!',{icon: 6,time:1000});
						   window.location.reload();
					   }
					}); 
                   /*  $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="admin_stop(this,"${item.cid }")" href="javascript:;" title="正在实训"><i class="layui-icon">&#xe601;</i></a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="layui-btn layui-btn-normal layui-btn-mini">正常上课</span>');
                    $(obj).remove(); */
                   
                });
            }
   
          
            </script>
</body>

</html>