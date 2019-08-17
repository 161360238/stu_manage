<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/jsp/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>学生管理系统</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${baseurl}admin/css/font.css">
	<link rel="stylesheet" href="${baseurl}admin/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="${baseurl}admin/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${baseurl}admin/js/xadmin.js"></script>
</head>
<body>
   <!-- 顶部开始 -->
    <div class="container">
        <div class="logo"><a>学生后台管理系统</a></div>
        <div class="left_open">
            <i title="展开左侧栏" class="iconfont">&#xe699;</i>
        </div>
        <ul class="layui-nav right" lay-filter="">
          <li class="layui-nav-item">
            <a href="javascript:;">${activeUser.username }</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->             
              <dd><a href="${baseurl}logout.do">退出</a></dd>
            </dl>
          </li>
          <li class="layui-nav-item to-index"><a href="#">前台首页</a></li>
        </ul>
        
    </div>
    <!-- 顶部结束 -->
    <!-- 中部开始 -->
     <!-- 左侧菜单开始 -->
    <div class="left-nav">
      <div id="side-nav">
        <ul id="nav">
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b8;</i>
                    <cite>学生管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${baseurl}stuBasicInfoList.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>学生列表</cite>
                            
                        </a>
                    </li >
                    <li>
                        <a _href="${baseurl}teaBasicInfoList.jsp.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>教师列表</cite>                            
                        </a>
                    </li>
                     <li>
                        <a href="javascript:;">
                            <i class="iconfont">&#xe70b;</i>
                            <cite>账号管理</cite>
                            <i class="iconfont nav_right">&#xe697;</i>
                        </a>
                        <ul class="sub-menu">
                            <li>
                                <a _href="${baseurl}stuAccountList.do">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>学生账号</cite>
                                    
                                </a>
                            </li >
                            <li>
                                <a _href="${baseurl}teaAccountList.do">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>教师账号</cite>                                    
                                </a>
                            </li>                                                        
                        </ul>
                    </li>
                            
                </ul>
            </li>                       
             <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe62a;</i>
                    <cite>班级管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${baseurl}selectAllClazz.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>班级增删</cite>
                        </a>
                    </li >
                </ul>
               
             
                 <ul class="sub-menu">
                    <li>
                        <a _href="${baseurl}selectClazzByLike.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>信息管理</cite>
                        </a>
                    </li >
                </ul>
                
                  <ul class="sub-menu">
                    <li>
                        <a _href="${baseurl}attend/selectZclassByLike.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>考勤情况</cite>
                        </a>
                    </li >
                </ul>
                
            </li>
            
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe726;</i>
                    <cite>宿舍管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                 	
                    <li>
                        <a _href="${baseurl }room/selectRoomByClid.do?clid=123">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>宿舍分配</cite>
                        </a>
                    </li >
                     <li>
                        <a _href="${baseurl }room/selectRoomByCid.do?clid=123&clazzs=0">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>宿舍详情</cite>
                        </a>
                    </li >
                    
                </ul>
            </li>
            <c:if test="${activeUser.identity == 4 }">
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe726;</i>
                    <cite>管理员管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${baseurl}adminList.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>管理员列表</cite>
                        </a>
                    </li >               
                </ul>
            </li>
            </c:if>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ce;</i>
                    <cite>贫困认定</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${baseurl}amdinPovDeteryesOrNo.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>贫困认定管理</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${baseurl}amdinPovDeterMana.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>贫困认定统计</cite>
                        </a>
                    </li >
                  
                                                                                    
                </ul>
            </li>
        </ul>
      </div>
    </div>
    <!-- <div class="x-slide_left"></div> -->
    <!-- 左侧菜单结束 -->
    <!-- 右侧主体开始 -->
   <div class="page-content">
        <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
          <ul class="layui-tab-title">
            <li>我的桌面</li>
          </ul>
          <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='${baseurl}welcome.do' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
          </div>
        </div>
    </div>
    <div class="page-content-bg"></div>
    <!-- 右侧主体结束 -->
    <!-- 中部结束 -->
    <!-- 底部开始 -->
    <div class="footer">
        <div class="copyright">Copyright ©2017 All Rights Reserved</div>  
    </div>
    <!-- 底部结束 -->
    
</body>

</html>