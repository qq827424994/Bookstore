package dao;

import java.util.List;

import entity.*;

 

public interface BookDao {

	// ����µ�ͼ��
	public int addBook(Book book);

	// �޸�ͼ��
	public int updateBook(Book book);

	// ����ͼ��ID��ѯ��ͼ��
	public Book findBook(int bookId);

	// ��ѯ������õ�ͼ��
	public List<Book> bestSellingBook(int pageNumber, int pageSize);

	// ��ѯ�����ϼܵ�ͼ��
	public List<Book> latestBook(int pageNumber, int pageSize);

	// ��ѯ�Ƽ�ͼ��ID
	public List<Recommended> allRecommended(int pageNumber, int pageSize);

	// ��ѯ�ؼ�ͼ��ID
	public List<Bargain> allBargain(int pageNumber, int pageSize);

	// ����ͼ�����Ʋ�ѯͼ��
	public List<Book> allBookByName(String bookName, int pageNumber,
			int pageSize);

	// �������߲�ѯͼ��
	public List<Book> allBookByAuthor(String bookAuthor, int pageNumber,
			int pageSize);

	// ���ݳ������ѯͼ��
	public List<Book> allBookByPress(String bookPress, int pageNumber, int pageSize);

	// �������ID����ȡ���
	public Type findType(int typeId);

	// ����ͼ���������ѯͼ��

	public List<Book> allBookByType(int typeId, int pageNumber, int pageSize);

	// ��ѯͼ���Ƿ�Ϊ�ؼ�ͼ��
	public Bargain isBargain(int bookId);
	

}
