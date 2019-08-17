<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%
		pageContext.setAttribute("APP_PATH",request.getContextPath());
	%>
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-2.2.3.js"></script>
	<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>Document</title>
    <link href="${APP_PATH }/static/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${APP_PATH }/static/css/bass.css" rel="stylesheet"/>
    <link href="${APP_PATH }/static/css/index.css" rel="stylesheet"/>
  
</head>
<body>
<div>
    <header>
        <div style="height:50px;width:100%;background-color: #FC605A">
        	<a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16" style="height: 50px;line-height: 50px;font-size: 20px;color:#ffffff"></i></a>
            <span style="width: 100%;height: 50px;line-height: 50px;font-size: 20px;color:#ffffff;margin-left:40%">宿舍选择</span>
        </div>
    </header>
    <div style="height: 2.5rem;"></div>
</div>
    <div class="contact">
        <div class="contact-content">
                <div>
                    <c:forEach var="item" items="${rooms }">
                        <a href="javascript:;" onclick="admin_stop('${item.rid}','${item.rnum}','${item.rpnum }')" >
                            <span class="user-name"> 宿舍号：${item.rnum }</span>
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span >是否为混寝：
                             <c:choose>
                             	<c:when test="${item.ismix ==0}">
                             		否
                             	</c:when>
                             	<c:otherwise>
                             		是
                             	</c:otherwise>
                             </c:choose>
                             </span>
                            <br>
                            <span >容纳人数：${item.rpnum }</span>
                           
                            
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span >
                        		    已选人数：
                        		    
                        		    <span id="${item.rid }"></span>
			                        	<script type="text/javascript">
			                        		var rnum='${item.rnum}';
				                        		$("#${item.rid }").load('${APP_PATH}/room/selectPnumByRid.do?rnum='+rnum);
				                        </script>

                            </span>
                            <!-- <span style="font-size: 12px">(点击查看宿舍成员)</span> -->
                        </a>
                        <br>
                    </c:forEach>
                    
                </div>
        </div>
    </div>
    
 <div class="modal fade" id="myModal" aria-hidden="false">
    <div class="modal-dialog">
      <div class="modal-content">
        <!-- 模态框头部 -->
        <div class="modal-header">
          <h4 class="modal-title">宿舍选定</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        <!-- 模态框主体 -->
        <div class="modal-body">
          确定选择这个宿舍吗？
        </div>
        <!-- 模态框底部 -->
        <div class="modal-footer">
         <button type="button" class="btn btn-secondary"   id="submit"  >确定</button>
          <button type="button" class="btn btn-secondary" data-dismiss="modal">我再想想</button>
        </div>
   
      </div>
    </div>
  </div>
  
    
 <!--  <input type="hidden" name="pnum"> -->
</body>
<script type="text/javascript">

		
	
	function admin_stop(rid,rnum,rpnum){    //宿舍id 与宿舍能容纳的人数
		var rids="#"+rid;
		var pnum=$(rids).text();    //当前已经选择的人数
		//alert(pnum);
		//alert(rpnum)
		 if(pnum<rpnum){
			$("#myModal").modal();
			$("#submit").click(function(){
				$.ajax({ 
		          	type:"POST",
		          	url: "${APP_PATH}/room/chooseRoom.do",
		          	data: {"rid":rid,"rnum":rnum},
		          	dataType:"json",
		          	success: function(msg){
		          		if(msg.code==100){
		          			alert("选择宿舍成功");
			          		window.location.reload();	
		          		}
		          	   },
		          	  
		          	   erreo:function(){
		          		   alert("请求失败");
		          	   }
						});	
			})
			
		}else{
			alert("这个宿舍人数已经达到上限");
		} 
		 
	}





</script>
</html>