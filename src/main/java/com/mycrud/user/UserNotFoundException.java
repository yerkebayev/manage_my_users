package com.mycrud.user;

public class UserNotFoundException extends Throwable {

    UserNotFoundException(String message){
        super(message);

    }
}
