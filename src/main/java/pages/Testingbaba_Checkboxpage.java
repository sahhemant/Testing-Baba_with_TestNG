package pages;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseliabary.Baseliabary;
import propertyutility.ReadCheckboxdata;

public class Testingbaba_Checkboxpage extends Baseliabary {
	ArrayList<String> Expected=null;
	public Testingbaba_Checkboxpage()
	{
		PageFactory.initElements(driver, this);
	}
	    @FindBy(xpath="//*[text()='×']")
	    private WebElement closebtn;
	    @FindBy(xpath=" //*[text()='Practice']")
	    private WebElement practiceform;
	    @FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
		private WebElement Elements;
	    @FindBy(xpath="//*[text()='check box']")
	    private WebElement checkbox;
	    @FindBy(xpath="//*[@id=\"tab_2\"]/div/iframe")
	    private WebElement checkboxframe;
	    @FindBy(xpath="//*[@id=\"myCheck\"]")
	    private WebElement mobilecheckbox;
	    @FindBy(xpath="//*[@id=\"mylaptop\"]")
	    private WebElement laptopcheckbox;
	    @FindBy(xpath="//*[@id=\"mydesktop\"]")
	    private WebElement desktopcheckbox;
	    @FindBy(xpath="//*[@id=\"text\"]")
	    private WebElement mobilecheckboxdata;
	    @FindBy(xpath="//*[@id=\"text1\"]")
	    private WebElement laptopmobilecheckboxdata;
	    @FindBy(xpath="//*[@id=\"text2\"]")
	    private WebElement desktopmobilecheckboxdata;
	   
		public void clickonclosebtn()
		{
			closebtn.click();
			practiceform.click();
		}
		 public void clickonElements()
			{
				Elements.click();
			}
		public void clickoncheckbox() throws InterruptedException
		{
			Thread.sleep(2000);
			checkbox.click();
		}
		public void clickonselectedcheckbox() throws InterruptedException 
		{
			Thread.sleep(2000); 
			driver.switchTo().frame(checkboxframe);
			mobilecheckbox.click();
			laptopcheckbox.click();
			desktopcheckbox.click();
						
		}
		
		public void readcheckboxdata()
		{
		Expected=new ArrayList<String>();
		Expected.add(ReadCheckboxdata.getReadproperty("Mobile"));
		Expected.add(ReadCheckboxdata.getReadproperty("Laptop"));
		Expected.add(ReadCheckboxdata.getReadproperty("Desktop"));
		}
		
		public void getverifiedcheckboxdata() throws InterruptedException
		{
			Thread.sleep(2000);
			try
			{
				
				 ArrayList<String> Actual=new ArrayList<String>();
				 Actual.add(mobilecheckboxdata.getText());
				 Actual.add(laptopmobilecheckboxdata.getText());
				 Actual.add(desktopmobilecheckboxdata.getText());	
			
				  for(String dd:Expected) 
				  {
				    for(String dd1:Actual) 
				{
				    	Assert.assertEquals(dd,dd1);    	
				        Actual.remove(dd1); 
				        break;
				  } 
				}
				   
				  //driver.switchTo().defaultContent();
				}
			
			catch(Exception e)
			{
				System.out.println("issue in getverifiedcheckboxdata " + e);
			}
		}
			}


