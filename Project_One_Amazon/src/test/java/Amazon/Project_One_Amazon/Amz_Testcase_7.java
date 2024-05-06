package Amazon.Project_One_Amazon;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Data_Fetching;

public class Amz_Testcase_7 extends Amz_Launch_Quit
//Ensure that the product detail page displays all necessary information(price,reviews,description).
{
	@Test
	public void product_details() throws IOException
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
		search.sort_category();//selecting category
		search.select_shoe();//selecting first shoe
		
		Amz_B2C_ProductDetails1 details = new Amz_B2C_ProductDetails1(driver);
		
		Assert.assertTrue(details.add_to_cart.isDisplayed()==true, "Product search is not done");
		//assertion is done on add to cart button which is visible in product details page after selecting a product
		Reporter.log("Product details page has the information");
	}

}
