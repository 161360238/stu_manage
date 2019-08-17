<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
    <title>设置新密码</title>
    <link href="${baseurl}common/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/bass.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/index.css" rel="stylesheet"/>
     <script type="text/javascript" src="${baseurl}js/tbdValidate.js"></script>
</head>
<body>
	<div>
             <header>
                  <div class="header" style="position:relative;">
                      <h1>设置新密码</h1>
                      <a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16" style="position:absolute;top:14px;left:18px;"></i></a>
                  </div>
              </header>	
	          <div style="height: 2.5rem;"></div>
	               </div>
			    <div class="register reset-password">
	                   <form action="" id="resetpawForm" method="post" class="input-group register-group">
	                   		<div class="input-row reset-p">
	                               <label><i class="icon-uniE937"></i></label>
	                               <input id="oldPaw" type="password" name="oldpass" placeholder="请输入当前密码" >
	                               <div id="oldPaw_text" class="account_warning" style="color: #d45252;"></div>
	                           </div>
	                           <div class="input-row reset-p">
	                               <label><i class="icon-uniE937"></i></label>
	                               <input type="password" id="newPaw1" name="newpass" placeholder="请设置新密码" >
	                              <div id="newPaw1_text" class="account_warning" style="color: #d45252;"></div>
	                           </div>
	                           <div class="input-row reset-p">
	                               <label><i class="icon-uniE937"></i></label>
	                               <input type="password" id="newPaw2" placeholder="请重新输入一遍密码" >
	                              <div id="newPaw2_text" class="account_warning" style="color: #d45252;"></div>
	                               </div>	
	                           <button type="button" id="resetpaw" class="btn cy-btn reset-p-a"  style="background:#ff4e00;">提交</button>     
	                   </form>
                </div>                
                	<div class="toolTip-box" style="display: none;">
                <div class="toolTip-flop">
                    <i class="icon-uniE931 hint"></i>
                    <b>提示信息</b>
                    <p id="errorInfo">重置成功</p>
                    <div class="btnbox">
                        <a href="#" class="btn btn-b hidePopup">确定</a>
                    </div>
                </div>
			</div>
<script type="text/javascript" src="${baseurl}common/js/jquery.min.js"> </script>
<script type="text/javascript" src="${baseurl}js/jquery-form.min.js"></script>
       <script type="text/javascript">
   	var regconfig=[
   				{eleinput:"oldPaw",eletext:"oldPaw_text",rule:[{reg:/^.+$/,text:"旧密码不能为空"},{reg:/^.{6,10}$/,text:'密码在6-10位之间'}]},
   				{eleinput:"newPaw1",eletext:"newPaw1_text",rule:[{reg:/^.+$/,text:"新密码不能为空"},{reg:/^.{6,10}$/,text:'密码在6-10位之间'}]},
   				{eleinput:"newPaw2",eletext:"newPaw2_text",rule:[{reg:/^.+$/,text:"新密码不能为空"},{reg:/^.{6,10}$/,text:'密码在6-10位之间'}]}
   					];			
   		tbdValidate(
   				regconfig,
   				{
   					elesubmit:"resetpaw",//提交按钮
   					funsubmit:function(){//验证通过可提交回调 			
   						//信息提交接口
   						alert("成功");
   						resetPdw();
   					},
   					funerr:function(){//不可提交回调   						
   					},
                       funerrlist:function(errlist){
                           $('#'+ errlist[0]).focus();
                       }	
   				}
   			);    		
   		function resetPdw(){
   			var options = {
        			url:"${baseurl}resetPaw.do",
       				beforeSubmit : function(){						
               			return true ; //必须返回true,否则,请求终止.
       				},
       				success : function(result){      					
       					if(result.status == 200){       						
    						$(".toolTip-box").show();
    						$('#resetpawForm')[0].reset();
       					}else{
       						$("#errorInfo").html(result.msg);
    						$(".toolTip-box").show();
       					}
            		}	
        		};        		
        		$("#resetpawForm").ajaxSubmit(options); //异步提交	    		    
			}
   		
  		$(document).ready(function(){
		    $(".hidePopup").click(function(){
		        $(".toolTip-box").hide();
		    });	        
	   }); 		   		  		
       </script>
</body>
</html>