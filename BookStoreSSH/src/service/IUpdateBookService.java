package service;

import entity.Book;
import entity.Type;

public interface IUpdateBookService {
public Book findBook(int bookId);
public Type findType(int typeId);
public void updateBook(Book book);
}
