package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import service.IBookBargainService;
import service.IFindBookService;

import com.opensymphony.xwork2.ActionSupport;

 
import entity.*;

@SuppressWarnings("serial")
public class SingleBookAction extends ActionSupport{

	private IFindBookService findbookservice;
	private IBookBargainService bookbargainservice;
	public String execute(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String bookId = request.getParameter("bookId");
		int bookIdInt = Integer.parseInt(bookId);
		Book book = new Book();
		book = findbookservice.findBook(bookIdInt);
		Bargain bargain = null;
		bargain = bookbargainservice.isBargain(bookIdInt);
		if(bargain == null){
			book.setBookNewPrice(book.getBookPrice());
		}else{
			book.setBookNewPrice(bargain.getBookNewPrice());
		}
		request.setAttribute("singleBook", book);
		return null;
	}

	public IFindBookService getFindbookservice() {
		return findbookservice;
	}

	public void setFindbookservice(IFindBookService findbookservice) {
		this.findbookservice = findbookservice;
	}

	public IBookBargainService getBookbargainservice() {
		return bookbargainservice;
	}

	public void setBookbargainservice(IBookBargainService bookbargainservice) {
		this.bookbargainservice = bookbargainservice;
	}
}
