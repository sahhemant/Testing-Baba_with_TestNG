package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;
import pages.Testingbaba_Accordionpage;


public class Testingbaba_AccordionTest extends Baseliabary {

	Testingbaba_Accordionpage ob;
	
	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{	
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_Accordionpage();
		ob.clickonclosebtn();
}
	@Test(priority = 0)
	public void clickonwidgetsbtn()
	{
		ob.clickonwidgetsbtn();
	}
}
