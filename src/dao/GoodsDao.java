package dao;

import java.util.List;

import entity.Goods;

public interface GoodsDao {
	
	//��ѯ��������
	public int getTotalCount();
	
	//��ѯȫ����Ʒ  ����
	public List<Goods> queryAllgoods() ;
	
	//currentPage:��ǰҳ��ҳ�룩     pageSize��ҳ���С��ÿҳ��ʾ������������
	public List<Goods> queryGoodsByPage(int currentPage, int pageSize);
	
	//����
	public boolean goodsUpdate(int dishnum,int dishid);
	
	//���ݲ˲�ѯ����
	public int queryGoodsByNum(String dishname);
	
	//ģ����ѯ
	public List<Goods> queryLikeGoods(String str);
}
