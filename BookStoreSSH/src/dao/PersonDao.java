package dao;

import entity.*;

public interface PersonDao {
	// 管理员登录验证
 
	public boolean checkManager(String managerName, String managerPassword);

	// 获取用户信息
	public User findUser(int userId);

	// 普通用户登录验证
 
	public User checkUser(String userName, String userPassword);

	// 检查注册用户名是否已经存在
 
	public boolean isUserNameExist(String userName);

	// 添加一条用户信息
	public int addUser(User user);

	// 修改一条用户信息
	public int updateUserInfor(User user);

	// 根据sexId查询Sex
	public Sex findSex(int sexId);
}
