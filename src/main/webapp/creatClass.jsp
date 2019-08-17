<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	pageContext.setAttribute("APP_PATH",request.getContextPath());
%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
  	<link href="${APP_PATH }/common/fonts/iconfont.css" rel="stylesheet"/>
  	<link href="${APP_PATH }/common/css/new.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/bass.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/index.css" rel="stylesheet"/>
    <link href="${APP_PATH }/common/css/zmw.css" rel="stylesheet"/>
    
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	
</head>
<body>
<div>
    <header>
        <div style="height:50px;width:100%;background-color: #FC605A">
        	<a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16" style="height: 50px;line-height: 50px;font-size: 20px;color:#ffffff"></i></a>
            <span style="width: 100%;height: 50px;line-height: 50px;font-size: 20px;color:#ffffff;margin-left:40%">创建班级</span>
        </div>
    </header>
    <div style="height: 5rem"></div>
</div>

<div>
<div style="width: 100%">
    <span style="font-size: 20px;width: 30%;margin:8% 3%">班级名称：</span>
    <div style="display: inline-block;width: 60%">
        <input type="text" placeholder="请输入班级名字" aria-describedby="basic-addon1" class="form-control" id="cname" style="margin: 10px 0px">
    </div>
</div>
<div style="width: 100%">
    <span style="font-size: 20px;width: 30%;margin:8% 3%">班级类型：</span>
    <div class="radio" style="display: inline-block;width: 60%">
        <input type="radio" class="radio-la" name="gender" id="optionsRadios1" value="min"><label for="optionsRadios1" class="group-T-l icon-uniE940" style="font-size: 18px">小班</label>
        <input type="radio" class="radio-la" name="gender" id="optionsRadios2" value="max"><label for="optionsRadios2" class="group-T-2 icon-uniE940" style="font-size: 18px">大班</label>

    </div>
</div>
<div style="width:90%">
    <span style="font-size: 20px;margin:8% 3%">选择班级：</span>
    <div style="margin-left:3%">
        <div id="dyear" style="margin-left:5%"><span>年级：</span></div>
        <div id="dmajor" style="margin-left:5%"><span>专业：</span></div>
        <div id="dclazz" style="margin-left:5%"><span>班级：</span></div>
    </div>
</div>

<div id="btn">
  <!--   <button id="btn1" type="button" class="btn btn-success btn-lg" style="width: 90%;margin-left: 5%;">提交</button> -->
</div>

</div>


 	<script type="text/javascript">
		$(function(){
			 $(":radio").click(function(){
				  	   $("#dyear").empty();
					   $("#dyear").html("<span>年级：</span>");
					   var vid1=$("<select id='year' class='form-control' ><option value='0'>--请选择--</option></select>")
			         	.appendTo("#dyear");
					   $("#dmajor").empty();
					   $("#dmajor").html("<span>专业：</span>");
			         	var vid2=$("<select id='major' class='form-control' ><option value='0'>--请选择--</option> </select>")
			         	.appendTo("#dmajor");
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
						
				  if($(this).val()=="min"){
					  
					  
					  //如果创建小班级
					  	$("#btn").empty();
					  	$("#btn").html("<button id='btn1' type='button' class='btn btn-success btn-lg' style='width: 90%;margin-left: 5%;''>创建小班</button>");
					  	
			         	 $("#dclazz").empty();
			         	 $("#dclazz").html("<span>班级：</span>");
			         	var vid3=$("<select id='clazz' class='form-control' ><option value='0'>--请选择--</option> </select>")
			         	.appendTo("#dclazz");
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
					//如果建小班，获取下拉框的值，记录插到自建班级里面
						$("#btn1").click(function(){
							if($("#cname").val().length==0){
		                        alert("请输入班级名字");
		                        return false;
		                    }
		                    var clazz=$("#clazz").val();  //获取行政班级的ID
		                    
		                    if(clazz==null||clazz==""||clazz==0){
		                    	alert("请选择班级");
		                        return false;
		                    }
		                    var zclassname=$("#cname").val();    //获取创建班级的名称
		                    url='${APP_PATH }/addClass/addZclass.do';
		                    data={"clazzs":clazz,"zclassname":zclassname};
		                    $.ajax({
		                        type:"GET",
		                        url:url,
		                        data: data,
		                        dataType:'json',
		                        success:function(result){
		                        	alert("创建班级成功"); 
		                            //location.href = '${APP_PATH }/Test.jsp';
		                        	location.href = '${APP_PATH }/addClass/selectZclass.do';
		                        },
		                        error:function(){
		                            alert("创建班级失败");
		                        },
		                    });
		                });
		//--------------------------------------------------------------------------------------------------------
		            }else{
		             	$("#btn").empty();
					  	$("#btn").html("<button id='btn2' type='button' class='btn btn-success btn-lg' style='width: 90%;margin-left: 5%;''>创建大班</button>");
			         	 $("#dclazz").empty();
			         	 $("#dclazz").html("<span>班级：</span>");

			             //选择专业后，显示班级，多选
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
					                	var emps = result.extend.msg; 
					               	    $("#dclazz").empty();
							         	 $("#dclazz").html("<span>班级：</span><br>");
					                	$.each(emps,function(index,item){
					                		var val=item.cname;
					                		var check=$("<input type='checkbox' name='clazzs'/>").attr("value",item.cid);
											var checkBoxTd = $("<label ></label>").append(check);
											var checkBoxTd2 = $("<label></label>").append(val+"&thinsp;&thinsp;&thinsp;&thinsp;");	
					        				$("#dclazz").append(checkBoxTd);
					        				$("#dclazz").append(checkBoxTd2);
					        			});	
					                },
					                error:function(){    	
					                	 alert("请求失败");
					                },
					        	});
						});
			             //点击提交按钮，提交创建班级的请求
							 $("#btn2").click(function(){
								 if($("#cname").val().length==0){
				                        alert("请输入班级名字");
				                        return false;
				                    }
								 
									var box = document.getElementsByName("clazzs");
									var objArray = box.length;
									var chestr="";
									var zclassname=$("#cname").val();
									for(var i=0;i<objArray;i++){
										if(box[i].checked == true){
											chestr+=box[i].value+",";
										} 
									}
									if(chestr==""){
										alert("请选择班级");
				                        return false;
									}
									url='${APP_PATH }/addClass/addZclass.do';
									data={"clazzs":chestr,"zclassname":zclassname};
									
									 $.ajax({
							                type:"GET",
							                url:url,
							                data: data,
							                dataType:'json',
							                 success:function(result){
							                    //alert(result.extend.msg);
							                	alert("创建班级成功"); 
							                	//location.href = '${APP_PATH }/Test.jsp';  /addClass/selectZclass.do
							                	location.href = '${APP_PATH }/addClass/selectZclass.do';
							                },
							                error:function(){    	
							                	 alert("创建班级失败");
							                }, 
							        	});
						        }); 
				  }
				  });
		});
	</script>
</html>