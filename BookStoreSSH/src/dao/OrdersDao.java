package dao;

import java.util.List;

import entity.*;

public interface OrdersDao {
	// ��ѯ���ж���
	public List<Orders> allOrders(final int pageNumber, final int pageSize);

	// ��ѯ���ж���
	 
	public List<Orders> allOrdersByDeal(final String isDeal,
			final int pageNumber, final int pageSize);

	// ���һ���µĶ���
	public int addOrders(Orders orders);

	// ɾ��һ������
	public int deleteOrders(int ordersId);

	// �޸Ķ���
	public void updateOrders(Orders orders);

	// ����ID��ѯ����
	public Orders findOrders(int ordersId);

	// ���һ������ͼ����Ϣ
	public void addOrdersbook(Ordersbook ordersbook);

	// ����userId��ȡ���û����ж���
 	public List<Orders> allOrdersByUser(int userId, int pageNumber, int pageSize);

	// ����userId,��������״̬��ȡ���û����ж���
	public List<Orders> allOrdersByUserDeal(int userId, String isDeal,
			int pageNumber, int pageSize);

	// ����ordersId��ȡ�ö������ж���ͼ��
	public List<Ordersbook> allOrdersbookByOrders(int ordersId);
}
