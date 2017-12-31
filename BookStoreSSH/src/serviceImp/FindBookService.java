package serviceImp;

import daoImp.BookManage;
import entity.Book;
import service.IFindBookService;

public class FindBookService implements IFindBookService {
	private BookManage bookManage;
	public Book findBook(int bookId) {
		// TODO Auto-generated method stub
		return bookManage.findBook(bookId);
	}
	public BookManage getBookManage() {
		return bookManage;
	}
	public void setBookManage(BookManage bookManage) {
		this.bookManage = bookManage;
	}

}
