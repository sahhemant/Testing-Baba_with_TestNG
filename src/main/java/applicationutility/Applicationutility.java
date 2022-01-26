package applicationutility;

import java.awt.Robot;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseliabary.Baseliabary;

public class Applicationutility extends Baseliabary {
	public static void clickme(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
	}
	public static void sendkeys(WebElement ele,String value)
	{
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(value);
	}
	public static void Doubleclick(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
	}
	
	public static void Rightclick(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();;
	}
	public static void click(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.click(ele).perform();
    }
	public static void mouseover(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	public static void changewindow(int tabno)
	{
		Set<String> dd = driver.getWindowHandles();
		ArrayList<String>tabs=new ArrayList<String>(dd);
		driver.switchTo().window(tabs.get(tabno));
	}
	
	public static void uploadfile(String path)
	{
		try
		{
			StringSelection sel=new StringSelection(path);
			Clipboard clipboard=java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(sel, null);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(150);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		catch(Exception e)
		{
			System.out.println("error in uploadfile" + e);
		}
	}
	public static String datepick()
	{
		String date;
		SimpleDateFormat df= new SimpleDateFormat("dd-MM-yyyy");
		Date db=new Date();
		date=df.format(db);
		return date;
	}
	public static String datepicktime()
	{
		String Date1;
		SimpleDateFormat df=new SimpleDateFormat("dd-mm-yyyy hh:mm");
		Date db=new Date();
		Date1=df.format(db);
		return Date1;
}
	
}
