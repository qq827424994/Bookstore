package service;

import java.util.List;

import entity.Bargain;
import entity.Book;
import entity.Recommended;

public interface ITypeBookService {
	public List<Book> bestSellingBook(int pageNumber, int pageSize);
	public List<Book> latestBook(int pageNumber, int pageSize);
	public List<Recommended> allRecommended(int pageNumber, int pageSize);
	public List<Bargain> allBargain(int pageNumber, int pageSize);
}
