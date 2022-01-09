package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baseliabary.Baseliabary;

public class Testingbaba_Framepage extends Baseliabary{
 public Testingbaba_Framepage()
 {
	 PageFactory.initElements(driver, this);
 }
 @FindBy(xpath="//*[text()='×']")
 private WebElement closebtn;
 @FindBy(xpath=" //*[text()='Practice']")
 private WebElement practiceform;
 @FindBy(xpath="(//*[@id=\"headingOne\"]/h2/button)[1]")
 private WebElement alartframewindowbtn;
 @FindBy(xpath="//*[text()=\"frames\"]")
 private WebElement frame;
 @FindBy(xpath="//*[@id=\"tab_13\"]/iframe[1]")
 private WebElement longframe;
 @FindBy(xpath="//*[text()='This is a sample page']")
 private WebElement longframetext;
 @FindBy(xpath="//*[@id=\"tab_13\"]/iframe[2]")
 private WebElement smallframe;
 @FindBy(xpath="//*[text()='This is a sample page']")
 private WebElement smallframetext;
 
 public void clickonclosebtn()
	{
	Applicationutility.clickme(closebtn);
	Applicationutility.clickme(practiceform);
		
	}
	 public void clickonalartframewindowbtn()
		{
		 Applicationutility.clickme(alartframewindowbtn);		
		}
	 public void clickonframebtn()
		{
		 Applicationutility.clickme(frame);		
		}
	 public void longframe()
		{
		 driver.switchTo().frame(longframe)	;
		 System.out.println(longframetext.getText());
		 driver.switchTo().defaultContent();
		}
	 public void smallframe()
		{
		 driver.switchTo().frame(smallframe)	;
		 System.out.println(smallframetext.getText());
		 driver.switchTo().defaultContent();
		}
}
