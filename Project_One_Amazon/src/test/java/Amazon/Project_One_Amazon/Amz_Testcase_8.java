package Amazon.Project_One_Amazon;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Data_Fetching;

public class Amz_Testcase_8 extends Amz_Launch_Quit//check if products can be sorted by relevance,price,rating.etc.
{
	@Test
	public void sorting_shoe() throws IOException
	{
		Amz_B2C_Homepage homepage = new Amz_B2C_Homepage(driver);
		homepage.hoverover();
		homepage.sign_in();
		
		Reporter.log("Clicked on sign in");
		
		Data_Fetching d1 = new Data_Fetching();
		d1.fetch_data();
		
		Amz_B2C_Login login = new Amz_B2C_Login(driver);//login action
		login.un();
		login.click_continue();
		login.pwd();
		login.login_click();
		
		Reporter.log("successfully loged into the application");

		Amz_B2C_Search1 search = new Amz_B2C_Search1(driver);
		search.search_here();//searching for shoe
		Reporter.log("Searched for shoe");
		search.sort_category();
		search.sort_rating();
		search.sort_price();
		search.sort_shoe_size();
		
		Assert.assertTrue(search.searched_result.isDisplayed()==true, "Sorting is not done");
		//sorting is done on the price, it is selected only when sorting is done
		Reporter.log("Successfully sorted");
		
	}

}
