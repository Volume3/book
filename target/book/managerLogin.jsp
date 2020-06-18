<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'managerLogin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link href="css/navbar.css" rel="stylesheet">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet">
	<link
	href="http://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
  </head>
  
  <body>
	<div class="container" style="height: auto;background-color: white;">
		<nav class="navbar navbar-default">
	      <div class="container-fluid">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" href="search.jsp">图书管理系统</a>
	        </div>
	        <div id="navbar" class="navbar-collapse collapse">
	          <ul class="nav navbar-nav">
	            <li><a href="search.jsp">首页</a></li>
	            <li><a href="other.jsp">关于我们</a></li>
	            <li><a href="advice.jsp">联系我们</a></li>
	            <li class="dropdown">
	              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">更多 <span class="caret"></span></a>
	              <ul class="dropdown-menu">
	                <li><a href="#">Action</a></li>
	                <li><a href="#">Another action</a></li>
	                <li><a href="#">Something else here</a></li>
	                <li role="separator" class="divider"></li>
	                <li class="dropdown-header">Nav header</li>
	                <li><a href="#">Separated link</a></li>
	                <li><a href="#">One more separated link</a></li>
	              </ul>
	            </li>
	          </ul>
	          <ul class="nav navbar-right navbar-nav">
	<!--           <ul class="nav navbar-right nav-pills"> -->
	            <li class="active" id="search" role="presentation"><a href="search.jsp">查询</a></li>
	            <li role="presentation"><a href="Register.jsp">注册</a></li>
	            <li role="presentation"><a href="Login.jsp">用户登录</a></li>
	            <li role="presentation"><a href="managerLogin.jsp">管理员登录</a></li>
	          </ul>
	        </div><!--/.nav-collapse -->
	      </div><!--/.container-fluid -->
	    </nav>
		<!--上面第3个大div-->
		<div class="container div-relative" id='Logindiv3'>
			<div class="jumbotron" id='FromBackground'>
				<h1>图书管理系统</h1>
				<br>
				<p class="somewords">欢迎使用图书管理系统</p>
				<br>
				<p class="btn1">
					<a class="btn btn-lg btn-primary" href="Login.jsp" role="button"
						style='background-color: #3B99FC;border-color: #2676E3;color: white;z-index:999'>用户登录
						&raquo;</a>
				</p>
			</div>

			<div class="container div-login">
					<h4 class="form-signin-heading" style='font-size:20px;'>管理员登录</h4>
					<br>
					<div>
						<label for="inputUsername" class="sr-only">输入用户名</label> <input
							type="text" id="inputUsername" name="username"
							class="form-control" placeholder="输入用户名" autofocus>
						<br> <label for="inputPassword" class="sr-only">输入密码</label>
						<input type="password" id="inputPassword" name="password"
							class="form-control" placeholder="输入密码" >
					</div>
					
					<br>
					<button class="btn btn-md btn-primary btn-block"
						id='BtnLogin'
						style='background-color: #3B99FC;border-color: #2676E3;color: white;'>登录</button>

			</div>

		</div>


	<script
		src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
	<script>
		
		$("#BtnLogin").click(function(){
			var inputUsername = $("#inputUsername").val();
			var inputPassword = $('input[name="password"]').val();
		    if((inputUsername=="admin")&&(inputPassword=="admin")){
		    	window.location.href="management.jsp";
		    }
		});

	</script>
  </body>
</html>
