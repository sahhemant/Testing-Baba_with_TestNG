package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;

import pages.Testingbaba_Progessbarpage;

public class Testingbaba_ProgessbarTest extends Baseliabary 
{
	Testingbaba_Progessbarpage ob;
	
	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{	
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_Progessbarpage();
		ob.clickonclosebtn();
}
	@Test(priority = 0)
	public void progressbar() throws InterruptedException 
	{
		ob.clickonprogressbarbtn();
	}
	
}

