<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'search.jsp' starting page</title>
    
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

    <title>图书查询</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/navbar.css" rel="stylesheet">
    <link href="css/search.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="scripts/ie-emulation-modes-warning.js"></script>

  </head>
  
  <body>
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="scripts/ie10-viewport-bug-workaround.js"></script>
    <div class="container">
    <!-- Static navbar -->
<!--     <nav class="navbar nav-tabs"> -->
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

		<div class="jumbotron">
			<h2>馆藏检索</h2>
	    <div class="row">
			  <div class="col-lg-8">
			  <form action="./queryservlet" method="post">
			    <div class="input-group">
			      <input class="glyphicon glyphicon-calendar" type="text" name="bookname" placeholder="请输入书名" required="required" value="${bookname}"/>
			      <button type="submit" value="查询">查询</button>
			    </div><!-- /input-group -->
			    </form>
			  </div><!-- /.col-lg-6 -->
			</div><!-- /.row -->
		</div>
		
		<div class="table-responsive">
						<table class="table table-bordered agileinfo">
							<thead>
								<tr>
									<th>编号</th>
									<th>书名</th>
									<th>作者</th>
									<th>位置</th>
									<th>余量</th>
									<th>是否借阅</th>
								</tr>
							</thead>
							<c:forEach var="row" items="${messageList}" varStatus="status">
								<tr>
									<td class="t1"><c:out value="${row.bookid}" />
									</td>
									<td class="t2"><c:out value="${row.bookname}" /><br>
									</td>
									<td class="t3"><c:out value="${row.author}" /><br>
									</td>
									<td class="t4"><c:out value="${row.position}" />
									</td>
									<td class="t4"><c:out value="${row.num}" />
									</td>
									<td class="t15"><a href="borrow.jsp"
										 class="seat-button two">借阅</a></td>
								</tr>
							</c:forEach>
						</table>
					</div>

		<div class="container">
      <!-- Example row of columns -->
      <div class="row" id="hotclass">
        <div class="col-md-4">
          <h4>热门图书</h4>
          <ul>
          	<li><span class="glyphicon glyphicon-menu-right"></span> 看见</li>
          	<li><span class="glyphicon glyphicon-menu-right"></span> 理想国</li>
          	<li><span class="glyphicon glyphicon-menu-right"></span> 三体</li>
          	<li><span class="glyphicon glyphicon-menu-right"></span> 亲密关系</li>
          	<li><span class="glyphicon glyphicon-menu-right"></span> 海伯利安</li>
          	<li><span class="glyphicon glyphicon-menu-right"></span> 白夜行</li>
          	<li><span class="glyphicon glyphicon-menu-right"></span> 巨人的陨落</li>
          	<li><span class="glyphicon glyphicon-menu-right"></span> 龙珠</li>
          </ul>
          <p><a class="btn btn-default" href="#" role="button" id="details">View details »</a></p>
        </div>
        <div class="col-md-4">
          <h4>热门检索</h4>
          <ul>
          	<li><span class="glyphicon glyphicon-menu-right"></span> 司法公正</li>
          	<li><span class="glyphicon glyphicon-menu-right"></span> 高等数学</li>
          	<li><span class="glyphicon glyphicon-menu-right"></span> 空气</li>
          	<li><span class="glyphicon glyphicon-menu-right"></span> 资本论</li>
          	<li><span class="glyphicon glyphicon-menu-right"></span> 微观经济学</li>
          	<li><span class="glyphicon glyphicon-menu-right"></span> 余华</li>
          	<li><span class="glyphicon glyphicon-menu-right"></span> 东野圭吾</li>
          	<li><span class="glyphicon glyphicon-menu-right"></span> 岛上书店</li>
          </ul>
          <p><a class="btn btn-default" href="#" role="button" id="details">View details »</a></p>
       </div>
      </div>

	</div>
	<script>
		console.log("start");
		var messageList = '<%=session.getAttribute("messageList")%>';
		console.log(messageList);
	</script>

  </body>
</html>
