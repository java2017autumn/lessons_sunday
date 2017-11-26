package com.javaguru.lesson10.service;

import com.javaguru.lesson10.database.Database;
import com.javaguru.lesson10.domain.User;

import java.util.Optional;

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

    public User getUser(Long id) {
        if (id != null && id >= 0) {
            Optional<User> user = database.selectUserById(id);
            if (user.isPresent()) {
                return user.get();
            }
        }
        return null;
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
