package com.example31.__Spring.Boot.service;

import com.example31.__Spring.Boot.model.User;

import java.util.List;

public interface UserService {
    void saveUser(String firstName, String lastName, String email);

    User showUserById(int id);

    List<User> getAllUsers();

    void updateUserById(int id, User updatedUser);

    void removeUserById(int id);
}
