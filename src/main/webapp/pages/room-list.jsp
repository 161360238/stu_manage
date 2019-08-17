<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/WEB-INF/jsp/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
		<%
			pageContext.setAttribute("APP_PATH", request.getContextPath());
		%>
	<%-- 	<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script> --%>
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
            
            <xblock>
            <!-- <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon">&#xe640;</i>批量删除</button> -->
            <button class="layui-btn" onclick="admin_add('添加宿舍','${baseurl}pages/room-add.jsp','600','500')"><i class="layui-icon">&#xe608;</i>添加</button>
            <span class="x-right" style="line-height:40px">共有数据：${num } 条</span></xblock>
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
                            操作
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
				
														<c:choose>
							                        		<c:when test="${item.cid =='11111111111111111111111111111111'}">
								                        		<a style="text-decoration:none" onClick="admin_start('宿舍分配','${baseurl }pages/room-dis.jsp','${item.rid}','510','410')" href="javascript:;" title="立即分配">
																	<i class="layui-icon">&#xe62f;</i>
																</a>
							                        		</c:when>
							                        		<c:otherwise>						                      
																<a style="text-decoration:none" onClick="admin_stop('重新分配','${baseurl }pages/room-rdis.jsp','${item.rid}','510','410')" href="javascript:;" title="重新分配">
																	<i class="layui-icon">&#xe62f;</i>
																</a>
							                        		</c:otherwise>
							                        	</c:choose>
						                            <a title="编辑" href="javascript:;" onclick="admin_edit('编辑','selectRoom.do','${item.rid}','510','410')"
						                                class="ml-5" style="text-decoration:none">
						                                <i class="layui-icon">&#xe642;</i>
						                            </a>
						                            <a title="删除" href="javascript:;" onclick="admin_del(this,'${item.rid}')" 
						                            style="text-decoration:none">
						                                <i class="layui-icon">&#xe640;</i>
						                            </a>
						                        </td>        
			                    </tr>
                     </c:forEach>
                </tbody>
            </table>

           <div class="col-md-6">
				<nav aria-label="Page navigation">
				<ul class="pagination">
					<li><a href="${APP_PATH }/room/selectRoomByClid.do?pn=1">首页</a></li>
					<c:if test="${pageInfo.hasPreviousPage }">
						<li><a href="${APP_PATH }/room/selectRoomByClid.do?pn=${pageInfo.pageNum-1}"
							aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
						</a></li>
					</c:if>

					<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
						<c:if test="${page_Num == pageInfo.pageNum }">
							<li class="active"><a href="#">${page_Num }</a></li>
						</c:if>
						<c:if test="${page_Num != pageInfo.pageNum }">
							<li><a href="${APP_PATH }/room/selectRoomByClid.do?pn=${page_Num }">${page_Num }</a></li>
						</c:if>

					</c:forEach>
					<c:if test="${pageInfo.hasNextPage }">
						<li><a href="${APP_PATH }/room/selectRoomByClid.do?pn=${pageInfo.pageNum+1 }"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a></li>
					</c:if>
					<li><a href="${APP_PATH }/room/selectRoomByClid.do?pn=${pageInfo.pages}">末页</a></li>
				</ul>
				</nav>
			</div>
           
           
        </div>
        <script src="${baseurl }admin/lib/layui/layui.js" charset="utf-8"></script>
        <script src="${baseurl }admin/js/x-layui.js" charset="utf-8"></script>
        <script>
        layui.use(['laypage', 'layer'], function(){
        	  var laypage = layui.laypage
        	  ,layer = layui.layer;
          

              //以上模块根据需要引入
              
		//总页数低于页码总数
		  /* laypage.render({
		    elem: 'page'
		    ,count: 50 //数据总数
		  }); */
              
              
            });

            //批量删除提交
             function delAll () {
                layer.confirm('确认要删除吗？',function(index){
                    //捉到所有被选中的，发异步进行删除
                    layer.msg('删除成功', {icon: 1});
                });
             }
             /*添加*/
            function admin_add(title,url,w,h){
                x_admin_show(title,url,w,h);
               
            }
            

             /*停用*/
            function admin_stop(title,url,id,w,h){
            	
           	 x_admin_show(title,url+"?id="+id,w,h);
               /* layer.confirm('确认正常上课用吗？',function(index){
                   //发异步把用户状态进行更改
                 		
                   $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="admin_stop(this,"${item.cid }")" href="javascript:;" title="正在实训"><i class="layui-icon">&#xe601;</i></a>');
                   $(obj).parents("tr").find(".td-status").html('<span class="layui-btn layui-btn-normal layui-btn-mini">正常上课</span>');
                   $(obj).remove();
                   layer.msg('正常上课!',{icon: 6,time:1000});
               }); */
           }

            /*启用*/
            function admin_start(title,url,id,w,h){
            	 x_admin_show(title,url+"?id="+id,w,h);
            }
            //编辑
            function admin_edit (title,url,id,w,h) {
                x_admin_show(title,url+"?rid="+id,w,h);
               
            }
            /*删除*/
            function admin_del(obj,id){
                layer.confirm('确认要删除吗？',function(index){
                    //发异步删除数据
                    $.ajax({
                    	type:"POST",
                    	url: "${baseurl}room/deleteRoom.do",
                    	data: {"rid":id},
                    	success: function(msg){
                    	   },
                    	   erreo:function(){
                    		   alert("请求失败");
                    	   }
						});
                    
                    $(obj).parents("tr").remove();
                    layer.msg('已删除!',{icon:1,time:1000});
                });
            }
            </script>
    </body>
    <script type="text/javascript">
    
    		function  addele(result){
            	var empIdTd = $("<span></span>").append(result.extend.msg);
				$("clazz").apend(empIdTd);
            };
    
    </script>
</html>