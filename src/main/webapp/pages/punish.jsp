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
       	 <form action="" id="addRewardStuForm" class="layui-form layui-form-pane">
               <input name="sid" type="hidden" value="${sid}" >
                <div class="layui-form-item">
                    <label for="name" class="layui-form-label">
                        <span class="x-red">*</span>处分情况
                    </label>
                    <div class="layui-input-inline">
                        <input type="text"  name="pscore"  placeholder="请输入数值" required="" lay-verify="required"
                        autocomplete="off" class="layui-input">
                    </div>
                </div>   
                  
                  <input class="layui-input" type="text" placeholder="处分时间" name="nstime" id="start">        
                
                <div class="layui-form-item layui-form-text">
                    <label for="desc" class="layui-form-label">
                        	处分性质
                    </label>
                    <div class="layui-input-block">
                        <textarea placeholder="请输入内容"  name="pdesc" class="layui-textarea"></textarea>
                    </div>
                </div>               
               
                <div class="layui-form-item layui-form-text">
                    <label for="desc" class="layui-form-label">
                      	  备注
                    </label>
                    <div class="layui-input-block">
                        <textarea placeholder="请输入内容"  name="pother" class="layui-textarea"></textarea>
                    </div>
                </div>
                <div class="layui-form-item">
               		<!-- <button  class="layui-btn" onclick="dcse()">立即提交</button> -->
              </div>            
            </form>
            <button class="layui-btn"  onclick="dcse()">立即提交</button>
    <script type="text/javascript" src="${baseurl}js/jquery-form.min.js"></script>
    <script> 
    function dcse(){
    	var options = {
    			url:"${baseurl}addStuPunish.do", 
    			type:"post",
   				success : function(result){
   					if(result.status == 200){
   						layer.msg(result.msg);
   						//关闭页面
   						setTimeout(function(){ 
   							var index = parent.layer.getFrameIndex(window.name);  
   	   					    parent.layer.close(index);				
   						}, 2000);   						
   					}else{
   						layer.msg(result.msg);
   					}
        		}	
    		};        		
    		$("#addRewardStuForm").ajaxSubmit(options); //异步提交
    		return ;  
    } 
     
	//日期
    layui.use('laydate', function(){
        var laydate = layui.laydate;       
        //执行一个laydate实例
        laydate.render({
          elem: '#start' //指定元素
        });
        //执行一个laydate实例
        laydate.render({
          elem: '#end' //指定元素
        });
      });
    
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