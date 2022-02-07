package com.solvd.qa;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.qa.api.PostUserMethod;
import org.testng.annotations.Test;

public class ApiSampleTest extends AbstractTest{
	
	@Test
	public void testUserCreation(){
		PostUserMethod postUserMethod = new PostUserMethod();
		postUserMethod.callAPIExpectSuccess();
		postUserMethod.validateResponse();
		
		postUserMethod.addProperty( "job", "worker" );
	}
	
	@Test
	public void testMissingName(){
		PostUserMethod postUserMethod = new PostUserMethod();
		postUserMethod.callAPIExpectSuccess();
		postUserMethod.validateResponse();
		
		postUserMethod.addProperty( "job", "worker" );
		postUserMethod.removeProperty( "name" );
	}
}
