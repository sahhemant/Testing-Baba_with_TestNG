package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baseliabary.Baseliabary;

public class Testingbaba_NestedFramepage extends Baseliabary 
{
   public Testingbaba_NestedFramepage()
   {
	   PageFactory.initElements(driver, this);
   }
   @FindBy(xpath="//*[text()='×']")
   private WebElement closebtn;
   @FindBy(xpath=" //*[text()='Practice']")
   private WebElement practiceform;
   @FindBy(xpath="(//*[@id=\"headingOne\"]/h2/button)[1]")
   private WebElement alartframewindowbtn;
   @FindBy(xpath="//*[text()='nested frames']")
   private WebElement nestedframe;
   @FindBy(xpath="//*[@id=\"tab_14\"]/iframe")
   private WebElement ppframe;
   @FindBy(xpath="//*[@src=\"text.html\"]")
   private WebElement parentframe; 
   @FindBy(xpath="//*[text()='Parent']")
   private WebElement parenttext; 
   @FindBy(xpath="//*[@src=\"example.html\"]")
   private WebElement childframe;
   @FindBy(xpath="//*[text()='Child']")
   private WebElement childtext; 
   @FindBy(xpath="//*[text()='Click Here']")
   private WebElement childlink;
   
 
   
   public void clickonclosebtn()
  	{
  	Applicationutility.clickme(closebtn);
  	Applicationutility.clickme(practiceform);
  	}
   public void clickonalartframewindowbtn()
	{
	 Applicationutility.clickme(alartframewindowbtn);		
	}
   public void clickonnestedframe()
 	{
 	Applicationutility.clickme(nestedframe);
}
   public void ppframe()
   {
	   driver.switchTo().frame(ppframe);
	   driver.switchTo().frame(parentframe);
	   System.out.println(parenttext.getText());
	   driver.switchTo().frame(childframe);
	   System.out.println(childtext.getText());
	   childlink.click();
	   driver.switchTo().defaultContent();
   }
}