package com.solvd.apitesting;

import com.solvd.apitesting.method.GetUserCommitMethod;
import com.solvd.apitesting.method.GetUserMethod;
import com.solvd.apitesting.method.GetUserRepoIssuesMethod;
import org.testng.annotations.Test;

public class UserTest {

    @Test(testName = "check the GET method for https://api.github.com/users/opapina")
    public void verifyGetUserTest() {
        GetUserMethod getUserMethod = new GetUserMethod(null, "api/user.get/rs.json");
        getUserMethod.callAPI();
        getUserMethod.validateResponse();
    }

    @Test(testName = "check that GET return information of commits")
    public void verifyGetUserCommitsTest() {
        GetUserCommitMethod getUserCommitMethod = new GetUserCommitMethod(null, "api/user/commit/get/rs.json");
        getUserCommitMethod.callAPI();
        getUserCommitMethod.validateResponse();
    }

    @Test(testName = "verify that GET return information of issues")
    public void verifyGetUserRepoIssuesTest() {
        GetUserRepoIssuesMethod getUserRepoIssuesMethod = new GetUserRepoIssuesMethod();
        getUserRepoIssuesMethod.callAPI();
        getUserRepoIssuesMethod.validateResponse();
    }
}
