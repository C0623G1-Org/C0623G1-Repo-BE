package com.example.english.service;

import com.example.english.model.User;
import com.example.english.repository.IUserRepository;
import com.example.english.repository.UserRepository;

public class UserServiceImpl implements IUserService {
    private final IUserRepository userRepository = new UserRepository();
    @Override
    public void signup(User user) {
        userRepository.signup(user);
    }

    @Override
    public Boolean login(String loginId, String password) {

    }

    @Override
    public void editUser(User user) {

    }

    @Override
    public void deleteUser(int userId) {

    }
}
