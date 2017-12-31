package serviceImp;

import daoImp.PersonManage;
import entity.User;
import service.IUserInfomationService;

public class UserInfomationService implements IUserInfomationService {
	private PersonManage personManage;
	public User showUserinfor(int useId) {
		// TODO Auto-generated method stub
		return personManage.findUser(useId);
	}
	public PersonManage getPersonManage() {
		return personManage;
	}
	public void setPersonManage(PersonManage personManage) {
		this.personManage = personManage;
	}

}
