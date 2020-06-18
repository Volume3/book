package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class other_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<link rel=\"icon\" href=\"https://static.jianshukeji.com/highcharts/images/favicon.ico\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t#container{\r\n");
      out.write("\t\t\twidth: 800px;\r\n");
      out.write("\t\t\theight: 500px;\r\n");
      out.write("\t\t\tposition: relative;\r\n");
      out.write("\t\t\tleft: 350px;\r\n");
      out.write("\t\t\ttop:100px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script src=\"https://code.highcharts.com.cn/highcharts/highcharts.js\"></script>\r\n");
      out.write("\t<script src=\"https://code.highcharts.com.cn/highcharts/modules/exporting.js\"></script>\r\n");
      out.write("\t<script src=\"https://img.hcharts.cn/highcharts-plugins/highcharts-zh_CN.js\"></script>\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>图书查询</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("    <link href=\"css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"css/navbar.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/search.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\r\n");
      out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\r\n");
      out.write("    <script src=\"scripts/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("  <nav class=\"navbar navbar-default\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"search.jsp\">图书管理系统</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("          <ul class=\"nav navbar-nav\">\r\n");
      out.write("            <li><a href=\"search.jsp\">首页</a></li>\r\n");
      out.write("\t        <li><a href=\"other.jsp\">关于我们</a></li>\r\n");
      out.write("\t        <li><a href=\"advice.jsp\">联系我们</a></li>\r\n");
      out.write("            <li class=\"dropdown\">\r\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">更多 <span class=\"caret\"></span></a>\r\n");
      out.write("              <ul class=\"dropdown-menu\">\r\n");
      out.write("                <li><a href=\"#\">Action</a></li>\r\n");
      out.write("                <li><a href=\"#\">Another action</a></li>\r\n");
      out.write("                <li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("                <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("                <li class=\"dropdown-header\">Nav header</li>\r\n");
      out.write("                <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("                <li><a href=\"#\">One more separated link</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <ul class=\"nav navbar-right navbar-nav\">\r\n");
      out.write("<!--           <ul class=\"nav navbar-right nav-pills\"> -->\r\n");
      out.write("            <li class=\"active\" id=\"search\" role=\"presentation\"><a href=\"search.jsp\">查询</a></li>\r\n");
      out.write("            <li role=\"presentation\"><a href=\"Login.jsp\">注册</a></li>\r\n");
      out.write("            <li role=\"presentation\"><a href=\"Register.jsp\">用户登录</a></li>\r\n");
      out.write("            <li role=\"presentation\"><a href=\"managerLogin.jsp\">管理员登录</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div><!--/.nav-collapse -->\r\n");
      out.write("      </div><!--/.container-fluid -->\r\n");
      out.write("    </nav>\r\n");
      out.write("  </div> <!-- /container -->\r\n");
      out.write("    <div id=\"container\" style=\"min-width:400px;height:400px\"></div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tHighcharts.setOptions({\r\n");
      out.write("\t\t\tglobal: {\r\n");
      out.write("\t\t\t\tuseUTC: false\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tfunction activeLastPointToolip(chart) {\r\n");
      out.write("\t\t\tvar points = chart.series[0].points;\r\n");
      out.write("\t\t\tchart.tooltip.refresh(points[points.length - 1]);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar chart = Highcharts.chart('container', {\r\n");
      out.write("\t\t\tchart: {\r\n");
      out.write("\t\t\t\ttype: 'spline',\r\n");
      out.write("\t\t\t\tmarginRight: 10,\r\n");
      out.write("\t\t\t\tevents: {\r\n");
      out.write("\t\t\t\t\tload: function () {\r\n");
      out.write("\t\t\t\t\t\tvar series = this.series[0],\r\n");
      out.write("\t\t\t\t\t\t\tchart = this;\r\n");
      out.write("\t\t\t\t\t\tactiveLastPointToolip(chart);\r\n");
      out.write("\t\t\t\t\t\tsetInterval(function () {\r\n");
      out.write("\t\t\t\t\t\t\tvar x = (new Date()).getTime(), // 当前时间\r\n");
      out.write("\t\t\t\t\t\t\t\ty = 100*Math.random(); // 随机值\r\n");
      out.write("\t\t\t\t\t\t\tseries.addPoint([x, y], true, true);\r\n");
      out.write("\t\t\t\t\t\t\tactiveLastPointToolip(chart);\r\n");
      out.write("\t\t\t\t\t\t}, 1000);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\ttitle: {\r\n");
      out.write("\t\t\t\ttext: '图书管理系统实时访问数据'\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\txAxis: {\r\n");
      out.write("\t\t\t\ttype: 'datetime',\r\n");
      out.write("\t\t\t\ttickPixelInterval: 150\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tyAxis: {\r\n");
      out.write("\t\t\t\ttitle: {\r\n");
      out.write("\t\t\t\t\ttext: null\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\ttooltip: {\r\n");
      out.write("\t\t\t\tformatter: function () {\r\n");
      out.write("\t\t\t\t\treturn '<b>' + this.series.name + '</b><br/>' +\r\n");
      out.write("\t\t\t\t\t\tHighcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) + '<br/>' +\r\n");
      out.write("\t\t\t\t\t\tHighcharts.numberFormat(this.y, 2);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tlegend: {\r\n");
      out.write("\t\t\t\tenabled: false\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tseries: [{\r\n");
      out.write("\t\t\t\tname: '实时访问数据',\r\n");
      out.write("\t\t\t\tdata: (function () {\r\n");
      out.write("\t\t\t\t\t// 生成随机值\r\n");
      out.write("\t\t\t\t\tvar data = [],\r\n");
      out.write("\t\t\t\t\t\ttime = (new Date()).getTime(),\r\n");
      out.write("\t\t\t\t\t\ti;\r\n");
      out.write("\t\t\t\t\tfor (i = -19; i <= 0; i += 1) {\r\n");
      out.write("\t\t\t\t\t\tdata.push({\r\n");
      out.write("\t\t\t\t\t\t\tx: time + i * 1000,\r\n");
      out.write("\t\t\t\t\t\t\ty: 100*Math.random()\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\treturn data;\r\n");
      out.write("\t\t\t\t}())\r\n");
      out.write("\t\t\t}]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
