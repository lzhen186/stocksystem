package entity;

import java.util.List;

public class Page {
//	��ǰҳ  currentPage
	private int currentPage;
	
//	ҳ���С pageSize
	private int pageSize ;

//	������ totalCount
	private int totalCount;
	
//	��ҳ��   totalPage
	private int totalPage ;
	
//	��ǰҳ�����ݼ���  goods
	private List<Goods> goods;
	

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<Goods> getGoods() {
		return goods;
	}

	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}

	public Page(int currentPage, int pageSize, int totalCount, int totalPage, List<Goods> goods) {
		super();
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.goods = goods;
	}
	
	
}
