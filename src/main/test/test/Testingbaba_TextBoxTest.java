package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;
import pages.Testingbaba_TextBoxpage;

public class Testingbaba_TextBoxTest extends Baseliabary {

	Testingbaba_TextBoxpage ob;
	@BeforeTest
	public void getlaunch_testingbabaUrl() 
	{	
		getlaunch("http://testingbaba.com/index.html");
		ob=new Testingbaba_TextBoxpage();
		ob.clickonclosebtn();
	}
@Test(priority=1)
public void clickonElements() 
{
	ob.clickonElements();
}
@Test(priority=2)
public void clickonTextBox() 
{ 
	ob.clickonTextBox();
}
@Test(priority=3)
public void Filltaxboxdetails()
{
	ob.Filltaxboxdetails ();
}
@Test(priority=4)
public void getvarifytextboxdata()
{	
	ob.getvarifytextboxdata ();
}

}
 