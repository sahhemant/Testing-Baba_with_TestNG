package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;
import pages.Testingbaba_Buttonpage;

public class Testingbaba_ButtonTest extends Baseliabary {

	
	Testingbaba_Buttonpage ob;
	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{	
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_Buttonpage();
		ob.clickonclosebtn();
	}
	@Test(priority=0)
	public void clickonElements()
	{
		ob.clickonElements();
	}
	@Test(priority=1)
	public void clickonButtons() 
	{
		ob.clickonButtons();
	}
	@Test(priority=2)
	public void performDoubleclick() 
	{
		ob.clickonDoubleclick();
	}
	@Test(priority=3)
	  public void performRightclick() 
	  { 
		  ob.clickonRightclick(); 
		  }
	@Test(priority=4)
	  public void clickonclick() 
	  { 
		  ob.clickonclick(); 
		  }
	
	@Test(priority=5)
	  public void readbuttonboxdata() 
	  { 
		  ob.readbuttonboxdata(); 
	  }
	
	@Test(priority=6)
	  public void getverifybuttondata() 
	  { 
		  ob.getverifybuttondata(); 
	  }
	
}
