package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GoodsDao;
import dao.ListDao;
import dao.impl.GoodsDaoImpl;
import dao.impl.ListDaoImpl;
import entity.Lister;


public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ListServlet() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("text/html; charset=UTF-8");
		int dishid = Integer.valueOf(request.getParameter("id")); 
		String dishname = request.getParameter("name");
		Float dishprice = Float.parseFloat(request.getParameter("price"));
		int currentpage = Integer.valueOf(request.getParameter("current"));
		
		
		ListDao dao = new ListDaoImpl();
		
		Lister lists = new Lister();
		lists.setId(dishid);
		lists.setDishname(dishname);
		lists.setDishnum(100);
		lists.setDishprice(dishprice);
		
		
		boolean bname = dao.queryDishName(dishname);
		if(!bname) {
			dao.ListUpdate(lists);
		}
		
		
		request.setAttribute("current", currentpage);
		request.getRequestDispatcher("GoodsServlet").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
