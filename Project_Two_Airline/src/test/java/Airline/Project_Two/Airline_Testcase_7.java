package Airline.Project_Two;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Airline_Testcase_7 extends Airline_Launch_Quit
//Test for multi-city flight search
{
	@Test
	public void multi_city()
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
		
		/*homepage.click_from1();
		homepage.write_from_place();
		homepage.select_from_auto();//selecting from auto suggestion
		Reporter.log("From place is selected");*/
		
		homepage.click_to();//click on to option
		homepage.write_to_place1();//to place text field multi-city
		homepage.select_to_auto();//selecting from auto suggestion
		Reporter.log("To place is selected for multi-city(second city)");
		
		homepage.click_on_departure1();//selecting departure date for second city
		homepage.select_date1();//date selected for second city
		Reporter.log("Selected departure date for second city");
		
		homepage.click_on_search();//select search flight option
		
		Assert.assertTrue(homepage.select_own_flight.isDisplayed()==true, "Didnot search for flight");
		//assertion done on update search flight button, it displays once the search is done
		Reporter.log("Searched for multi-city flight");
	}

}
