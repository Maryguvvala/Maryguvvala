package Amazon.Project_One_Amazon;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Data_Fetching;

public class Amz_Testcase_14 extends Amz_Launch_Quit
//Go to orders page and click on your last ordered product and give 5 star rating
{
	@Test
	public void give_rating() throws IOException
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
		homepage.click_on_orders();
		
		Amz_B2C_OrdersPage orders= new Amz_B2C_OrdersPage(driver);
		Reporter.log("Orders page is opened");
		orders.select_past_order();
		orders.choose_order_fromlist();
		orders.click_review_product();
		orders.click_on_rating();
		
		Assert.assertTrue(orders.alert_submitted.isDisplayed()==true, "Rating is not done");
		//assertion done on submitted text,it is visible when the rating is done
		Reporter.log("5 star rating is given to last order");
		
	}

}
