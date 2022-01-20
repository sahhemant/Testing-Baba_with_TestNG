package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baseliabary.Baseliabary;

public class Testingbaba_Widgetspage extends Baseliabary {

	public Testingbaba_Widgetspage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
    private WebElement closebtn;
    @FindBy(xpath=" //*[text()='Practice']")
    private WebElement practiceform;
    @FindBy(xpath="//*[@data-target=\"#widget\"]")
    private WebElement widgets;
    @FindBy(xpath="//*[text()='accordion']")
    private WebElement accordionbtn;
    @FindBy(xpath="//*[@id=\"collapse1\"]/div")
    private WebElement firsttext;
    @FindBy(xpath="//*[@id=\"accordion2\"]/div[2]/div[1]/h2/button")
    private WebElement secondbtn;
    @FindBy(xpath="//*[@id=\"collapse2\"]/div")
    private WebElement secondtext;
    @FindBy(xpath="//*[@id=\"accordion2\"]/div[3]/div[1]/h2/button")
    private WebElement thirdbtn;
    @FindBy(xpath="//*[@id=\"collapse3\"]/div")
    private WebElement thirdtext;
    
    
    public void clickonclosebtn()
   	{
   	Applicationutility.clickme(closebtn);
   	Applicationutility.clickme(practiceform);
}
    public void clickonwidgetsbtn()
    {
    	Applicationutility.clickme(widgets);
    	Applicationutility.clickme(accordionbtn);
    	String data1=firsttext.getText();
    	System.out.println(data1);
    	Applicationutility.clickme(secondbtn);
    	String data2=secondtext.getText();
    	System.out.println(data2);
    	Applicationutility.clickme(thirdbtn);
    	String data3=thirdtext.getText();
    	System.out.println(data3);
    	
    }
}
