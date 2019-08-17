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
    <%
	pageContext.setAttribute("APP_PATH",request.getContextPath());
    pageContext.setAttribute("rid",request.getParameter("id"));
	%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
  <body>

  		 <div><h3>重新分配：</h3></div>
		 <div>
		 		<div id="dyear"><h4>年级：</h4> <br></div>
				<div id="dmajor"><h4>专业：</h4> <br></div>
				<div id="dclazz"><h4>班级：</h4> <br></div>
	   	</div>	
  <button id="btn1" type="button" class="btn btn-success btn-lg">提交</button>
  
        <!-- <div class="x-body">
            <form id="seacherInfo" class="layui-form layui-col-md12 x-so" action="" method="POST">
		                <div class="layui-form-item">
		                    <label for="year" class="layui-form-label">
		                        <span class="x-red">*</span>年级
		                    </label>
		                    <div  class="layui-input-inline">
		                      <select name="productList" lay-verify="required" id="year">
							       <option value=""></option>
							        <option value="0">北京</option>
							        <option value="1">上海</option>
							        <option value="2">广州</option>
							        <option value="3">深圳</option>
							        <option value="4">杭州</option>
							      </select>
		                    </div>
		                    <div class="layui-form-mid layui-word-aux">
		                        <span class="x-red">*</span>（必填项）
		                    </div>
		                </div>
                
                 <div class="layui-form-item">
                    <label for="year" class="layui-form-label">
                        <span class="x-red">*</span>专业
                    </label>
                    <div class="layui-input-inline">
                       <select name="city" lay-verify="required">
					        <option value=""></option>
					        <option value="0">北京</option>
					        <option value="1">上海</option>
					        <option value="2">广州</option>
					        <option value="3">深圳</option>
					        <option value="4">杭州</option>
					      </select>
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>（必填项）
                    </div>
                </div>
                  <div class="layui-form-item">
                    <label for="year" class="layui-form-label">
                        <span class="x-red">*</span>专业
                    </label>
                    <div class="layui-input-inline">
                       <select name="city" lay-verify="required">
					        <option value=""></option>
					        <option value="0">北京</option>
					        <option value="1">上海</option>
					        <option value="2">广州</option>
					        <option value="3">深圳</option>
					        <option value="4">杭州</option>
					      </select>
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>（必填项）
                    </div>
                </div>
               <div class="layui-form-item">
                    <label for="L_repass" class="layui-form-label"></label>
				        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                </div>
            </form>
              <div class="layui-form-item" >
              	   <center>
                    <label for="L_repass" class="layui-form-label"></label>
          		    <button class="layui-btn" onclick="dcse()">确认分配</button>
          		   </center>  
             </div>
        </div>
            -->
           
        <script src="${baseurl}admin/lib/layui/layui.js" charset="utf-8"></script>
        <script src="${baseurl}admin/js/x-layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="${baseurl}common/js/class.js"></script>
	    <script type="text/javascript" src="${baseurl}common/js/method01.js"></script>
	    <script type="text/javascript" src="${baseurl}admin/js/xadmin.js"></script>
	    <script type="text/javascript" src="${baseurl}js/jquery-1.12.4.min.js"></script>
	    <script type="text/javascript" src="${baseurl}js/jquery-form.min.js"></script>
	    <script type="text/javascript">

	   /*  function dcse(){	
	    	var year=$("#year").val();
	    	var major=$("#major").val();
	    	var class1=$("#class1").val();
	    	var options = {
	    			type: 'post', // 提交方式 get/post
	    			url:"${baseurl}addClass/add.do", 	
	    			data:{"year":year,
	    				  "major":major,
	    				  "class":class1},
	   				success : function(result){
	        			//alert(result.code)
	        			if(result.code==100){
	        				layer.alert('班级添加成功')
	        			}else{
	        				layer.alert("这个班级已经存在");
	        			}
	        		}	
	    		};        		
	    		$("#seacherInfo").ajaxSubmit(options); //异步提交
	    		return ;        
			
	    } */
	     layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
	    }); 
	    </script>   
    </body>
<script type="text/javascript">
		 $(function(){
			 $("#dyear").empty();
			   $("#dyear").html("<h4>年级：</h4>");
			   var vid1=$("<select id='year' class='form-control' ><option value='0'>--请选择--</option></select>")
	         	.appendTo("#dyear");
			   
			   $("#dmajor").empty();
			   $("#dmajor").html("<h4>专业：</h4>");
	         	var vid2=$("<select id='major' class='form-control' ><option value='0'>--请选择--</option> </select>")
	         	.appendTo("#dmajor");
			
	         	//如果创建小班级
	         	 $("#dclazz").empty();
	         	 $("#dclazz").html("<h4>班级：</h4>");
	         	var vid3=$("<select id='clazz' class='form-control' ><option value='0'>--请选择--</option> </select>")
	         	.appendTo("#dclazz");

				//页面加载完成，显示年份
				url='${APP_PATH }/addClass/selectYear.do';
				 $.ajax({
		                type:"GET",
		                url:url,
		                dataType:'json',
		                success:function(result){
		                	var emps = result.extend.msg;
		                	$.each(emps,function(index,item){
		        				var checkBoxTd = $("<option></option>").attr("value",item.cgrade).text(item.cgrade);
		        				$("#year").append(checkBoxTd);
		        			});	
		                },
		                error:function(){    	
		                	 alert("请求失败");
		                },
		        	});
			
				//年份选择完成后，获取专业信息
					$("#year").change(function(){
						url='${APP_PATH }/addClass/selectMajor.do';
						var year=$("#year").val();
						 $.ajax({
				                type:"GET",
				                url:url,
				                data:{"year":year},
				                dataType:'json',
				                success:function(result){
				                	$("#major").empty();
				                	var checkBoxTd = $("<option></option>").attr("value",0).text("请选择");
			        				$("#major").append(checkBoxTd);
				                	var emps = result.extend.msg;
				                	$.each(emps,function(index,item){
				                	
				        				var checkBoxTd = $("<option></option>").attr("value",item).text(item);
				        				$("#major").append(checkBoxTd);
				        			});	
				                },
				                error:function(){    	
				                	 alert("请求失败");
				                },
				        	});
					});
					 
				//选择专业后，显示班级，单选
					$("#major").change(function(){
						url='${APP_PATH }/addClass/selectclazz.do';
						var major=$("#major").val();
						var year=$("#year").val();
						 $.ajax({
				                type:"GET",
				                url:url,
				                data:{"cmajor":major,"year":year},
				                dataType:'json',
				                success:function(result){
				                	$("#clazz").empty();
				                	var checkBoxTd = $("<option></option>").attr("value",0).text("--请选择--");
			        				$("#clazz").append(checkBoxTd);
				                	var emps = result.extend.msg;
				                	$.each(emps,function(index,item){
				        				var checkBoxTd = $("<option></option>").attr("value",item.cid).text(item.cname);
				        				$("#clazz").append(checkBoxTd);
				        			});	
				                },
				                error:function(){    	
				                	 alert("请求失败");
				                },
				        	});
					});
				
					 $("#btn1").click(function(){
							var clazz=$("#clazz").val();  //获取行政班级的ID
							var rid='${rid}';
							url='${APP_PATH }/room/disRoom.do';   
							data={"clazzs":clazz,"rid":rid};
							$.ajax({
					                type:"GET",
					                url:url,
					                data: data,
					                dataType:'json',
					                 success:function(result){
					                	alert("请求成功");
					                },
					                error:function(){    	
					                	 alert("请求失败");
					                }, 
					        	});
				        });	

		});

</script>
</html>