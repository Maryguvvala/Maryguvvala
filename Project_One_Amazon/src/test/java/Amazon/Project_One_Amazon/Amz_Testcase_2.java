package Amazon.Project_One_Amazon;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Data_Fetching;

public class Amz_Testcase_2 extends Amz_Launch_Quit//Verify login is successful with correct email and password
{

	@Test
	public void login_Steps_with_correct_details() throws IOException
	{
		Amz_B2C_Homepage homepage = new Amz_B2C_Homepage(driver);
		homepage.hoverover();
		homepage.sign_in();
		
		Reporter.log("Clicked on sign in button");
		
		Data_Fetching d1 = new Data_Fetching();
		d1.fetch_data();
		
		Amz_B2C_Login login = new Amz_B2C_Login(driver);
		login.un();
		login.click_continue();
		login.pwd();
		login.login_click();
		
		
		
		Assert.assertTrue("Search option is not visible",homepage.search_bar.isDisplayed()==true);
        //assertion done on search textfield, it only displays once login is successful

		Reporter.log("Successfully login is completed");
	}

}
