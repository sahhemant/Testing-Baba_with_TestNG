package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baseliabary.Baseliabary;

public class Testingbaba_browserwindowpage extends Baseliabary {

	public Testingbaba_browserwindowpage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[text()='×']")
    private WebElement closebtn;
    @FindBy(xpath=" //*[text()='Practice']")
    private WebElement practiceform;
    @FindBy(xpath="(//*[@id=\"headingOne\"]/h2/button)[1]")
    private WebElement alartframewindowbtn;
    @FindBy(xpath="//*[text()='browser windows']")
    private WebElement browserwindowbtn;
    @FindBy(xpath="//*[@id=\"tab_11\"]/div[1]/a")
    private WebElement newtabbtn;
    @FindBy(xpath="//*[@id=\"tab_11\"]/div[2]/a")
    private WebElement newwindowbtn;
    @FindBy(xpath="//*[@id=\"tab_11\"]/div[3]/a")
    private WebElement newwindowmsgbtn;
    
    public void clickonclosebtn()
	{
	Applicationutility.clickme(closebtn);
	Applicationutility.clickme(practiceform);		
	}
	 public void clickonalartframewindowbtn()
		{
		 Applicationutility.clickme(alartframewindowbtn);		
		}
	 public void clickonbrowserwindowbtnbtn() throws InterruptedException 
		{
		 Applicationutility.clickme(browserwindowbtn);
		 Applicationutility.clickme(newtabbtn);	
		 Applicationutility.changewindow(1);
		 Thread.sleep(2000);
		 driver.close();
		 Applicationutility.changewindow(0);
		 Applicationutility.clickme(newwindowbtn);
		 Applicationutility.changewindow(1);
		 Thread.sleep(2000);
		 driver.close();
		 Applicationutility.changewindow(0);
		 Applicationutility.clickme(newwindowmsgbtn);
		 Applicationutility.changewindow(1);
		 Thread.sleep(2000);
		 driver.close();
		 Applicationutility.changewindow(0);
		}

}
