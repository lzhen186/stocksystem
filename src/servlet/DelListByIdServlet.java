package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ListDao;
import dao.impl.ListDaoImpl;


public class DelListByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DelListByIdServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int dishid = Integer.parseInt(request.getParameter("id"));
		
		if(dishid !=0) {
			ListDao dao = new ListDaoImpl();
			dao.delBylistId(dishid);
		}
		
		response.sendRedirect("ListerServlet");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
