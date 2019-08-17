<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ include file="/WEB-INF/jsp/tag.jsp"%>
   <%@ taglib prefix="itpage" uri="http://zc.cn/common/"%>
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
    <script type="text/javascript" src="${baseurl}js/jquery-1.12.4.min.js"></script>
</head>
<body>
 <div class="x-nav">
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:-10px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:42px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
        <form  id="seacherInfo" class="layui-form layui-col-md12 x-so" action="${baseurl}teaAccountList.do" method="POST">       
        
             <input type="text" name="stu_name"  value="${stu_name}" placeholder="请输入教师姓名" autocomplete="off" class="layui-input">
          <button id="tsearch" class="layui-btn"><i class="layui-icon">&#xe615;</i></button> 	          
        </form>
      </div>   
      <xblock>
        <span class="x-right" style="line-height:40px">共有数据：${page.total} 条</span>
      </xblock>        
      <table  class="layui-table">
        <thead>
          <tr>
            <th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>姓名</th>
            <th>性别</th>                    
            <th>手机号</th>        
            <th>操作</th></tr>
        </thead>
        <tbody>
	        <c:forEach items="${page.rows}" var="row">
	        <tr>
	            <td>
	              <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>
	            </td>
	            <td>${row.tname}</td>	               
	            <td><c:if test="${row.tsex =='1' }">男</c:if>
	            <c:if test="${row.tsex =='0' }">女</c:if></td>	
	             <td>${row.tphone}</td>              	                   	            
	            <td class="td-manage">                	             
	              <a title="恢复账号" onclick=member_del(this,'${row.tid}') href="javascript:;">
	                <i class="layui-icon">&#xe619;</i>
	              </a> 
	            </td>
	          </tr>   
	        </c:forEach>
        </tbody>
      </table>      
       <itpage:page url="${baseurl}teaAccountList.do"></itpage:page>
    </div>
    
    <script type="text/javascript" src="${baseurl}admin/js/xadmin.js"></script>
    <script type="text/javascript" src="${baseurl}js/jquery-1.12.4.min.js"></script>
    <script> 		
    layui.use('layer', function(){
        var layer = layui.layer;
      });    
      /*用户-删除*/
          function member_del(obj,id){
          layer.confirm('确认要恢复该用户账号吗？',function(index){
        	  $.ajax({
        		  url:'${baseurl}thawTeaAccount.do',
        		  type:'POST',
        		  data:{tid:id},
        		  success:function(result){
        			 if(result.status == 200){
        				 $(obj).parents("tr").remove();
        				 layer.msg('操作成功!',{icon:1,time:1000}); 
        			 }else{
        				 layer.msg('操作失败!',{icon:1,time:1000}); 
        			 }
        		  }
        	  });             
          });
      }    
    </script>
</body>
</html>