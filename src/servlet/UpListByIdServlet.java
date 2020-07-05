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

public class UpListByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public UpListByIdServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int dishid = Integer.parseInt(request.getParameter("id"));
		int dishnum = Integer.parseInt(request.getParameter("dishnum"));
		String dishname = request.getParameter("dishname");
		GoodsDao goodsdao = new GoodsDaoImpl();
		int goodsnum = goodsdao.queryGoodsByNum(dishname);
		
		if(dishnum>0 && dishnum<=goodsnum) {
			ListDao dao = new ListDaoImpl();
			dao.upBylistId(dishid, dishnum);
		}
		request.getRequestDispatcher("ListerServlet").forward(request,response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
