package com.example.english.repository;

import com.example.english.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepository implements IUserRepository {
    private static final String SQL_USERNAME = "root";
    private static final String SQL_PASSWORD = "123456";
    private static final String SQL_URL = "jdbc:mysql://localhost:3306/?user=root";
    private static final String SIGNUP_SQL = "INSERT INTO case_study.nguoi_dung(user_name, email, dob, login_id, password) VALUES (?, ?, ?, ?, ?);";

    public UserRepository() {
    }

    private Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(SQL_URL, SQL_USERNAME, SQL_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    @Override
    public void signup(User user) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SIGNUP_SQL)) {
            preparedStatement.setString(1,user.getUserName());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3,user.getDob());
            preparedStatement.setString(4,user.getLoginId());
            preparedStatement.setString(5,user.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void login(String loginId, String password) {

    }

    @Override
    public void editUser(User user) {

    }

    @Override
    public void deleteUser(int userId) {

    }
}
