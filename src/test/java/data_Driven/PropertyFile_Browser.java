package data_Driven;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile_Browser {

	public static void main(String[] args) throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		prop.load(fis);
		String appUrl = prop.getProperty("url"); 
		String User  = prop.getProperty("username");
		String password  = prop.getProperty("password");
		Object Browser = prop.getProperty("browser");
		
		
		WebDriver driver;
		//declaring in common coz it is needed in if and else blocks
		
		if(Browser.equals("edge"))
		{
		WebDriverManager.edgedriver().setup();
	     driver = new EdgeDriver();
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); 
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(appUrl);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(User);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	
	}

}
