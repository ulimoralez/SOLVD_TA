package com.solvd.qa.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.R;

@RequestTemplatePath( path = "api/user/post/request.json")
@ResponseTemplatePath( path = "api/user/post/response.json")
@Endpoint(methodType = HttpMethodType.POST, url = "${api_url}/api/users/2")
@SuccessfulHttpStatus( status = HttpResponseStatusType.CREATED_201)
public class PostUserMethod extends AbstractApiMethodV2 {
	public PostUserMethod(){
		super();
		replaceUrlPlaceholder( "api_url", R.CONFIG.get( "api_url" ) );
		setProperties( "api/user/post/user.properties");
	}
}
