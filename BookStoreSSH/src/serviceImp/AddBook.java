package serviceImp;

import daoImp.BookManage;
import entity.Book;
import service.IAddBook;

public class AddBook implements IAddBook {
	private BookManage bookManage;
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		return bookManage.addBook(book);
	}
	public BookManage getBookManage() {
		return bookManage;
	}
	public void setBookManage(BookManage bookManage) {
		this.bookManage = bookManage;
	}

}
