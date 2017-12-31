package serviceImp;

import java.util.List;


import daoImp.OrdersManage;

import entity.Orders;
import entity.Ordersbook;
import service.ISingleOrderService;

public class SingleOrderService implements ISingleOrderService {
	private OrdersManage ordersManage;
	public Orders findOrders(int ordersId) {
		// TODO Auto-generated method stub
		return ordersManage.findOrders(ordersId);
	}

	public List<Ordersbook> allOrdersbookByOrders(int ordersId) {
		// TODO Auto-generated method stub
		return ordersManage.allOrdersbookByOrders(ordersId);
	}


	public OrdersManage getOrdersManage() {
		return ordersManage;
	}

	public void setOrdersManage(OrdersManage ordersManage) {
		this.ordersManage = ordersManage;
	}


}
