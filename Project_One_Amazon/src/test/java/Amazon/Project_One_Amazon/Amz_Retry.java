package Amazon.Project_One_Amazon;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Amz_Retry implements IRetryAnalyzer
{

	int retry = 2;
	int count = 0;
	@Override
	public boolean retry(ITestResult result) 
	{
		if (count<retry)
		{
			count++;
			return true;
		}
		return false;
	}

}
