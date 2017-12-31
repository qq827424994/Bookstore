package action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
 

import service.ITypeBookService;
import entity.*;

@SuppressWarnings("serial")
public class AllBookAction extends ActionSupport{
	
private ITypeBookService typebookservice;
	public String execute(){
		//推荐书
		List<Recommended> allRecommended = typebookservice.allRecommended(1, 6);
		List<Book> recommendedBook = new ArrayList<Book>();
		for(Recommended recommended : allRecommended){
			Book book = new Book();
			book = recommended.getBook();
			recommendedBook.add(book);
		}
		//特价书
		List<Bargain> allBargain = typebookservice.allBargain(1, 6);
		List<Book> bargainBook = new ArrayList<Book>();
		for(Bargain bargain : allBargain){
			Book book = new Book();
			book = bargain.getBook();
			bargainBook.add(book);
		}
		//新书
		List<Book> latestBook = typebookservice.latestBook(1, 6);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("recommendedBook", recommendedBook);
		request.setAttribute("bargainBook", bargainBook);
		request.setAttribute("latestBook", latestBook);
		
		return null;
	}
	public ITypeBookService getTypebookservice() {
		return typebookservice;
	}
	public void setTypebookservice(ITypeBookService typebookservice) {
		this.typebookservice = typebookservice;
	}

}
