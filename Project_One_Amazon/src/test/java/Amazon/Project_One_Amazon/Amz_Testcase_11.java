package Amazon.Project_One_Amazon;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Data_Fetching;

public class Amz_Testcase_11 extends Amz_Launch_Quit
//Validate the entire checkout process,including address selection,payment method selection and order review.
{
	@Test
	public void validate_checkout() throws IOException
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
		Reporter.log("Cart page is opened");
		
		Amz_B2C_Cart cart = new Amz_B2C_Cart(driver);
		cart.proceed_to_buy();
		Reporter.log("click on proceed to buy");
		
		Amz_B2C_Checkout_Page checkout = new Amz_B2C_Checkout_Page(driver);
		Reporter.log("checkout page is opened");
		
		checkout.select_address();
		Reporter.log("Address is selected");
		checkout.select_card();
		Reporter.log("Debit/credit card is selected");
		
		checkout.click_enter_card();
		checkout.iframe();
		checkout.enter_card_details();
		Reporter.log("Entered card details");
		Assert.assertTrue(checkout.enter_after.isDisplayed()==true, "card details not entered");
		//assertion done on enter card details
		
		Reporter.log("Checkout process is validated");
	}

}
