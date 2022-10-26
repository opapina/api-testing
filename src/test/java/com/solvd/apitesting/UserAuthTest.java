package com.solvd.apitesting;

import com.qaprosoft.apitools.validation.JsonComparatorContext;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.solvd.apitesting.method.PostUserIssueMethod;
import com.solvd.apitesting.method.PatchUserIssueMethod;
import com.solvd.apitesting.method.PostUserMilestonesMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserAuthTest {

    @Test(testName = "check that it's possible to create a https://api.github.com/repos/{owner}/{repo}/issues")
    public void verifyPostUserIssueCreateTest() {
        PostUserIssueMethod postUserIssueMethod = new PostUserIssueMethod( "api/user.issue.post/rs.json");
        postUserIssueMethod.setHeaders(R.CONFIG.get("token"));
        postUserIssueMethod.addProperty("username", "opapina");
        postUserIssueMethod.addProperty("reponame", "hmsbase");
        postUserIssueMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postUserIssueMethod.callAPI();
        JsonComparatorContext comparatorContext = JsonComparatorContext.context()
                .<String>withPredicate("node_id", node -> node.startsWith("I"))
                .<String>withPredicate("url", url -> url.contains("https://api.github.com/repos/opapina/hmsbase/issues/"))
                .<Integer>withPredicate("number", number -> number > 40)
                .<Integer>withPredicate("open_issue", issueNumber -> issueNumber > 40)
                .<String>withPredicate("isTodayDateTime", datetime -> datetime.startsWith("2022-10-26"));
        postUserIssueMethod.validateResponse(comparatorContext);
    }

    @Test(testName = "check that issue will be lock")
    public void verifyPatchUserIssueMethod() {
        PatchUserIssueMethod patchUserIssueMethod = new PatchUserIssueMethod();
        patchUserIssueMethod.setHeaders(R.CONFIG.get("token"));
        patchUserIssueMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        patchUserIssueMethod.callAPI();
        JsonComparatorContext comparatorContext = JsonComparatorContext.context()
                .<Integer>withPredicate("open_issues", issueNumber -> issueNumber > 49)
                .<String>withPredicate("isTodayDateTime", datetime -> datetime.startsWith("2022-10-26"));
        patchUserIssueMethod.validateResponse(comparatorContext);
    }

    @Test(testName = "check that milestone for hmsbase will be created")
    public void verifyPostUserMilestoneMethod() {
        PostUserMilestonesMethod postUserMilestonesMethod = new PostUserMilestonesMethod();
        postUserMilestonesMethod.setHeaders(R.CONFIG.get("token"));
        postUserMilestonesMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postUserMilestonesMethod.addProperty("username", "opapina");
        postUserMilestonesMethod.addProperty("reponame", "hmsbase");
        postUserMilestonesMethod.addProperty("number", "20");
        postUserMilestonesMethod.callAPI();
        JsonComparatorContext comparatorContext = JsonComparatorContext.context()
                .<String>withPredicate("isTodayDateTime", datetime -> datetime.startsWith("2022-10-26"));
        postUserMilestonesMethod.validateResponse(comparatorContext);
    }
}
