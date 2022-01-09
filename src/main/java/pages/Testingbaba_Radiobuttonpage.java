package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseliabary.Baseliabary;

public class Testingbaba_Radiobuttonpage extends Baseliabary {

	public Testingbaba_Radiobuttonpage ()
	{
	PageFactory.initElements(driver, this);
    }
	@FindBy(xpath="//*[text()='×']")
    private WebElement closebtn;
    @FindBy(xpath=" //*[text()='Practice']")
    private WebElement practiceform;
    @FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement Elements;
    @FindBy(xpath="//*[text()='radio buttons']")
	private WebElement Radiobtn;
    @FindBy(xpath="//*[@id=\"no\"]")
	private WebElement no;
    
    public void clickonclosebtn()
	{
		closebtn.click();
		practiceform.click();
	}
	 public void clickonElements()
		{
			Elements.click();
		}

public void clickonRadiobutton() 
{
	Radiobtn.click();
}
public void clickonnobutton() 
{
	no.click();
}
}