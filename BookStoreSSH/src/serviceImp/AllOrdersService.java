package serviceImp;

import java.util.List;

import daoImp.OrdersManage;
import entity.Orders;
import service.IAllOrdersService;

public class AllOrdersService implements IAllOrdersService {
	private OrdersManage ordersManage;
	public List<Orders> allOrdersByUser(int userId, int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return ordersManage.allOrdersByUser(userId, pageNumber, pageSize);
	}

	public List<Orders> allOrders(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return ordersManage.allOrders(pageNumber, pageSize);
	}

	public List<Orders> allOrdersByDeal(String isDeal, int pageNumber,
			int pageSize) {
		// TODO Auto-generated method stub
		return ordersManage.allOrdersByDeal(isDeal, pageNumber, pageSize);
	}

	public List<Orders> allOrdersByUserDeal(int userId, String isDeal,
			int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return ordersManage.allOrdersByUserDeal(userId, isDeal, pageNumber, pageSize);
	}

	public OrdersManage getOrdersManage() {
		return ordersManage;
	}

	public void setOrdersManage(OrdersManage ordersManage) {
		this.ordersManage = ordersManage;
	}

}
