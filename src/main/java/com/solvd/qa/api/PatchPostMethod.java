package com.solvd.qa.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.R;

@RequestTemplatePath(path = "api/posts/patch/patchRequest.json")
@ResponseTemplatePath(path = "api/posts/patch/patchRequest.json")
@Endpoint(methodType = HttpMethodType.PATCH, url = "${post_api_url}/api/posts/${id}")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PatchPostMethod extends AbstractApiMethodV2 {
    public PatchPostMethod(int id){
        super();
        replaceUrlPlaceholder("id", String.valueOf(1));
        replaceUrlPlaceholder("post_api_url", R.CONFIG.get("post_api_url"));
    }
}
