package Amazon.Project_One_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_B2C_Checkout_Page 
{
	WebDriver driver;
//step-1	
	@FindBy(id="shipToThisAddressButton")
	WebElement address_button;// use this address button
	
	@FindBy(xpath="(//span[@class='pmts-instrument-selector'])[3]")
	WebElement card_option;//debit/credit card button for payment option
	
	@FindBy(xpath="(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]")
	WebElement enter_button;//enter card details button
	
	@FindBy(xpath="//iframe[@name='ApxSecureIframe']")
	WebElement frame_handle;// handlin iframe
	
	@FindBy(xpath="//input[@name='addCreditCardNumber']")
	WebElement card_details;// actual card details textfield
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
	WebElement banking_button;//net banking option
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
	WebElement upi_button;// upi apps option
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[6]")
	WebElement emi_button;//EMI option
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[7]")
	WebElement cod_button;//cash on delivery option
	
	@FindBy(name="ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")
	WebElement use_this_payment;// use this payment option
	
	@FindBy(name="ppw-claimCode")
	WebElement coupon;//coupon code textfield
	
	@FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	WebElement enter_after;//enter button present after entering card details
//step-2
	public void select_address()
	{
		address_button.click();
	}
	public void select_card()
	{
		card_option.click();
	}
	public void click_enter_card()
	{
		enter_button.click();
	}
	public void iframe()
	{
		driver.switchTo().frame(frame_handle);
	}
	public void enter_card_details()
	{
		card_details.sendKeys("4524521487954");
	}
	public void select_banking()
	{
		banking_button.click();
	}
	public void select_upi()
	{
		upi_button.click();
	}
	public void select_emi()
	{
		emi_button.click();
	}
	public void select_cod()
	{
		cod_button.click();
	}
	public void enter_coupon()
	{
		coupon.sendKeys("45921");
		coupon.sendKeys(Keys.ENTER);
	}
//step-3
	public Amz_B2C_Checkout_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
