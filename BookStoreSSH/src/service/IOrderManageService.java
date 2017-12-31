package service;

import entity.Orders;
import entity.Ordersbook;

public interface IOrderManageService {
public int addOrders(Orders orders);
public Orders findOrders(int ordersId);
public void addOrdersbook(Ordersbook ordersbook);
public int deleteOrders(int ordersId);
public void updateOrders(Orders orders);
}
