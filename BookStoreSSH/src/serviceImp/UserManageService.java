package serviceImp;

import daoImp.PersonManage;
import entity.Sex;
import entity.User;
import service.IUserManageService;

public class UserManageService implements IUserManageService {
	private PersonManage personManage;

	
	public PersonManage getPersonManage() {
		return personManage;
	}
	public void setPersonManage(PersonManage personManage) {
		this.personManage = personManage;
	}
	public int updateUserInfor(User user) {
		// TODO Auto-generated method stub
		 return personManage.updateUserInfor(user);
	}
	public Sex findSex(int sexId) {
		// TODO Auto-generated method stub
		return  personManage.findSex(sexId);
	}

}
