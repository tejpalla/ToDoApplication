package com.example.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String user, String pass){

        boolean isValidUsername = user.equalsIgnoreCase("tej");
        boolean isValidPassword = pass.equalsIgnoreCase("tejpalla");

        return isValidUsername && isValidPassword;
    }
    
}
