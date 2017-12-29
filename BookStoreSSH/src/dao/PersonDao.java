package dao;

import entity.*;

public interface PersonDao {
	// ����Ա��¼��֤
 
	public boolean checkManager(String managerName, String managerPassword);

	// ��ȡ�û���Ϣ
	public User findUser(int userId);

	// ��ͨ�û���¼��֤
 
	public User checkUser(String userName, String userPassword);

	// ���ע���û����Ƿ��Ѿ�����
 
	public boolean isUserNameExist(String userName);

	// ���һ���û���Ϣ
	public int addUser(User user);

	// �޸�һ���û���Ϣ
	public int updateUserInfor(User user);

	// ����sexId��ѯSex
	public Sex findSex(int sexId);
}
