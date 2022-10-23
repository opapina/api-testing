package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetUserCommitMethod extends AbstractApiMethodV2 {
    public GetUserCommitMethod (String rqPath, String rsPath) {
        super(rqPath, rsPath);
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("url"));
        replaceUrlPlaceholder("user_name", "opapina");
        replaceUrlPlaceholder("repo_name", "hms");
    }
}
