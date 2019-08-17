<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/jsp/tag.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    <script src="${baseurl}admin/lib/layui/layui.js" charset="utf-8"></script>
    <script src="${baseurl}admin/js/x-layui.js" charset="utf-8"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
  <body>
       <div class="x-body">
            <h3>班委成员</h3>
            <c:choose>
				  <c:when test="${student1s !=null}">
		              <table class="layui-table">
						  <colgroup>
						    <col width="150">
						    <col width="200">
						    <col>
						  </colgroup>
								  <thead>
								    <tr>
								      <th>姓 名</th>
								      <th>电 话</th>
								      <th>班内任职</th>
								    </tr> 
								  </thead>
								  <tbody>
									 <c:forEach var="item" items="${student1s }">
				                   			 <tr>
							                        <td>
							                           ${item.sname }
							                        </td>
							                        <td>
							                            ${item.sphone }
							                        </td>
							                        <td>
							                        	 ${item.role }
							                        	<%-- <span id="${item.sid }"></span>
							                        		<script type="text/javascript">
							                        			var sid='${item.sid}';
							                        			$("#${item.sid}").load('${baseurl }room/getStudent2.do?sid='+sid);
							                        		</script> --%>
							                        </td>
				                  			  </tr>
				                     </c:forEach>
								  </tbody>			
							</table>
				</c:when>
							<c:otherwise>
								<div class="content" >
									 <i style='width:400px; height:400px;' class="layui-icon">&#xe69c;</i>(未设置，请到学生管理页面设置)
								</div>
							</c:otherwise>
				</c:choose>
				
       </div>

       
<script type="text/javascript">
        function dcse(){	
	    	var rnum=$("#rnum").val();
	    	var rpnum=$("#rpnum").val();
	    	var rid='${room.rid }';
	    	var ismix=$('input:radio:checked').val();
	    	var options = {
	    			type: 'post', // 提交方式 get/post
	    			url:"${baseurl}room/editRoom.do", 	
	    			data:{"rnum":rnum,
	    				  "rpnum":rpnum,
	    				  "isxim":ismix,
	    				  "rid":rid},
	   				success : function(result){
	        			//alert(result.code)
	        			if(result.code==100){
	        				layer.alert('宿舍修改成功')
	        			}else{
	        				layer.alert("这个班级已经存在");
	        			}
	        		},
	        		error:function(){
	        			alert("请求失败");
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