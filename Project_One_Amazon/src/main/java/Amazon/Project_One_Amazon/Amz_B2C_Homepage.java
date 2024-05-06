package Amazon.Project_One_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_B2C_Homepage
{
	WebDriver driver;
//step-1
	
	@FindBy(id="nav-link-accountList")
	WebElement hoverover_signin; // hover over sign in 
	
	@FindBy(linkText="Start here.")
	WebElement start_here_button; //click on start here button
	
	@FindBy(linkText="Sign in")
	WebElement sign_in_button; //click on sign in button
	
	@FindBy(xpath="//div[@class='sc-fvEvSO iLGXrF']")
	WebElement manage_profile;// click on manage profile button
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search_bar;//search bar for assertion
	
	@FindBy(id="nav-cart-count-container")
	WebElement cart_option;// click on cart 
	
    @FindBy(id="nav-orders")
    WebElement orders_option;// orders page
	
	
//step-2
	
	public void hoverover()
	{
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(hoverover_signin).perform();
	}
	
	public void click_start()
	{
		start_here_button.click();
	}
	
	public void sign_in()
	{
		sign_in_button.click();
	}
	public void click_on_profile()
	{
		manage_profile.click();
	}
	public void click_on_cart()
	{
		cart_option.click();
	}
	
	public void click_on_orders()
	{
		orders_option.click();
	}
//step-3
	public Amz_B2C_Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
