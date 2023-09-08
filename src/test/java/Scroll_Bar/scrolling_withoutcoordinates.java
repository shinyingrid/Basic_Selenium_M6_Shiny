package Scroll_Bar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrolling_withoutcoordinates {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		//address pf career
	      WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
	      //downcasting statement
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("arguments[0].scrollIntoView();", career);
	      Thread.sleep(7000);
	      career.click();

	}

}
