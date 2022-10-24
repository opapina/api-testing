package com.solvd.apitesting.domain;

import java.security.SecureRandom;

public class User {

    private String userName;
    private String token;

    public User(String userName, String token) {
        this.userName = userName;
        this.token = token;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
