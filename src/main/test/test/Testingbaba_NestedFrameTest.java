package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;
import pages.Testingbaba_NestedFramepage;


public class Testingbaba_NestedFrameTest  extends Baseliabary {

	Testingbaba_NestedFramepage ob;
	 
		@BeforeTest
		public void getlaunch_testingbabaUrl()
		{	
			getlaunch("https://testingbaba.com/");
			ob=new Testingbaba_NestedFramepage();
		    ob.clickonclosebtn();			
}
		@Test(priority=0)
		public void clickonalartframewindowbtn()
		{
			ob.clickonalartframewindowbtn();
		}
		@Test(priority=1)
		public void clickonnestedframe()
		{
			ob.clickonnestedframe();
		}
		@Test(priority=2)
		public void parentchildframe()
		{
			ob.ppframe();
		}
}
		