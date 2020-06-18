<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>User Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="http://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/login.css">
<!-- <link rel="shortcut icon" -->
<!-- 	href="https://www.12306.cn/index/images/favicon.ico" -->
<!-- 	type="image/x-icon" /> -->
<!-- <link rel="stylesheet" href="css/index_y_v3000.css"> -->
<link href="css/navbar.css" rel="stylesheet">
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
	          <a class="navbar-brand" href="#">图书管理系统</a>
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
	            <li class="active" id="search" role="presentation"><a href="./">查询</a></li>
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
					<a class="btn btn-lg btn-primary" href="Register.jsp" role="button"
						style='background-color: #3B99FC;border-color: #2676E3;color: white;z-index:999'>注册
						&raquo;</a>
				</p>
			</div>

			<div class="container div-login">
				<form id='formSize' class="form-signin" action=./LoginServlet
					method="post">
					<h4 class="form-signin-heading" style='font-size:20px;'>用户名登录</h4>
					<br>
					<div>
						<label for="inputUsername" class="sr-only">输入用户名</label> <input
							type="text" id="inputUsername" name="username"
							class="form-control" placeholder="输入用户名" required autofocus>
						<br> <label for="inputPassword" class="sr-only">输入密码</label>
						<input type="password" id="inputPassword" name="password"
							class="form-control" placeholder="输入密码" required>
					</div>
					<div class="checkbox">
						<label class="agreeItems"> <input type="checkbox"
							value="remember-me"> 我同意<a href=""><u>《服务条款》</u> </a>和<a
							href=""><u>《隐私政策》</u> </a> </label> <a href="" class="forgetPword">忘记密码</a>
					</div>
					<br>
					<button class="btn btn-md btn-primary btn-block" type="submit"
						id='BtnLogin'
						style='background-color: #3B99FC;border-color: #2676E3;color: white;'>登录</button>
				</form>

			</div>

		</div>


	<script
		src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
	<script>
// 		function is_login_alter(){
// 			var logininfo = '<%=session.getAttribute("login_info")%>';
// 			if (logininfo == 'succeed'){
// 				window.location.href = "search.jsp";
// 			} else {
				alert(logininfo);
// 				alert("请先登录");
// 				window.location.href = "Login.jsp";
// 			}
// 		};
// 		window.onload = function(){
// 			var logininfo = '<%=session.getAttribute("login_info")%>';
// 			console.log(logininfo);
// 			if (logininfo == 'succeed'){
// 				var user_name = '<%=session.getAttribute("user_name")%>';
											alert(user_name);
// 				document.getElementById('is_login').innerText = user_name;
// 				document.getElementById('is_login').href = '#';

// 				document.getElementById('is_sign').innerText = '登出';
// 				document.getElementById('is_sign').href = 'UserServlet?action=exit';
// 			} else {
// 				document.getElementById('is_login').innerText = '登录';
// 				document.getElementById('is_login').href = 'Login.jsp';
// 				document.getElementById('is_sign').innerText = '注册';
// 				document.getElementById('is_sign').href = 'Register.jsp;';
// 			}
// 		};

	</script>
</body>
</html>
