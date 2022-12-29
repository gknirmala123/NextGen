package Web.BaseClass;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
		
		public BaseClass() {
			// TODO Auto-generated constructor stub
			try 
			{
				prop=new Properties();
				FileInputStream ip=new FileInputStream("./config/configs.properties");
				prop.load(ip);
				ip.close();
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		public void initialization()
		{
			String browsername= prop.getProperty("Browser");
			if(browsername.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","./WebDriver/chromedriver.exe");
				driver=new ChromeDriver();
				System.out.println("Browser is matched");
							
			}
			else
			   System.out.println("Browser not matched");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("URL"));
			System.out.println("The browser open is as"+" "+driver.getClass());
		}
		public void TearDown() 
		{
			driver.close();
		}
}
