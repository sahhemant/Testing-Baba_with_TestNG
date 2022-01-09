package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baseliabary.Baseliabary;
import waitutility.Waitutility;

public class Testingbaba_alartpage extends Baseliabary {

	public Testingbaba_alartpage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[text()='×']")
    private WebElement closebtn;
    @FindBy(xpath=" //*[text()='Practice']")
    private WebElement practiceform;
    @FindBy(xpath="(//*[@id=\"headingOne\"]/h2/button)[1]")
    private WebElement alartframewindowbtn;
    @FindBy(xpath=" //*[text()='alerts']")
    private WebElement alartbtn;
    @FindBy(xpath="//*[@id=\"tab_12\"]/div[1]/div[2]/button")
    private WebElement clickmebtn;
    @FindBy(xpath="//*[@id=\"tab_12\"]/div[2]/div[2]/button")
    private WebElement clickmebtn2;
    @FindBy(xpath="//*[@id=\"tab_12\"]/div[3]/div[2]/button")
    private WebElement clickmebtn3;
    @FindBy(xpath="//*[@id=\"tab_12\"]/div[4]/div[2]/button")
    private WebElement clickmebtn4;
 
    public void clickonclosebtn()
	{
	Applicationutility.clickme(closebtn);
	Applicationutility.clickme(practiceform);
		
	}
	 public void clickonalartframewindowbtn()
		{
		 Applicationutility.clickme(alartframewindowbtn);		
		}
	 public void clickonalartbtn()
		{
		 Applicationutility.clickme(alartbtn);		
		}
	 public void clickonclickmebtn()
	 {
		 Applicationutility.clickme(clickmebtn);
		 String data=driver.switchTo().alert().getText();
		 System.out.println(data);
		 driver.switchTo().alert().accept();
	 }
	 public void clickonclickmebtn2()
	 {
		 Applicationutility.clickme(clickmebtn2);
		 Waitutility.alertispresent(5);
		 String data=driver.switchTo().alert().getText();
		 System.out.println(data);
		 driver.switchTo().alert().accept();
	 }
	 public void clickonclickmebtn3()
	 {
		 Applicationutility.clickme(clickmebtn3);
		 String data=driver.switchTo().alert().getText();
		 System.out.println(data);
		 driver.switchTo().alert().dismiss();
	 }
	 public void clickonclickmebtn4()
	 {
		 Applicationutility.clickme(clickmebtn4);
		 String data=driver.switchTo().alert().getText();
		 System.out.println(data);
		 driver.switchTo().alert().sendKeys("hemant sah");
		 driver.switchTo().alert().accept();

	 }
	
}
