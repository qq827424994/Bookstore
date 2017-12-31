package action;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.User;
import service.ILoginService;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {

	private String userName;
	private String userPassword;
	private ILoginService loginservice;

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

	
	// 普通用户登录
	public String loginCheck() throws UnsupportedEncodingException {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String page = "fail";
		User user = new User();
		user = loginservice.loginCheck(userName, userPassword);
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
		flag = loginservice.managerLoginCheck(userName, userPassword);
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

	public ILoginService getLoginservice() {
		return loginservice;
	}

	public void setLoginservice(ILoginService loginservice) {
		this.loginservice = loginservice;
	}
}
