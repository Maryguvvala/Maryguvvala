package Airline.Project_Two;

import java.io.IOException;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import airline_utility.Data_Fetching;

public class Airline_Testcase_12 extends Airline_Launch_Quit
//Login to page,search the flight and logout
{
	@Test
	public void login_search_logout() throws IOException, InterruptedException
	{
		Reporter.log("Airline page has opened");
		Airline_Login_Page login = new Airline_Login_Page(driver);
		Data_Fetching data = new Data_Fetching();
		data.fetch_data();
		
		login.enter_num();
		Thread.sleep(10000);
		Reporter.log("Successfully logged in");

		
		Airline_Homepage homepage = new Airline_Homepage(driver);
		//homepage.click_close1();
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
		search.select_profile_logout();
		
		Assert.assertTrue("Log out not done", search.login_buton.isDisplayed()==true);
		//assertion done on login button, visible after logout is done
		
		Reporter.log("Logged out of application");

	}

	
}
