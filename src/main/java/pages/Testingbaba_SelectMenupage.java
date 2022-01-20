package pages;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import applicationutility.Applicationutility;
import baseliabary.Baseliabary;

public class Testingbaba_SelectMenupage extends Baseliabary {

	public Testingbaba_SelectMenupage()
	{
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
    private WebElement closebtn;
    @FindBy(xpath=" //*[text()='Practice']")
    private WebElement practiceform;
    @FindBy(xpath="//*[@data-target=\"#widget\"]")
    private WebElement widgets;
    @FindBy(xpath="//*[text()='select menu']")
    private WebElement selectmenubtn;
    @FindBy(xpath="//*[@id=\"tab_24\"]/form/div/div[1]/select")
    private WebElement selectvaluebtn;
    @FindBy(xpath="//*[@id=\"tab_24\"]/form/div/div[2]/select")
    private WebElement selectonebtn;
    @FindBy(xpath="//*[@id=\"tab_24\"]/form/div/div[3]/div/select")
    private WebElement oldstylebtn;
    @FindBy(xpath="//*[@id=\"tab_24\"]/form/div/div[5]/div/select")
    private WebElement multiselectbtn;
    
    
    public void clickonclosebtn()
   	{
   	Applicationutility.clickme(closebtn);
   	Applicationutility.clickme(practiceform);
   	Applicationutility.clickme(widgets);
	Applicationutility.clickme(selectmenubtn);
    }
    public void clickonselectvalue() 
    {
    	try
    	{
    		
    		Applicationutility.clickme(selectvaluebtn);
    		Robot robot= new Robot();
    		Select sel= new Select(selectvaluebtn);
    		List<WebElement> dd = sel.getOptions();
    		robot.keyPress(KeyEvent.VK_CONTROL);
			dd.get(2).click();
			robot.keyRelease(KeyEvent.VK_CONTROL);	
    	}
    	 catch (Exception e)
		{
	
			System.out.println("issue in selectvalue "+e);
		}
    }
    	 public void clickonselectone() 
    	    {
    	    	try
    	    	{
    	    		Robot robot= new Robot();
    	    		Applicationutility.clickme(selectonebtn);
    	    		Select sel= new Select(selectonebtn);
    	    		List<WebElement> dd = sel.getOptions();
    	    		robot.keyPress(KeyEvent.VK_CONTROL);
    				dd.get(3).click();
    				robot.keyRelease(KeyEvent.VK_CONTROL);	
    	    	}
    	    	 catch (Exception e)
    			{
    		
    				System.out.println("issue in selectone "+e);
    			}
    	    }
    	    	public void clickonstyleselectmenubtn() 
        	    {
        	    	try
        	    	{	   
		    Robot robot= new Robot();
		    oldstylebtn.click();
			Select sel= new Select(oldstylebtn);
			List<WebElement> dd = sel.getOptions();
			robot.keyPress(KeyEvent.VK_CONTROL);
			dd.get(1).click();
			robot.keyRelease(KeyEvent.VK_CONTROL);
    }
        	catch (Exception e)
        			{
        		
        				System.out.println("issue in styleselectmenu "+e);
        			}
        	    }
    public void multiselect()
	{
		try {
			
			Robot robot= new Robot();
			multiselectbtn.click();
			Select sel= new Select(multiselectbtn);
			List<WebElement> dd = sel.getOptions();
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			dd.get(1).click();
			dd.get(0).click();
			
			dd.get(2).click();
			robot.keyRelease(KeyEvent.VK_CONTROL);
		
		} 
		catch (Exception e)
		{
	
			System.out.println("issue in Getmultidropdown "+e);
		}
	}
}