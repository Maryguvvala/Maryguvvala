package Airline.Project_Two;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Airline_Testcase_13 extends Airline_Launch_Quit
//Check if user is able to apply for coupon code while ordering the product

{
	@Test
	public void apply_coupon_code()
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

		Airline_search_page1 search = new Airline_search_page1(driver);
		search.click_book();
		Reporter.log("clicked on book flight");
		
		Airline_review_booking_page review = new Airline_review_booking_page(driver);
		review.click_coupon();
		
		Assert.assertTrue(review.coupon_applied.isDisplayed()==true , "Coupon not applied");
		//assertion done on the pop up msg awesome discount applied
		
		Reporter.log("Able to apply coupon code");
		
		
	}

}
