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
    <script type="text/javascript" src="${baseurl}js/jquery-form.min.js"></script>
</head>
<body>
	 <div class="x-body">
        <form class="layui-form" id="student2Form">
           <input name="sid" id="sid" type="hidden" value="${sid}" >
	        <input id="radiobtn" type="hidden" value="${stu.party}">  
	        <input id="fammly" type="hidden" value="${stu.fammly}">             
		     <div class="layui-form-item">
		    <label class="layui-form-label">
		    <span class="x-red">*</span>
		    	政治面貌</label>
		    <div class="layui-input-block">
		      <input type="radio" name="party" value="群众" title="群众">
		      <input type="radio" name="party" value="共青团员" title="共青团员" >
		      <input type="radio" name="party" value="积极分子" title="积极分子" >
		      <input type="radio" name="party" value="预备党员" title="预备党员" >
		      <input type="radio" name="party" value="党员" title="党员" >
		    </div>
		  </div>         
		                 
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  	班级职务
              </label>
              <div class="layui-input-inline">
                  <input type="text"  name="role" required="" lay-verify="required" value="${stu.role}"
                  autocomplete="off" class="layui-input">
              </div>
          </div>  
              
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  	德育分
              </label>
              <div class="layui-input-inline">
                  <input type="text"  name="dynum" required="" lay-verify="required" value="${stu.dynum}"
                  autocomplete="off" class="layui-input">
              </div>
          </div>    
           
           <div class="layui-form-item layui-form-text">
                    <label for="desc" class="layui-form-label">
                      	  家庭条件
                    </label>
                    <div class="layui-input-block">
                        <textarea placeholder="请输入内容"  id="textfammly" name="fammly" class="layui-textarea"></textarea>
                    </div>
                </div>
      	</form>
	      <button  class="layui-btn" onclick="dcse()"> 立即提交</button>
    </div>
    <script type="text/javascript" src="${baseurl}js/jquery-form.min.js"></script>
    <script>
    
    $(function(){   		
			if($("#radiobtn").val() != null)
		$(":radio[value=" + $("#radiobtn").val() +"]").attr("checked","true") 
			if($("#fammly").val() != null)
		$("#textfammly").val($("#fammly").val());		
	});
    
    function dcse(){
    	var options = {
    			url:"${baseurl}addStuInfoBymanager.do", 
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
    		$("#student2Form").ajaxSubmit(options); //异步提交
    		return ;  
    } 
    	   
        layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
        
          //自定义验证规则
          form.verify({
            nikename: function(value){
              if(value.length < 5){
                return '昵称至少得5个字符啊';
              }
            }
            ,pass: [/(.+){6,12}$/, '密码必须6到12位']
            ,repass: function(value){
                if($('#L_pass').val()!=$('#L_repass').val()){
                    return '两次密码不一致';
                }
            }
          });
          
        });
    </script>
</body>
</html>