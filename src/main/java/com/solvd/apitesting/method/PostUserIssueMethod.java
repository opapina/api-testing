package com.solvd.apitesting.method;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostUserIssueMethod extends AbstractApiMethodV2 {
    public PostUserIssueMethod(String rsPath) {
        super("api/user.issue.post/rq.json", rsPath);
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("url"));
        replaceUrlPlaceholder("owner", "opapina");
        replaceUrlPlaceholder("repo", "hmsbase");
    }
}
