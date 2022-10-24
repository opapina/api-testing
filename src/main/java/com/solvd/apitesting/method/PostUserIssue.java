package com.solvd.apitesting.method;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostUserIssue extends AbstractApiMethodV2 {
    public PostUserIssue(String rqPath, String rsPath) {
        super(rsPath, rqPath);
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("url"));
    }
}
