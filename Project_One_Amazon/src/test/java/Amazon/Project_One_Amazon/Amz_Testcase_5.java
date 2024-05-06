package Amazon.Project_One_Amazon;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Data_Fetching;

public class Amz_Testcase_5 extends Amz_Launch_Quit
// Test searching for products using its name like shoe.
{
	@Test
	public void search_shoe() throws IOException 
	{
		Amz_B2C_Homepage homepage = new Amz_B2C_Homepage(driver);
		homepage.hoverover();
		homepage.sign_in();
		
		Reporter.log("Clicked on sign in button");
		
		Data_Fetching d1 = new Data_Fetching();
		d1.fetch_data();
		
		Amz_B2C_Login login = new Amz_B2C_Login(driver);//login action
		login.un();
		login.click_continue();
		login.pwd();
		login.login_click();
		
		Reporter.log("Successfully login is completed");
		
		Amz_B2C_Search1 search = new Amz_B2C_Search1(driver);
		search.search_here();//searching for shoe
		
		Assert.assertTrue(search.sort_by_option.isDisplayed()==true, "Searchin is not done");
		//assertion done on sort by feature, it only displays once the searching is done
	
		Reporter.log("Successfully searched a product");
	}
}
