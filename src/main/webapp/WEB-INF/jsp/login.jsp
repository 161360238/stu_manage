<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 	<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
    <title>登录</title>
	<link href="${baseurl}common/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/bass.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/index.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/new.css" rel="stylesheet"/>   
    <script type="text/javascript" src="${baseurl}js/tbdValidate.js"></script>
</head>
<body>
    <div class="login-box" style="text-align:center">
        <div class="head-login" >
        	<div class="logo" style="text-align:center;" >
            	<img src="${baseurl}common/images/logo.png" style="width:175px;margin-top:40px; " >
                <p style="font-size:30px;">信工e采</p>
        	</div>
        </div>
        <div class="login">
          	<form id="loginform" action="#" method="post" class="input-group register-group" >
                <div class="input-row">
                    <label><i class="icon-uniE938"></i></label>
                   <input id="user" type="text" placeholder="准考证号/学号/手机号" name="username">
                   <div id="login_phone_text" class="account_warning">账号</div>              
                </div>
        	
                 <div class="input-row">
                     <label><i class="icon-uniE937"></i></label>
                   <input id="psw" type="password" placeholder="输入密码" name="password" >
                    <div id="login_password_text" class="password_warning">密码</div>
                 </div>
                             
                <div class="input-row">
                	 <label><i class="icon-uniE937"></i></label>
                    <label for="random" style="position:'absolute';top:-18%;right:20%">
                    <img id="randomcode_img" src="${baseurl}validatecode.jsp" alt="" style="width:90px; height: 37px"								  
				onclick = randomcode_refresh(this) /></label>
                  <input id="random" type="text" placeholder="请输入验证码" name="randomCode">
                </div>

               <div class="toolTip-box" style="display: none;">
                   <div class="toolTip-flop">
                       <i class="icon-uniE931 hint"></i>
                       <b>提示信息</b>
                       <p id="errorInfo"></p>
                       <div class="btnbox">
                           <a href="#" class="btn btn-b hidePopup">确定</a>
                       </div>

                   </div>
               </div>
              <button  id="login_submit" type="button" class="btn cy-btn btn-red" >登录</button>
        	</form>
        	<div class="login-reg">
                <a class="reg-left" href="${baseurl}resetUserPsss.do">忘记密码?</a>
                <a class="reg-right" href="${baseurl}register.do">注册账号</a>
            </div>
        </div>
    </div>
</body>
<!-- 引入js资源 -->
<script type="text/javascript" src="${baseurl}common/js/zepto.min.js"></script>
<script type="text/javascript" src="${baseurl}common/js/jquery.min.js"> </script>
<script type="text/javascript" src="${baseurl}js/jquery-form.min.js"></script>
	<script type="text/javascript">  
   
		var regconfig=[
				{eleinput:"user",eletext:"login_phone_text",rule:[{reg:/^.+$/,text:"账号不能为空"},{reg:/^(1[5|6|7|8|9]|2[0|1|2|3|4])\d{7}|(1[5|6|7|8|9]|2[0|1|2|3|4])\d{12}|\d{12}$/,text:"账号格式错误"}]},
				{eleinput:"psw",eletext:"login_password_text",rule:[{reg:/^.+$/,text:"密码不能为空"},{reg:/^.{6,10}$/,text:'密码为6-10位'}]}
					];			
		tbdValidate(
				regconfig,
				{
					elesubmit:"login_submit",//提交按钮
					funsubmit:function(){//验证通过可提交回调 			
						//信息提交接口						
						login();
					},
					funerr:function(){//不可提交回调						
					},
                    funerrlist:function(errlist){
                        $('#'+ errlist[0]).focus();
                    }	
				}
			);		
	     $(document).ready(function(){
	        $(".hidePopup").click(function(){
	            $(".toolTip-box").hide();
	        });	        
	    }); 
	    //用户登陆
	    function login() {	
	    		    	
	    	var options = {
        			url:"${baseurl}login.do",
       				beforeSubmit : function(){						
               			return true ; //必须返回true,否则,请求终止.
       				},
       				success : function(str){      					
       					if(str == '用户名不存在' || str == '密码错误' || str == '验证码错误' || str == '网络出错了'){
    						$("#errorInfo").html(str);
    						$(".toolTip-box").show();
    						randomcode_refresh($("img")[1])
    					}else{
    						window.location.href='index.do';
    					} 		
            		}	
        		};        		
        		$("#loginform").ajaxSubmit(options); //异步提交	    		    
			}
	    
	    //验证码更新
	    function randomcode_refresh(obj){
			obj.src = "${baseurl}validatecode.jsp?time=" + new Date().getTime();
		}
	    
	</script>

</html>