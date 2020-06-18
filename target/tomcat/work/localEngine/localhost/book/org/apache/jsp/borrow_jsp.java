package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class borrow_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'borrow.jsp' starting page</title>\r\n");
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
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("<!--     <link rel=\"icon\" href=\"../../favicon.ico\"> -->\r\n");
      out.write("\r\n");
      out.write("    <title>借阅书籍</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("    <link href=\"css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"css/navbar.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/borrow.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\r\n");
      out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\r\n");
      out.write("    <script src=\"scripts/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t<h1>自助借还系统</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"panel-footer\">\r\n");
      out.write("\t\t\t\t请选择要借阅的数量\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-6 col-md-2\" id=\"info\">\r\n");
      out.write("\t\t    <div>姓名：张三</div>\r\n");
      out.write("\t\t    <div>证号：2017212212015</div>\r\n");
      out.write("\t\t    <div>可借数量：10本</div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div id=\"number\">\r\n");
      out.write("\t\t\t  <div class=\"col-xs-6 col-md-2\">\r\n");
      out.write("\t\t\t  \t<div class=\"thumbnail btn btn-default\" id=\"try\">\r\n");
      out.write("\t\t\t      <div>1本</div>\r\n");
      out.write("\t\t\t  \t</div>\r\n");
      out.write("\t\t\t    <div class=\"thumbnail btn btn-default\">\r\n");
      out.write("\t\t\t      <div>4本</div>\r\n");
      out.write("\t\t\t  \t</div>\r\n");
      out.write("\t\t\t  \t<div class=\"thumbnail btn btn-default\">\r\n");
      out.write("\t\t\t      <div>7本</div>\r\n");
      out.write("\t\t\t  \t</div>\r\n");
      out.write("\t\t\t  \t<div class=\"thumbnail btn btn-default\">\r\n");
      out.write("\t\t\t      <div>10本</div>\r\n");
      out.write("\t\t\t  \t</div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  <div class=\"col-xs-6 col-md-2\">\r\n");
      out.write("\t\t\t  \t<div class=\"thumbnail btn btn-default\">\r\n");
      out.write("\t\t\t      <div>2本</div>\r\n");
      out.write("\t\t\t  \t</div>\r\n");
      out.write("\t\t\t    <div class=\"thumbnail btn btn-default\">\r\n");
      out.write("\t\t\t      <div>5本</div>\r\n");
      out.write("\t\t\t  \t</div>\r\n");
      out.write("\t\t\t  \t<div class=\"thumbnail btn btn-default\">\r\n");
      out.write("\t\t\t      <div>8本</div>\r\n");
      out.write("\t\t\t  \t</div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  <div class=\"col-xs-6 col-md-2\">\r\n");
      out.write("\t\t\t  \t<div class=\"thumbnail btn btn-default\">\r\n");
      out.write("\t\t\t      <div>3本</div>\r\n");
      out.write("\t\t\t  \t</div>\r\n");
      out.write("\t\t\t    <div class=\"thumbnail btn btn-default\">\r\n");
      out.write("\t\t\t      <div>6本</div>\r\n");
      out.write("\t\t\t  \t</div>\r\n");
      out.write("\t\t\t  \t<div class=\"thumbnail btn btn-default\">\r\n");
      out.write("\t\t\t      <div>9本</div>\r\n");
      out.write("\t\t\t  \t</div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t\t<div class=\"btn btn-default\" id=\"exit\">\r\n");
      out.write("\t\t\t\t退出\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("\t<script src=\"scripts/ie10-viewport-bug-workaround.js\"></script>\r\n");
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
