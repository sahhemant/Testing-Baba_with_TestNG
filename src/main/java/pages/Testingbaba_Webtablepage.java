package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseliabary.Baseliabary;
import excelutility.Excelutility;


public class Testingbaba_Webtablepage extends Baseliabary{

	String path="C:\\Users\\yogesh\\git\\repository\\New_Automation_Using_TestNG_Framework\\testresult\\namedata.xlsx";
	
	public Testingbaba_Webtablepage()
	{
		PageFactory.initElements(driver, this);
	}
	    @FindBy(xpath="//*[text()='×']")
	    private WebElement closebtn;
	    @FindBy(xpath=" //*[text()='Practice']")
	    private WebElement practiceform;
	
	    @FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	    private WebElement Elements;
	
	    @FindBy(xpath="//*[text()='web tables'][@onclick=\"changeText(this)\"]")
        private WebElement webtables;
	    @FindBy(xpath="//*[@id=\"tab_4\"]/div/iframe")
        private WebElement frametable;
	    @FindBy(xpath="//*[@name=\"name\"][@title=\"Must contain Alphabet only(Min 3 Letters)\"]")
	    private WebElement name;
	    @FindBy(xpath="//*[@type=\"text\"][@title=\"eg name@gmail.com\"]")
	    private WebElement email;
	    @FindBy(xpath="//*[@class=\"btn btn-success save-btn\"]")
		private WebElement save ;
	
	    @FindBy(xpath="//*[text()='Edit']")
	    private List<WebElement> Editbtn;
	    
	    @FindBy(xpath="//*[@name=\"edit_name\"]")
	    private WebElement Editname;
	    
	   @FindBy(xpath="//*[text()='Update']")
	    private WebElement Updatebtn;
	    
	    public void clickonclosebtn()
		{
			closebtn.click();
			practiceform.click();
		}
	    public void clickonElements()
		{
			Elements.click();
		}
	    
	    public void clickonwebtables() 
	    {
	    
	    	webtables.click();
	    }	 
		  public void filltable() {
		  
			  driver.switchTo().frame(frametable);
			  for(int i=1;i<=4;i++)
				{	     
				name.sendKeys(Excelutility.getreaddata(path, i, 0));		
				email.sendKeys(Excelutility.getreaddata(path,i, 1));
				save.click();			
		  }
		  }
		  public void Updatenamedetails() 
		  {
			  for(WebElement dd:Editbtn)
			  {
				 dd.click();
			  }
				 for(int i=1;i<=4;i++)
				 {
				 Editname.clear();
				 Editname.sendKeys(Excelutility.getreaddata(path, i, 2));
				//email.sendKeys(Excelutility.getreaddata(path,i, 1));
				 Updatebtn.click();			  
		  }
		  }
		  }
