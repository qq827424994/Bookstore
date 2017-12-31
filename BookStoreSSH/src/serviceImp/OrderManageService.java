package serviceImp;

import daoImp.OrdersManage;
import entity.Orders;
import entity.Ordersbook;
import service.IOrderManageService;

public class OrderManageService implements IOrderManageService {
private OrdersManage ordersManage;
	public int addOrders(Orders orders) {
		// TODO Auto-generated method stub
		return ordersManage.addOrders(orders);
	}

	public Orders findOrders(int ordersId) {
		// TODO Auto-generated method stub
		return ordersManage.findOrders(ordersId);
	}

	public void addOrdersbook(Ordersbook ordersbook) {
		// TODO Auto-generated method stub
		ordersManage.addOrdersbook(ordersbook);
	}

	public int deleteOrders(int ordersId) {
		// TODO Auto-generated method stub
		return ordersManage.deleteOrders(ordersId);
	}

	public void updateOrders(Orders orders) {
		// TODO Auto-generated method stub
		ordersManage.updateOrders(orders);
	}
	public OrdersManage getOrdersManage() {
		return ordersManage;
	}

	public void setOrdersManage(OrdersManage ordersManage) {
		this.ordersManage = ordersManage;
	}

	

	
}
