<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>概览</title>

    <!-- Bootstrap core CSS -->
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<%=request.getContextPath()%>/resources/css/dashboard.css" rel="stylesheet">

</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">学生成绩管理系统</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class=" dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                        <span class="glyphicon glyphicon-plus" aria-hidden="true"> </span>添加<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/student/add">添加学生</a></li>
                        <li><a href="/teacher/add">添加教师</a></li>
                        <li><a href="/staff/add">添加职工</a></li>
                        <li><a href="/course/add">添加课程</a></li>
                        <li><a href="/score/add">添加成绩</a></li>
                    </ul>
                </li>
            </ul>

            <form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="搜索...">
                <button type="submit" class=" btn  btn-primary">搜索</button>
            </form>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li class="active"><a href="#"><span class="glyphicon glyphicon-menu-right" aria-hidden="true"> </span>概览 <span class="sr-only">(current)</span></a></li>
                <li><a href="${pageContext.request.contextPath}/student/list.html">学生信息</a></li>
                <li><a href="/teacher/list">教师信息</a></li>
                <li><a href="/staff/list">职工信息</a></li>
            </ul>
            <ul class="nav nav-sidebar">
                <li><a href="/course/list">课程信息</a> </li>
                <li><a href="/score/list">成绩信息</a></li>
                <li><a href="">成绩排名</a></li>
                <li><a href="">考试信息</a></li>

            </ul>
            <ul class="nav nav-sidebar">
                <li><a href="/editinfo">信息管理</a></li>
            </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header">概览</h1>

            <div class="row placeholders">
                <div class="col-xs-6 col-sm-3 placeholder">
                    <img src="<%=request.getContextPath()%>/resources/imgs/5.jpg" class="img-responsive" alt="Generic placeholder thumbnail">
                    <h4>学生</h4>
                    <span class="text-muted">进入学生页面</span>
                </div>
                <div class="col-xs-6 col-sm-3 placeholder">
                    <img src="<%=request.getContextPath()%>/resources/imgs/2.jpg" class="img-responsive" alt="Generic placeholder thumbnail">
                    <h4>教师</h4>
                    <span class="text-muted">进入教师页面</span>
                </div>
                <div class="col-xs-6 col-sm-3 placeholder">
                    <img src="<%=request.getContextPath()%>/resources/imgs/3.jpg" class="img-responsive" alt="Generic placeholder thumbnail">
                    <h4>职工</h4>
                    <span class="text-muted">进入职工页面</span>
                </div>
                <div class="col-xs-6 col-sm-3 placeholder">
                    <img src="<%=request.getContextPath()%>/resources/imgs/4.gif" class="img-responsive" alt="Generic placeholder thumbnail">
                    <h4>未知</h4>
                    <span class="text-muted">不知道拿来干啥</span>
                </div>
            </div>

            <h2 class="sub-header">概览</h2>
            <div >
                ${message}
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>


</body>
</html>
