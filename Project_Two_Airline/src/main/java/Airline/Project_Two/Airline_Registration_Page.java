package Airline.Project_Two;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import airline_utility.Data_Fetching;

public class Airline_Registration_Page extends Data_Fetching
{
	WebDriver driver;
//step-1	
	@FindBy(name="phone")
	WebElement mobile_num_tf;

	@FindBy(xpath="(//input[@class='loginCont__input'])[1]")
    WebElement name_tf;
	
	@FindBy(xpath="(//input[@class='loginCont__input'])[2]")
    WebElement email_tf;
	
	@FindBy(xpath="//button[.='Lets Go']")
	WebElement lets_go_button;
//step-2
	public void enter_num()
	{
		mobile_num_tf.sendKeys(enter_phn_num);
	}
	
	public void enter_name()
	{
		name_tf.sendKeys(enter_name);
	}
	
	public void enter_email()
	{
		email_tf.sendKeys(enter_email);
	}
	
	public void click_letsgo()
	{
		lets_go_button.click();
	}
	
//step-3
	public Airline_Registration_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
}
