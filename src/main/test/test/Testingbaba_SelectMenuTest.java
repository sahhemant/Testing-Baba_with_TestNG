package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;
import pages.Testingbaba_SelectMenupage;

public class Testingbaba_SelectMenuTest extends Baseliabary {

	Testingbaba_SelectMenupage ob;
	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{	
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_SelectMenupage();
		ob.clickonclosebtn();
}
	@Test(priority = 0)
	public void clickonSelectmenubtn() 
	{
		ob.clickonselectvalue();
		
	}
	@Test(priority=1)
	public void  clickonselectone()
	{
		ob.clickonselectone();
	}
	@Test(priority=2)
	public void  clickonstyleselectmenubtn()
	{
		ob.clickonstyleselectmenubtn();
	}
	@Test(priority=3)
	public void  clickonmultiselectbtn()
	{
		ob.multiselect();
	}
}
