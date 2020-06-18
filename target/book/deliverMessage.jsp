<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%-- <% --%>
<%-- String path = request.getContextPath(); --%>
<%-- String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; --%>
<%-- %> --%>

<%-- <%@ page import="com.rabbitMQ,java.text*"  %> --%>
<%@ page import="com.rabbitMQ.Send"  %>
<%@ page import="com.rabbitMQ.Recv"  %>
<%@ page import="com.rabbitMQ.Reciver" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'getMessage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/navbar.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="scripts/ie-emulation-modes-warning.js"></script>
  </head>
    <style>
    textarea {
        width: 100%;
        height: 350px;
        resize: none;
        font-size: 18px;
        line-height: 35px;
        text-indent: 5px;
        border: none;
    }

    textarea:focus {
        border: none;
        outline:none;
    }

    #submit {
        width: 300px;
    }

    p {
        text-align: center;
    }
</style>
  <body>
    <%
//     	  获取输入的建议内容
         request.setCharacterEncoding("UTF-8");
         String message = request.getParameter("content");
//          out.println(message);
         Send sendMessage = new Send();
         sendMessage.setQueryDetail(message);
         sendMessage.send();
         
//          Recv recvMessage = new Recv();
//          recvMessage.setQueryDetail(message);
//          recvMessage.recv();
     %>
     
     <div class="container">
        <!-- Static navbar -->
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
                    <a class="navbar-brand" href="#">图书管理系统</a>
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
                        <li class="active"><a href="./">查询<span class="sr-only">(current)</span></a></li>
                        <li><a href="Register.jsp">注册</a></li>
                        <li><a href="Login.jsp">登录</a></li>
                    </ul>
                </div>
                <!--/.nav-collapse -->
            </div>
            <!--/.container-fluid -->
        </nav>

        <!-- Main component for a primary marketing message or call to action -->
        <div class="panel panel-primary">
            <div class="panel-heading">
                <h3 class="panel-title">建议箱</h3>
            </div>
            <div class="panel-body">
<!--                 <textarea maxlength="200" placeholder="字数不得超过200...."></textarea> -->

				<% 
						out.println("<div class='well'>"+message+"</div>");
// 					 Reciver reciver = new Reciver();
					 
// 					 reciver = new Recv().recv(reciver);
// 					 Recv recvModel = new Recv();
// 					 reciver = recvModel.recv();
					 
// 					 String recvMessage = reciver.getQueryDetail();
// 					 System.out.println("deliver页面"+reciver.getQueryDetail());

// 			         String message = recvMessage.getQueryDetail();
// 					 out.println("这是deliver页面"+recvMessage);
// 			         out.println("<div class='well'>"+"这是deliver页面"+recvMessage+"</div>");
				 %>
            </div>
        </div>

    </div> <!-- /container -->

    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="scripts/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="scripts/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
