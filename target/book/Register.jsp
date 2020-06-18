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

<title>User Registration</title>

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
<link
	href="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="css/index_y_v3000.css">
<link rel="shortcut icon"
	href="https://www.12306.cn/index/images/favicon.ico"
	type="image/x-icon" />
<link rel="stylesheet" type="text/css" href="css/register.css" />
<link href="css/navbar.css" rel="stylesheet">

</head>

<body>

	<div class="container" style="height: auto;background-color: white;">
		<nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                        aria-expanded="false" aria-controls="navbar">
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
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                                aria-haspopup="true" aria-expanded="false">更多 <span class="caret"></span></a>
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
                    <ul class="nav navbar-nav navbar-right">
                        <li class="active"><a href="search.jsp">查询<span class="sr-only">(current)</span></a></li>
                        <li><a href="Register.jsp">注册</a></li>
                        <li><a href="Login.jsp">用户登录</a></li>
                        <li role="presentation"><a href="managerLogin.jsp">管理员登录</a></li>
                    </ul>
                </div>
                <!--/.nav-collapse -->
            </div>
            <!--/.container-fluid -->
        </nav>
		<form id='formname' class="form-horizontal" role="form" action="./RegisterServlet" method="post">
			<h3 id="title" style="position: relative;left: 470px;">请填写注册信息</h3>
			<br>
			<!-- 用户名 -->
			<div class="form-group">
				<label class="col-sm-4 control-label"><span
					class="item_tips">* </span>用户名</label>
				<div class="col-sm-4">
					<input class="form-control" id="userName" name="username"
						type="text" value="" placeholder="用户名设置成功后不可修改" maxlength="30"
						minlength="3">
				</div>
				<span class="col-sm-4" id='tips'>3-30位字母、数字或“_”,字母开头</span>
			</div>
			<!-- 密码 -->
			<div class="form-group">
				<label class="col-sm-4 control-label"><span
					class="item_tips">* </span>登录密码</label>
				<div class="col-sm-4">
					<input class="form-control" id="inputPassword1" name="password"
						type="password" placeholder="3-20位的数字、字母或符号">
				</div>
			</div>
			<!-- 密码2 -->
			<div class="form-group">
				<label class="col-sm-4 control-label"><span
					class="item_tips">* </span>确认密码</label>
				<div class="col-sm-4">
					<input class="form-control" id="inputPassword2" type="password"
						placeholder="再次输入您的登录密码">
				</div>
			</div>


			<!-- 姓名 -->
			<div class="form-group">
				<label class="col-sm-4 control-label"><span
					class="item_tips">* </span>姓名</label>
				<div class="col-sm-4">
					<input class="form-control" id="userRealName" name="name"
						type="text" value="" placeholder="请输入姓名">
				</div>
				<span class="col-sm-4" id='tips'>用于身份核验，请正确填写</span>
			</div>


			<div class="form-group">
				<div class="col-sm-4"></div>
				<div class="col-sm-8">
					<input type="checkbox" name="interst" id='isCheck'>我已阅读并同意遵守
					<a href="">《隐私权政策》</a>
				</div>
			</div>

			<div id="buttons">
				<button type="submit" class="btn btn-md" id='nextStepButton'
					style="width: 30%;position:relative;left:400px">注册</button>
			</div>

		</form>
		
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
	<script
		src="https://cdn.bootcss.com/moment.js/2.24.0/moment-with-locales.js"></script>
	<script
		src="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.47/js/bootstrap-datetimepicker.min.js"></script>
	<script>
		function is_login_alter(){
			var logininfo = '<%=session.getAttribute("login_info")%>';
			if (logininfo == 'succeed'){
				window.location.href = "search.jsp";
			} else {
	// 			alert(logininfo);
				alert("请先登录");
				window.location.href = "Login.jsp";
			}
		};
		window.onload = function(){
			var logininfo = '<%=session.getAttribute("login_info")%>';
			console.log(logininfo);
			if (logininfo == 'succeed'){
				var user_name = '<%=session.getAttribute("user_name")%>';
				// 							alert(user_name);
				document.getElementById('is_login').innerText = user_name;
				document.getElementById('is_login').href = '#';

				document.getElementById('is_sign').innerText = '登出';
				document.getElementById('is_sign').href = 'UserServlet?action=exit';
			} else {
				document.getElementById('is_login').innerText = '登录';
				document.getElementById('is_login').href = 'Login.jsp';
				document.getElementById('is_sign').innerText = '注册';
				document.getElementById('is_sign').href = 'Register.jsp;';
			}
		};

		$('#nextStepButton').on(
				'click',
				function() {

					var username = $("#userName").val();
					var a = [];
					$("input[type=password]").each(function() {
						a.push($(this).val())
					});
					var userpassword1 = a[0];
					var userpassword2 = a[1];
					var userrealname = $("#userRealName").val();
					var ischeck = $("#isCheck").is(':checked');

					var flag = 0;
					//判断注册信息
					if ((username == '') || (userpassword1 == '')
							|| (userpassword2 == '') || (userrealname == '')) {
						flag = 1;
						alert('请将信息填写完整');
						return false;
					} else if (ischeck == false) {
						flag = 1;
						alert('请仔细阅读协议条款，并勾选为已阅！');
						return false;
					}

					if ((flag == 0) && (username.length < 3)
							&& (username.length > 30)) {
						flag = 1;
						alert('错误！用户名需填写3-30位！');
						return false;
					} else if ((username.length >= 3)
							|| (username.length <= 30)) {
						var patrn = /^(\w){3,30}$/;
						if (!patrn.test(username)) {
							flag = 1;
							alert('用户名无效！请填写3-30位的数字、字母或符号！');
							return false;
						}
					}

					if ((flag == 0) && (userpassword1 != userpassword2)) {
						flag = 1;
						alert('错误！两次密码不相同！');
						return false;
					} else if (userpassword1 == userpassword2) {
						var patrn = /^(\w){3,20}$/;
						if (!patrn.test(userpassword1)) {
							flag = 1;
							alert('密码无效！请填写3-20位的数字、字母或符号！');
							return false;
						}
					}
				});
	</script>

</body>
</html>
