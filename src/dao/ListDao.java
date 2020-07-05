package dao;

import java.util.List;

import entity.Lister;

public interface ListDao {
	//采购车更新
	public boolean ListUpdate(Lister lists);
	//查询采购车
	public List<Lister> queryAllList();
	//更据id删除
	public boolean delBylistId(int id);
	//根据id更新
	public boolean upBylistId(int dishid,int dishnum);
	//更据名称查询
	public boolean queryDishName(String dishname);
	//清空
	public boolean clearLister();
}
