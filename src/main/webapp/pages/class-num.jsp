<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/jsp/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>欢迎页面-X-admin2.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${baseurl}admin/css/font.css">
    <link rel="stylesheet" href="${baseurl}admin/css/xadmin.css">
    <link rel="stylesheet" href="${baseurl}common/css/new.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="${baseurl}admin/lib/layui/layui.js" charset="utf-8"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
  <body>
        <div class="x-body">
            <form id="seacherInfo" class="layui-form layui-col-md12 x-so" action="" method="POST">
                <div class="layui-form-item">
                    <label for="cscore" class="layui-form-label">
                        <span class="x-red">*</span>班级评分
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="cscore" value="${cscore }"
                        autocomplete="off" class="layui-input">
                    </div>
                     <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>保留一位小数
                    </div> 
                </div>
                
             
              
            </form>
              <div class="layui-form-item" >
              	   <center>
                    <label for="L_repass" class="layui-form-label"></label>
          		    <button class="layui-btn" onclick="dcse()">提交</button>
          		   </center>  
             </div>
        </div>
           
           
        <script src="${baseurl}admin/lib/layui/layui.js" charset="utf-8"></script>
        <script src="${baseurl}admin/js/x-layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="${baseurl}common/js/class.js"></script>
	    <script type="text/javascript" src="${baseurl}common/js/method01.js"></script>
	    <script type="text/javascript" src="${baseurl}admin/js/xadmin.js"></script>
	    <script type="text/javascript" src="${baseurl}js/jquery-1.12.4.min.js"></script>
	    <script type="text/javascript" src="${baseurl}js/jquery-form.min.js"></script>
	    <script type="text/javascript">

	    function dcse(){	
	    	
	    	var cid='${cid}';
	    	var cscore=$("#cscore").val();
	    	var options = {
	    			type: 'POST', // 提交方式 get/post
	    			url:"${baseurl}alterCscore.do", 	
	    			data:{"cscore":cscore,
	    				  "cid":cid},
	   				success : function(result){
	        			//alert(result.code)
	        			if(result.code==100){
	        				layer.alert('修改成功')
	        			}else{
	        				layer.alert("修改失败");
	        			}
	        		},
	    				error:function(){
	    					alert("修改失败");
	    				}
	    		};        		
	    		$("#seacherInfo").ajaxSubmit(options); //异步提交
	    		return ;        
			
	    }
	    layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
	    });
	    </script>   
    </body>

</html>