package tau.keys;

import com.solvd.qa.api.tau.selenium.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload(){

        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("/Users/ulisesmoralez/Documents/SOLVD/SOLVD_TA/src/main/resources/chromedriver");

        assertEquals(uploadPage.getUploadedFiles(), "chromedriver", "Uploaded files incorrect");
    }
}
