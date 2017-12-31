package serviceImp;

import service.ILoginService;
import daoImp.PersonManage;
import entity.User;
public class LoginService implements ILoginService {
private PersonManage personManage;

	public User loginCheck(String userName,String userPassword) {
		// TODO Auto-generated method stub
		return personManage.checkUser(userName, userPassword);
	}

	public boolean managerLoginCheck(String userName,String userPassword) {
		// TODO Auto-generated method stub
		return personManage.checkManager(userName, userPassword); 
	}

	public PersonManage getPersonManage() {
		return personManage;
	}

	public void setPersonManage(PersonManage personManage) {
		this.personManage = personManage;
	}

}
