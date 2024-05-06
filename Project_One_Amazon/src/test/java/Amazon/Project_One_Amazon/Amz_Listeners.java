package Amazon.Project_One_Amazon;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Amz_Listeners implements ITestListener
{
	static WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) 
	{
		ITestListener.super.onTestStart(result);
		Reporter.log("Testcase started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Testcase passed");
		TakesScreenshot tss = (TakesScreenshot) driver;
		File source = tss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\KING\\eclipse-workspace\\Project_One_Amazon\\Amz_Screenshot\\Amz_pass\\pass."+result.getName() +".png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		ITestListener.super.onTestFailure(result);
		Reporter.log("Testcase failed");
		TakesScreenshot tss1 = (TakesScreenshot) driver;
		File source = tss1.getScreenshotAs(OutputType.FILE);
	    File destination = new File("C:\\Users\\KING\\eclipse-workspace\\Project_One_Amazon\\Amz_Screenshot\\Amz_fail\\fail."+result.getName() +".png");
	    try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	    
	    
	}
	

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		ITestListener.super.onTestSkipped(result);
		Reporter.log("Testcase is skipped");// can use dependsOnMethod annotation
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		ITestListener.super.onTestFailedWithTimeout(result);
		Reporter.log("Testcase failed due to explicit wait timeout");

	}

	@Override
	public void onStart(ITestContext context) 
	{
		ITestListener.super.onStart(context);
		Reporter.log("Suite start");

	}

	@Override
	public void onFinish(ITestContext context) 
	{
		ITestListener.super.onFinish(context);
		Reporter.log("Suite end");

	}

}
