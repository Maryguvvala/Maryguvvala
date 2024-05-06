package Airline.Project_Two;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
@Listeners(Airline_Listeners.class)
public class Airline_Launch_Quit extends Airline_Listeners
{
	
	@BeforeMethod
	@Parameters("browser")
	public void pre_conditions(String name_of_browser)
	{
		if(name_of_browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(name_of_browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		if(name_of_browser.equals("edge"))
		{
			driver = new EdgeDriver();    
		}
		
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@AfterMethod
	public void closure_activity()
	{
		System.out.println("Testcase is successfull");
	}
}
