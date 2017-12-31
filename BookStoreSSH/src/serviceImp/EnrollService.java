package serviceImp;

import service.IEnrollService;
import entity.User;
import daoImp.PersonManage;
public class EnrollService implements IEnrollService {
    private PersonManage personManage;
	public void enroll(User user) {
		// TODO Auto-generated method stub
    personManage.addUser(user);
	}
	public boolean check(String username) {
		// TODO Auto-generated method stub
		return personManage.isUserNameExist(username);
		}

	public PersonManage getPersonManage() {
		return personManage;
	}
	public void setPersonManage(PersonManage personManage) {
		this.personManage = personManage;
	}

	

}
