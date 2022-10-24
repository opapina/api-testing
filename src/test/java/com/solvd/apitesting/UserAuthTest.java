package com.solvd.apitesting;

import com.solvd.apitesting.domain.User;
import com.solvd.apitesting.method.PostUserIssue;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserAuthTest {

    @BeforeMethod
    public void setup() {
        User user = new User("opapina", "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");
        user.getToken();
    }

    @Test(testName = "check that it's possible to create a https://api.github.com/user/ssh_signing_keys")
    public void verifyPostUserKeyCreateTest() {
        PostUserIssue postUserIssue = new PostUserIssue("api/user.issue.post/rq.json", null);
        postUserIssue.addCookie("token", "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");
        postUserIssue.addProperty("owner", "opapina");
        postUserIssue.addProperty("repo", "hmsbase");
        postUserIssue.callAPI();
        postUserIssue.validateResponse();
    }
}
