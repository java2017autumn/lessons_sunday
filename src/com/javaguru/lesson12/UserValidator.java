package com.javaguru.lesson12;

import java.util.HashSet;
import java.util.Set;

class UserValidator implements Validator<User> {

    private Set<Validator<User>> validators = new HashSet<>();

    public void addValidator(Validator<User> validator) {
        validators.add(validator);
    }

    @Override
    public void validate(User user) {
        assertNotNull(user);
        validators.forEach(validator -> validator.validate(user));
    }
}
