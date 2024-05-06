package Airline.Project_Two;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import airline_utility.Data_Fetching;

public class Airline_Testcase_8 extends Airline_Launch_Quit 
//Check for seat selection during the booking process
{
	@Test
	public void check_seat_selection() throws InterruptedException, IOException
	{
		Airline_Homepage homepage = new Airline_Homepage(driver);
		homepage.click_close1();
		homepage.click_close2();
		homepage.click_multicity_button();// multi-city radio button
		Reporter.log("Selected multi-city trip");
		homepage.click_from();
		homepage.write_from_place();// from place text field
		homepage.select_from_auto();

		homepage.write_to_place();// to place text field
		homepage.select_to_auto();// selecting from auto suggestion
		Reporter.log("To place is selected for multi-city(first city)");

		homepage.click_on_departure();// selecting departure option
		homepage.select_date();// selecting date for departure
		Reporter.log("Selected departure date for first city");

		// homepage.click_travel_class();//selecting travellers & class
		homepage.click_business_class();// selected economy travel class
		homepage.click_on_done2();
		Reporter.log("Economy class is selected");

		homepage.click_to();// click on to option
		homepage.write_to_place1();// to place text field multi-city
		homepage.select_to_auto();// selecting from auto suggestion
		Reporter.log("To place is selected for multi-city(second city)");

		homepage.click_on_departure1();// selecting departure date for second city
		homepage.select_date1();// date selected for second city
		Reporter.log("Selected departure date for second city");

		homepage.click_on_search();// select search flight option
		Reporter.log("Flight is searched");
		
		Airline_search_page1 search = new Airline_search_page1(driver);
		search.click_book();
		Reporter.log("clicked on book flight");

		Airline_review_booking_page review = new Airline_review_booking_page(driver);
		Data_Fetching data = new Data_Fetching();
		data.fetch_data();
		review.enter_pincode();
		Reporter.log("Entered pincode");
		review.select_state();
		review.select_state_list();
		Reporter.log("Selected state");
		review.select_radio_button();
		review.select_gender();
		review.first_name();
		review.last_name();
		Reporter.log("Entered first and last name");
		review.email();
		Reporter.log("Entered email id");
		review.phn_number();
		Reporter.log("Entered phone number");
		review.select_checkbox1();
		//review.click_travel_unsecure();
		review.click_proceed();
		Thread.sleep(5000);
		review.click_proceed();
		Reporter.log("clicked on proceed button");
		review.click_correct();
		review.select_seat();
		
		Assert.assertTrue(review.payment_tb.isDisplayed()==true, "Not clicked on proceed");
		//assertion done on payment option
		Reporter.log("Seat is selected");

	}
	

}
