package service;

import java.util.List;

import entity.Book;

public interface IAllBookService {
	public List<Book> allBookByName(String bookName, int pageNumber,
			int pageSize);
	public List<Book> allBookByAuthor(String bookAuthor, int pageNumber,
			int pageSize);
	public List<Book> allBookByPress(String bookPress, int pageNumber, int pageSize);
	public List<Book> allBookByType(int typeId, int pageNumber, int pageSize);
}
