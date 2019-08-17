<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
 	 <title>注册</title>
    <link href="${baseurl}common/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/bass.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/index.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/new.css" rel="stylesheet"/>
    <script type="text/javascript" src="${baseurl}js/tbdValidate.js"></script>
</head>
<body>
	<div>
    <header>
        <div class="header">
            <h1>注册账户</h1>
            <a href="login.html" class="return"><i class="icon-16"></i></a>
        </div>
    </header>
    <div style="height: 2.5rem;"></div>
</div>
<!-- 注册 register-->
		<div class="register" id="register">
    <form class="input-group register-group">
        <div class="input-row">
            <label><i class="icon-uniE92B"></i></label>
            <div class="group-T">
                <input type="radio" class="radio-la" name="userType" value="1" id="check-1" checked="checked"><label for="check-1" class="group-T-l icon-uniE940">学生</label>
                <input type="radio" class="radio-la" name="userType" value="0" id="check-2"  ><label for="check-2" class="group-T-2 icon-uniE940">老师</label>
            </div>
        </div>
        <div class="input-row">
            <label><i class="icon-uniE938"></i></label>
            <input id="check-number" type="text" placeholder="准考证号/学号/手机号" >
            <div id="login_phone_text" class="account_warning">账号</div>
        </div>
      
        <div class="input-row">
            <label><i class="icon-uniE937"></i></label>
            <input type="password" placeholder="请输入密码" id="pds" >
             <div id="login_password_text" class="password_warning">密码</div>
        </div>
        <div class="input-row">
            <label><i class="icon-uniE937"></i></label>
            <input type="password" placeholder="确认密码" id="enterpsd">
             <div id="enter_password_text" class="password_warning">确认密码</div>
        </div>
              
        <!-- <div class="input-row">
            <label></label>
            <input class="code-in" type="text" placeholder="验证码">
            <a class="code-a" href="#" class="btn">获取验证码</a>
        </div> -->
              
         <div class="input-row">
         	 <label><i class="icon-uniE937"></i></label>
             <label for="random" style="position:'absolute';top:-18%;right:19%">
             <img id="randomcode_img" src="${baseurl}validatecode.jsp" alt="" style="width:90px; height: 37px"								  
				onclick = randomcode_refresh(this) /></label>
           <input id="random" type="text" placeholder="请输入验证码">
         </div>
        
        <button type="button" class="btn cy-btn btn-red" onclick="register()">下一步</button>
        <div class="clause-box">
            注册即视为同意<a href="#" class="clause-t">《使用条款和隐私政策》</a>
           <!--  <a href="login.html" class="fr clause-t">会员登录</a> -->
        </div>
    </form>
    
		<div class="toolTip-box" style="display: none;">
                <div class="toolTip-flop">
                    <i class="icon-uniE931 hint"></i>
                    <b>提示信息</b>
                    <p id="errorInfo">注册成功</p>
                    <div class="btnbox">
                        <a href="#" class="btn btn-b hidePopup">确定</a>
                    </div>
                </div>
</div>
<!-- 引用的js文件 -->
<script src="${baseurl}common/js/custom.js"></script>
<script type="text/javascript" src="${baseurl}common/js/jquery.min.js"> </script>
<script type="text/javascript">	
	$(document).ready(function(){
	    $(".hidePopup").click(function(){
	        $(".toolTip-box").hide();
	    });	        
	});
	var regconfig=[
					{eleinput:"check-number",eletext:"login_phone_text",rule:[{reg:/^.+$/,text:"账号不能为空"},{reg:/^(1[5|6|7|8|9]|2[0|1|2|3|4])\d{7}|(1[5|6|7|8|9]|2[0|1|2|3|4])\d{12}$/,text:"账号格式错误"}]},
					{eleinput:"pds",eletext:"login_password_text",rule:[{reg:/^.+$/,text:"密码不能为空"},{reg:/^.{6,10}$/,text:'密码在6-10位之间'}]},
					{eleinput:"enterpsd",eletext:"enter_password_text",rule:[{reg:/^.+$/,text:"确认密码不能为空"},{reg:/^.{6,10}$/,text:'密码在6-10位之间'}]},
						];			
			tbdValidate(
					regconfig,
					{
						elesubmit:"login_submit",//提交按钮
						funsubmit:function(){//验证通过可提交回调 			
							register();
						},
						funerr:function(){//不可提交回调
						},
	                   funerrlist:function(errlist){
	                       $('#'+ errlist[0]).focus();
	                   }	
					}
				);	
	  //用户注册
	  	function register(){		
		 $.ajax({
			 	url:'registerdate.do',
			 	type:'POST',
			 	data:{'usertype':$("input:checked").val(),'usercode':$("#check-number").val(),'password':$("#pds").val(),'randomcode':$("#random").val()},
			 	dataType:'json',
			 	success:function(res){
			 		if(res.status == 400 || res.status == 500){
			 			$("#errorInfo").html(res.msg);
						$(".toolTip-box").show();
						randomcode_refresh($("img")[0])
			 		}else{
						$(".toolTip-box").show();
						setTimeout("window.location.href='index.do'", 2000);
			 		}
			 	}
		 })
		 		 
	  }         
    //验证码更新
    function randomcode_refresh(obj){
		obj.src = "${baseurl}validatecode.jsp?time=" + new Date().getTime();
	}    
</script>
</body>

</html>