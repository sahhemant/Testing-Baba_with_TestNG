package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baseliabary.Baseliabary;

public class Testingbaba_Uploadfilepage extends Baseliabary {

	String path="C:\\Users\\yogesh\\git\\repository\\New_Automation_Using_TestNG_Framework\\testdata\\bora.pdf";
	public Testingbaba_Uploadfilepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement closebtn;
    @FindBy(xpath=" //*[text()='Practice']")
    private WebElement practiceform;
    @FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement Elements;
    
    @FindBy(xpath=" //*[text()='upload and download']")
	private WebElement Uploaddownload;
    
    @FindBy(xpath="//*[text()='Select a file']")
   	private WebElement uploadfile;
 
    
    
    public void clickonclosebtn()
    {
    Applicationutility.clickme(closebtn);
    Applicationutility.clickme(practiceform);   	
    }
     public void clickonElements()
     {    
    	 Applicationutility.clickme(Elements);		
    	}

     public void clickonUploaddownload()
     {
    	 Applicationutility.clickme(Uploaddownload);		
    	}
    

     public void clickonuploadfile() throws InterruptedException
     {
    	 Applicationutility.clickme(uploadfile);
    	 Thread.sleep(2000);
    	 Applicationutility.uploadfile(path);
    	}
    
    
    
}
