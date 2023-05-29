package org.example.service;


import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {
//    private UserDao  userDao = new UserDaoImpl();
    private UserDao  userDao = new UserDaoMysqlImpl();

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
