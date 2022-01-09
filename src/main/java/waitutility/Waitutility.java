package waitutility;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseliabary.Baseliabary;

public class Waitutility extends Baseliabary {

	public static void alertispresent(int time)
	{
		WebDriverWait wait= new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.alertIsPresent());
	}
}
