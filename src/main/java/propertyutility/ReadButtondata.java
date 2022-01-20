package propertyutility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadButtondata {

	static String path="C:\\Users\\yogesh\\git\\TestingBaba_Testng\\New_Automation_Using_TestNG_Framework\\testdata\\button.properties";
	public static String getReadproperty(String key)
	{
		String value="";
		try 
		{
		FileInputStream	 fis =new FileInputStream(path);
		Properties pro=new Properties();
		pro.load(fis);
		value=pro.getProperty(key);
		}
		catch(Exception e)
		{
			System.out.println("issue in get read property " + e);
		}
		return value;
	}
}