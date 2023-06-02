package POMClassesusingTestNGclasswithBaseAndUtilityPropertyFiles;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neostoxBase.Base;
import utility.Utility;


public class listener extends Base implements ITestListener {
	public void  onTestFailure(ITestResult result)
	
	{
		String tcname = result.getName();
		Reporter.log("TC"+tcname+" is failed ,try again" ,true);
		try {
			Utility.takesScreenshot(driver, tcname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result)
	
	{
		Reporter.log("Tc"+result.getName()+"tc is skipped", true);
		try {
			Utility.takesScreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}
	public void  onTestSuccess(ITestResult result)
	{
		Reporter.log("Tc"+result.getName()+"is passed successfully",true);
	}

}
