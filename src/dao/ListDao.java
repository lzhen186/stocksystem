package dao;

import java.util.List;

import entity.Lister;

public interface ListDao {
	//�ɹ�������
	public boolean ListUpdate(Lister lists);
	//��ѯ�ɹ���
	public List<Lister> queryAllList();
	//����idɾ��
	public boolean delBylistId(int id);
	//����id����
	public boolean upBylistId(int dishid,int dishnum);
	//�������Ʋ�ѯ
	public boolean queryDishName(String dishname);
	//���
	public boolean clearLister();
}
