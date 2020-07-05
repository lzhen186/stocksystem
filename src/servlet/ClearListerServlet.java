package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ListDao;
import dao.impl.ListDaoImpl;


public class ClearListerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ClearListerServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ListDao dao = new ListDaoImpl();
		dao.clearLister();
		response.sendRedirect("ListerServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
