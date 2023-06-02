package listenerStudy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;




public class listener implements ITestListener {
	
	public void  onTestFailure(ITestResult result)
	
	{
		String tcname = result.getName();
		Reporter.log("TC"+tcname+"is failed ,try again" ,true);
		
	}
	public void onTestSkipped(ITestResult result)
	
	{
		Reporter.log("Tc"+result.getName()+"tc is skipped", true);
		
		
	}
	public void  onTestSuccess(ITestResult result)
	{
		Reporter.log("Tc"+result.getName()+"is passed successfully",true);
	}

}
