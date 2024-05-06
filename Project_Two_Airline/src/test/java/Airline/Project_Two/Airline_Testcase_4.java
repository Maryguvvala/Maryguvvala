package Airline.Project_Two;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Airline_Testcase_4  extends Airline_Launch_Quit
//Test the search functionality for one-way flights
{
	@Test
	public void one_way_flight()
	{
		Airline_Homepage homepage = new Airline_Homepage(driver);
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
		Reporter.log("Date is selected");

		homepage.click_travel_class();//selecting travellers & class
		//homepage.click_on_done1();
		homepage.click_on_done2();
		homepage.click_on_search();//selecting search flight
		
		
		Assert.assertTrue(homepage.Update_button.isDisplayed()==true, "Didnot search for flight");
		//assertion done on update search flight button, it displays once the search is done
		Reporter.log("Searched for one way flight");
	}

}
