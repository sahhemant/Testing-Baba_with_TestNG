package pages;

import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baseliabary.Baseliabary;
import propertyutility.Propertyutility;

public class Testingbaba_TextBoxpage extends Baseliabary {

	ArrayList<String> Expected=null;
	
	public Testingbaba_TextBoxpage()
	{
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath="//*[text()='×']")
    private WebElement closebtn;
    @FindBy(xpath="//*[text()='Practice']")
    private WebElement practiceform;
    
    @FindBy(xpath="//*[@data-target=\"#elements\"]")
	private WebElement Elements;
    
	@FindBy(xpath="//*[text()='text box']")
	private WebElement textbox;
	@FindBy(xpath="//*[@id=\"fullname1\"]")
	private WebElement fullname;
	@FindBy(xpath="//*[@id=\"fullemail1\"]")
	private WebElement fullemail;
	@FindBy(xpath="//*[@id=\"fulladdresh1\"]")
	private WebElement currentaddress;
	@FindBy(xpath="//*[@id=\"paddresh1\"]")
	private WebElement permanentaddress;
	@FindBy(xpath="//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")
	private WebElement submitbtn;
	
	@FindBy(xpath="//*[@class=\"col-md-6 mt-5\"]/label")
	private List<WebElement> tabledata;
		   
		public void clickonclosebtn()
		{
			closebtn.click();
			practiceform.click();
			//Applicationutility.clickme(closebtn);
			//Applicationutility.clickme(practiceform);
		}
	
	public void clickonElements() 
	{
		Elements.click();
		// Applicationutility.clickme(Elements);
	}
	public void clickonTextBox() 
	{
		textbox.click();
		 //Applicationutility.clickme(textbox);
		//textbox.click();
	}
	public void Filltaxboxdetails()
	{
		Expected=new ArrayList<String>();
		Expected.add(Propertyutility.getReadproperty("name"));
		Expected.add(Propertyutility.getReadproperty("email"));
		Expected.add(Propertyutility.getReadproperty("currentadd"));
		Expected.add(Propertyutility.getReadproperty("permanentadd"));
		
		Applicationutility.sendkeys(fullname, Propertyutility.getReadproperty("name"));
		Applicationutility.sendkeys(fullemail, Propertyutility.getReadproperty("email"));
		Applicationutility.sendkeys(currentaddress, Propertyutility.getReadproperty("currentadd"));
		Applicationutility.sendkeys(permanentaddress, Propertyutility.getReadproperty("permanentadd"));
		submitbtn.click();
		
		/*fullname.sendKeys(Propertyutility.getReadproperty("name"));
		fullemail.sendKeys(Propertyutility.getReadproperty("email"));
		currentaddress.sendKeys(Propertyutility.getReadproperty("currentadd"));
		permanentaddress.sendKeys(Propertyutility.getReadproperty("permanentadd"));
		submitbtn.click();*/
		
	}
	public void getvarifytextboxdata()
	{
		try
		{
			ArrayList<String>Actual=new ArrayList<String>();
			Actual.add(tabledata.get(1).getText());
			Actual.add(tabledata.get(3).getText());
			Actual.add(tabledata.get(5).getText());
			Actual.add(tabledata.get(7).getText());
			
			for(String dd:Expected)
			{
				for(String dd1:Actual)
				{
					AssertJUnit.assertEquals(dd, dd1);
					Actual.remove(dd1);
					break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("issue in getvarified in textdata " +e);
		}
		}
	
}