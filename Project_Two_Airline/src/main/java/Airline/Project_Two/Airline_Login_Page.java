package Airline.Project_Two;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import airline_utility.Data_Fetching;

public class Airline_Login_Page extends Data_Fetching 
{
	WebDriver driver;
// step-1
	@FindBy(name = "phone")
	WebElement mobile_num_tf;
	
	@FindBy (xpath="//span[.='SEARCH FLIGHTS']")
	WebElement search_button;
	
	
	
// step-2
	public void enter_num() 
	{
		mobile_num_tf.sendKeys(enter_phn_num);
	}
	public void enter_wrong_num() 
	{
		mobile_num_tf.sendKeys(incorrect_num);
	}

// step-3
	public Airline_Login_Page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

}
