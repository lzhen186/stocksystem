package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GoodsDao;
import dao.impl.GoodsDaoImpl;
import entity.Goods;


public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SearchServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String conn = request.getParameter("content");
		GoodsDao dao = new GoodsDaoImpl();
		List<Goods> goods = dao.queryLikeGoods(conn);
		request.setAttribute("current", 1);
		request.setAttribute("goods",goods);
		request.getRequestDispatcher("goods.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
