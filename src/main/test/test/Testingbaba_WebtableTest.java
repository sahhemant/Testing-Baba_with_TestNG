package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliabary.Baseliabary;

import pages.Testingbaba_Webtablepage;

public class Testingbaba_WebtableTest extends Baseliabary {
	
	Testingbaba_Webtablepage ob;
	
	@BeforeTest
	public void getlaunch_testingbabaUrl()
	{	
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_Webtablepage();
		ob.clickonclosebtn();
	}
	@Test(priority=0)
	public void clickonElements()
	{
		ob.clickonElements();
	}
	@Test(priority=1)
	public void clickonwebtable()  
	{
		ob.clickonwebtables();
	}
	  @Test(priority=2) 
	  public void filldetails()
	  {
	  ob.filltable(); 
	  }
		 @Test(priority=4) 
		 public void updatedetails() 
		 {
		 ob.Updatenamedetails();	 
		 }	 
}
