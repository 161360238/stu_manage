<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/jsp/tag.jsp"%>
<%@ taglib prefix="itpage" uri="http://zc.cn/common/"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="renderer" content="webkit">
   <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
   <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
   <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
   <link rel="stylesheet" href="${baseurl}admin/css/font.css">
   <link rel="stylesheet" href="${baseurl}admin/css/xadmin.css">
   <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
   <script type="text/javascript" src="${baseurl}admin/lib/layui/layui.js" charset="utf-8"></script>
   <script type="text/javascript" src="${baseurl}admin/js/xadmin.js"></script>
</head>
<body>
    <div class="x-nav">
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" method="POST" action="${baseurl}adminList.do">      
          <input type="text" name="stu_name"  placeholder="请输入用户名" value="${stu_name }" autocomplete="off" class="layui-input">
          <button class="layui-btn"  lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      <xblock>  
        <button class="layui-btn" onclick="x_admin_show('添加管理员','${baseurl}addAdmin.do')"><i class="layui-icon"></i>添加</button>
        <span class="x-right" style="line-height:40px">共有数据：${page.total} 条</span>
      </xblock>
      <table class="layui-table">
        <thead>
          <tr>
            <th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>姓名</th>
            <th>手机号</th>       
            <th>角色</th>                 
            <th>操作</th>
        </thead>
        <tbody>
        <c:forEach items="${page.rows }" var="items">
          <tr>
            <td>
              <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>
            </td>
            <td>${items.aname }</td>
            <td>${items.acollage }</td>
            <td>管理员</td>         
            <td class="td-manage">             
              <a title="删除" onclick="member_del(this,'${items.aid}')" href="javascript:;">
                <i class="layui-icon">&#xe640;</i>
              </a>
            </td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
   	 		<itpage:page url="${baseurl}adminList.do"></itpage:page>
    </div>
    <script>
      layui.use('laydate', function(){
        var laydate = layui.laydate;            
      });

      /*用户-删除*/
      function member_del(obj,id){
          layer.confirm('确认要删除吗？',function(index){        	
        	  $.ajax({
        		  url:'${baseurl}delectManAccount.do',
        		  type:'POST',
        		  data:{aid:id},        		 
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