package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;

import pages.Testingbaba_linkspage;

public class Testingbaba_linksTest  extends Baseliabary {

	Testingbaba_linkspage ob;
	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{	
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_linkspage();
		ob.clickonclosebtn();
	}
	@Test(priority=0)
	public void clickonElements()
	{
		ob.clickonElements();
	}
	@Test(priority=1)
	public void clickonLinks()
	{
		ob.clickonLinks();
	}
	@Test(priority=2)
	public void clickonDemoPage() throws InterruptedException
	{
		ob.clickonDemoPage();
	}
	@Test(priority=3)
	public void clickonAPIcall() 
	{
		ob.clickonAPIcall();
	}
	
	
}
