package Amazon.Project_One_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_B2C_ProductDetails1 
{
	WebDriver driver;
//step-1	
	@FindBy(id="add-to-cart-button")
	WebElement add_to_cart;

	@FindBy(linkText="Go to Cart")
	WebElement go_to_cart;

    
	
//step-2
	public void cart_button()
	{
		
		add_to_cart.click();
	}
	public void cart_page()
	{
		go_to_cart.click();
	}
//step-3
	public Amz_B2C_ProductDetails1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
