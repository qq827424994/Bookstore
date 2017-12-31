package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import service.IBookBargainService;
import service.ISingleOrderService;

import com.opensymphony.xwork2.ActionSupport;

import java.util.*;


import entity.*;
@SuppressWarnings("serial")
public class SingleOrdersAction extends ActionSupport{
	
	private ISingleOrderService singleorderservice;
	private IBookBargainService bookbargainservice;
	
	public String execute(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String ordersId = request.getParameter("ordersId");
		int ordersIdInt = Integer.parseInt(ordersId);
		Orders orders = new Orders();
		orders = singleorderservice.findOrders(ordersIdInt);
		List<Ordersbook> allOrdersbookByOrders = new ArrayList<Ordersbook>();
		allOrdersbookByOrders = singleorderservice.allOrdersbookByOrders(ordersIdInt);
		List<Book> bookList = new ArrayList<Book>();
		for(Ordersbook ordersbook : allOrdersbookByOrders){
			Book book = ordersbook.getBook();
			Bargain bargain = null;
			bargain = bookbargainservice.isBargain(book.getBookId());
			if(bargain != null){
				book.setBookPrice(bargain.getBookNewPrice());
			}
			book.setBookAmount(ordersbook.getBookAmount());
			bookList.add(book);
		}
		request.setAttribute("bookList", bookList);
		request.setAttribute("orders", orders);
		return null;
	}


	public ISingleOrderService getSingleorderservice() {
		return singleorderservice;
	}


	public void setSingleorderservice(ISingleOrderService singleorderservice) {
		this.singleorderservice = singleorderservice;
	}


	public IBookBargainService getBookbargainservice() {
		return bookbargainservice;
	}


	public void setBookbargainservice(IBookBargainService bookbargainservice) {
		this.bookbargainservice = bookbargainservice;
	}

}
