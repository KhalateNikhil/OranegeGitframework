package BaseLayer;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    protected static Properties prop;
    protected static WebDriver driver;
	
	public BaseClass()
	{
		try {
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//ConfigurationLayer//hrm.properties");
		     
			 prop= new Properties();
		prop.load(fis);
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public static void initialization()
	{
		//System.setProperty("webdriver.chrome.driver", "path of chrome driver");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.manage().deleteAllCookies();
		 
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
}
