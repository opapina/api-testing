package com.solvd.apitesting;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class UserAuthTest {

    @BeforeMethod
    public void setup() {
        User user = new User();
        user.setUserName("opapina");
        try {
            user.setToken(SecureRandom.getInstance("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"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(testName = "check that it's possible to create a https://api.github.com/user/ssh_signing_keys")
    public void verifyPostUserKeyCreateTest() {
        PostUserKey postUserKey = new PostUserKey("api.user.post/rq.json", "api.user.post/rs.json" );
        postUserKey.callAPI();
        postUserKey.validateResponse();
    }
}
