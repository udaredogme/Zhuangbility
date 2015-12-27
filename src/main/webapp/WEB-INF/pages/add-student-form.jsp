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
	<link href="<%=request.getContextPath()%>/resources/square/green.css" rel="stylesheet">
	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/icheck.js"></script>

	<script>
		$(document).ready(function(){
			$('input').iCheck({
				checkboxClass: 'icheckbox_square-green',
				radioClass: 'iradio_square-green',
				increaseArea: '20%' // optional
			});
		});
	</script>

</head>
<body>

<div class="container">
	<p>${message}</p>
	<form:form class="form-signin" method="POST" commandName="student" action="${pageContext.request.contextPath}/student/add.html">
		<h2 class="form-signin-heading">添加学生</h2>
		<form:input type="text"  class="form-control" placeholder="姓名" path="name" />
		<form:input type="text"  class="form-control" placeholder="学号" path="stuID"  />
		<br>
		<form:input type="text"  class="form-control" placeholder="学院" path="college"  />
		<form:input type="text"  class="form-control" placeholder="专业" path="speclity"  />
		<br>

		<form:radiobutton  path="gender" value="男" />男
		<form:radiobutton  path="gender" value="男" />女
		<br>
		<br>
		<button class="btn btn-lg btn-success btn-block" type="submit">提交</button>
	</form:form>


</div>
</body>
</html>