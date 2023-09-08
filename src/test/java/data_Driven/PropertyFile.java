package data_Driven;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import okio.Timeout;

public class PropertyFile {

	public static void main(String[] args) throws IOException 
	{
		// create an object for properties class-available in java util package
		Properties prop = new Properties();
		
		//create an object for FileInputStream - available in java IO package
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties"); //error - need to add argment
		//add throws exception
		//(. - indicates inside our package)
		prop.load(fis);
		String appUrl = prop.getProperty("url"); //inside arg pass any string from the data file
		String User  = prop.getProperty("username");
		String password  = prop.getProperty("password");
		
		WebDriverManager.edgedriver().setup();
		//Opening chrome browser
		WebDriver driver = new EdgeDriver();
		//maximize
		driver.manage().window().maximize();
		//implicit statement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(appUrl);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(User);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	} 

}
