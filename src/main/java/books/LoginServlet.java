package books;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import books.UserDao;
import books.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
//		out.println("<HTML>");
//		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
//		out.println("  <BODY>");
//		out.print("    This is ");
//		out.print(this.getClass());
//		out.println(", using the GET method");
//		out.println("  </BODY>");
//		out.println("</HTML>");
//		out.flush();
//		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//��ȡLogin.jspҳ���ύ���˺ź�����
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//��������
		System.out.println(username+" "+password);
		
		//��ȡLogin.jspҳ���ύ���˺��������õ�ʵ����User��
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		//�������ݽ�����
		UserDao userDao = new UserDao();
		User resultuser = userDao.login(user);

		if(resultuser != null){
			//����session
		    request.setCharacterEncoding("utf-8");
		    response.setContentType("text/html;charset=utf-8");
		    HttpSession session=request.getSession();
		    System.out.println(resultuser.getUsername());
		    
		    session.setAttribute("user_name", resultuser.getUsername());
		    session.setAttribute("login_info", "��¼�ɹ�!");
		    System.out.println(session.getAttribute("login_info"));
		}
		else{
			HttpSession session=request.getSession();
			session.setAttribute("login_info", "��¼ʧ��!");
		}
		
		request.getRequestDispatcher("is_login.jsp").forward(request,response);
	}


}
