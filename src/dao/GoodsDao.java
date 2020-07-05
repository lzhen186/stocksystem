package dao;

import java.util.List;

import entity.Goods;

public interface GoodsDao {
	
	//查询总数据数
	public int getTotalCount();
	
	//查询全部商品  集合
	public List<Goods> queryAllgoods() ;
	
	//currentPage:当前页（页码）     pageSize：页面大小（每页显示的数据条数）
	public List<Goods> queryGoodsByPage(int currentPage, int pageSize);
	
	//更新
	public boolean goodsUpdate(int dishnum,int dishid);
	
	//更据菜查询数量
	public int queryGoodsByNum(String dishname);
	
	//模糊查询
	public List<Goods> queryLikeGoods(String str);
}
