package serviceImp;

import java.util.List;

import daoImp.BookManage;
import entity.Bargain;
import entity.Book;
import entity.Recommended;
import service.ITypeBookService;

public class TypeBookService implements ITypeBookService {
	private BookManage bookManage;
	public List<Book> bestSellingBook(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return bookManage.bestSellingBook(pageNumber, pageSize);
	}

	public List<Book> latestBook(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return bookManage.latestBook(pageNumber, pageSize);
	}

	public List<Recommended> allRecommended(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return bookManage.allRecommended(pageNumber, pageSize);
	}

	public List<Bargain> allBargain(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return bookManage.allBargain(pageNumber, pageSize);
	}

	public BookManage getBookManage() {
		return bookManage;
	}

	public void setBookManage(BookManage bookManage) {
		this.bookManage = bookManage;
	}


}
