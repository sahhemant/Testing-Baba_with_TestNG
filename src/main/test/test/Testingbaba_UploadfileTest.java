package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseliabary.Baseliabary;
import pages.Testingbaba_Uploadfilepage;

 
public class Testingbaba_UploadfileTest extends Baseliabary {

	Testingbaba_Uploadfilepage ob;
	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{	
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_Uploadfilepage();
		ob.clickonclosebtn();
	}
	@Test(priority=0)
	public void clickonElements()
	{
		ob.clickonElements();
	}
	@Test(priority=1)
	public void clickonUploaddownload()
	{
		ob.clickonUploaddownload ();
	}
	@Test(priority=2)
	public void clickonuploadfile() throws InterruptedException
	{
		ob.clickonuploadfile ();
		
	}
}
