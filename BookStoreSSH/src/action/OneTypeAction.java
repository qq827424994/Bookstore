package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import service.*;

import com.opensymphony.xwork2.ActionSupport;

import java.io.UnsupportedEncodingException;
import java.util.*;


import entity.*;

@SuppressWarnings("serial")
public class OneTypeAction extends ActionSupport{
	
private IAllBookService allbookservice;
private ITypeBookService typebookservice;
private IFindType findtype;
	
	public String execute(){
		String page = "oneType";
		List<Book> bookList = new ArrayList<Book>();
		String typeDescribe = "";
		HttpServletRequest request = ServletActionContext.getRequest();
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String searchType = request.getParameter("searchType");
		String searchDescribe = request.getParameter("searchDescribe");

		if(searchType == null || "".equals(searchType.trim())){
			page = "error";
		}
		else {
			if(searchDescribe == null || "".equals(searchDescribe.trim())){
				page = "error";
			}else{
				if("bookName".equals(searchType)){//按图书名称
					bookList = allbookservice.allBookByName(searchDescribe, 1, 10);
					typeDescribe = searchDescribe;
				}
				else if("bookAuthor".equals(searchType)){//按作者名称
					bookList = allbookservice.allBookByAuthor(searchDescribe, 1, 10);
					typeDescribe = searchDescribe;
				}
				else if("bookPress".equals(searchType)){//按出版社
					bookList = allbookservice.allBookByPress(searchDescribe, 1, 10);
					typeDescribe = searchDescribe;
				}
				else if("bookType".equals(searchType)){//按书本类别
					int typeId = Integer.parseInt(searchDescribe);
					Type type = findtype.findType(typeId);
					bookList = allbookservice.allBookByType(typeId, 1, 10);
					typeDescribe = type.getTypeName();
				}
				else if("bookStatus".equals(searchType)){//按书本现状，指特价、畅销、最新、推荐
					if("bestSelling".equals(searchDescribe)){
						//畅销书
						typeDescribe = "畅销图书";
						bookList = typebookservice.bestSellingBook(1, 10);
					}
					else if("latest".equals(searchDescribe)){
						//最新书
						typeDescribe = "最新图书";
						bookList = typebookservice.latestBook(1, 10);
					}
					else if("recommended".equals(searchDescribe)){
						//推荐书
						typeDescribe = "推荐图书";
						List<Recommended> allRecommended = typebookservice.allRecommended(1, 6);
						for(Recommended recommended : allRecommended){
							Book book = new Book();
							book = recommended.getBook();
							bookList.add(book);
						}
					}
					else if("bargain".equals(searchDescribe)){
						//特价书
						typeDescribe = "特价图书";
						List<Bargain> allBargain = typebookservice.allBargain(1, 6);
						for(Bargain bargain : allBargain){
							Book book = new Book();
							book = bargain.getBook();
							bookList.add(book);
						}
					}else{
						page = "error";
					}
				}else{
					page = "error";
				}
			}
		}
		request.setAttribute("typeDescribe", typeDescribe);
		request.setAttribute("bookList", bookList);
		return page;
	}

	public IAllBookService getAllbookservice() {
		return allbookservice;
	}

	public void setAllbookservice(IAllBookService allbookservice) {
		this.allbookservice = allbookservice;
	}

	public ITypeBookService getTypebookservice() {
		return typebookservice;
	}

	public void setTypebookservice(ITypeBookService typebookservice) {
		this.typebookservice = typebookservice;
	}

	public IFindType getFindtype() {
		return findtype;
	}

	public void setFindtype(IFindType findtype) {
		this.findtype = findtype;
	}



}


