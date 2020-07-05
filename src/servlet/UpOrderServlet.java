package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ListDao;
import dao.OrderDao;
import dao.impl.ListDaoImpl;
import dao.impl.OrderDaoImpl;
import entity.Lister;


public class UpOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpOrderServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		ListDao dao = new ListDaoImpl();
		List<Lister> lister = dao.queryAllList();
		
		
		request.setAttribute("lister", lister);
		
		
//		dao.clearLister();
		
		request.getRequestDispatcher("listlistlist.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
