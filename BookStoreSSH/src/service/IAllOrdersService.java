package service;
import java.util.List;

import entity.Orders;
public interface IAllOrdersService {
public List<Orders> allOrdersByUser(int userId, int pageNumber, int pageSize);
public List<Orders> allOrders(final int pageNumber, final int pageSize);
public List<Orders> allOrdersByDeal(final String isDeal,final int pageNumber, final int pageSize);
public List<Orders> allOrdersByUserDeal(int userId, String isDeal,int pageNumber, int pageSize);
}
