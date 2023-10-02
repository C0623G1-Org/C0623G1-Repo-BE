package com.example.english.repository;

import com.example.english.model.User;

public interface IUserDAO {
    void signup(User user);
    void login(String loginId, String password);
    void editUser(User user);
    void deleteUser(int userId);
}