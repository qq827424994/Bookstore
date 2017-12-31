package service;

import entity.User;

public interface ILoginService {
	public User loginCheck(String userName, String userPassword);
	public boolean managerLoginCheck(String userName, String userPassword);
}
