package pages; 

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseliabary.Baseliabary;

public class Testingbaba_Loginpage extends Baseliabary
{
	public Testingbaba_Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath="//*[text()='×']")
    private WebElement closebtn;
    @FindBy(xpath=" //*[text()='Practice']")
    private WebElement practiceform;
	public void clickonclosebtn() 
	{
		closebtn.click();
		practiceform.click();
	}
	
}
