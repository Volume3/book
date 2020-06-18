<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<meta charset="utf-8">
	<link rel="icon" href="https://static.jianshukeji.com/highcharts/images/favicon.ico">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<style>
		#container{
			width: 800px;
			height: 500px;
			position: relative;
			left: 350px;
			top:100px;
		}

	</style>
	<script src="https://code.highcharts.com.cn/highcharts/highcharts.js"></script>
	<script src="https://code.highcharts.com.cn/highcharts/modules/exporting.js"></script>
	<script src="https://img.hcharts.cn/highcharts-plugins/highcharts-zh_CN.js"></script>
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
  <div class="container">
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
            <li role="presentation"><a href="Login.jsp">注册</a></li>
            <li role="presentation"><a href="Register.jsp">用户登录</a></li>
            <li role="presentation"><a href="managerLogin.jsp">管理员登录</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div><!--/.container-fluid -->
    </nav>
  </div> <!-- /container -->
    <div id="container" style="min-width:400px;height:400px"></div>
	<script>
		Highcharts.setOptions({
			global: {
				useUTC: false
			}
		});

		function activeLastPointToolip(chart) {
			var points = chart.series[0].points;
			chart.tooltip.refresh(points[points.length - 1]);
		}
		var chart = Highcharts.chart('container', {
			chart: {
				type: 'spline',
				marginRight: 10,
				events: {
					load: function () {
						var series = this.series[0],
							chart = this;
						activeLastPointToolip(chart);
						setInterval(function () {
							var x = (new Date()).getTime(), // 当前时间
								y = 100*Math.random(); // 随机值
							series.addPoint([x, y], true, true);
							activeLastPointToolip(chart);
						}, 1000);
					}
				}
			},
			title: {
				text: '图书管理系统实时访问数据'
			},
			xAxis: {
				type: 'datetime',
				tickPixelInterval: 150
			},
			yAxis: {
				title: {
					text: null
				}
			},
			tooltip: {
				formatter: function () {
					return '<b>' + this.series.name + '</b><br/>' +
						Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) + '<br/>' +
						Highcharts.numberFormat(this.y, 2);
				}
			},
			legend: {
				enabled: false
			},
			series: [{
				name: '实时访问数据',
				data: (function () {
					// 生成随机值
					var data = [],
						time = (new Date()).getTime(),
						i;
					for (i = -19; i <= 0; i += 1) {
						data.push({
							x: time + i * 1000,
							y: 100*Math.random()
						});
					}
					return data;
				}())
			}]
		});
	</script>
</body>

  </body>
</html>
