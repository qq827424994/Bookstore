package service;

import java.util.List;


import entity.Orders;
import entity.Ordersbook;

public interface ISingleOrderService {
public Orders findOrders(int ordersIdInt);
public List<Ordersbook> allOrdersbookByOrders(int ordersIdInt);
}
