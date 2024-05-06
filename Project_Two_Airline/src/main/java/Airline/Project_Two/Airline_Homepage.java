package Airline.Project_Two;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_Homepage 
{
	WebDriver driver;
//step-1
	@FindBy (xpath="//span[@class='logSprite icClose']")
	WebElement close1;//close pop up 1
	
	@FindBy (xpath="//p[@class='sc-jlwm9r-1 ewETUe']")
	WebElement close2;//close pop up 2
	
	@FindBy (xpath="(//span[@class='sc-12foipm-17 eBxhjL fswWidgetLabel'])[1] ")
	WebElement from_option;//click on from option
	
	@FindBy (xpath="//input[@type='text']")
	WebElement from_tf;//from place text field
	
	@FindBy (xpath="(//span[@class='sc-12foipm-17 eBxhjL fswWidgetLabel'])[5]")
	WebElement from_option1;//click on from option for multi-city
	
	@FindBy (xpath="//div[@class='sc-12foipm-38 kapuxD']/ul/li")
	List<WebElement> select_from_city;//select from auto suggestion
	
	@FindBy (xpath="//input[@type='text']")
	WebElement to_tf;//to place text field
	
	@FindBy (xpath="//div[@class='sc-12foipm-38 kapuxD']/ul/li")
	List<WebElement> select_to_city;//select the destination from auto suggestion
	
	@FindBy (xpath="(//p[.='28'])[2]")
	WebElement date_option;//select the date from calendar departure date
	
	@FindBy (xpath="(//p[.='30'])[2]")
	WebElement date_option1;//select the date from calendar return date
	
	@FindBy (xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[5]")
	WebElement travel_class;// travellers &class button
	
	@FindBy (xpath="//span[.='Done']")
	WebElement done_button1;//select the done button
	
	@FindBy (xpath="//a[.='Done']")
	WebElement done_button2;
	
	@FindBy (xpath="//span[.='SEARCH FLIGHTS']")
	WebElement search_button; //click on search flight button
	
	@FindBy (xpath="//button[.='UPDATE SEARCH']")
	WebElement Update_button; // update search button for assertion
	
	@FindBy (xpath="//span[@class='sc-12foipm-84 CHCvS']")
	WebElement roundTrip_radio_button;// round trip radio button
	
	@FindBy (xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[3]")
	WebElement departure_option;//click on departure
	
	@FindBy (xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[7]")
	WebElement departure_option1;//click on 2nd departure for multi city option
	
	@FindBy (xpath="//li[.='economy']")
	WebElement economy_class;// economy travel class 

	@FindBy (xpath="//li[.='business']")
	WebElement business_class;// business travel class button
	
	@FindBy (xpath="//li[.='first class']")
	WebElement first_class;// first class travel class button
	
	@FindBy (xpath="(//span[@class='sc-12foipm-84 CHCvS'])[2]")
	WebElement multicity_radio_button;//multi city radio button option
	
	@FindBy (xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[6]")
	WebElement to_option;//second to option for multi-city flight
	
	@FindBy (id="mc_split_tab")
	WebElement select_own_flight;//select your own flights is visible after multi-city search, used for assertion
	
	@FindBy (xpath="(//span[@class='sc-12foipm-65 ljgJsP'])[2]")
	WebElement add_passenger_option; // adding more passenger
	
	@FindBy (xpath="(//span[@class='sc-12foipm-65 ljgJsP'])[4]")
	WebElement add_children_option; // adding more passenger
	
	@FindBy (xpath="(//span[@class='sc-12foipm-65 ljgJsP'])[6]")
	WebElement add_infant_option; // adding more passenger
//step-2
	public void select_passengers()
	{
		add_passenger_option.click();
		add_passenger_option.click();
		add_children_option.click();
		add_infant_option.click();
	}
	public void click_update()
	{
		Update_button.click();
	}
	public void click_close1()
	{
		close1.click();
	}
	public void click_close2()
	{
		close2.click();
	}
	public void click_from()
	{
		from_option.click();
	}
	public void click_from1()
	{
		from_option1.click();
	}
	public void write_from_place()
	{
		from_tf.sendKeys("Hyderabad"); 
	}
	public void write_to_place1()//for multi-city option
	{
		to_tf.sendKeys("Pune");
	}
	public void select_from_auto()
	{
		int count = select_from_city.size();
		System.out.println(count);
		select_from_city.get(count-10).click();
	}
	public void write_to_place()
	{
		to_tf.sendKeys("Bengaluru"); 
	}
	public void select_to_auto()
	{
		int count1 = select_to_city.size();
		System.out.println(count1);
		select_to_city.get(count1-10).click();
	}
	
	public void select_date()
	{
		date_option.click();
	}
	public void select_date1()
	{
		date_option1.click();
	}
	public void click_on_done1()
	{
		done_button1.click();
	}
	public void click_on_done2()
	{
		done_button2.click();
	}
	public void click_on_search()
	{
		search_button.click();
	}
	public void click_radio_button()
	{
		roundTrip_radio_button.click();
		
	}
	public void click_on_departure()
	{
		departure_option.click();
		
	}
	public void click_on_departure1()
	{
		departure_option1.click();
		
	}
	public void click_travel_class()
	{
		travel_class.click();
		
	}
	public void click_economy_class()
	{
		economy_class.click();
		
	}
	public void click_business_class()
	{
		business_class.click();
		
	}
	public void click_first_class()
	{
		first_class.click();
		
	}
	public void click_multicity_button()
	{
		multicity_radio_button.click();
		
	}
	public void click_to()
	{
		to_option.click();
		
	}
//step-3	
	public Airline_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
