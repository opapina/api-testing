package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostUserKey extends AbstractApiMethodV2 {
    public PostUserKey(String rqPath, String rsPath) {
        super(rsPath, rqPath);
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("url"));
    }
}
