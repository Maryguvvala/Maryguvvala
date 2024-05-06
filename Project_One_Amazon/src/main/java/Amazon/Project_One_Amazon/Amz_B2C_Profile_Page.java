package Amazon.Project_One_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_B2C_Profile_Page 
{
	WebDriver driver;
//step-1
	@FindBy(linkText="View")
	WebElement view_button; //click on view button
	
	@FindBy(xpath="//span[@class='editProfile']")
	WebElement edit_button;//click on edit button
	
	@FindBy(id="editProfileNameInputId")
	WebElement edit_name;//click on edit name textfield
	
	@FindBy(xpath="(//input[@class='a-button-input'])[9]")
	WebElement continue_button;//click on continue button
	
	@FindBy(xpath="//div[.='Your Profile']")
	WebElement your_profile;//your profile test is visble for assertion
	
//step-2
	public void click_on_view()
	{
		view_button.click();
	}
	
	public void click_on_edit()
	{
		edit_button.click();
	}
	public void edit_the_name()
	{
		edit_name.sendKeys(Keys.CONTROL+"a"); //changing the name 
		edit_name.sendKeys(Keys.DELETE);
		edit_name.sendKeys("Mary");
	}
	public void click_continue()
	{
		continue_button.click(); ; //click on continue to make changes
	}
	
	
//step-3
	public Amz_B2C_Profile_Page(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
}
