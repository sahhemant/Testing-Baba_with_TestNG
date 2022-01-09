package screenshorts_utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import baseliabary.Baseliabary;

public class Screenshort_Utility extends Baseliabary {

	public static void getscreentshot(String filename,String foldername)
	{
		try {
		String location=System.getProperty("user.dir");
		String path=location+"\\screenshots\\"+foldername+"\\"+filename+".png";
		EventFiringWebDriver ef = new EventFiringWebDriver(driver);
	    File src=	ef.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File(path));
		}
		catch(Exception ex)
		{
			System.out.println("issued in screenshoot"+ex);
		}
		
		
	}
}