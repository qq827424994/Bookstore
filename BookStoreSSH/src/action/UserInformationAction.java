package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import service.IUserInfomationService;

import com.opensymphony.xwork2.ActionSupport;
 
import entity.User;

@SuppressWarnings("serial")
public class UserInformationAction extends ActionSupport{

	private IUserInfomationService userinfomationservice;

	
	public String execute(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String userIdString = request.getParameter("userId");
		int userId = Integer.parseInt(userIdString);
		User user = userinfomationservice.showUserinfor(userId);
		request.setAttribute("user", user);
		return null;
	}

	public IUserInfomationService getUserinfomationservice() {
		return userinfomationservice;
	}

	public void setUserinfomationservice(IUserInfomationService userinfomationservice) {
		this.userinfomationservice = userinfomationservice;
	}
}
