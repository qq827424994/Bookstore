package action;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

import daoImp.PersonManage;
import entity.User;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {

	private String userName;
	private String userPassword;
	private PersonManage personManage;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public void setPersonManage(PersonManage personManage) {
		this.personManage = personManage;
	}

	// 普通用户登录
	public String loginCheck() throws UnsupportedEncodingException {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String page = "fail";
		User user = new User();
		user = personManage.checkUser(userName, userPassword);
		if (user != null) {
			page = "success";
			
			HttpSession session = request.getSession();
			if (session.getAttribute("loginUser") != null) {
				session.removeAttribute("loginUser");
			}
			session.setAttribute("loginUser", user);
		}
		return page;
	}

	// 管理员登录
	public String managerLoginCheck() throws UnsupportedEncodingException {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String page = "fail";
		boolean flag = false;
		flag = personManage.checkManager(userName, userPassword);
		if (flag) {
			page = "success";
			
			HttpSession session = request.getSession();
			if (session.getAttribute("managerLoginName") != null) {
				session.removeAttribute("managerLoginName");
			}
			session.setAttribute("managerLoginName", userName);
		}
		return page;
	}
}
