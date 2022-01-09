package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;
import pages.Testingbaba_Framepage;


public class Testingbaba_FrameTest extends Baseliabary {

	Testingbaba_Framepage ob;
	

	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{	
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_Framepage();
		ob.clickonclosebtn();
}
	@Test(priority=0)
	public void clickonalartframewindowbtn()
	{
		ob.clickonalartframewindowbtn();
	}
	@Test(priority=1)
	public void clickonframebtn()
	{
		ob.clickonframebtn();
	}
	@Test(priority=2)
	public void longframe()
	{
		ob.longframe();
	}
	@Test(priority=3)
	public void samllframe()
	{
		ob.smallframe();
	}
	

}
