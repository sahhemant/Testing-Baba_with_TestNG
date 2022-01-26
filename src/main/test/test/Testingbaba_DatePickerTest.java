package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;
import pages.Testingbaba_DatePickerpage;


public class Testingbaba_DatePickerTest extends Baseliabary
{
	Testingbaba_DatePickerpage ob;
	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{	
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_DatePickerpage();
		ob.clickonclosebtn();
}
	@Test(priority = 0)
		public void clickondatepicker()
		{
		ob.date();
	}
}
