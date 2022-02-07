package com.solvd.qa.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.R;

@ResponseTemplatePath( path = "api/user/get/rs.json")
@Endpoint(methodType = HttpMethodType.GET, url = "${post_api_url}/posts/1")
@SuccessfulHttpStatus( status = HttpResponseStatusType.OK_200)
public class GetPostMethod extends AbstractApiMethodV2{
	public GetPostMethod(){
		super();
		replaceUrlPlaceholder( "post_api_url", R.CONFIG.get( "post_api_url" ) );
		setProperties( "api/user/get/post.properties" );
	}
}
