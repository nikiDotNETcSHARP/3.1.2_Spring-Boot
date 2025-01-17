package com.example31.__Spring.Boot.service;

import com.example31.__Spring.Boot.dao.UserDao;
import com.example31.__Spring.Boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void saveUser(String firstName, String lastName, String email) {
        userDao.saveUser(firstName, lastName, email);
    }

    @Override
    public User showUserById(int id) {
        return userDao.showUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void updateUserById(int id, User updatedUser) {
        userDao.updateUserById(id, updatedUser);
    }

    @Override
    public void removeUserById(int id) {
        userDao.removeUserById(id);
    }
}
