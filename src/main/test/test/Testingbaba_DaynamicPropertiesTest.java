package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;
import pages.Testingbaba_DaynamicPropertiespage;

public class Testingbaba_DaynamicPropertiesTest extends Baseliabary {

	Testingbaba_DaynamicPropertiespage ob;
	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{	
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_DaynamicPropertiespage();
		ob.clickonclosebtn();
	}
	@Test(priority=0)
	public void clickondaynamicbtn() throws InterruptedException
	{
		ob.clickondaynamicbtn();
	}
}
