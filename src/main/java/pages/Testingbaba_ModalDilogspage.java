package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baseliabary.Baseliabary;

public class Testingbaba_ModalDilogspage extends Baseliabary {

	public Testingbaba_ModalDilogspage()
	   {
		   PageFactory.initElements(driver, this);
	   }
	   @FindBy(xpath="//*[text()='×']")
	   private WebElement closebtn;
	   @FindBy(xpath=" //*[text()='Practice']")
	   private WebElement practiceform;
	   @FindBy(xpath="(//*[@id=\"headingOne\"]/h2/button)[1]")
	   private WebElement alartframewindowbtn;
	   @FindBy(xpath="//*[text()='modal dialogs']")
	   private WebElement modeldilogsbtn;
	   @FindBy(xpath="//*[@id=\"tab_15\"]/div/button[1]")
	   private WebElement smallmodelbtn;
	   @FindBy(xpath="//*[@id=\"exampleModal1\"]/div/div/div[2]")
	   private WebElement smallmodelbtntext;
	   @FindBy(xpath="//*[@id=\"exampleModal1\"]/div/div/div[3]/button")
	   private WebElement smallmodelclosebtn;
	 
	   
	   @FindBy(xpath="//*[@id=\"tab_15\"]/div/button[2]")
	   private WebElement largemodelbtn;
	   @FindBy(xpath="//*[@id=\"exampleModal2\"]/div/div/div[2]")
	   private WebElement largemodelbtntext;
	   @FindBy(xpath="//*[@id=\"exampleModal2\"]/div/div/div[3]/button")
	   private WebElement largemodelclosebtn;
	   
	   public void clickonclosebtn()
	  	{
	  	Applicationutility.clickme(closebtn);
	  	Applicationutility.clickme(practiceform);
	  	}
	   public void clickonalartframewindowbtn()
		{
		 Applicationutility.clickme(alartframewindowbtn);		
		}
	   public void clickonmodeldilogsbtnbtn()
		{
		 Applicationutility.clickme(modeldilogsbtn);		
		}
	   public void clickonsmallmodelbtn()
		{
		 Applicationutility.clickme(smallmodelbtn);	
		 String data=driver.switchTo().alert().getText();
		 System.out.println(data);
		 driver.switchTo().alert().dismiss();
		}
		
	   public void clickonlargemodelbtnbtn()
		{
		   Applicationutility.clickme(largemodelbtn);	
			 largemodelclosebtn.click();
		}
		
}
