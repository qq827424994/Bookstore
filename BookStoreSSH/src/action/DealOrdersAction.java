package action;

import service.IOrderManageService;
import entity.*;

public class DealOrdersAction {
 private IOrderManageService ordermanageservice;
 private Integer ordersId;
 
 public String execute(){
	 Orders ord=ordermanageservice.findOrders(ordersId);
	 ord.setIsDeal("1");
	 ordermanageservice.updateOrders(ord);
	 return "success";
 }



public Integer getOrdersId() {
	return ordersId;
}

public void setOrdersId(Integer ordersId) {
	this.ordersId = ordersId;
}


public IOrderManageService getOrdermanageservice() {
	return ordermanageservice;
}


public void setOrdermanageservice(IOrderManageService ordermanageservice) {
	this.ordermanageservice = ordermanageservice;
}
}
