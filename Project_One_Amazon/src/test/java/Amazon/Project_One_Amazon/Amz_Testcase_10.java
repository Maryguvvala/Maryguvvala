package Amazon.Project_One_Amazon;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Data_Fetching;

public class Amz_Testcase_10 extends Amz_Launch_Quit
//Test updating item quantities and removing items from the cart.
{
	@Test
	public void update_remove_items() throws IOException
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
		
		homepage.click_on_cart();
		Amz_B2C_Cart cart = new Amz_B2C_Cart(driver);
		cart.click_item();
		cart.select_num_update();
		
		Reporter.log("Item updated in the cart");
		
		cart.delete_item();
		
		Reporter.log("Item deleted from the cart");

		Assert.assertTrue(cart.click_proceed.isDisplayed()==true, "update not done");
		//assertion done on proceed to buy
		
	}

}
