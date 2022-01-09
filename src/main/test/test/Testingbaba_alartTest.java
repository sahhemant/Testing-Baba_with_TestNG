package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;

import pages.Testingbaba_alartpage;

public class Testingbaba_alartTest extends Baseliabary {

	Testingbaba_alartpage ob;
	
	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{	
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_alartpage();
		ob.clickonclosebtn();
}
	@Test(priority=0)
	public void clickonalartframewindowbtn()
	{
		ob.clickonalartframewindowbtn();
	}
	@Test(priority=1)
	public void clickonalartbtn()
	{
		ob.clickonalartbtn();
	}
	@Test(priority=2)
	public void clickonclickmebtn()
	{
		ob.clickonclickmebtn();
	}
	@Test(priority=3)
	public void clickonclickmebtn2()
	{
		ob.clickonclickmebtn2();
	}
	@Test(priority=4)
	public void clickonclickmebtn3()
	{
		ob.clickonclickmebtn3();
	}
	@Test(priority=5)
	public void clickonclickmebtn4()
	{
		ob.clickonclickmebtn4();
	}
	
}