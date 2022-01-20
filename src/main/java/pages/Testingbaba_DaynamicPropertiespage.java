package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baseliabary.Baseliabary;

public class Testingbaba_DaynamicPropertiespage extends Baseliabary {

	public Testingbaba_DaynamicPropertiespage()
	{
		PageFactory.initElements(driver, this);
	}
	
	    @FindBy(xpath="//*[text()='×']")
  	    private WebElement closebtn;
	    @FindBy(xpath=" //*[text()='Practice']")
	    private WebElement practiceform;
	    @FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
		private WebElement Elements;
	    @FindBy(xpath="//*[@onclick=\"changeText(this),dynamicproperties();\"]")
	  	private WebElement daynamicbtn;
	    @FindBy(xpath="//*[@id=\"Enable\"]")
	  	private WebElement enablecbtn;
	   
	    public void clickonclosebtn()
	    {
	    Applicationutility.clickme(closebtn);
	    Applicationutility.clickme(practiceform);
	    Applicationutility.clickme(Elements);   	
	    }
	    public void clickondaynamicbtn() throws InterruptedException
	    {
	    	 Applicationutility.clickme(daynamicbtn);   
	    	 //Applicationutility.clickme(enablecbtn); 
	    	 Thread.sleep(5000);
	    	 boolean out=enablecbtn.isEnabled();
	    	 
	    	 System.out.println(out);
	    	
	    	
	    	 
	    }
}
