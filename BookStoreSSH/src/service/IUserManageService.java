package service;

import entity.Sex;
import entity.User;

public interface IUserManageService {
public int updateUserInfor(User user);
public Sex findSex(int sexId);
}
