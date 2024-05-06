package Airline.Project_Two;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import airline_utility.Data_Fetching;

public class Airline_Testcase_3 extends Airline_Launch_Quit
//Test login with invalid credentials and ensure proper error messages are displayed

{
	@Test
	public void login_with_wrong_details() throws IOException
	{
		Reporter.log("Airline page has opened");
		Airline_Login_Page login = new Airline_Login_Page(driver);
		Data_Fetching data = new Data_Fetching();
		data.fetch_data();
		login.enter_wrong_num();
		Reporter.log("Login failed due to incorrect number");
		Assert.assertTrue(login.search_button.isDisplayed()==false, "Login failed");
		//assertion done on search flight button
		
		
	}

}
