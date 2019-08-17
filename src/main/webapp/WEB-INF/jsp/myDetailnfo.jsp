<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/tag.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
    <title>我的详情</title>
    <link href="${baseurl}common/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/bass.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/index.css" rel="stylesheet"/>
</head>
<body>
<div>
        <header>
            <div class="header" style="position:relative;">
                <h1>我的个人信息</h1>
                <a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16"  style="position:absolute;top:14px;left:18px;"></i></a>
            </div>
        </header>
        <div style="height: 2.5rem;"></div>
    </div>
	<!-- 企业详情 firmDetails -->
	<div class="firmDetails">
		<div class="firmD-head">
			<c:if test="${activeUser.simage == ''}">
						<img src="${baseurl}common/images/user-img2.png" id="photo">
					</c:if>
					<c:if test="${activeUser.simage != ''}">
						<img src="${baseurl}pics/pictures/${activeUser.simage}" >
					</c:if>	 	 
			<div class="fD-text">
				<h1>${stu.sname}</h1>	
				<div class="fD-association">
					<em class="arrow-left"></em>
					<span>${stu.snum}</span>
				</div>
			</div>
		</div>
		<div class="firmD-tab">
			<!-- tab nav -->
			<ul id="tab_btn" class="tab-list">
                <li class="pick">基本信息</li>
                <!--<li><span class="bar"></span>背景信息</li>-->
                <li><span class="bar"></span>成长记录</li>
            </ul>
            <!-- tab nav end-->
            <ul>
                <li class="tab_content show">
                	<div class="firmD-menu">                	
						<ul class="vconlist">
							<%-- <li class="firmD-img"><img src="${baseurl}common/images/qy.png"></li>  --%>							
							<li>
								<label>性别</label>
								<div class="vcon-content">
								<c:if test="${stu.ssex == '0' }">女</c:if>
								<c:if test="${stu.ssex == '1' }">男</c:if>
								</div>
							</li>							
							<li>
								<label>院系</label>
								<div class="vcon-content">${stu.colname }</div>
							</li>							
							<li>
								<label>专业</label>
								<div class="vcon-content">${stu.smajor }</div>
							</li>						
							<li>
								<label>班级</label>
								<div class="vcon-content">${stu.cname }</div>
							</li>
							<li>
								<label>宿舍</label>
								<div class="vcon-content">
									${stu.rid }
								</div>
							</li>
							<li>
								<label>手机号</label>
								<div class="vcon-content">
									${stu.sphone }
								</div>
							</li>
							<li>
								<label>入学年份</label>
								<div class="vcon-content">${stu.sgrade }</div>
							</li>
							<li>
					                <label>政治面貌</label>
					                <div class="vcon-content">${stu.student2.party }</div>
					            </li>
					            <li>
					                <label>班级任职</label>
					                <div class="vcon-content">${stu.student2.role }</div>
					            </li>							
							
						</ul>
					</div>
                </li>
                   
                <li class="tab_content">	           
                	 <ul class="vconlist supply bio-supply">
                	 <c:forEach items="${rewardList }" var="items">
						<li>
							<a href="${baseurl}findDetailRewardInfo.do?rid=${items.rid}">
								<label><span class="btn btn-green">详情</span></label>
								<div class="vcon-content">
									<span class="supply-text">${items.rdesc } </span> 									
									<span class="supply-time">
										  <fmt:formatDate value="${items.rtime}" pattern="yyyy-MM-dd"/>
										<span class="icon-uniE926"></span>
									</span>
								</div>
							</a>						
						</li>
					</c:forEach>														
					</ul> 
                </li>
            </ul>
		</div>
	</div>
    <script type="text/javascript">
	    //TAB切换
	    var tab_Btns_box=document.getElementById('tab_btn');
	    var tab_Btns=tab_Btns_box.getElementsByTagName('li');
	    var tab_contents=document.getElementsByClassName('tab_content');
	    for(var i=0;i<tab_Btns.length;i++){
	    tab_Btns[i].index=i;

	    tab_Btns[i].onclick=function(){
	     for(var i=0;i<tab_Btns.length;i++){
	     if(i!==this.index){
	     tab_Btns[i].classList.remove('pick')
	     }
	     }
	     tab_Btns[this.index].className="pick";

	     for(var j=0;j<tab_contents.length;j++){
	     if(j!==this.index){
	         tab_contents[j].classList.remove('show');
	     }
	         tab_contents[this.index].classList.add('show');
	     }
	    }
	    }
    </script>
</body>
</html>