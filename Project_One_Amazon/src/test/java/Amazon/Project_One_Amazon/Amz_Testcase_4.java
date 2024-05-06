package Amazon.Project_One_Amazon;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Data_Fetching;

public class Amz_Testcase_4 extends Amz_Launch_Quit
//Check if a user can successfully edit their profile information
{
	@Test
	public void profile_edit() throws IOException
	{
		Amz_B2C_Homepage homepage = new Amz_B2C_Homepage(driver);
		homepage.hoverover();
		homepage.sign_in();;
		Reporter.log("Clicked on sign in button");
		Data_Fetching d1 = new Data_Fetching();
		d1.fetch_data();
		
		Amz_B2C_Login login = new Amz_B2C_Login(driver);//login action
		login.un();
		login.click_continue();
		login.pwd();
		login.login_click();
		Reporter.log("Successfully login is completed");
		
		homepage.hoverover();
		homepage.click_on_profile();//selecting manage profile to do changes
		
		Amz_B2C_Profile_Page profile = new Amz_B2C_Profile_Page(driver);
		profile.click_on_view();
		profile.click_on_edit();
		profile.edit_the_name();
		profile.click_continue();
		
		Assert.assertTrue(profile.your_profile.isDisplayed()==true, "Editing is not completed");
		//assertion is done your profile text option, it displays once editing is done
		Reporter.log("Name edited successfully");
	}

}
