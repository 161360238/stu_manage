<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
    <title>我的详情</title>
    <link href="${baseurl}common/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/bass.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/index.css" rel="stylesheet"/>
	<link href="${baseurl}common/css/new.css" rel="stylesheet"/>
	<script type="text/javascript" src="${baseurl}js/tbdValidate.js"></script>	 
</head>
<body>	
 	<div>
        <header>
            <div class="header" style="position:relative;">
                <h1>信息认证</h1>
                <a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16" style="position:absolute;top:14px;left:18px;"></i></a>
            </div>
        </header>
        <div style="height: 2.5rem;"></div>
    </div>
    	<input  type="hidden" id="status" value="${activeUser.status } ">
   <form action="" method="POST" id="infoForm" enctype="multipart/form-data" >
               <label for="addr-show">
               <input type="hidden" value="null" id="addr-show0"  name="sgrade" >
               <input type="hidden" value="null" id="addr-show1"  name="smajor" >
               <input type="hidden" value="null" id="addr-show2"  name="cname" >
               <input type="hidden" value="null" id="addr-show3"  name="rid" > 
           </label>
           <input type="hidden" value="null" id="reid" name="reid"> 
		<!-- 企业详情 firmDetails -->
		<div class="firmDetails">
			<div class="firmD-head">
				<div class="user-info-content">
					<div id="showImg" style="width: 62px;">
					<c:if test="${activeUser.simage == ''}">
						<img src="${baseurl}common/images/user-img2.png" id="photo">
					</c:if>
					<c:if test="${activeUser.simage != ''}">
						<img src="${baseurl}pics/pictures/${activeUser.simage}" >
					</c:if>	 			
					</div>
					<div class="user-info-message" >
						<span>${activeUser.username}</span>
						<c:if test="${activeUser.status == 2}">
							<span class="xj-result">信息已认证</span>
						</c:if>
						<c:if test="${activeUser.status == 1}">
								<span class="xj-result">信息未认证</span>
						</c:if>
					</div>
					<label style="color:red;" class="changePhotoLabel">修改头像</label>
					<div class="changePhotoDiv" style="display:none;width: 325px;height:500px;border: 1px solid #000;">
						<label style="color:red;" for="up_img">上传图片</label>
						 <input  type="file" name="myimage" id="up_img" onchange="fileUpLoad(this);"/> 	
					</div>
				</div><br>
			</div>
		</div>
			<div class="firmD-tab">
				<div class="unPassMessage" style="display: block">
						<fieldset>
							<legend>基本信息</legend>
							<div style="position:relative">
								<label>姓&nbsp;&nbsp;名:</label><input id="sname" type="text"  name="sname" style="margin:0px;padding:0px;width:79%;"><br />	<br/>
								<div id="name_text" class="authen_warning">姓名</div>						
							</div>							
							<label>性&nbsp;&nbsp;别:</label>
								 <input type="radio" name="ssex" value="1">男
								 <input type="radio" name="ssex"  value="0">女<br /><br/>
						<div style="position:relative">
							<label>院&nbsp;&nbsp;系:</label>
							<input type="text" id="colname" name="colname" style="margin:0px;padding:0px;width:79%;"><br /><br/>	
							<div id="school_text" class="authen_warning">院系</div>										  		       
						</div>													     			 							      
				        <label>班&nbsp;&nbsp;级:</label>					
				            <select id="prov" style="padding:0px;width:25%;" >
				                <option id="sgrade" >-入学年份-</option>
				                <c:forEach items="${grade}" var="items">
				                	<option value="${items.reid }">${items.cgrade}</option>						                	
				                </c:forEach>						
				            </select>												         
				            <select id="city" class="ctiy" style="padding:0px;width:25%;"  >
				                <option id="smajor">-选择专业-</option>
				            </select>												           
				            <select id="country" style="padding:0px;width:27%;"  >
				                <option id="cname">-选择班级-</option>
				            </select><br><br>
				                                 宿舍 <select id="weroom" style="padding:0px;width:27%;" >
				             	  <option id="roomMarker">-选择宿舍-</option>
				            </select><br><br> 				            
						      <div style="position:relative">
							<label>学&nbsp;&nbsp;号:</label><input type="text"  id="InputSnum" name="InputSnum" style="margin:0px;padding:0px;width:79%;"><br /><br/>
							<div id="stu_number_text" class="authen_warning">学号</div>
							</div>	
							<div style="position:relative">
							<label>手机号:</label><input type="text" id="sphone" name="sphone" style="margin:0px;padding:0px;width:78%;"><br /><br/>
							<div id="sphone_text" class="authen_warning">手机号</div>
							</div>
													    
						</fieldset>						
				</div>		 			
			</div>
	 </form> 
	<button id="infoFrom" class="btn met1" style="width:100px;height:30px;background-color: #FC605A;margin-left:30%;border-radius: 10px;border: 0;" >提交</button>
	  	
	  			<div class="toolTip-box" style="display: none;">
                <div class="toolTip-flop">
                    <i class="icon-uniE931 hint"></i>
                    <b>提示信息</b>
                    <p id="errorInfo">认证成功</p>
                    <div class="btnbox">
                        <a href="#" class="btn btn-b hidePopup">确定</a>
                    </div>

                </div>
			</div>
</body>
</html>

<script type="text/javascript" src="${baseurl}common/js/jquery.min.js"> </script>
<script type="text/javascript" src="${baseurl}js/jquery-form.min.js"></script>
<script type="text/javascript">
var regconfig=[
               {eleinput:"sname",eletext:"name_text",rule:[{reg:/^.+$/,text:"姓名不能为空"},{reg:/^[\u4e00-\u9fa5]{2,4}$/,text:"姓名填写格式错误"}]},
               {eleinput:"colname",eletext:"school_text",rule:[{reg:/^.+$/,text:"院系不能为空"},{reg:/^[\u4e00-\u9fa5]{6}$/,text:"院系填写格式错误"}]},
               {eleinput:"InputSnum",eletext:"stu_number_text",rule:[{reg:/^.+$/,text:"学号不能为空"},{reg:/^\d{9}$/,text:"学号填写格式错误"}]},
               {eleinput:"sphone",eletext:"sphone_text",rule:[{reg:/^.+$/,text:"手机号不能为空"},{reg:/^1[34578]\d{9}$/,text:"手机号填写格式错误"}]},               
           ];
     tbdValidate(
               regconfig,
               {
                   elesubmit:"infoFrom",//提交按钮
                   funsubmit:function(){
                	   AuthStuInfo();
                   },
                   funerr:function(){//不可提交回调
                   },
                   funerrlist:function(errlist){
                       $('#'+ errlist[0]).focus();
                   }
               }
           );
    	$(function(){
 		var selobj = document.getElementById("prov");
 			selobj.onchange = function(){
 			var cityEle = document.getElementById("city");
			cityEle.options.length=0;
 			$.ajax({
 				url:'${baseurl}selectCmajor.do',
 				type:'POST',
 				data:{reid:$("#prov").val()},
 				success:function(result){
 					console.log(result)
 					for(var i = 0; i < result.length ;i++){						
 					 var cityOpt = document.createElement('option');
 			            cityOpt.innerText = result[i].cmajor;
 			            cityOpt.value = result[i].reid;	 			          
 			            $("#city").append(cityOpt);
 					}
 				}				
 			});			
 		}		
 		var selectobj = document.getElementById("city");
 		selectobj.onchange = function(){
 			var cityEle = document.getElementById("country");
			cityEle.options.length=0;
 			$.ajax({
 				url:'${baseurl}selectClass.do',
 				type:'POST',
 				data:{reid:$("#city").val()},
 				success:function(result){
 					console.log(result)
 					for(var i = 0; i < result.length ;i++){						
 					 var cityOpt = document.createElement('option');
 			            cityOpt.innerText = result[i].cname;
 			            cityOpt.value = result[i].reid;
 			            $("#country").append(cityOpt);
 					}
 				}
 			});		
 		} 				
 		 var selectobj = document.getElementById("country");
 			selectobj.onchange = function(){
 			var cityEle = document.getElementById("weroom");
			cityEle.options.length=0;
 			$.ajax({
 				url:'${baseurl}selectCname.do',
 				type:'POST',
 				data:{reid:$("#country").val()},
 				success:function(result){
 					for(var i = 0; i < result.length ;i++){						
 					 var cityOpt = document.createElement('option');
 			            cityOpt.innerText = result[i].rnum; 			         
 			            $("#weroom").append(cityOpt);
 					}
 				}
 			});		
 		} 
 		
    	});
      
		//表单提交	
		function AuthStuInfo(){
			$("#reid").val($("#country").val())				
				$(":selected").each(function(i){
					$("#addr-show"+i).val(this.innerHTML);
				})
			 					
			   for(var j = 0; j < $(":selected").length;j++){
				   //alert($("#addr-show"+j).val())
				if($("#addr-show"+j).val().indexOf("选择") !=-1 ){
					$("#errorInfo").html("信息未填写完整");
					$(".toolTip-box").show();
					return ;
				}	 	
			}  						
			var options = {
        			url:"${baseurl}addStuInfo.do",
       				beforeSubmit : function(){  						
               			return true ; 
       				},
       				success : function(result){
            			if(result.status == 200){
            				$("#errorInfo").html(result.msg);
    						$(".toolTip-box").show();
    						$("#infoFrom").attr("disabled",true);
            			}else{
    						$(".toolTip-box").show();
    					setTimeout("window.location.href='AuthenStuInfo.do'", 2000);
            			}	
            		}	
        		};        		
        		$("#infoForm").ajaxSubmit(options); //异步提交
        		return ;         			
		}
		
	$(document).ready(function(){
        $(".hidePopup").click(function(){
            $(".toolTip-box").hide();
        });	        
    }); 
	
	if(	$("#status").val() == 2){
		showStu();
		//表单只读	
		$("#infoFrom").attr("disabled",true);
		}
	//学生信息回显
	function showStu() {
		$.ajax({
			type:"POST",
			url:"${baseurl}showStuInfo.do",
			success:function(data) {
				 $("#sname").val(data.sname);
				$(":radio[value=" + data.ssex +"]").attr("checked","true")
				$("#sgrade").text(data.sgrade)
				$("#smajor").text(data.smajor)
				$("#cname").text(data.cname)				
				$("#colname").val(data.colname)
				$("#InputSnum").val(data.snum)
				$("#sphone").val(data.sphone);
				$("#roomMarker").text(data.rid)	 					
			}
		});
	}		
</script>
<script type="text/javascript">	

	//需求：点击提交按钮后，span标签的文字变成信息认证通过，直接显示信息
	//获取事件源及相关元素
	var unPassMessage=document.getElementsByClassName("unPassMessage")[0];
	var img=document.getElementById("photo");
	var label=document.getElementsByClassName("changePhotoLabel")[0];
	var changePhoto=document.getElementsByClassName("changePhotoDiv")[0];
	var imgCont = document.getElementById("showImg");
			
	  //头像上传功能
	label.onclick=function () {
        unPassMessage.style.display="none";
    //    passMessage.style.display="none";
		changePhoto.style.display="block";
    }
	 function fileUpLoad(_this){
	        var file = _this.files[0];
	        if(!/image\/\w+/.test(file.type)){ //html中已经用accept='image/*'限制上传的是图片了，此处判断可省略
	            alert("文件必须为图片！");
	            return false;
	        }
	        if(!FileReader){
	            alert("你的浏览器不支持H5的FileReader");
	            ipt.setAttribute("disabled","disabled");//浏览器不支持禁用input type='file'文件上传标签
	            return;
	        }
	        var fileReader = new FileReader();
	        fileReader.readAsDataURL(file);//将文件读取为Data URL 读取结果放在result中
	        fileReader.onload = function(e){
	            var img = '<img src="'+this.result+'"/>';
	            imgCont.innerHTML = img;
	            changePhoto.style.display="none";
	            unPassMessage.style.display="block";
	        }
		}
</script>
