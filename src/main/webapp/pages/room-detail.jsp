<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.pdsu.stuManage.bean.Room"%>
<%@ page import="java.util.List"%>

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
            后台管理系统
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
          <!--   <xblock> -->
		<div class="row" style="float:right">
		
			<div class='form-inline'>
			<form action="${APP_PATH }/room/selectRoomByCid.do"  >
		 		<span id="dyear">年级： </span>
				<span id="dmajor">专业： </span>
				<span id="dclazz">班级： </span>
				<button class="layui-btn x-right"  id="btn1" lay-filter="formDemo"><i class="layui-icon">&#xe615;</i></button>
			</form>

			</div>	
	   	</div>	 
            	<span class="x-left" style="line-height:40px">共有数据： ${pageInfo.total } 条</span>
          <!--   </xblock> -->
            <table class="layui-table">
                <thead>
                    <tr>
                        <th>
                            <input type="checkbox" name="" value="">
                        </th>
                        <th>
                            ID
                        </th>
                        <th>
                            登录名
                        </th>
                        <th>
                            宿舍号
                        </th>
                        <th>
                            容纳人数
                        </th>
                        <th>
                            是否为混寝
                        </th>
                        <th>
                            所属班级
                        </th>
                        <th>
                            状态
                        </th>
                        <th>
                            详情
                        </th>
                    </tr>
                </thead>
                
                <tbody>
                	 <c:forEach items="${pageInfo.list }" var="item">
                    <tr>
			                        <td>
			                            <input type="checkbox" value="1" name="">
			                        </td>
			                        <td>
			                            1
			                        </td>
			                        <td>
			                            admin
			                        </td>
			                        <td >
			                            ${item.rnum }
			                        </td>
			                        <td >
			                          ${item.rpnum }
			                        </td>
			                        <td >
				                        	<c:choose>
				                        		<c:when test="${item.ismix ==1}">
				                        			是
				                        		</c:when>
				                        		<c:otherwise>
				                        			否
				                        		</c:otherwise>
				                        	</c:choose>
			                        </td>
			                        <td>
			                        	<span id="${item.rid }"></span>
				                        	<script type="text/javascript">
				                        		var cid='${item.cid}';
					                        		$("#${item.rid }").load('${baseurl }room/getClazz.do?cid='+cid);
					                        </script>
			                        </td>
			                        <td class="td-status">
			                            <span class="layui-btn layui-btn-normal layui-btn-mini">
				                        	<c:choose>
				                        		<c:when test="${item.cid =='11111111111111111111111111111111'}">
				                        			未分配
				                        		</c:when>
				                        		<c:otherwise>
				                        			已经分配
				                        		</c:otherwise>
				                        	</c:choose>
			                            </span>
			                        </td>
			                        <td class="td-manage">
	
										
			                            <a title="查看详情" href="javascript:;" onclick="admin_edit('详情','selectRoomMember.do','${item.rnum}','510','410')"
			                                class="ml-5" style="text-decoration:none">
			                                <i class="layui-icon">&#xe6b2;</i>
			                            </a>
			                            
			                        </td>        
                    </tr>
                     </c:forEach>
                </tbody>
            </table>
            
            <div class="col-md-6">
				<nav aria-label="Page navigation">
				<ul class="pagination">
					<li><a href="${APP_PATH }/room/selectRoomByCid.do?pn=1&year=${year}&major=${major}&clazzs=${clazzs}">首页</a></li>
					<c:if test="${pageInfo.hasPreviousPage }">
						<li><a href="${APP_PATH }/room/selectRoomByCid.do?pn=${pageInfo.pageNum-1}&year=${year}&major=${major}&clazzs=${clazzs}"
							aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
						</a></li>
					</c:if>


					<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
						<c:if test="${page_Num == pageInfo.pageNum }">
							<li class="active"><a href="#">${page_Num }</a></li>
						</c:if>
						<c:if test="${page_Num != pageInfo.pageNum }">
							<li><a href="${APP_PATH }/room/selectRoomByCid.do?pn=${page_Num }&year=${year}&major=${major}&clazzs=${clazzs}">${page_Num }</a></li>
						</c:if>

					</c:forEach>
					<c:if test="${pageInfo.hasNextPage }">
						<li><a href="${APP_PATH }/room/selectRoomByCid.do?pn=${pageInfo.pageNum+1 }&year=${year}&major=${major}&clazzs=${clazzs}"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a></li>
					</c:if>
					<li><a href="${APP_PATH }/room/selectRoomByCid.do?pn=${pageInfo.pages}&year=${year}&major=${major}&clazzs=${clazzs}">末页</a></li>
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
              
		//总页数低于页码总数
		  /* laypage.render({
		    elem: 'page'
		    ,count: 50 //数据总数
		  });  */
            });

            //详情
            function admin_edit (title,url,id,w,h) {
                x_admin_show(title,url+"?rnum="+id,w,h);
               
            }
            </script>
    </body>
    
    <script type="text/javascript">
    $(function(){
			  	    $("#dyear").empty();
				   $("#dyear").html("年级：");
				   var year='${year}';
				   if(year==0){
					   var vid1=$("<select name='year' id='year' class='form-control'  style = 'width:200px;'><option value='0'>--请选择--</option></select>")
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
				   if(major==null||major=="0"){
					   var vid2=$("<select name='major' id='major' class='form-control'  style = 'width:200px;'><option value='0'>--请选择--</option> </select>")
			         	.appendTo("#dmajor");
				   }else{
					   var vid22=$("<select name='major' id='major' class='form-control'  style = 'width:200px;'><option value='${major}'>${major}</option> </select>")
			         	.appendTo("#dmajor");  
					   var vid222=$("<option value='0'></option> </select>")
			         	.appendTo("#major");  
				   }
		         	
		         	
		         	 //如果创建小班级
		         	 $("#dclazz").empty();
		         	 $("#dclazz").html("班级：");
		         	 var clazzs='${clazzs}';
		         	if(clazzs==null||clazzs=="0"){
		         		var vid3=$("<select id='clazz' name='clazzs' class='form-control'  style = 'width:200px;'><option value='0'>--请选择--</option> </select>")
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
    });
    </script>
</html>