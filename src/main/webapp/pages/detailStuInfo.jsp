<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	<input type="hidden" id="party" value="${detailInfo.student2.party}">
	 <input id="fammly" type="hidden" value="${detailInfo.student2.fammly}">  
        <form class="layui-form" id="student2Form"> 
                 
		     <div class="layui-form-item">
		    <label class="layui-form-label">
		    	政治面貌</label>
		    <div class="layui-input-block">
		      <input type="radio" name="party" value="群众" title="群众">
		      <input type="radio" name="party" value="共青团员" title="共青团员" >
		      <input type="radio" name="party" value="积极分子" title="积极分子" >
		      <input type="radio" name="party" value="预备党员" title="预备党员" >
		      <input type="radio" name="party" value="党员" title="党员" >
		    </div>
		  </div>         
		                 
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  	班级职务
              </label>
              <div class="layui-input-inline">
                  <input type="text"  name="role" required="" lay-verify="required" value="${detailInfo.student2.role}"
                  autocomplete="off" class="layui-input">            
              </div>
          </div>  
              
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  	德育分
              </label>
              <div class="layui-input-inline">
                  <input type="text"  name="dynum" required="" lay-verify="required" value="${detailInfo.student2.dynum}"
                  autocomplete="off" class="layui-input">
              </div>
          </div>    
         
          <div class="layui-form-item layui-form-text">
                    <label for="desc" class="layui-form-label">
                      	  家庭条件
                    </label>
                    <div class="layui-input-block">
                        <textarea  id="textfammly" class="layui-textarea"></textarea>
                    </div>
                </div>
     </form>
      		个人记录
           <table class="layui-table">
                    <thead>
                        <tr>
                            <th>经历描述</th>
                            <th>时间</th>
                            <th>加分</th>
                            <th>备注</th>                      
                        </tr>
                    </thead>
                    <tbody>
                    	<c:forEach items="${detailInfo.rewards}" var="reward">
                    		 <tr>
                            <td>${reward.rdesc}</td>
                            <td>
                            <fmt:formatDate value="${reward.rtime}" pattern="yyyy-MM-dd"/>                           
                            </td>
                            <td>${reward.rscore}</td>
                            <td>${reward.rother}</td>                           
                        </tr>                       	
                    	</c:forEach>                                    
                    </tbody>
                </table>
      		处分记录
           <table class="layui-table">
                    <thead>
                        <tr>
                            <th>处分描述</th>
                            <th>处分时间</th>
                            <th>扣分</th>
                            <th>备注</th>                      
                        </tr>
                    </thead>
                    <tbody>
                    	<c:forEach items="${detailInfo.punishments}" var="punishment">
                    		 <tr>
                            <td>${punishment.pdesc}</td>
                            <td>
                            <fmt:formatDate value="${punishment.ptime}" pattern="yyyy-MM-dd"/>
							</td>
                            <td>${punishment.pscore}</td>
                            <td>${punishment.pother}</td>                           
                        </tr>                       	
                    	</c:forEach>                                    
                    </tbody>
                </table>
                 
</body>
<script type="text/javascript">
		$(function(){   		
			if($("#party").val() != null)
		$(":radio[value=" + $("#party").val() +"]").attr("checked","true")
		if($("#fammly").val() != null)
			$("#textfammly").val($("#fammly").val());
});	
</script>
</html>