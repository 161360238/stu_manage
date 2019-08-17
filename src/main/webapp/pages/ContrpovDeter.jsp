<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 	<meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${baseurl}admin/css/font.css">
    <link rel="stylesheet" href="${baseurl}admin/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="${baseurl}admin/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${baseurl}admin/js/xadmin.js"></script>
</head>
<body>
    <div class="x-nav">    
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">      
           
      	状态： <span class="layui-btn layui-btn-normal layui-btn-mini" id="status" >
      	<c:if test="${function.pression == '0' }">已关闭</c:if>
      	<c:if test="${function.pression == '1' }">已开启</c:if>
      	</span>
      	 <button class="layui-btn" onclick="member_stop('1','开放')">开放认定</button>
        <button class="layui-btn layui-btn-danger" onclick="member_stop('0','关闭')">关闭认定</button> 
      			                              
    </div>
    <script type="text/javascript">    
       /*用户-停用*/
      function member_stop(status,text){ 
          layer.confirm('确认要'+ text +'贫困认定吗？',function(index){        	
        	  $.ajax({
        		  url:"${baseurl}updatePovDeterStatusbyPression.do",
        		  type:'POST',
        		  data:{status:status},
        		  success:function(result){
        			  if(result.status == 200){
        				  if(status == '0'){
        				 $("#status").html('已关闭'); 
        				 layer.msg('已关闭!',{icon: 5,time:1000});        					  
        				  }else{
        				 $("#status").html('以开放'); 
        				 layer.msg('已开放!',{icon: 5,time:1000});        					          					  
        				  }        				  
        			  }
        			  if(result.status == 400){        				              				
             				 layer.msg('操作失败!',{icon: 5,time:1000});        					              				 
        			  }
        		  }
        	  });                      
          });
      }
     </script>
  </body>
</html>