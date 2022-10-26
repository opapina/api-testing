package com.solvd.apitesting.method;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;

@Endpoint(url = "${config.env.url}/repos/${owner}/${repo}/issues/${issue_number}", methodType = HttpMethodType.PATCH)
@RequestTemplatePath(path = "api/user.issue.patch/rq.json")
@ResponseTemplatePath(path = "api/user.issue.patch/rs.json")
public class PatchUserIssueMethod extends AbstractApiMethodV2 {

    public PatchUserIssueMethod() {
        replaceUrlPlaceholder("owner", "opapina");
        replaceUrlPlaceholder("repo", "hmsbase");
        replaceUrlPlaceholder("issue_number", "48");
    }
}
