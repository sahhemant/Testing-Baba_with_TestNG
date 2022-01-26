package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;
import pages.Testingbaba_Tooltippage;

public class Testingbaba_TooltipTest extends Baseliabary {
	Testingbaba_Tooltippage ob;
	
	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{	
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_Tooltippage();
		ob.clickonclosebtn();
}
	@Test(priority = 0)
	public void tooltipmenu() 
	{
		ob.clickontooltip();
	}
	
}