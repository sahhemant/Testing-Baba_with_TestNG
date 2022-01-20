package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;
import pages.Testingbaba_Widgetspage;


public class Testingbaba_WidgetsTest extends Baseliabary {

	Testingbaba_Widgetspage ob;
	
	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{	
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_Widgetspage();
		ob.clickonclosebtn();
}
	@Test(priority = 0)
	public void clickonwidgetsbtn()
	{
		ob.clickonwidgetsbtn();
	}
}
