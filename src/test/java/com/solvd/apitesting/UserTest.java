package com.solvd.apitesting;

import com.solvd.apitesting.method.GetUserCommitMethod;
import com.solvd.apitesting.method.GetUserMethod;
import org.testng.annotations.Test;

public class UserTest {

    @Test(testName = "check the GET method for https://api.github.com/users/opapina")
    public void verifyGetUserTest() {
        GetUserMethod getUserMethod = new GetUserMethod(null, "api/user.get/rs.json");
        getUserMethod.callAPI();
        getUserMethod.validateResponse();
    }

    @Test(testName = "check the GET return information of commits")
    public void verifyGetUserCommitsTest() {
        GetUserCommitMethod getUserCommitMethod = new GetUserCommitMethod(null, "api/user/commit/get/rs.json");
        getUserCommitMethod.callAPI();
        getUserCommitMethod.validateResponse();
    }
}
