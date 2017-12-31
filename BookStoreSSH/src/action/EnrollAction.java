package action;

import java.util.regex.Pattern;

import service.IEnrollService;

import com.opensymphony.xwork2.ActionSupport;


 
import entity.*;

@SuppressWarnings("serial")
public class EnrollAction extends ActionSupport{
		
	private String userName;
	private String userPassword;
	private String userRePassword;
	private String userEmail;
	private IEnrollService enrollService;
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
	public String getUserRePassword() {
		return userRePassword;
	}
	public void setUserRePassword(String userRePassword) {
		this.userRePassword = userRePassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String execute(){
		User newUser = new User();
		newUser.setUserName(userName);
		newUser.setUserPassword(userPassword);
		newUser.setUserEmail(userEmail);
		enrollService.enroll(newUser);
		return "success";
	}
	public void validate(){
//		if(!Pattern.matches("[a-zA-Z][a-zA-Z0-9]{5,15}", userName)){
//			addFieldError("userName", "�û�����ʹ��6-16λӢ����ĸ�����֣�������ĸ��ͷ��");
//		}
		if(!Pattern.matches("[a-zA-Z0-9]{6,12}", userPassword)){
			addFieldError("userPassword", "������ʹ��6-12λӢ����ĸ�����֣�");
		}
		if(!userRePassword.equals(userPassword)){
			addFieldError("userRePassword", "�������벻һ�£�");
		}
		if("".equals(userEmail.trim())){
			addFieldError("userEmail", "���䲻��Ϊ�գ�");
		}
		boolean flag = true; 
		flag = enrollService.check(userName);
		if(flag){
			addFieldError("userName", "�û����Ѿ����ڣ�");
		}
	}
	public IEnrollService getEnrollService() {
		return enrollService;
	}
	public void setEnrollService(IEnrollService enrollService) {
		this.enrollService = enrollService;
	}
}
