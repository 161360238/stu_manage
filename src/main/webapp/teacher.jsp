<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%
		pageContext.setAttribute("APP_PATH",request.getContextPath());
	%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>Document</title>
    <link href="${APP_PATH }/static/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${APP_PATH }/static/css/bass.css" rel="stylesheet"/>
    <link href="${APP_PATH }/static/css/index.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/new.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/bass.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/index.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/zmw.css" rel="stylesheet"/>
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-2.2.3.js"></script>
    
    
    <style>
        .firmD-menu input{
            width: 70%;
            height:20px;
            margin-top: 5px
        }
        .firmD-menu ul li{
            border-bottom:none;
        }
    </style>
<%
	session.setAttribute("session_cid", request.getParameter("zcid"));  //设置班级ID
%> 
</head>
<body>
<div>
    <header>
        <div style="height:50px;width:100%;background-color: #FC605A">
            <a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16" style="height: 50px;line-height: 50px;font-size: 20px;color:#ffffff"></i></a>
            <span style="width: 100%;height: 50px;line-height: 50px;font-size: 20px;color:#ffffff;margin-left:40%">创建班级</span>
        </div>
    </header>
    <div style="height: 2.5rem"></div>
</div>
<div class="firmD-menu">
	<ul class="vconlist">
		<li class="tab_content show">
                <li style="margin-top: 25px">
                    <span class="span-blue" ><font size="4px">签到码：</font></span>
                    <span id="get_msg"></span>
                </li>
                <li>
                <button id="change" style="width: 90%;margin:20px 5%" class="btn btn-info">获取签到码</button>
            </li>
            <li>
                    <span class="span-blue"><font size="4px">有效时间：</font></span>
                    <input type="text" id="time" name="time" placeholder="输入有效签到时间" class=" input-teacher" >
            </li>
            <li>
                <button id="start" style="width: 90%;margin:10px 5%" class="btn btn-info">开始签到</button>
            </li>
            <li>
                    <span class="span-blue">时间剩余:</span>
                    <input id="second_show" type="text" placeholder="" class=" input-teacher" style="border:none">
            </li>
            <li>
            		<span class="span-blue">已签到数:</span>
                    <input type="text" id="num_show" placeholder="" class=" input-teacher" style="border:none">
            </li>
            </ul>
            </div>
	<a id="detail_show" href="${APP_PATH}/attend/showDetail.do"></a>
</body>

<script type="text/javascript">
	var intDiff = parseInt('1');
	var interval2;
	
    $(function () {
    	
    	//点击获取验证码
        $("#change").click(function () {  
        	
            var url = '${APP_PATH }/attend/getAttendCode.do';
            $.ajax({
                type:"POST",
                url:url,
                data: {"a":new Date().getTime()},
                dataType:'json',
                success:function(result){
                   /*  $("#get_msg").val(result.extend.Q_code); */
                	 $("#get_msg").text(result.extend.Q_code);
                },
                error:function(){    	
                    $("#get_msg").text('link fail');
                },
          
        	});
        });
    	
    	//点击开始，发起签到开始请求
    	$("#start").click(function(){
    		
    		var url="/stu_manage/attend/begin.do";
    		var time=$("#time").val();
    		time=time.trim();
    		if(time==null||time==""){
    			alert("请输入有效签到时间！");
    		}else if(time==0||time=="0"){
    			alert("请重新输入有效签到时间！")
    		}else{
    			$.ajax({
       			 type:"POST",
                    url:url,
                    data: {"time":time},
                    dataType:'json',
       		});
       		//倒计时开始
       		timer(intDiff);
       		//实时显示签到人数
       	   	getnum();
    		}
    		$("#start").attr('disabled',true);
    	});
    });
    	
	//显示签到时间剩余多少秒			
    function timer(intDiff){
		
    	  var times=$("#time").val();
    	  if(times.length==0){
    		  time=2;
    	  }
          intDiff = parseInt(times);//倒计时总秒数量
          
        var interval1= window.setInterval(function(){
        var second=0;//时间默认值 
        if(intDiff > 0){
        	second =intDiff;
        }
        $('#second_show').val(+second+'秒');
        intDiff--;
        if(intDiff<0){
        	clearInterval(interval1);  //时间到，停止计时
        	clearInterval(interval2);  //时间到，停止发送查询签到人数的请求
        	stop();
        }
        
        }, 1000);
    } 
	
	
  //每隔一秒发送一个ajax请求，动态显示签到的人数
	function getnum(){
		var url="/stu_manage/attend/getnum.do";
		 interval2= window.setInterval(function(){
			//  alert("aaa");
			 $.ajax({
				 type:"POST",
	            url:url,
	            dataType:'json',
	            success:function(result){
	            	  $('#num_show').val(result.extend.num+'人');
                },
			});
	}, 1000);	
  }
  
  //发送给服务端，签到时间截止
  function stop(){
	  var url="/stu_manage/attend/stop.do";
	  $.ajax({
		type:"POST",
         url:url,
         dataType:'json',   	 
		});
	  alert("签到已经截止");
	  $("#start").attr('disabled',false);
	  $("#detail_show").html("点击查看详细签到情况");
  }
  
  
   
</script>
</html>