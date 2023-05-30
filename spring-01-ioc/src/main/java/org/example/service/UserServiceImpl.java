package org.example.service;


import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {

    //private UserDao  userDao = new UserDaoImpl();
    //private UserDao userDao = new UserDaoMysqlImpl();


    //使用set解决开发者自己不断切换到层实现的问题
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
