package com.solvd.apitesting.method;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;

@Endpoint(url = "${config.env.url}/repos/opapina/hmsbase/milestones", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/user.milestone.post/rq.json")
@ResponseTemplatePath(path = "api/user.milestone.post/rs.json")
public class PostUserMilestonesMethod extends AbstractApiMethodV2 {
}
