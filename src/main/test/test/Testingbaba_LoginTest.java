package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;
import pages.Testingbaba_Loginpage;

public class Testingbaba_LoginTest extends Baseliabary {
	
	Testingbaba_Loginpage ob;
	
	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{
		getlaunch("http://testingbaba.com/index.html");
		ob=new Testingbaba_Loginpage();
	}
	@Test(priority=0)
	public void clickonclosebtn() 
	{
		ob.clickonclosebtn();
	}
	
}
