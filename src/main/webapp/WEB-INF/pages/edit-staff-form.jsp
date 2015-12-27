<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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
    <title>注册</title>
    <!-- Bootstrap core CSS -->
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="<%=request.getContextPath()%>/resources/css/login.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/resources/css/login.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <p>${message}</p>

    <form:form class="form-signin" method="POST" commandName="staff" action="${pageContext.request.contextPath}/editinfo/edit_stf/${staff.id}.html">
    <h2 class="form-signin-heading">修改职工</h2>
        <form:input type="text"  class="form-control" placeholder="姓名" path="name" />
        <form:input type="text"  class="form-control" placeholder="编号" path="stfID"  />
    <br>
        <form:input type="text"  class="form-control" placeholder="部门" path="college"  />
    <br>
    <button class="btn btn-lg btn-info btn-block" type="submit">提交修改</button>
    </form:form>
</body>
</html>