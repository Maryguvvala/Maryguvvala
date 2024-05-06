package Airline.Project_Two;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import airline_utility.Data_Fetching;

public class Airline_Testcase_11 extends Airline_Launch_Quit // edit check
//Validate if after clicking on book button in the search page user is able to enter every text fields present like pincode,state,radio
//button,Firstname,lastname,email id,mobile number ,promo code etc

{
	@Test
	public void check_text_fields() throws InterruptedException, IOException 
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
		// homepage.click_on_done1();
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

		/*
		  Airline_Homepage homepage = new Airline_Homepage(driver);//one way flight
		  code homepage.click_close1(); homepage.click_close2(); homepage.click_from();
		  homepage.write_from_place();//from place text field
		  homepage.select_from_auto();//selecting from auto suggestion
		  Reporter.log("From place is selected");
		  
		  homepage.write_to_place();//to place text field
		  homepage.select_to_auto();//selecting from auto suggestion
		  Reporter.log("To place is selected");
		  
		  homepage.click_on_departure();//selecting departure option
		  homepage.select_date();//selecting date for departure
		  Reporter.log("Date is selected");
		  
		  /*homepage.click_travel_class();//selecting travellers & class
		  homepage.click_on_done2();*/
		/*
		  homepage.click_on_search();//selecting search flight
		  Reporter.log("Flight is searched");*/

		Airline_search_page1 search = new Airline_search_page1(driver);
		//search.click_view_fares();
		search.click_book();
		Reporter.log("clicked on book flight");

		Airline_review_booking_page review = new Airline_review_booking_page(driver);
		Data_Fetching data = new Data_Fetching();
		data.fetch_data();
		review.enter_pincode();
		Reporter.log("Able to enter pincode");
		review.select_state();
		review.select_state_list();
		Reporter.log("Able to select state");
		review.select_radio_button();
		review.select_gender();
		review.first_name();
		review.last_name();
		Reporter.log("Able to enter first and last name");
		review.email();
		Reporter.log("Able to enter email id");
		review.phn_number();
		Reporter.log("Able to enter phone number");
		review.promo_code();
		Reporter.log("Able to enter promo code");
		
		Thread.sleep(5000);
		
		Assert.assertTrue(review.proceed_textbox.isDisplayed()==true , "not able to perform actions");
		//assertion done on proceed textbox
		Reporter.log("Able to perform actions on all the fields");
		
	}
}
