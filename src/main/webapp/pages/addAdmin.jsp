<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/jsp/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>欢迎页面-X-admin2.0</title>
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
	 <div class="x-body">
        <form class="layui-form" id="addAdminFrom"  action="" method="post">
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>姓名
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="name" name="aname" required="" lay-verify="required"
                  autocomplete="off" class="layui-input">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>必填
              </div>
          </div>
          <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>账号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="phone" name="phone" required="" lay-verify="phone"
                  autocomplete="off" class="layui-input">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>12位数字 将会成为您唯一的登入名
              </div>
          </div>                 
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>密码
              </label>
              <div class="layui-input-inline">
                  <input type="password" id="L_pass" name="apwd" required="" lay-verify="pass"
                  autocomplete="off" class="layui-input">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  6到10个字符
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
                  <span class="x-red">*</span>确认密码
              </label>
              <div class="layui-input-inline">
                  <input type="password" id="L_repass" required="" lay-verify="repass"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
               
              </label>
              
          </div>
      </form> 
       <button  class="layui-btn" lay-filter="add" lay-submit="" onclick="desc()">
                 	 增加
       </button>    
    </div>
    <script type="text/javascript" src="${baseurl}js/jquery-form.min.js"></script>
    <script>
    function desc(){
      var options = {
  			url:"${baseurl}addAdmindo.do", 
  			type:"post", 			
 				success : function(result){
 					if(result.status == 200){
 						layer.msg(result.msg);
 						//关闭页面
 						setTimeout(function(){ 
 							var index = parent.layer.getFrameIndex(window.name);  
 	   					    parent.layer.close(index);				
 						}, 1000);   						
 					}else{
 						layer.msg(result.msg);
 					}
      		}	
  		};        		
  		$("#addAdminFrom").ajaxSubmit(options); //异步提交
  		return ;    
     }
     
    </script>
  </body>
</html>
