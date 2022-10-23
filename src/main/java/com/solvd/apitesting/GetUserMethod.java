package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetUserMethod extends AbstractApiMethodV2 {

    public GetUserMethod(String rqPath, String rsPath) {
        super(rqPath, rsPath);
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("url"));
    }
}
