package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baseliabary.Baseliabary;


public class Testingbaba_linkspage extends Baseliabary {
	
	
	public Testingbaba_linkspage()
	{
		PageFactory.initElements(driver, this);
	}
	
	    @FindBy(xpath="//*[text()='×']")
  	    private WebElement closebtn;
	    @FindBy(xpath=" //*[text()='Practice']")
	    private WebElement practiceform;
	    @FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
		private WebElement Elements;
	    
	    @FindBy(xpath="//*[text()='links']")
		private WebElement Links;
	    
	    @FindBy(xpath="//*[text()='Demo Page']")
	  	private WebElement domepage;
	    
	    @FindBy(xpath=" //*[@onclick=\"Created()\"]")
	  	private WebElement  Created;
	    @FindBy(xpath=" //*[@onclick=\"Content()\"]")
	  	private WebElement  NoContent;
	    @FindBy(xpath="  //*[@onclick=\"Moved()\"]")
	  	private WebElement  Moved;
	    @FindBy(xpath="  //*[@onclick=\"Request()\"]")
	  	private WebElement  BadRequest;
	    @FindBy(xpath="  //*[@onclick=\"Unauthorized()\"]")
	  	private WebElement  Unauthorized;
	    @FindBy(xpath="  //*[@onclick=\"Forbidden()\"]")
	  	private WebElement  Forbidden;
	    @FindBy(xpath="  //*[@onclick=\"Found()\"]")
	  	private WebElement   NotFound;
	    
	  
public void clickonclosebtn()
{
Applicationutility.clickme(closebtn);
Applicationutility.clickme(practiceform);
	
}
 public void clickonElements()
	{
	 Applicationutility.clickme(Elements);		
	}
 public void clickonLinks()
	{
	 Applicationutility.clickme(Links);	
	}
 public void clickonDemoPage() throws InterruptedException
	{
	 Applicationutility.clickme(domepage);
	 Thread.sleep(2000);
	 Applicationutility.changewindow(1);
	 Thread.sleep(2000);
	 driver.close();
	 Applicationutility.changewindow(0);
	}
 public void clickonAPIcall() 
	{
	 Applicationutility.clickme(Created);
	 Applicationutility.clickme(NoContent);
	 Applicationutility.clickme(Moved);	
	 Applicationutility.clickme(BadRequest);
	 Applicationutility.clickme(Unauthorized);
	 Applicationutility.clickme(Forbidden);
	 Applicationutility.clickme(NotFound);
	}
 


}
