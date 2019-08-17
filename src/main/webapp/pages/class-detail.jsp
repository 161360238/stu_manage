<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/WEB-INF/jsp/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
		 <%
			pageContext.setAttribute("APP_PATH",request.getContextPath());
		%>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
		<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
		<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
		        <meta charset="utf-8">
        <title>
            学生管理系统
        </title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta name="apple-mobile-web-app-status-bar-style" content="black">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="format-detection" content="telephone=no">
         <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" href="${baseurl }admin/css/x-admin.css" media="all">
    </head>
   <body>
        <div class="x-nav">
            <span class="layui-breadcrumb">
              <a><cite>首页</cite></a>
              <a><cite>班级管理</cite></a>
              <a><cite>班级增删</cite></a>
            </span>
            <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  href="javascript:location.replace(location.href);" title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
        </div>
        <div class="x-body">
            <xblock>
		        <div class="row" style="float:right">
					<div class='form-inline'>
						<form action="${APP_PATH }/selectClazzByLike.do">
					 		<span id="dyear">年级： </span>
							<span id="dmajor">专业： </span>
							<span id="dclazz">班级： </span>
						    <button class="layui-btn x-right"  id="btn1" lay-filter="formDemo"><i class="layui-icon">&#xe615;</i></button>
						</form>
					</div>	
			   	</div>	 
            	<span class="x-left" style="line-height:40px">共有数据：${pageInfo.total } 条</span>
            	
            </xblock>
            
            <table class="layui-table">
                <thead>
                    <tr>
                        <th>
                           班级评分
                        </th>
                        <th>
                            辅导员姓名
                        </th>
                        <th>
                            班委成员
                        </th>
                        <th>
                            班级人数
                        </th>
                        <th>
                            年级
                        </th>
                        <th>
                            专业
                        </th>
                        <th>
                            班级
                        </th>
                        <th>
                            状态
                        </th>
                        <th>
                            操作
                        </th>
                    </tr>
                </thead>
                
                <tbody>
                	<c:forEach items="${pageInfo.list }" var="item">
                    <tr>
			                        <td>
			                            ${item.cscore }
			                        </td>
			                       
			                        <td>
			                        	<c:choose>
			                        		<c:when test="${item.introduce !=''}">
			                        				${item.introduce }	
			                        		</c:when>
			                        		
			                        		<c:otherwise>
			                        			<i class="layui-icon">&#xe69c;</i>(未设置)
			                        		</c:otherwise>
			                        	</c:choose>
			                        </td>
			                        <td>
			                        <a title="点击查看" href="javascript:;" onclick="admin_edit('班委成员','ClazzAdmin.do','${item.cid }','510','410')"
			                            class="ml-5" style="text-decoration:none">
			                                <i class="layui-icon">&#xe770;</i>
			                        </a>(点击查看) 
			                         <td>
			                         <!-- 班级的学生人数 -->
			                            ${item.stunum }
			                            <span id="${item.cid }"></span>
				                        	<script type="text/javascript">
				                        		var cid='${item.cid}';
					                        		$("#${item.cid }").load('${baseurl }/selectStuNum.do?cid='+cid);
					                        </script>
			                        </td>
			                        <td >
			                            ${item.cgrade }
			                        </td>
			                        <td >
			                          ${item.cmajor }
			                        </td>
			                        <td >
			                           ${item.cname }
			                        </td>
			                       
			                        <td class="td-status">
			                            <span >
			                               	<c:choose>
												<c:when test="${item.cstatue eq 1}"><span class="layui-btn layui-btn-normal layui-btn-mini">正常上课</span></c:when>
												<c:otherwise><span class="layui-btn layui-btn-disabled layui-btn-mini">正在实训</span></c:otherwise>
											</c:choose>  	
			                            </span>
			                        </td>
			                        <td class="td-manage">
			                                <%--  <c:choose>
												<c:when test="${item.cstatue eq 1}">
							                       <a style="text-decoration:none" onclick="admin_stop(this, '${item.cid }')" href="javascript:;" title="实训中">
							                            <i class="layui-icon">&#xe601;</i>
							                      </a>
												</c:when>
												<c:otherwise>
												<a style="text-decoration:none" onClick="admin_start(this,'${item.cid }')" href="javascript:;" title="正常上课">
												
													<i class="layui-icon">&#xe62f;</i>
												</a>
												</c:otherwise>
											</c:choose> --%>
										<a title="修改评分" href="javascript:;" onclick="admin_num('修改评分','editClassNum.do','${item.cid }','410','310')"
			                            class="ml-6" style="text-decoration:none">
			                                <i class="layui-icon">&#xe60e;</i>
			                            </a>
			                           
			                             <a title="设置辅导员" href="javascript:;" onclick="admin_assis('设置辅导员','ClazzAssis.do','${item.cid }','410','310')"
			                            class="ml-6" style="text-decoration:none">
			                                <i class="layui-icon">&#xe614;</i>
			                            </a>
			                            
			                            <%-- <a title="设置班委" href="javascript:;" onclick="admin_edit('班委成员','ClazzAdmin.do','${item.cid }','510','410')"
			                            class="ml-5" style="text-decoration:none">
			                                <i class="layui-icon">&#xe613;</i>
			                            </a> --%>
			                          
			                        </td>        
                    </tr>
                     </c:forEach>
                </tbody>
            </table>

 			<div class="col-md-6">
				<nav aria-label="Page navigation">
				<ul class="pagination">
					<li><a href="${APP_PATH }/selectClazzByLike.do?pn=1&year=${year}&major=${major}&clazzs=${clazzs}">首页</a></li>
					<c:if test="${pageInfo.hasPreviousPage }">
						<li><a href="${APP_PATH }/selectClazzByLike.do?pn=${pageInfo.pageNum-1}&year=${year}&major=${major}&clazzs=${clazzs}"
							aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
						</a></li>
					</c:if>


					<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
						<c:if test="${page_Num == pageInfo.pageNum }">
							<li class="active"><a href="#">${page_Num }</a></li>
						</c:if>
						<c:if test="${page_Num != pageInfo.pageNum }">
							<li><a href="${APP_PATH }/selectClazzByLike.do?pn=${page_Num }&year=${year}&major=${major}&clazzs=${clazzs}">${page_Num }</a></li>
						</c:if>

					</c:forEach>
					<c:if test="${pageInfo.hasNextPage }">
						<li><a href="${APP_PATH }/selectClazzByLike.do?pn=${pageInfo.pageNum+1 }&year=${year}&major=${major}&clazzs=${clazzs}"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a></li>
					</c:if>
					<li><a href="${APP_PATH }/selectClazzByLike.do?pn=${pageInfo.pages}&year=${year}&major=${major}&clazzs=${clazzs}">末页</a></li>
				</ul>
				</nav>
			</div>          
           
           
        </div>
        <script src="${baseurl }admin/lib/layui/layui.js" charset="utf-8"></script>
        <script src="${baseurl }admin/js/x-layui.js" charset="utf-8"></script>
        <script>
        layui.use(['laypage', 'layer','form'], function(){
      	  var laypage = layui.laypage
      	  ,layer = layui.layer
      	  ,form = layui.form;
            //以上模块根据需要引入
            form.on('submit(formDemo)', function(data){
				    layer.msg(JSON.stringify(data.field));
				    return false;
				  });
              //以上模块根据需要引入
              
		//总页数低于页码总数
		  laypage.render({
		    elem: 'page'
		    ,count: 50 //数据总数
		  });  
            });
             /*添加*/
            function admin_add(title,url,w,h){
                x_admin_show(title,url,w,h);
            }

            //编辑
            function admin_edit (title,url,id,w,h) {
                x_admin_show(title,url+"?cid="+id,w,h);
            }
            function admin_num (title,url,id,w,h) {
                 x_admin_show(title,url+"?cid="+id,w,h);
             }
            
            function admin_assis (title,url,id,w,h) {
                 x_admin_show(title,url+"?cid="+id,w,h);
             }
             /*停用*/
            function admin_stop(obj,id){
                layer.confirm('确认正在实训吗？',function(index){
                    //发异步把用户状态进行更改
                    $.ajax({
					   type: "GET",
					   url: "${baseurl}/alterStopClazz.do",
					   data: {"id":id},
					   success: function(msg){
					   /*   alert( "Data Saved: " + msg.code ); */
						   layer.msg('实训中!',{icon: 6,time:1000});
					   }
					});
                  /*   $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="admin_start(this,"${item.cid }")" href="javascript:;" title="正常上课"><i class="layui-icon">&#xe62f;</i></a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="layui-btn layui-btn-disabled layui-btn-mini">正在实训</span>');
                    $(obj).remove(); */
                   
                });
            }

            /*启用*/
            function admin_start(obj,id){
                layer.confirm('确认正常上课用吗？',function(index){
                    //发异步把用户状态进行更改
                     $.ajax({
					   type: "GET",
					   url: "${baseurl}/alterStartClazz.do",
					   data: {"id":id},
					   success: function(msg){
					     alert( "Data Saved: " + msg.code );
					   }
					});
                   /*  $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="admin_stop(this,"${item.cid }")" href="javascript:;" title="正在实训"><i class="layui-icon">&#xe601;</i></a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="layui-btn layui-btn-normal layui-btn-mini">正常上课</span>');
                    $(obj).remove(); */
                    layer.msg('正常上课!',{icon: 6,time:1000});
                });
            }
            
          
            </script>
    </body>
 <script type="text/javascript">
    $(function(){
			  	    $("#dyear").empty();
				    $("#dyear").html("年级：");
				    var year='${year}';
					  if(year==null||year==''||year=='0'){
						  var vid1=$("<select name='year' id='year' class='form-control'  style = 'width:200px;'><option value='0'></option></select>")
				         	.appendTo("#dyear");
					  }else{
						  var vid11=$("<select name='year' id='year' class='form-control'  style = 'width:200px;'><option value='${year}'>${year}</option></select>")
				         	.appendTo("#dyear");
						  var vid111=$("<option value='0'></option></select>")
				         	.appendTo("#year");
					  }
				   
				   
				   
				   $("#dmajor").empty();
				   $("#dmajor").html("专业：");
				   var major='${major}';
				   if(major==null||major==''||major=='0'){
						var vid2=$("<select name='major' id='major' class='form-control'  style = 'width:200px;'><option value='0'></option></select>")
			         	.appendTo("#dmajor");
				   }else{
					   var vid22=$("<select name='major' id='major' class='form-control'  style = 'width:200px;'><option value='${major}'>${major}</option> </select>")
			         	.appendTo("#dmajor");
					   var vid222=$("<option value='0'></option></select>")
			         	.appendTo("#major");
				   }

		         	 //如果创建小班级
		         	 $("#dclazz").empty();
		         	 $("#dclazz").html("班级：");
		         	 var clazzs='${clazzs}';
		         	 if(clazzs==null||clazzs==''||clazzs=='0'){
		         		var vid3=$("<select id='clazz' name='clazzs' class='form-control'  style = 'width:200px;'><option value='0'></option> </select>")
			         	.appendTo("#dclazz");
		         	 }else{
		         		var vid33=$("<select id='clazz' name='clazzs' class='form-control'  style = 'width:200px;'><option value='${clazzs}'>${cname}</option> </select>")
			         	.appendTo("#dclazz");	 
		         		var vid333=$("<option value='0'></option> </select>")
			         	.appendTo("#clazz");	 
		         	 }
		         	 
		         	
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
			                	 //alert("请求失败");
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
				                	// alert("请求失败");
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
				                	// alert("请求失败");
				                },
				        	});
					});
    });
    </script>
</html>