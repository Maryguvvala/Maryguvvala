package Amazon.Project_One_Amazon;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Data_Fetching;

public class Amz_TestCase_1 extends Amz_Launch_Quit //Test if a new user can successfully register.
{
	
	@Test
	public void registration_steps() throws IOException
	{
		Amz_B2C_Homepage homepage = new Amz_B2C_Homepage(driver);
		homepage.hoverover();
		homepage.click_start();
		
		Reporter.log("Clicked on register(start here) button");
		
		Data_Fetching d1 = new Data_Fetching();
		d1.fetch_data();
		
		Amz_B2C_Registration register = new Amz_B2C_Registration(driver);
		register.fname();
		register.phn_num();
		register.pwd();
		register.click_on_continue();
		Assert.assertFalse(register.start_puzzle.isDisplayed()==true, "Puzzle cannot be done with automation");
		//assertion is done puzzle button
		Reporter.log("Registration not done");
		
		
		
	}

	
	
}
