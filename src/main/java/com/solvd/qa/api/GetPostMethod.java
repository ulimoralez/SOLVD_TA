package com.solvd.qa.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.R;

@ResponseTemplatePath( path = "api/posts/get/rs.json")
@Endpoint(methodType = HttpMethodType.GET, url = "${post_api_url}/posts/${id}")
@SuccessfulHttpStatus( status = HttpResponseStatusType.OK_200)
public class GetPostMethod extends AbstractApiMethodV2{
	public GetPostMethod(int id){
		super();
		replaceUrlPlaceholder( "post_api_url", R.CONFIG.get( "post_api_url" ) );
		replaceUrlPlaceholder("id", String.valueOf(1));
		setProperties("api/posts/post.properties");
	}
}
