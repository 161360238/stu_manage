<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%
		pageContext.setAttribute("APP_PATH",request.getContextPath());
	%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>Document</title>
    <script src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script> 
	<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="${baseurl}admin/lib/layui/layui.js" charset="utf-8"></script>
    <link href="${APP_PATH }/static/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/bass.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/index.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/new.css" rel="stylesheet"/>
  
</head>
<body>
	<div>
		<header>
			<div class="header">
				<h1>发布公告</h1>
				<a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16"></i></a>
			</div>
		</header>	
		<div style="height: 2.5rem;"></div>
	</div>
	
	<!-- 发布圈子 circlePublish-->
	<div class="c-Publish">
	<form action="" id="seacherInfo" method="POST" enctype="multipart/form-data">
			<div class="Pu-text">
				<textarea rows="4" id="notice" name="notice" placeholder="在这里编辑公告内容..."></textarea>	
			</div>
			<div class="Pu-img">
					上传图片：
					<image id="blah" style="width:100px; height:100px;"/>
					
					<input type="file" name="photo" id="imgInp">
			</div>
			<!-- <input type="submit" value="发布" class="btn btn-max btn-green"> -->
	</form>
	</div>
	 <button class="btn btn-max btn-green" onclick="dcse()">发布</button> 
	<!-- 发布圈子 circlePublish end-->
	
		<script src="${APP_PATH}/admin/lib/layui/layui.js" charset="utf-8"></script>
        <script src="${APP_PATH}/admin/js/x-layui.js" charset="utf-8"></script>
         <script type="text/javascript" src="${baseurl}js/jquery-form.min.js"></script>
        
<script>

			function readURL(input) {
			    if (input.files && input.files[0]) {
			        var reader = new FileReader();
			
			        reader.onload = function (e) {
			            $('#blah').attr('src', e.target.result);
			        }
			        reader.readAsDataURL(input.files[0]);
			    }
			}
			
			$("#imgInp").change(function(){
			    readURL(this);
			});



				function dcse(){	
				var options = {
					url:"${APP_PATH}/notice/uploadPic.do", 				
						success : function(result){
						if(result.code==100){
							alert(result.extend.msg);
							window.location.href='${APP_PATH}/notice/selectAllNotice.do';
						}else{
							alert(result.extend.msg);
						}
						
					},
					error:function(){
						alert("请上传大小在8M以下图片");
					}
				};        		
				$("#seacherInfo").ajaxSubmit(options); //异步提交
				return ;        
				
				}
				
				
        layui.use( 'layer', function(){
      	  var layer = layui.layer;
        });
           

            /*启用*/
            function admin_start(zcid){
                layer.confirm('确认删除该班级吗？',function(index){
                    //发异步把用户状态进行更改
                      $.ajax({
					   type: "POST",
					   url: "${APP_PATH}/addClass/delZclazzByZcid.do",
					   data: {"zcid":zcid},
					   success: function(msg){
						   layer.msg('已经删除!',{icon: 6,time:1000});
						   window.location.reload();
					   }
					}); 
                   /*  $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="admin_stop(this,"${item.cid }")" href="javascript:;" title="正在实训"><i class="layui-icon">&#xe601;</i></a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="layui-btn layui-btn-normal layui-btn-mini">正常上课</span>');
                    $(obj).remove(); */
                   
                });
            }
   
          
            </script>
</body>

</html>