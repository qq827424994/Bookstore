package serviceImp;

import daoImp.BookManage;
import entity.Book;
import entity.Type;
import service.IUpdateBookService;

public class UpdateBookService implements IUpdateBookService {
 private BookManage bookManage;
	public Book findBook(int bookId) {
		// TODO Auto-generated method stub
		return bookManage.findBook(bookId);
	}

	public Type findType(int typeId) {
		// TODO Auto-generated method stub
		return bookManage.findType(typeId);
	}

	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		bookManage.updateBook(book);
	}

	public BookManage getBookManage() {
		return bookManage;
	}

	public void setBookManage(BookManage bookManage) {
		this.bookManage = bookManage;
	}

}
