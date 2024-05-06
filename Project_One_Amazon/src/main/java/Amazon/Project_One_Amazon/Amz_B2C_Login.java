package Amazon.Project_One_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Data_Fetching;

public class Amz_B2C_Login extends Data_Fetching
{
	WebDriver driver;
//step-1
	@FindBy(id="ap_email")
	WebElement username_tf; // name text field 

	@FindBy(id="continue")
	WebElement continue_button; //continue button
	
	@FindBy(id="ap_password")
	WebElement password_tf; //password text field
	
	@FindBy(id="signInSubmit")
	WebElement sign_in_button; // actual sign in
	
//step-2
	public void un()
	{
		username_tf.sendKeys(username);
	}
	public void click_continue()
	{
		continue_button.click();
	}
	public void pwd()
	{
		password_tf.sendKeys(correct_pwd);
	}
	public void wrong_pwd()
	{
		password_tf.sendKeys(incorrect_pwd);
	}
	public void login_click()
	{
		sign_in_button.click();
	}
//step-3
	public Amz_B2C_Login(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
