package dao;

import java.util.List;

import entity.*;

public interface OrdersDao {
	// 查询所有订单
	public List<Orders> allOrders(final int pageNumber, final int pageSize);

	// 查询所有订单
	 
	public List<Orders> allOrdersByDeal(final String isDeal,
			final int pageNumber, final int pageSize);

	// 添加一个新的订单
	public int addOrders(Orders orders);

	// 删除一个订单
	public int deleteOrders(int ordersId);

	// 修改订单
	public void updateOrders(Orders orders);

	// 根据ID查询订单
	public Orders findOrders(int ordersId);

	// 添加一条订单图书信息
	public void addOrdersbook(Ordersbook ordersbook);

	// 根据userId获取该用户所有订单
 	public List<Orders> allOrdersByUser(int userId, int pageNumber, int pageSize);

	// 根据userId,订单处理状态获取该用户所有订单
	public List<Orders> allOrdersByUserDeal(int userId, String isDeal,
			int pageNumber, int pageSize);

	// 根据ordersId获取该订单所有订单图书
	public List<Ordersbook> allOrdersbookByOrders(int ordersId);
}
