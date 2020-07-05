package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.User;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		UserDao dao = new UserDaoImpl();
		User user = new User(name,pwd);
		boolean flag = dao.login(user);
		if(flag) {
			request.setAttribute("message","success");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			request.setAttribute("message", "fail");
			//request.getRequestDispatcher("login.jsp").forward(request,response);
			response.sendRedirect("login.jsp");
		}
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
