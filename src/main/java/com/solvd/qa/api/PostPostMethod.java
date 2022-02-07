package com.solvd.qa.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.R;

@RequestTemplatePath( path = "api/user/post/postRequest.json")
@ResponseTemplatePath( path = "api/user/post/postResponse.json")
@Endpoint(methodType = HttpMethodType.POST, url = "${post_api_url}/posts")
@SuccessfulHttpStatus( status = HttpResponseStatusType.CREATED_201)
public class PostPostMethod extends AbstractApiMethodV2{
	
	public PostPostMethod(){
		super();
		replaceUrlPlaceholder( "post_api_url", R.CONFIG.get( "post_api_url" ) );
		setProperties( "api/user/get/post.properties");
	}
}
