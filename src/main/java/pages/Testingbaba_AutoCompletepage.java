package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import applicationutility.Applicationutility;
import baseliabary.Baseliabary;

public class Testingbaba_AutoCompletepage extends Baseliabary {

	public Testingbaba_AutoCompletepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
    private WebElement closebtn;
    @FindBy(xpath=" //*[text()='Practice']")
    private WebElement practiceform;
    @FindBy(xpath="//*[@data-target=\"#widget\"]")
    private WebElement widgets;
    @FindBy(xpath="//*[text()='auto complete']")
    private WebElement autocompletebtn;
    @FindBy(xpath="//*[@id=\"myInput\"]")
    private WebElement clickinfill;



    
    public void clickonclosebtn()
   	{
   	Applicationutility.clickme(closebtn);
   	Applicationutility.clickme(practiceform);
   	Applicationutility.clickme(widgets);
	Applicationutility.clickme(autocompletebtn);
}
   
    	 public void clickonmouseover() throws InterruptedException 
 		{	
    		  
    		    Thread.sleep(2000);
    		    clickinfill.click();
    		    clickinfill.sendKeys("india");
    		    clickinfill.sendKeys(Keys.ARROW_DOWN);
    		    clickinfill.sendKeys(Keys.ENTER);
    		    
	    		
 		}
    	
}
