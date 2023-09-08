package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider 
{
	@org.testng.annotations.DataProvider
	
	public Object[][] getData()
	{
		Object[][] a = new Object[3][2];
		a[0][0] = "abcdef";
		a[0][1]= "123456";
		
		a[1][0] ="112233";
		a[1][1]= "abcdabcd";
		
		a[2][0]="shiny";
		a[2][1]="54321";
		
		return a;
	}
	@Test(dataProvider = "getData")
	public void demo(String username,String pwd) throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(3000);
		
		driver.findElement(By.name("login")).click();
		driver.close();
	}
}
