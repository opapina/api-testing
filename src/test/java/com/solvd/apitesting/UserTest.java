package com.solvd.apitesting;

import org.testng.annotations.Test;

public class UserTest {

    @Test(testName = "check the GET method for https://api.github.com/users/opapina")
    public void verifyGetUserTest() {
        GetUserMethod getUserMethod = new GetUserMethod(null, "api.user.get/rs.json");
        getUserMethod.callAPI();
        getUserMethod.validateResponse();
    }

    @Test(testName = "check the GET return information of commits")
    public void verifyGetUserCommitsTest() {
        GetUserCommitMethod getUserCommitMethod = new GetUserCommitMethod(null, "api.userkey.get/rs.json");
        getUserCommitMethod.callAPI();
        getUserCommitMethod.validateResponse();
    }
}
