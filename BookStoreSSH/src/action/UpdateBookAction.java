package action;

import java.io.File;
import java.text.*;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import service.IUpdateBookService;

import com.opensymphony.xwork2.ActionSupport;

import entity.*;

@SuppressWarnings("serial")
public class UpdateBookAction extends ActionSupport {

	private int bookId;
	private String bookName;
	private String bookAuthor;
	private String bookPress;
	private String bookRemark;
	private int typeId;
	private int bookAmount;
	private double bookPrice;
	private IUpdateBookService updatebookservice;
	private File doc;
	private String fileName;
	private String contentType;
	private String dir;
	private String targetFileName;

	public void setDoc(File file) {
		this.doc = file;
	}

	public void setDocFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setDocContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getTargetFileName() {
		return targetFileName;
	}

	public void setTargetFileName(String targetFileName) {
		this.targetFileName = targetFileName;
	}

	private String generateFileName(String fileName) {
		DateFormat format = new SimpleDateFormat("yyMMddHHmmss");
		String formatDate = format.format(new Date());
		int random = new Random().nextInt(100000);
		int position = fileName.lastIndexOf(".");
		String extension = fileName.substring(position);
		return formatDate + random + extension;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPress() {
		return bookPress;
	}

	public void setBookPress(String bookPress) {
		this.bookPress = bookPress;
	}

	public String getBookRemark() {
		return bookRemark;
	}

	public void setBookRemark(String bookRemark) {
		this.bookRemark = bookRemark;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public int getBookAmount() {
		return bookAmount;
	}

	public void setBookAmount(int bookAmount) {
		this.bookAmount = bookAmount;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public IUpdateBookService getUpdatebookservice() {
		return updatebookservice;
	}

	public void setUpdatebookservice(IUpdateBookService updatebookservice) {
		this.updatebookservice = updatebookservice;
	}


	

	@SuppressWarnings("deprecation")
	public String execute() {
		System.out.println(bookId);
		Book book = updatebookservice.findBook(bookId);
		System.out.println(book);
		if (doc != null) {
			System.out.println("asd");
			String realPath = ServletActionContext.getRequest().getRealPath(
					"/upload");
			String targetDirectory = realPath;
			targetFileName = generateFileName(fileName);
			setDir(targetDirectory + "\\" + targetFileName);
			File target = new File(targetDirectory, targetFileName);
			try {
				FileUtils.copyFile(doc, target);
				book.setBookPicture(targetFileName);// Í¼Æ¬µØÖ·
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("ssss");
		book.setBookName(bookName);
		book.setBookAuthor(bookAuthor);
		book.setBookPress(bookPress);
		book.setBookRemark(bookRemark);
		book.setBookPrice(bookPrice);
		book.setBookAmount(bookAmount);
		Type type = updatebookservice.findType(typeId);
		book.setType(type);// Àà±ð
		updatebookservice.updateBook(book);
		return SUCCESS;
	}


}
