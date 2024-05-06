package Amazon.Project_One_Amazon;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Data_Fetching;

public class Amz_Testcase_13 extends Amz_Launch_Quit
//Check if user is able to apply for coupon code while ordering the product.
{
	@Test
	public void apply_coupon() throws IOException
	{
		Amz_B2C_Homepage homepage = new Amz_B2C_Homepage(driver);
		homepage.hoverover();
		homepage.sign_in();;
		
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
		checkout.enter_coupon();
		
		Assert.assertFalse(checkout.use_this_payment.isEnabled()==false, "is not enable bcz coupon is not valid");
		//assertion done on use this payment option, it is enabled only coupon is accepted
		Reporter.log("Coupon code entered");
		
	}

}
