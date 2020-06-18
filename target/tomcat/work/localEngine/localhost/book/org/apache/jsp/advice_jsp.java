package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class advice_jsp extends org.apache.jasper.runtime.HttpJspBase
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
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<title>My JSP 'advice.jsp' starting page</title>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("\t\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t\t<!--\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t\t\t-->\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\r\n");
      out.write("\t\t<meta name=\"author\" content=\"\">\r\n");
      out.write("\t\t<!--     <link rel=\"icon\" href=\"../../favicon.ico\"> -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<title>图书管理系统</title>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Bootstrap core CSS -->\r\n");
      out.write("\t\t<link\r\n");
      out.write("\t\t\thref=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css\"\r\n");
      out.write("\t\t\trel=\"stylesheet\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("\t\t<link href=\"css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Custom styles for this template -->\r\n");
      out.write("\t\t<link href=\"css/navbar.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\r\n");
      out.write("\t\t<!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\r\n");
      out.write("\t\t<script src=\"scripts/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\ttextarea {\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\theight: 350px;\r\n");
      out.write("\t\t\tresize: none;\r\n");
      out.write("\t\t\tfont-size: 18px;\r\n");
      out.write("\t\t\tline-height: 35px;\r\n");
      out.write("\t\t\ttext-indent: 5px;\r\n");
      out.write("\t\t\tborder: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\ttextarea:focus {\r\n");
      out.write("\t\t\tborder: none;\r\n");
      out.write("\t\t\toutline: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t#submit {\r\n");
      out.write("\t\t\twidth: 300px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tform {\r\n");
      out.write("\t\t\ttext-align: center;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("        <!-- Static navbar -->\r\n");
      out.write("        <nav class=\"navbar navbar-default\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\"\r\n");
      out.write("                        aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"search.jsp\">图书管理系统</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li><a href=\"search.jsp\">首页</a></li>\r\n");
      out.write("\t\t\t\t        <li><a href=\"other.jsp\">关于我们</a></li>\r\n");
      out.write("\t\t\t\t        <li><a href=\"advice.jsp\">联系我们</a></li>\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\"\r\n");
      out.write("                                aria-haspopup=\"true\" aria-expanded=\"false\">更多 <span class=\"caret\"></span></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a href=\"#\">Action</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Another action</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("                                <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("                                <li class=\"dropdown-header\">Nav header</li>\r\n");
      out.write("                                <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("                                <li><a href=\"#\">One more separated link</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li class=\"active\"><a href=\"search.jsp\">查询<span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                        <li><a href=\"Register.jsp\">注册</a></li>\r\n");
      out.write("                        <li><a href=\"Login.jsp\">用户登录</a></li>\r\n");
      out.write("                        <li role=\"presentation\"><a href=\"managerLogin.jsp\">管理员登录</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--/.nav-collapse -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--/.container-fluid -->\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <!-- Main component for a primary marketing message or call to action -->\r\n");
      out.write("       \t<form action=\"deliverMessage.jsp\" method = \"post\">\r\n");
      out.write("       \t\t<div class=\"panel panel-primary\">\r\n");
      out.write("\t            <div class=\"panel-heading\">\r\n");
      out.write("\t                <h3 class=\"panel-title\">建议箱</h3>\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t            <div class=\"panel-body\">\r\n");
      out.write("\t                <textarea maxlength=\"200\" placeholder=\"字数不得超过200....\" name = \"content\"></textarea>\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        <input class=\"btn btn-primary btn-lg\" type = \"submit\" value=\"提交\" id='submit'/>\r\n");
      out.write("       \t</form>\r\n");
      out.write("\t       \r\n");
      out.write("    </div> <!-- /container -->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"scripts/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("    <script src=\"scripts/ie10-viewport-bug-workaround.js\"></script>\r\n");
      out.write("\t</body>\r\n");
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
