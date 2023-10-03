package com.example.english.service;

import com.example.english.model.User;

public interface IUserService {
    void signup(User user);
    Boolean login(String loginId, String password);
    void editUser(User user);
    void deleteUser(int userId);
}
