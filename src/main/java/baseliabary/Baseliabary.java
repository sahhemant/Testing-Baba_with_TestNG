package baseliabary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import screenshorts_utility.Screenshort_Utility;

public class Baseliabary {
    
	public static WebDriver driver;
	public void getlaunch(String url)
	{
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogesh\\git\\TestingBaba_Testng\\New_Automation_Using_TestNG_Framework\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	 @AfterTest 
	 public void teardown()  
	  {
		 driver.quit();
		  }
	 
	@AfterMethod
		public void resultanalysis(ITestResult result)
		{
			String methodname = result.getMethod().getMethodName();
			if(result.isSuccess())
			{
				Screenshort_Utility.getscreentshot(methodname, "passed");
			}
			else if(result.getStatus()==ITestResult.FAILURE)
			{
				Screenshort_Utility.getscreentshot(methodname, "failed");
			}
			else if(result.getStatus()==ITestResult.SKIP)
			{
				Screenshort_Utility.getscreentshot(methodname, "Skip");
			}
		}
		
}