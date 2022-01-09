package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;
import pages.Testingbaba_ModalDilogspage;


public class Testingbaba_ModalDilogsTest extends Baseliabary {
	Testingbaba_ModalDilogspage ob;
	 
	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{	
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_ModalDilogspage();
	    ob.clickonclosebtn();			
}
	@Test(priority=0)
	public void clickonalartframewindowbtn()
	{
		ob.clickonalartframewindowbtn();
	}
	@Test(priority=1)
	public void clickonmodeldilogsbtnbtn()
	{
		ob.clickonmodeldilogsbtnbtn();
	}
	@Test(priority=2)
	public void clickonsmallmodelbtn()
	{
		ob.clickonsmallmodelbtn();
	}
	@Test(priority=3)
	public void clickonlargemodelbtnbtn()
	{
		ob.clickonlargemodelbtnbtn();
	}
}