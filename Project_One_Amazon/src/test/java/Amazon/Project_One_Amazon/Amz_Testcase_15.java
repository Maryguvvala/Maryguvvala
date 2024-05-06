package Amazon.Project_One_Amazon;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amz_Testcase_15 extends Amz_Launch_Quit
//Reach till cart page without login in 
{
	@Test
	public void without_login()
	{
		Amz_B2C_Search1 search = new Amz_B2C_Search1(driver);
		search.search_here();//searching for shoe
		Reporter.log("Searched for shoe");
		search.select_shoe();
        Reporter.log("Selected first shoe");
        
        Amz_B2C_ProductDetails1 details = new Amz_B2C_ProductDetails1(driver);
        details.cart_button();
        details.cart_page();
       
        Amz_B2C_Cart cart = new Amz_B2C_Cart(driver);
	
        Assert.assertTrue(cart.click_proceed.isDisplayed()==true, "not reached till cart page");
		//assertion done on proceed to buy
        Reporter.log("Product added to the cart");
	}

}
