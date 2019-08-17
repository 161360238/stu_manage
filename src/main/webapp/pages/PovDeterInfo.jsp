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
	        <input id="fammly" type="hidden" value="${stu2.fammly}">             
 
           <div class="layui-form-item layui-form-text">
                    <label for="desc" class="layui-form-label">
                      	  选项信息
                    </label>
                    <div class="layui-input-block">
                        <textarea placeholder="无信息"  id="textfammly" name="fammly" class="layui-textarea"></textarea>
                    </div>
                </div>
      	</form>	   
    </div> 
    <script> 
    $(function(){   				
		$("#textfammly").val($("#fammly").val());		
	});          
    </script>
</body>
</html>