package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;
import pages.Testingbaba_Checkboxpage;

public class Testingbaba_CheckboxTest  extends Baseliabary {

	Testingbaba_Checkboxpage ob;
	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{	
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_Checkboxpage();
		ob.clickonclosebtn();
	}
	
	@Test(priority=0)
	public void clickonElements()
	{
		ob.clickonElements();
	}
	@Test(priority=1)
	public void clickoncheckbox() throws InterruptedException 
	{
		ob.clickoncheckbox();
	}
	@Test(priority=2)
	public void clickonselectedcheckbox() throws InterruptedException
	{
		ob.clickonselectedcheckbox();
	}
	@Test(priority=3)
	public void readcheckboxdata()
	{
		ob.readcheckboxdata();
	}
	@Test(priority=4)
	public void getverifiedcheckboxdata() throws InterruptedException
	{
	ob.getverifiedcheckboxdata();
}
}