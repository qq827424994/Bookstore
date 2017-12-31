package serviceImp;

import daoImp.BookManage;
import entity.Type;
import service.IFindType;

public class FindType implements IFindType {
	private BookManage bookManage;
	public Type findType(int typeId) {
		// TODO Auto-generated method stub
		return bookManage.findType(typeId);
	}
	public BookManage getBookManage() {
		return bookManage;
	}
	public void setBookManage(BookManage bookManage) {
		this.bookManage = bookManage;
	}

}
