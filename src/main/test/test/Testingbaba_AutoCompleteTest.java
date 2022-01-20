package test;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;
import pages.Testingbaba_AutoCompletepage;


public class Testingbaba_AutoCompleteTest extends Baseliabary {

	Testingbaba_AutoCompletepage ob;
	
	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{	
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_AutoCompletepage();
		ob.clickonclosebtn();
}
	@Test(priority = 0)
	public void clickonautocompletebtn() throws  InterruptedException
	{
		ob.clickonmouseover();
	}
	
}
