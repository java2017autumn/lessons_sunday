package com.javaguru.lesson12;

class LoginValidator implements Validator<User> {

    public void checkLoginLength(String login) {
        if (login.length() <= 0 || login.length() > 15) {
            throw new UserValidationException("Incorrect login length");
        }
    }

    @Override
    public void validate(User user) {
        String login = user.getLogin();
        assertNotNull(login);
        checkLoginLength(login);
    }
}
