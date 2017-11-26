package com.javaguru.lesson10.database;

import com.javaguru.lesson10.domain.User;

import java.util.Optional;

public interface Database {

    Optional<User> selectUserById(Long id);

    void insert(User user);
}
