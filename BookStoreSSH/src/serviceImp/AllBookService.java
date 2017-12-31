package serviceImp;

import java.util.List;

import daoImp.BookManage;
import entity.Book;
import service.IAllBookService;

public class AllBookService implements IAllBookService {
	private BookManage bookManage;
	public List<Book> allBookByName(String bookName, int pageNumber,
			int pageSize) {
		// TODO Auto-generated method stub
		return bookManage.allBookByName(bookName, pageNumber, pageSize);
	}

	public List<Book> allBookByAuthor(String bookAuthor, int pageNumber,
			int pageSize) {
		// TODO Auto-generated method stub
		return bookManage.allBookByAuthor(bookAuthor, pageNumber, pageSize);
	}

	public List<Book> allBookByPress(String bookPress, int pageNumber,
			int pageSize) {
		// TODO Auto-generated method stub
		return bookManage.allBookByPress(bookPress, pageNumber, pageSize);
	}

	public List<Book> allBookByType(int typeId, int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return bookManage.allBookByType(typeId, pageNumber, pageSize);
	}

	public BookManage getBookManage() {
		return bookManage;
	}

	public void setBookManage(BookManage bookManage) {
		this.bookManage = bookManage;
	}

}
