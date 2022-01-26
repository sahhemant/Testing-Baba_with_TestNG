package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baseliabary.Baseliabary;

public class Testingbaba_DatePickerpage extends Baseliabary 
{
	public Testingbaba_DatePickerpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
    private WebElement closebtn;
    @FindBy(xpath=" //*[text()='Practice']")
    private WebElement practiceform;
    @FindBy(xpath="//*[@data-target=\"#widget\"]")
    private WebElement widgets;
    @FindBy(xpath="//*[text()='date picker']")
    private WebElement datepickerbtn;
    @FindBy(xpath="//*[@id=\"datePickerContainer\"]/div[1]/div[2]/input")
    private WebElement date;
    @FindBy(xpath="//*[@id=\"datePickerContainer\"]/div[2]/div[2]/input")
    private WebElement datetime;
    
    
    public void clickonclosebtn()
   	{
   	Applicationutility.clickme(closebtn);
   	Applicationutility.clickme(practiceform);
   	Applicationutility.clickme(widgets);
	Applicationutility.clickme(datepickerbtn);
    }
    public void date()
    {
    	Applicationutility.clickme(date);
    	date.sendKeys(Keys.ARROW_LEFT);
    	date.sendKeys(Keys.ARROW_LEFT);
    	date.sendKeys(Applicationutility.datepick());
    	datetime.sendKeys(Applicationutility.datepicktime());
    }
    
}
