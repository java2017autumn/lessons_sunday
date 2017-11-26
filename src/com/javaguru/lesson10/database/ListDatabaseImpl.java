package com.javaguru.lesson10.database;

import com.javaguru.lesson10.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListDatabaseImpl implements Database {

    private Long id = 0L;
    private List<User> storage;

    public ListDatabaseImpl() {
        storage = new ArrayList<>();
    }

    @Override
    public Optional<User> selectUserById(Long id) {
        return storage.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    @Override
    public void insert(User user) {
        user.setId(id++);
        storage.add(user);
    }
}
