package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baseliabary.Baseliabary;

public class Testingbaba_Progessbarpage extends Baseliabary
{
	public Testingbaba_Progessbarpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
    private WebElement closebtn;
    @FindBy(xpath=" //*[text()='Practice']")
    private WebElement practiceform;
    @FindBy(xpath="//*[@data-target=\"#widget\"]")
    private WebElement widgets;
    @FindBy(xpath="//*[text()='progress bar']")
    private WebElement progressbtn;
    @FindBy(xpath="//*[@id=\"resetButton\"]")
    private WebElement startbtn;
    @FindBy(xpath="//*[@style=\"width: 100%;\"]")
    private WebElement attribute;
    
  
    public void clickonclosebtn()
   	{
   	Applicationutility.clickme(closebtn);
   	Applicationutility.clickme(practiceform);
   	Applicationutility.clickme(widgets);	
}
    public void clickonprogressbarbtn() throws InterruptedException
   	{
    	Applicationutility.clickme(progressbtn);
    	Applicationutility.clickme(startbtn);
    	Thread.sleep(2000);
    	 String tooltipInteger=attribute.getAttribute("style");
		 System.out.println(tooltipInteger);
   	}
}
   