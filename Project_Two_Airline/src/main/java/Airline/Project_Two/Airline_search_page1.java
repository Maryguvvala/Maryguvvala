package Airline.Project_Two;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_search_page1 
{
	WebDriver driver;
//step-1
	
	@FindBy (xpath="(//span[.='Flight Details'])[1]")
	WebElement flight_details_option; // flight details option in the search result page
	
	@FindBy (xpath="//span[.='Fare Details']")
	WebElement fare_details_option; // fare details option in search result page after clicking on flight details option
	
	@FindBy (xpath="//span[.='Baggage Information']")
	WebElement baggaeg_rules_option; //baggage information link option in search result page 
	
	@FindBy (xpath="//span[.='Cancellation Rules']")
	WebElement cancellation_rules_option;
	
	@FindBy (xpath="//span[.='Partially Refundable']")
	WebElement refund_option;// partially refundable option visible after clicking the link of cancellation rules, done for assertion
	
	//@FindBy (xpath="(//button[.='VIEW FARES'])[1]")
	//WebElement view_fares_option; //view fares option in search result
	
	@FindBy (id ="mc_ticket_summary_book_btn")
	WebElement book_button;//book option
		
	@FindBy (xpath="(//span[.='After 6PM'])[2]")
	WebElement after_6;
	
	@FindBy(xpath="//span[.='Direct']")
	WebElement direct;
	
	@FindBy (xpath="//div[@class='sc-fifgRP kqxAoQ']")
	WebElement hover_profile; // hey user hover over option
	
	@FindBy (xpath="//p[@class='sc-gEvEer fSyeqP']")
	WebElement click_profile; //click on view your profile
	
	@FindBy (xpath="//span[.='LOGOUT']")
	WebElement click_logout; //logout textbox
	
	@FindBy (xpath="//button[.='Yes, Log out']")
	WebElement confirm_logout; //confirm logout pop up message
	
	@FindBy (xpath="//button[.='Login']")
	WebElement login_buton; //after logout,login option is visible for assertion
//step-2
	public void select_profile_logout()
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(hover_profile).perform();
		click_profile.click();
		click_logout.click();
		confirm_logout.click();
	}
	public void click_after_6()
	{
		after_6.click();
	}
	public void click_direct()
	{
		direct.click();
	}
	public void click_flight_details()
	{
		flight_details_option.click();
	}
	public void click_fare_details()
	{
		fare_details_option.click();
	}
	public void click_baggage_rules()
	{
		baggaeg_rules_option.click();
	}
	public void click_cancellation_rules()
	{
		cancellation_rules_option.click();
	}
	/*public void click_view_fares()
	{
		view_fares_option.click();
	}*/
	public void click_book()
	{
		book_button.click();
		/*Set<String> id = driver.getWindowHandles();
		Iterator<String> pcid = id.iterator();
		String p_id = pcid.next();
		String c_id = pcid.next();
		driver.switchTo().window(c_id);*/
	}
	
//step-3	
	public Airline_search_page1(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
