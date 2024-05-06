package Airline.Project_Two;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import airline_utility.Data_Fetching;

public class Airline_review_booking_page extends Data_Fetching
{
	WebDriver driver;
//step-1
	@FindBy (id="Pincode")
	WebElement pincode_tf;

	@FindBy (xpath="//p[.='Telangana']")
	WebElement state_tf;
	
	@FindBy (xpath="//span[@class='sc-ktPPKK hKXtqD']")
	WebElement confirm_radio_button1;
	
	@FindBy (xpath="//div[@class='sc-iXzfSG gAfIJg']/ul/li")
	List<WebElement> state_list;
	
	@FindBy (xpath="//select[@class='common-elementsstyles__CustSelectTrvl-sc-ilw4bs-9 lpjPee']")
	WebElement gender_dropdown; //select the gender 
	
	@FindBy (name="givenname")
	WebElement firstname_tf;
	
	@FindBy (name="lastname")
	WebElement lastname_tf;
	
	@FindBy (name="email")
	WebElement email_tf;
	
	@FindBy (xpath="(//input[@class='common-elementsstyles__IpTxt-sc-ilw4bs-11 jxlvgt width100'])[3]")
	WebElement phn_number_tf;
	 
	@FindBy (id="goPromo")
	WebElement promo_tf;
	
	@FindBy (xpath="(//span[@class='common-elementsstyles__CheckBox-sc-ilw4bs-2 iCEsUc'])[1]")
	WebElement checkbox1; //pre-flight checklist check box
	
	@FindBy (xpath="(//span[@class='common-elementsstyles__CheckBox-sc-ilw4bs-2 iCEsUc'])[2]")
	WebElement checkbox2; //donate
	
	@FindBy (xpath="//button[.='Proceed']")
	WebElement proceed_textbox; //proceed textbox option
	
	@FindBy (xpath="//span[.='VIEW ALL COUPONS']")
	WebElement view_coupon; //view all coupons text
	
	@FindBy (xpath="(//span[@class='common-elementsstyles__CheckBox-sc-ilw4bs-2 TIWwk'])[1]")
	WebElement coupon1; // first coupon option
	
	@FindBy (xpath="//div[.='Awesome! Promo discount applied']")
	WebElement coupon_applied; // after selecting coupon discount applied msg appears. assertion.
	
	@FindBy (xpath="//button[.='Travel Unsecured']")
	WebElement travel_unsecure_tb; // travel unsecured textbox
	
	@FindBy (xpath="//button[.='That’s Correct']")
	WebElement correct_text;//review traveller details thats correct text
	
	@FindBy (xpath="//span[.='1A']")
	WebElement seat_option; // select seat
	
	@FindBy (xpath="//button[.='Proceed To Payment']")
	WebElement payment_tb; //proceed to payment textbox
	
	@FindBy (xpath="//span[.='Taxes and Surcharges']")
	WebElement taxes_text;// taxes and surcharges are visibile after clicking on book
//step-2
	public void click_payment()
	{
		payment_tb.click();
	}
	public void select_seat()
	{
		seat_option.click();
	}
	public void click_correct()
	{
		correct_text.click();
	}
	public void click_travel_unsecure()
	{
		travel_unsecure_tb.click();
	}
	public void click_coupon()
	{
		view_coupon.click();
		coupon1.click();
	}
	public void click_proceed()
	{
		proceed_textbox.click();
	}
	public void enter_pincode()
	{
		pincode_tf.sendKeys(pincode);
	}
	public void select_state()
	{
		state_tf.click();
	}
	public void select_state_list()
	{
		int count = state_list.size();
		System.out.println(count);
		state_list.get(count-6).click();
	}
	public void select_radio_button()
	{
		confirm_radio_button1.click();
	}
	public void select_gender()
	{
		Select s1 = new Select(gender_dropdown);
	    s1.selectByVisibleText("Female");
	}
	public void first_name()
	{
		firstname_tf.sendKeys(firstname);
	}
	public void last_name()
	{
		lastname_tf.sendKeys(firstname);
	}
	public void email()
	{
		email_tf.sendKeys(email_id);
	}
	public void phn_number()
	{
		phn_number_tf.sendKeys(phn_number);
	}
	public void promo_code()
	{
		promo_tf.sendKeys("04309");
	}public void select_checkbox1()
	{
		checkbox1.click();
		checkbox2.click();
	}
//step-3
	public Airline_review_booking_page(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}

}
