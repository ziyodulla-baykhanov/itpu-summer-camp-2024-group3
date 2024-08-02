package com.epam.learning.exception;

public class UserNotFoundException extends  RuntimeException{

    public UserNotFoundException(Integer id) {
        super("User with id: " + id + " not found");
    }
}
