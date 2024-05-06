package Amazon.Project_One_Amazon;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Data_Fetching;

public class Amz_Testcase_9 extends Amz_Launch_Quit
//Verify that items can be added to the shopping cart from the product pages
{
	@Test
	public void add_to_cart() throws IOException
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
		search.select_shoe();
        Reporter.log("Selected first shoe");
        
        Amz_B2C_ProductDetails1 details = new Amz_B2C_ProductDetails1(driver);
        details.cart_button();
       
        Assert.assertTrue(details.go_to_cart.isDisplayed()==true, "Product not added to cart ");
        //assertion done on go to cart option, it is visible once product is added to cart
        Reporter.log("Product added to the cart");
	
	
	
	}


}
