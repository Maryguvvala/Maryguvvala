package Amazon.Project_One_Amazon;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Data_Fetching;

public class Amz_Testcase_12 extends Amz_Launch_Quit
//Check if user is able to select each payment method
{
	@Test
	public void payment_method() throws IOException
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
		checkout.select_banking();
		checkout.select_upi();
		checkout.select_emi();
		checkout.select_cod();
		
		Assert.assertTrue(checkout.use_this_payment.isEnabled()==true, "Payments button is not enabled so select any option");
        //here if use this payment option is enabled it means the payment method is not selected
		Reporter.log("Able to select each payment method");
	}

}
