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



public class GoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public GoodsServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int current = Integer.valueOf(request.getParameter("current"));
		current = current-1;
		int pagesize = 12;	//每页大小
		GoodsDao dao  = new GoodsDaoImpl();
		List<Goods> goods =dao.queryGoodsByPage(current, pagesize);
		
		
		int count =dao.getTotalCount();//记录数
		int pages = 0;			//页数
		if(count%pagesize == 0) {
			pages = count/pagesize;
		}else {
			pages = count/pagesize + 1;
		}	
		int fristpage = 1;
		
		request.setAttribute("frist",fristpage);
		request.setAttribute("current", current+1);
		request.setAttribute("goods",goods);
		request.setAttribute("pages", pages);
		request.setAttribute("pagesize", pagesize);
		request.setAttribute("count", count);
		request.getRequestDispatcher("goods.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
