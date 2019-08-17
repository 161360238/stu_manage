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
        <form  id="seacherInfo" class="layui-form layui-col-md12 x-so" action="${baseurl}amdinPovDeterMana.do" method="POST">       
           <label for="addr-show">
               <input type="hidden" value="null" id="addr-show0"  name="enter_year" >
               <input type="hidden" value="null" id="addr-show1"  name="stu_major" >
               <input type="hidden" value="null" id="addr-show2"  name="stu_class" >          
           </label>           
           <div class="layui-input-inline"style="height:35px;padding-left:100px;">      
           <select class="layui-selet" id="prov" style="display: block;width:120px;height:35px;margin-left:10px;">
              <option >-选择年份-</option> 
              <c:forEach items="${grade}" var="items">
				   <option value="${items.reid }">${items.cgrade}</option>						                	
				</c:forEach>
              	 <c:if test="${henter_year != null}">          
             	 <option selected>${henter_year}</option> 
             	 </c:if> 
            </select>              
            <select class="layui-selet" id="city" style="display: block;width:140px;height:35px;margin-left:10px;">
              <option >-选择专业-</option>
              <c:if test="${hstu_major != null}">          
             	 <option selected>${hstu_major}</option> 
              </c:if>
            </select>          
            <select  class="layui-selet" id="country" style="display: block;width:120px;height:35px;margin-left:10px;">
              <option>-选择班级-</option>
              <c:if test="${hstu_class != null}">          
             	 <option selected>${hstu_class}</option> 
              </c:if>
            </select>
             <input type="text" name="stu_name"  value="${hstu_name}" placeholder="请输入学生姓名" autocomplete="off" class="layui-input" style="width:200px;height:35px;margin-left:10px;">
          <button id="tsearch" class="layui-btn"><i class="layui-icon">&#xe615;</i></button> 	 
          </div>
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
            <th>学号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年级</th>
            <th>专业</th>
            <th>班级</th>                   
            <th>贫困认定参数</th>         
            <th>审核</th>         
            <th>操作</th></tr>
        </thead>
        <tbody>
	        <c:forEach items="${page.rows}" var="row">
	        <tr>
	            <td>
	              <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>
	            </td>
	            <td>${row.snum}</td>
	            <td>${row.sname}</td>	        	         
	             <td><c:if test="${row.ssex =='1' }">男</c:if>
	            <c:if test="${row.ssex =='0' }">女</c:if></td>	        	         
	            <td>${row.sgrade}</td>
	            <td>${row.smajor}</td>
	            <td>${row.cname}</td>	                 	                
	            <td> 
	           		${row.student2.fammlynum}
	              </td>          	            
	            <td> 
	           		<a  onclick=x_admin_show('${row.sname}审核信息',"${baseurl}PovDeterInfo.do?sid=${row.sid}",600,250) href="javascript:;">
	               <i>详情</i>
	              </a>
	              </td>          	            
	            <td class="td-manage">                
	           <a onclick=x_admin_show('添加${row.sname}民主评议分',"${baseurl}addPovDeterScore.do?sid=${row.sid}",500,300) href="javascript:;">
	               <i class="layui-icon">&#xe642;</i>
	              </a>	           
	              <a title="删除" onclick=member_del(this,'${row.sid}') href="javascript:;">
	                <i class="layui-icon">&#xe640;</i>
	              </a>  
	            </td>
	          </tr>   
	        </c:forEach>
        </tbody>
      </table> 
     
       <itpage:page url="${baseurl}amdinPovDeterMana.do"></itpage:page>
    </div>
    
    <script type="text/javascript" src="${baseurl}common/js/class.js"></script>
    <script type="text/javascript" src="${baseurl}common/js/method01.js"></script>
    <script type="text/javascript" src="${baseurl}admin/js/xadmin.js"></script>
    <script type="text/javascript" src="${baseurl}js/jquery-1.12.4.min.js"></script>
    <script type="text/javascript" src="${baseurl}js/jquery-form.min.js"></script>
    <script> 		
    layui.use('layer', function(){
        var layer = layui.layer;
      }); 
    
    $(function(){  
    	 var tijaoobj = document.getElementById("tsearch");
    	 tijaoobj.onclick = function(){
    		 $(":selected").each(function(i){
    			 $("#addr-show"+i).val(this.innerHTML);
    			 if(this.innerHTML.indexOf("选择") !=-1){
    				 $("#addr-show"+i).val(null)
    			 }					
				});
    	 }
    	var selobj = document.getElementById("prov");
 		selobj.onchange = function(){
 			$.ajax({
 				url:'${baseurl}selectCmajor.do',
 				type:'POST',
 				data:{reid:$("#prov").val()},
 				success:function(result){
 					console.log(result)
 					for(var i = 0; i < result.length ;i++){						
 					 var cityOpt = document.createElement('option');
 			            cityOpt.innerText = result[i].cmajor;
 			            cityOpt.value = result[i].reid;	 			          
 			            $("#city").append(cityOpt);
 					}
 				}				
 			});			
 		}		
 		var selectobj = document.getElementById("city");
 		selectobj.onchange = function(){			
 			$.ajax({
 				url:'${baseurl}selectClass.do',
 				type:'POST',
 				data:{reid:$("#city").val()},
 				success:function(result){
 					console.log(result)
 					for(var i = 0; i < result.length ;i++){						
 					 var cityOpt = document.createElement('option');
 			            cityOpt.innerText = result[i].cname;
 			            cityOpt.value = result[i].reid;
 			            $("#country").append(cityOpt);
 					}
 				}
 			});		
 		}     
    });	
      /*用户-删除*/
      function member_del(obj,id){
          layer.confirm('确认要作废该信息吗？',function(index){
        	  $.ajax({
        		  url:'${baseurl}delectPovDeter.do',
        		  type:'POST',
        		  data:{sid:id},
        		  success:function(result){
        			 if(result.status == 200){
        				 $(obj).parents("tr").remove();
        				 layer.msg('已作废!',{icon:1,time:1000}); 
        			 }else{
        				 layer.msg('作废失败!',{icon:1,time:1000}); 
        			 }
        		  }
        	  });             
          });
      }     
    </script>
</body>
</html>