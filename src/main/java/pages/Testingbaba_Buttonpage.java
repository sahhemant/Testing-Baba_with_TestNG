package pages;

import java.util.ArrayList;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baseliabary.Baseliabary;
import propertyutility.ReadButtondata;

public class Testingbaba_Buttonpage extends Baseliabary {

	ArrayList<String> Expected=null;
	public Testingbaba_Buttonpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
    private WebElement closebtn;
    @FindBy(xpath=" //*[text()='Practice']")
    private WebElement practiceform;
    @FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement Elements;
    @FindBy(xpath="//*[text()='buttons'][@onclick=\"changeText(this)\"]")
    private WebElement Buttons;
    
    @FindBy(xpath="//*[@id=\"tab_5\"]/div[1]/button")
    private WebElement Doubleclick;
    
    @FindBy(xpath="//*[@id=\"noContextMenu\"]")
    private WebElement rightclick;
    
    @FindBy(xpath=" //*[@id=\"tab_5\"]/div[3]/button")
    private WebElement ClickMe;
 
    @FindBy(xpath=" //*[@id=\"double-content\"]")
    private WebElement doubleclickText;
    
    @FindBy(xpath="//*[@id=\"right-content\"]")
    private WebElement rightclickText;

    @FindBy(xpath="//*[@id=\"click-content\"]")
    private WebElement onclickText;
    
    
    
public void clickonclosebtn()
	{
	Applicationutility.clickme(closebtn);
	Applicationutility.clickme(practiceform);
		//closebtn.click();
		//practiceform.click();
	}
	 public void clickonElements()
		{
		 Applicationutility.clickme(Elements);
			//Elements.click();
		}
	 public void clickonButtons() 
		{
		 Buttons.click();
		}
	 public void clickonDoubleclick() 
		{	
		 Applicationutility.Doubleclick(Doubleclick);
		}
	 public void clickonRightclick() 
		{	
		 Applicationutility.Rightclick(rightclick);
		}
	 public void clickonclick() 
		{	
		 Applicationutility.click(ClickMe);
		} 
	 public void readbuttonboxdata()
		{
		Expected=new ArrayList<String>();
		Expected.add(ReadButtondata.getReadproperty("doubleclick"));
		Expected.add(ReadButtondata.getReadproperty("rightclick"));
		Expected.add(ReadButtondata.getReadproperty("dynamicclick"));
		}
	 
	 public void getverifybuttondata()
	 {
		 try
		 {
		 ArrayList<String> Actual=new ArrayList<String>();
		 Actual.add(doubleclickText.getText());
		 Actual.add(rightclickText.getText());
		 Actual.add(onclickText.getText());	
		 
		 for(String dd:Expected)
			{
				for(String dd1:Actual)
				{
					Assert.assertEquals(dd, dd1);
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
