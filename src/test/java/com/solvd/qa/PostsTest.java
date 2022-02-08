package com.solvd.qa;

import com.jayway.jsonpath.JsonPath;
import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.qa.api.GetPostMethod;
import com.solvd.qa.api.PatchPostMethod;
import com.solvd.qa.api.PostPostMethod;
import io.restassured.response.Response;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class PostsTest extends AbstractTest{
	
	@Test
	public void getPostWithId1Test(){
		GetPostMethod getPostMethod = new GetPostMethod(1);
		Response response = getPostMethod.callAPIExpectSuccess();
		getPostMethod.validateResponse();
		getPostMethod.validateResponseAgainstSchema( "api/posts/get/rs.schema" );
		
		System.out.println("ID: "+JsonPath.read( response.asString(), "id"));
	}
	
	@Test
	public void postPostTest() {
		PostPostMethod postPostMethod = new PostPostMethod();
		Response response = postPostMethod.callAPIExpectSuccess();
		postPostMethod.validateResponse();
		postPostMethod.validateResponseAgainstSchema( "api/posts/get/rs.schema" );
	}

	@Test
	public void postPatchTest(){
		PostPostMethod postPostMethod = new PostPostMethod();
		Response postResponse = postPostMethod.callAPIExpectSuccess();
		postPostMethod.validateResponse();

		Integer id = JsonPath.read(postResponse.asString(), "$.id");
		String stringId = id.toString();
		System.out.println("Id: "+stringId);

		PatchPostMethod patchPostMethod = new PatchPostMethod(1);
		Response response = patchPostMethod.callAPIExpectSuccess();
		patchPostMethod.addProperty("id", id);
		patchPostMethod.callAPIExpectSuccess();
		patchPostMethod.validateResponse();
		patchPostMethod.validateResponseAgainstSchema("api/posts/patch/patchSchema.json");

	}


}
