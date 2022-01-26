package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baseliabary.Baseliabary;

public class Testingbaba_Tooltippage extends Baseliabary 
{
	public Testingbaba_Tooltippage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
    private WebElement closebtn;
    @FindBy(xpath=" //*[text()='Practice']")
    private WebElement practiceform;
    @FindBy(xpath="//*[@data-target=\"#widget\"]")
    private WebElement widgets;
    @FindBy(xpath="//*[text()='tool tips']")
    private WebElement tooltipbtn;
    @FindBy(xpath="//*[@id=\"tab_22\"]/button")
    private WebElement overmetosee;
    
    public void clickonclosebtn()
   	{
   	Applicationutility.clickme(closebtn);
   	Applicationutility.clickme(practiceform);
   	Applicationutility.clickme(widgets);	
}
   
    	 public void clickontooltip() 
 		{	
    		 Applicationutility.clickme(tooltipbtn);
    		 Applicationutility.mouseover(overmetosee);
    		 String tooltipString=overmetosee.getAttribute("title");
    		 System.out.println(tooltipString);
 		}
}