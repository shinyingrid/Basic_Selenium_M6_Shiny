package TestNG_Distribution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_CrossBrowser

{
	@Parameters({"browsername"})
	@Test
	public void crossBrowser(String browser) throws Throwable
	{
		WebDriver driver;
		//declaring globally
		
		
		if(browser.equals("edge"))
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
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.close();
	}
}
