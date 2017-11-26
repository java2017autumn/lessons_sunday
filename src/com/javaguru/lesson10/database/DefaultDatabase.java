package com.javaguru.lesson10.database;

import com.javaguru.lesson10.domain.User;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class DefaultDatabase implements Database {

    private Long id = 0L;

    private Set<User> storage;

    public DefaultDatabase() {
        storage = new HashSet<>();
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
