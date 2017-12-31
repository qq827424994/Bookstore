package serviceImp;

import daoImp.BookManage;
import entity.Bargain;
import service.IBookBargainService;

public class BookBargainService implements IBookBargainService {
	private BookManage bookManage;
	public Bargain isBargain(int bookId) {
		// TODO Auto-generated method stub
		return bookManage.isBargain(bookId);
	}
	public BookManage getBookManage() {
		return bookManage;
	}
	public void setBookManage(BookManage bookManage) {
		this.bookManage = bookManage;
	}

}
