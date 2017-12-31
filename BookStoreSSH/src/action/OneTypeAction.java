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
				if("bookName".equals(searchType)){//��ͼ������
					bookList = allbookservice.allBookByName(searchDescribe, 1, 10);
					typeDescribe = searchDescribe;
				}
				else if("bookAuthor".equals(searchType)){//����������
					bookList = allbookservice.allBookByAuthor(searchDescribe, 1, 10);
					typeDescribe = searchDescribe;
				}
				else if("bookPress".equals(searchType)){//��������
					bookList = allbookservice.allBookByPress(searchDescribe, 1, 10);
					typeDescribe = searchDescribe;
				}
				else if("bookType".equals(searchType)){//���鱾���
					int typeId = Integer.parseInt(searchDescribe);
					Type type = findtype.findType(typeId);
					bookList = allbookservice.allBookByType(typeId, 1, 10);
					typeDescribe = type.getTypeName();
				}
				else if("bookStatus".equals(searchType)){//���鱾��״��ָ�ؼۡ����������¡��Ƽ�
					if("bestSelling".equals(searchDescribe)){
						//������
						typeDescribe = "����ͼ��";
						bookList = typebookservice.bestSellingBook(1, 10);
					}
					else if("latest".equals(searchDescribe)){
						//������
						typeDescribe = "����ͼ��";
						bookList = typebookservice.latestBook(1, 10);
					}
					else if("recommended".equals(searchDescribe)){
						//�Ƽ���
						typeDescribe = "�Ƽ�ͼ��";
						List<Recommended> allRecommended = typebookservice.allRecommended(1, 6);
						for(Recommended recommended : allRecommended){
							Book book = new Book();
							book = recommended.getBook();
							bookList.add(book);
						}
					}
					else if("bargain".equals(searchDescribe)){
						//�ؼ���
						typeDescribe = "�ؼ�ͼ��";
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


