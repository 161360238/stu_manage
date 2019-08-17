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
</head>
  <body>
       <div class="x-body">
            <form id="seacherInfo" class="layui-form layui-col-md12 x-so" action="" method="POST">
                <div class="layui-form-item">
                    <label for="rnum" class="layui-form-label">
                        <span class="x-red">*</span>宿舍号
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="rnum" value="${room.rnum }"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>（必填项）
                    </div>
                </div>
                
                <div class="layui-form-item">
                    <label for="rpnum" class="layui-form-label">
                        <span class="x-red">*</span>所能容纳人数
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="rpnum"  value="${room.rpnum }"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>（必填项）
                    </div>
                </div>
                
                
                 <div class="layui-form-item">
                    <label for="ismix" class="layui-form-label">
                        <span class="x-red">*</span>是否为混寝
                    </label>
                    <div class="layui-input-inline">
                    	<c:choose>
                    		<c:when test="${room.ismix==1 }">
                    			<input type="radio" name="ismix" value="0" title="否" >
							    <input type="radio" name="ismix" value="1" title="是" checked="checked">
                    		</c:when>
                    		<c:otherwise>
                    			<input type="radio" name="ismix" value="0" title="否" checked="checked">
					 		    <input type="radio" name="ismix" value="1" title="是" >
                    		</c:otherwise>
                    	</c:choose>
                      
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>（必选项）
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
          		    <button class="layui-btn" onclick="dcse()">提交</button>
          		   </center>  
             </div>
        </div>
           
           
        <script src="${baseurl}admin/lib/layui/layui.js" charset="utf-8"></script>
        <script src="${baseurl}admin/js/x-layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="${baseurl}common/js/class.js"></script>
	    <script type="text/javascript" src="${baseurl}common/js/method01.js"></script>
	    <script type="text/javascript" src="${baseurl}admin/js/xadmin.js"></script>
	    <script type="text/javascript" src="${baseurl}js/jquery-1.12.4.min.js"></script>
	    <script type="text/javascript" src="${baseurl}js/jquery-form.min.js"></script>
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