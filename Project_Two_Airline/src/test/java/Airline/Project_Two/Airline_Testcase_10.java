package Airline.Project_Two;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Airline_Testcase_10 extends Airline_Launch_Quit//edit check
//Validate the flight information,Fare details,Baggage Rules and Cancellation Rules link has the details in the search result page.

{
	@Test
	public void check_flight_information() throws InterruptedException
	{
		Airline_Homepage homepage = new Airline_Homepage(driver);
		homepage.click_close1();
		homepage.click_close2();
		homepage.click_multicity_button();//multi-city radio button
		Reporter.log("Selected multi-city trip");
		homepage.click_from();
		homepage.write_from_place();//from place text field
		homepage.select_from_auto();
		
		homepage.write_to_place();//to place text field
		homepage.select_to_auto();//selecting from auto suggestion
		Reporter.log("To place is selected for multi-city(first city)");
		
		homepage.click_on_departure();//selecting departure option 
		homepage.select_date();//selecting date for departure
		//homepage.click_on_done1();
		Reporter.log("Selected departure date for first city");
		
		//homepage.click_travel_class();//selecting travellers & class
		homepage.click_business_class();//selected economy travel class
		homepage.click_on_done2();
		Reporter.log("Economy class is selected");
		
		homepage.click_to();//click on to option
		homepage.write_to_place1();//to place text field multi-city
		homepage.select_to_auto();//selecting from auto suggestion
		Reporter.log("To place is selected for multi-city(second city)");
		
		homepage.click_on_departure1();//selecting departure date for second city
		homepage.select_date1();//date selected for second city
		Reporter.log("Selected departure date for second city");
		
		homepage.click_on_search();//select search flight option
		
		Reporter.log("Flight is searched");

		/*Airline_Homepage homepage = new Airline_Homepage(driver);//one way flight code
		homepage.click_close1();
		homepage.click_close2();
		homepage.click_from();
		homepage.write_from_place();//from place text field
		homepage.select_from_auto();//selecting from auto suggestion
		Reporter.log("From place is selected");
		
		homepage.write_to_place();//to place text field
		homepage.select_to_auto();//selecting from auto suggestion
		Reporter.log("To place is selected");
		
		homepage.click_on_departure();//selecting departure option 
		homepage.select_date();//selecting date for departure
		Reporter.log("Date is selected");*/

		/*homepage.click_travel_class();//selecting travellers & class
		homepage.click_on_done2();*/
		/*Thread.sleep(10000);
		homepage.click_on_search();//selecting search flight
		Reporter.log("Flight is searched");*/
		
		Airline_search_page1 search = new Airline_search_page1(driver);
		search.click_flight_details();
		Reporter.log("Clicked on flight details options and checked flight information");
		search.click_fare_details();
		Reporter.log("Checked flight fare details link");
		search.click_baggage_rules();
		Reporter.log("Checked flight baggage rules link");
		search.click_cancellation_rules();
		Reporter.log("Checked cancellation rules link");
		
		Assert.assertTrue(search.refund_option.isDisplayed()==true, "Cancellation rules is not verified");
		//assertion done on partially refund option
		Reporter.log("Checked flight cancellation rules link");
		
		
		
		
		
	}

}
