<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'borrow.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
<!--     <link rel="icon" href="../../favicon.ico"> -->

    <title>借阅书籍</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/navbar.css" rel="stylesheet">
    <link href="css/borrow.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="scripts/ie-emulation-modes-warning.js"></script>

  </head>
  
  <body>
    <div class="container">
		<div class="panel panel-default">
			<div class="panel-body">
				<h1>自助借还系统</h1>
			</div>
			<div class="panel-footer">
				请选择要借阅的数量
			</div>
		</div>
		<div class="row">
			<div class="col-xs-6 col-md-2" id="info">
		    <div>姓名：张三</div>
		    <div>证号：2017212212015</div>
		    <div>可借数量：10本</div>
		  </div>
		  <div id="number">
			  <div class="col-xs-6 col-md-2">
			  	<div class="thumbnail btn btn-default" id="try">
			      <div>1本</div>
			  	</div>
			    <div class="thumbnail btn btn-default">
			      <div>4本</div>
			  	</div>
			  	<div class="thumbnail btn btn-default">
			      <div>7本</div>
			  	</div>
			  	<div class="thumbnail btn btn-default">
			      <div>10本</div>
			  	</div>
			  </div>
			  <div class="col-xs-6 col-md-2">
			  	<div class="thumbnail btn btn-default">
			      <div>2本</div>
			  	</div>
			    <div class="thumbnail btn btn-default">
			      <div>5本</div>
			  	</div>
			  	<div class="thumbnail btn btn-default">
			      <div>8本</div>
			  	</div>
			  </div>
			  <div class="col-xs-6 col-md-2">
			  	<div class="thumbnail btn btn-default">
			      <div>3本</div>
			  	</div>
			    <div class="thumbnail btn btn-default">
			      <div>6本</div>
			  	</div>
			  	<div class="thumbnail btn btn-default">
			      <div>9本</div>
			  	</div>
			  </div>
		  </div>
			<div class="btn btn-default" id="exit">
				退出
			</div>
		</div>
	</div>

	<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="scripts/ie10-viewport-bug-workaround.js"></script>

  </body>
</html>
