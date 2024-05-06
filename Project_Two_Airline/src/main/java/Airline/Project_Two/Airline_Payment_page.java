package Airline.Project_Two;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_Payment_page 
{
	WebDriver driver;
//step-1
	@FindBy (xpath="//span[.='Credit/Debit/ATM Card']")
	WebElement credit_card;// select credit card
	
	@FindBy (id="cardNumber")
	WebElement card_details_tf; //enter card number
	
	@FindBy (xpath="//p[.='Card number is not valid']")
	WebElement not_valid_text; //card not valid text
//step-2
	public void select_credit_card()
	{
		credit_card.click();
		
	}
	public void enter_credit_card_details()
	{
		card_details_tf.sendKeys("451346231546542");
		
	}
	
	
	
	
//step-3
	
	public Airline_Payment_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
