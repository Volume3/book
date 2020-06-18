package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<title>User Registration</title>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"http://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/index_y_v3000.css\">\r\n");
      out.write("<link rel=\"shortcut icon\"\r\n");
      out.write("\thref=\"https://www.12306.cn/index/images/favicon.ico\"\r\n");
      out.write("\ttype=\"image/x-icon\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/register.css\" />\r\n");
      out.write("<link href=\"css/navbar.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\" style=\"height: auto;background-color: white;\">\r\n");
      out.write("\t\t<nav class=\"navbar navbar-default\">\r\n");
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
      out.write("\t\t<form id='formname' class=\"form-horizontal\" role=\"form\" action=\"./RegisterServlet\" method=\"post\">\r\n");
      out.write("\t\t\t<h3 id=\"title\" style=\"position: relative;left: 470px;\">请填写注册信息</h3>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<!-- 用户名 -->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-sm-4 control-label\"><span\r\n");
      out.write("\t\t\t\t\tclass=\"item_tips\">* </span>用户名</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t<input class=\"form-control\" id=\"userName\" name=\"username\"\r\n");
      out.write("\t\t\t\t\t\ttype=\"text\" value=\"\" placeholder=\"用户名设置成功后不可修改\" maxlength=\"30\"\r\n");
      out.write("\t\t\t\t\t\tminlength=\"3\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<span class=\"col-sm-4\" id='tips'>3-30位字母、数字或“_”,字母开头</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 密码 -->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-sm-4 control-label\"><span\r\n");
      out.write("\t\t\t\t\tclass=\"item_tips\">* </span>登录密码</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t<input class=\"form-control\" id=\"inputPassword1\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\ttype=\"password\" placeholder=\"3-20位的数字、字母或符号\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 密码2 -->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-sm-4 control-label\"><span\r\n");
      out.write("\t\t\t\t\tclass=\"item_tips\">* </span>确认密码</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t<input class=\"form-control\" id=\"inputPassword2\" type=\"password\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"再次输入您的登录密码\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 姓名 -->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-sm-4 control-label\"><span\r\n");
      out.write("\t\t\t\t\tclass=\"item_tips\">* </span>姓名</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t<input class=\"form-control\" id=\"userRealName\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\ttype=\"text\" value=\"\" placeholder=\"请输入姓名\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<span class=\"col-sm-4\" id='tips'>用于身份核验，请正确填写</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-8\">\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"interst\" id='isCheck'>我已阅读并同意遵守\r\n");
      out.write("\t\t\t\t\t<a href=\"\">《隐私权政策》</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"buttons\">\r\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn btn-md\" id='nextStepButton'\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 30%;position:relative;left:400px\">注册</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.bootcss.com/moment.js/2.24.0/moment-with-locales.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.47/js/bootstrap-datetimepicker.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction is_login_alter(){\r\n");
      out.write("\t\t\tvar logininfo = '");
      out.print(session.getAttribute("login_info"));
      out.write("';\r\n");
      out.write("\t\t\tif (logininfo == 'succeed'){\r\n");
      out.write("\t\t\t\twindow.location.href = \"search.jsp\";\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t// \t\t\talert(logininfo);\r\n");
      out.write("\t\t\t\talert(\"请先登录\");\r\n");
      out.write("\t\t\t\twindow.location.href = \"Login.jsp\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\twindow.onload = function(){\r\n");
      out.write("\t\t\tvar logininfo = '");
      out.print(session.getAttribute("login_info"));
      out.write("';\r\n");
      out.write("\t\t\tconsole.log(logininfo);\r\n");
      out.write("\t\t\tif (logininfo == 'succeed'){\r\n");
      out.write("\t\t\t\tvar user_name = '");
      out.print(session.getAttribute("user_name"));
      out.write("';\r\n");
      out.write("\t\t\t\t// \t\t\t\t\t\t\talert(user_name);\r\n");
      out.write("\t\t\t\tdocument.getElementById('is_login').innerText = user_name;\r\n");
      out.write("\t\t\t\tdocument.getElementById('is_login').href = '#';\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tdocument.getElementById('is_sign').innerText = '登出';\r\n");
      out.write("\t\t\t\tdocument.getElementById('is_sign').href = 'UserServlet?action=exit';\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tdocument.getElementById('is_login').innerText = '登录';\r\n");
      out.write("\t\t\t\tdocument.getElementById('is_login').href = 'Login.jsp';\r\n");
      out.write("\t\t\t\tdocument.getElementById('is_sign').innerText = '注册';\r\n");
      out.write("\t\t\t\tdocument.getElementById('is_sign').href = 'Register.jsp;';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t$('#nextStepButton').on(\r\n");
      out.write("\t\t\t\t'click',\r\n");
      out.write("\t\t\t\tfunction() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tvar username = $(\"#userName\").val();\r\n");
      out.write("\t\t\t\t\tvar a = [];\r\n");
      out.write("\t\t\t\t\t$(\"input[type=password]\").each(function() {\r\n");
      out.write("\t\t\t\t\t\ta.push($(this).val())\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\tvar userpassword1 = a[0];\r\n");
      out.write("\t\t\t\t\tvar userpassword2 = a[1];\r\n");
      out.write("\t\t\t\t\tvar userrealname = $(\"#userRealName\").val();\r\n");
      out.write("\t\t\t\t\tvar ischeck = $(\"#isCheck\").is(':checked');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tvar flag = 0;\r\n");
      out.write("\t\t\t\t\t//判断注册信息\r\n");
      out.write("\t\t\t\t\tif ((username == '') || (userpassword1 == '')\r\n");
      out.write("\t\t\t\t\t\t\t|| (userpassword2 == '') || (userrealname == '')) {\r\n");
      out.write("\t\t\t\t\t\tflag = 1;\r\n");
      out.write("\t\t\t\t\t\talert('请将信息填写完整');\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t} else if (ischeck == false) {\r\n");
      out.write("\t\t\t\t\t\tflag = 1;\r\n");
      out.write("\t\t\t\t\t\talert('请仔细阅读协议条款，并勾选为已阅！');\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tif ((flag == 0) && (username.length < 3)\r\n");
      out.write("\t\t\t\t\t\t\t&& (username.length > 30)) {\r\n");
      out.write("\t\t\t\t\t\tflag = 1;\r\n");
      out.write("\t\t\t\t\t\talert('错误！用户名需填写3-30位！');\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t} else if ((username.length >= 3)\r\n");
      out.write("\t\t\t\t\t\t\t|| (username.length <= 30)) {\r\n");
      out.write("\t\t\t\t\t\tvar patrn = /^(\\w){3,30}$/;\r\n");
      out.write("\t\t\t\t\t\tif (!patrn.test(username)) {\r\n");
      out.write("\t\t\t\t\t\t\tflag = 1;\r\n");
      out.write("\t\t\t\t\t\t\talert('用户名无效！请填写3-30位的数字、字母或符号！');\r\n");
      out.write("\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tif ((flag == 0) && (userpassword1 != userpassword2)) {\r\n");
      out.write("\t\t\t\t\t\tflag = 1;\r\n");
      out.write("\t\t\t\t\t\talert('错误！两次密码不相同！');\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t} else if (userpassword1 == userpassword2) {\r\n");
      out.write("\t\t\t\t\t\tvar patrn = /^(\\w){3,20}$/;\r\n");
      out.write("\t\t\t\t\t\tif (!patrn.test(userpassword1)) {\r\n");
      out.write("\t\t\t\t\t\t\tflag = 1;\r\n");
      out.write("\t\t\t\t\t\t\talert('密码无效！请填写3-20位的数字、字母或符号！');\r\n");
      out.write("\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
