package Airline.Project_Two;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import airline_utility.Data_Fetching;

public class Airline_Testcase_2  extends Airline_Launch_Quit
//Validate the login functionality with valid credentials.
{
	@Test
	public void login_with_right_details() throws IOException
	{
		Reporter.log("Airline page has opened");
		Airline_Login_Page login = new Airline_Login_Page(driver);
		Data_Fetching data = new Data_Fetching();
		data.fetch_data();
		
		login.enter_num();
		
		Assert.assertTrue(login.search_button.isDisplayed()==true, "Login failed");
		//assertion done on search flight button
		Reporter.log("Successfully logged into application");
	}

}
