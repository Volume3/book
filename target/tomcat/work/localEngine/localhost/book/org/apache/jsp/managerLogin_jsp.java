package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class managerLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'managerLogin.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t\r\n");
      out.write("\t<link href=\"css/navbar.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\t<link\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\t<link\r\n");
      out.write("\thref=\"http://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("\t<div class=\"container\" style=\"height: auto;background-color: white;\">\r\n");
      out.write("\t\t<nav class=\"navbar navbar-default\">\r\n");
      out.write("\t      <div class=\"container-fluid\">\r\n");
      out.write("\t        <div class=\"navbar-header\">\r\n");
      out.write("\t          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("\t            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t            <span class=\"icon-bar\"></span>\r\n");
      out.write("\t            <span class=\"icon-bar\"></span>\r\n");
      out.write("\t            <span class=\"icon-bar\"></span>\r\n");
      out.write("\t          </button>\r\n");
      out.write("\t          <a class=\"navbar-brand\" href=\"search.jsp\">图书管理系统</a>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("\t          <ul class=\"nav navbar-nav\">\r\n");
      out.write("\t            <li><a href=\"search.jsp\">首页</a></li>\r\n");
      out.write("\t            <li><a href=\"other.jsp\">关于我们</a></li>\r\n");
      out.write("\t            <li><a href=\"advice.jsp\">联系我们</a></li>\r\n");
      out.write("\t            <li class=\"dropdown\">\r\n");
      out.write("\t              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">更多 <span class=\"caret\"></span></a>\r\n");
      out.write("\t              <ul class=\"dropdown-menu\">\r\n");
      out.write("\t                <li><a href=\"#\">Action</a></li>\r\n");
      out.write("\t                <li><a href=\"#\">Another action</a></li>\r\n");
      out.write("\t                <li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("\t                <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("\t                <li class=\"dropdown-header\">Nav header</li>\r\n");
      out.write("\t                <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("\t                <li><a href=\"#\">One more separated link</a></li>\r\n");
      out.write("\t              </ul>\r\n");
      out.write("\t            </li>\r\n");
      out.write("\t          </ul>\r\n");
      out.write("\t          <ul class=\"nav navbar-right navbar-nav\">\r\n");
      out.write("\t<!--           <ul class=\"nav navbar-right nav-pills\"> -->\r\n");
      out.write("\t            <li class=\"active\" id=\"search\" role=\"presentation\"><a href=\"search.jsp\">查询</a></li>\r\n");
      out.write("\t            <li role=\"presentation\"><a href=\"Register.jsp\">注册</a></li>\r\n");
      out.write("\t            <li role=\"presentation\"><a href=\"Login.jsp\">用户登录</a></li>\r\n");
      out.write("\t            <li role=\"presentation\"><a href=\"managerLogin.jsp\">管理员登录</a></li>\r\n");
      out.write("\t          </ul>\r\n");
      out.write("\t        </div><!--/.nav-collapse -->\r\n");
      out.write("\t      </div><!--/.container-fluid -->\r\n");
      out.write("\t    </nav>\r\n");
      out.write("\t\t<!--上面第3个大div-->\r\n");
      out.write("\t\t<div class=\"container div-relative\" id='Logindiv3'>\r\n");
      out.write("\t\t\t<div class=\"jumbotron\" id='FromBackground'>\r\n");
      out.write("\t\t\t\t<h1>图书管理系统</h1>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<p class=\"somewords\">欢迎使用图书管理系统</p>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<p class=\"btn1\">\r\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-lg btn-primary\" href=\"Login.jsp\" role=\"button\"\r\n");
      out.write("\t\t\t\t\t\tstyle='background-color: #3B99FC;border-color: #2676E3;color: white;z-index:999'>用户登录\r\n");
      out.write("\t\t\t\t\t\t&raquo;</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"container div-login\">\r\n");
      out.write("\t\t\t\t\t<h4 class=\"form-signin-heading\" style='font-size:20px;'>管理员登录</h4>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<label for=\"inputUsername\" class=\"sr-only\">输入用户名</label> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" id=\"inputUsername\" name=\"username\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" placeholder=\"输入用户名\" autofocus>\r\n");
      out.write("\t\t\t\t\t\t<br> <label for=\"inputPassword\" class=\"sr-only\">输入密码</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" id=\"inputPassword\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" placeholder=\"输入密码\" >\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-md btn-primary btn-block\"\r\n");
      out.write("\t\t\t\t\t\tid='BtnLogin'\r\n");
      out.write("\t\t\t\t\t\tstyle='background-color: #3B99FC;border-color: #2676E3;color: white;'>登录</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#BtnLogin\").click(function(){\r\n");
      out.write("\t\t\tvar inputUsername = $(\"#inputUsername\").val();\r\n");
      out.write("\t\t\tvar inputPassword = $('input[name=\"password\"]').val();\r\n");
      out.write("\t\t    if((inputUsername==\"admin\")&&(inputPassword==\"admin\")){\r\n");
      out.write("\t\t    \twindow.location.href=\"management.jsp\";\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
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
