package Amazon.Project_One_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Data_Fetching;

public class Amz_B2C_Registration extends Data_Fetching
{
	WebDriver driver;
	//step-1
	@FindBy(id="ap_customer_name")
	WebElement firstname_tf; // name text field 
	
	@FindBy(id="ap_phone_number")
	WebElement phn_number_tf; //number textfieldap_password

	@FindBy(id="ap_password")
	WebElement password_tf; //password text field
	
	@FindBy(id="continue")
	WebElement continue_button; //continue button
	
	@FindBy(xpath="//button[@class='sc-nkuzb1-0 sc-d5trka-0 eZxMRy button']")
	WebElement start_puzzle;// start puzzle option for assertion
	//step-2
	public void fname()
	{
		firstname_tf.sendKeys(enter_name);
	}
	
	public void phn_num()
	{
		phn_number_tf.sendKeys(enter_phn_num);
	}
	public void pwd()
	{
		password_tf.sendKeys(enter_pwd);
		
	}
	public void click_on_continue()
	{
		continue_button.click();
	}
	
	//step-3
	public Amz_B2C_Registration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
}
