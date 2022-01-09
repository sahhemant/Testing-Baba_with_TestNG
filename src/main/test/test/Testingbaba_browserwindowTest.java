package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;
import pages.Testingbaba_browserwindowpage;


public class Testingbaba_browserwindowTest extends Baseliabary {

	Testingbaba_browserwindowpage ob;
	
	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{	
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_browserwindowpage();
		ob.clickonclosebtn();
}
	@Test(priority=0)
	public void clickonalartframewindowbtn()
	{
		ob.clickonalartframewindowbtn();
	}
	@Test(priority=1)
	public void clickonbrowserwindowbtnbtn() throws InterruptedException 
	{
		ob.clickonbrowserwindowbtnbtn();
	}

}
