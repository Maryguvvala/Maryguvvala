package Airline.Project_Two;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import airline_utility.Data_Fetching;

public class Airline_Testcase_1 extends Airline_Launch_Quit
//Verify that users can successfully register for a new account
{
	@Test
	public void registration() throws IOException
	{
		Reporter.log("Airline page has opened");
		Airline_Registration_Page register = new Airline_Registration_Page(driver);
		Data_Fetching data = new Data_Fetching();
		data.fetch_data();
		
		register.enter_num();
		register.enter_name();
		register.enter_email();
		register.click_letsgo();
		Reporter.log("successfully registered");
	}

}
