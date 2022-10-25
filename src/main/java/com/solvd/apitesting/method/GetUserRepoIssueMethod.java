package com.solvd.apitesting.method;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;

@Endpoint(url = "${config.env.url}/repos/opapina/hmsbase/issues/50", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/user.issue.get/rs.json")
public class GetUserRepoIssueMethod extends AbstractApiMethodV2 {
}
