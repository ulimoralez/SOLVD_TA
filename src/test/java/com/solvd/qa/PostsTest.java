package com.solvd.qa;

import com.jayway.jsonpath.JsonPath;
import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.qa.api.GetPostMethod;
import com.solvd.qa.api.PostPostMethod;
import io.restassured.response.Response;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class PostsTest extends AbstractTest{
	
	@Test
	public void getPost(){
		GetPostMethod getPostMethod = new GetPostMethod();
		Response response = getPostMethod.callAPIExpectSuccess();
		getPostMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getPostMethod.validateResponseAgainstSchema( "api/user/get/rs.schema" );
		
		System.out.println("ID: "+JsonPath.read( response.asString(), "id"));
	}
	
	@Test
	public void postTest(){
		PostPostMethod postPostMethod = new PostPostMethod();
		Response response = postPostMethod.callAPIExpectSuccess();
		postPostMethod.validateResponse(  );
	}
}
