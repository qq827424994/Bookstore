package dao;

import java.util.List;

import entity.*;

 

public interface BookDao {

	// 添加新的图书
	public int addBook(Book book);

	// 修改图书
	public int updateBook(Book book);

	// 根据图书ID查询该图书
	public Book findBook(int bookId);

	// 查询销量最好的图书
	public List<Book> bestSellingBook(int pageNumber, int pageSize);

	// 查询最新上架的图书
	public List<Book> latestBook(int pageNumber, int pageSize);

	// 查询推荐图书ID
	public List<Recommended> allRecommended(int pageNumber, int pageSize);

	// 查询特价图书ID
	public List<Bargain> allBargain(int pageNumber, int pageSize);

	// 根据图书名称查询图书
	public List<Book> allBookByName(String bookName, int pageNumber,
			int pageSize);

	// 根据作者查询图书
	public List<Book> allBookByAuthor(String bookAuthor, int pageNumber,
			int pageSize);

	// 根据出版社查询图书
	public List<Book> allBookByPress(String bookPress, int pageNumber, int pageSize);

	// 根据类别ID来获取类别
	public Type findType(int typeId);

	// 根据图书类别来查询图书

	public List<Book> allBookByType(int typeId, int pageNumber, int pageSize);

	// 查询图书是否为特价图书
	public Bargain isBargain(int bookId);
	

}
