package com.javaguru.lesson10.service;

import com.javaguru.lesson10.database.Database;
import com.javaguru.lesson10.domain.User;

public class UserService {

    private Database database;

    UserService(Database database) {
        this.database = database;
    }

    public void addUser(User user) {
        if (user != null) {
            if (isValidName(user.getName()) && isValidAge(user.getAge())) {
                database.insert(user);
            }
        }
    }


    private boolean isValidName(String name) {
        if (name != null && name.length() > 1) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isValidAge(Integer age) {
        if (age != null && age > 0) {
            return true;
        } else {
            return false;
        }
    }
}
