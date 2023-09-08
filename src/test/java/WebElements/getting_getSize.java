package WebElements;
import java.awt.Dimension;
//import org.openqa.selenium.Dimension;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class getting_getSize 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.id("email"));
		org.openqa.selenium.Dimension size = ele.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
	}
	
	
}
