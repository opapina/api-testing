package com.solvd.apitesting;

import java.security.SecureRandom;

public class User {

    private String userName;
    private SecureRandom token;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public SecureRandom getToken() {
        return token;
    }

    public void setToken(SecureRandom token) {
        this.token = token;
    }
}
