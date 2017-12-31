package service;

import entity.User;

public interface IEnrollService {
public void enroll(User user);
public boolean check(String username);
}
