package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;
import pages.Testingbaba_Radiobuttonpage;

public class Testingbaba_RadiobuttonTest extends Baseliabary {

	Testingbaba_Radiobuttonpage ob;
	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{	
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_Radiobuttonpage();
		ob.clickonclosebtn();
	}
	@Test(priority=0)
	public void clickonElements()
	{
		ob.clickonElements();
	}
	@Test(priority=1)
	public void clickonradiobutton() 
	{
		ob.clickonRadiobutton();
	}
	@Test(priority=2)
	public void clickonNobutton() 
	{
		ob.clickonnobutton();
	}
}
