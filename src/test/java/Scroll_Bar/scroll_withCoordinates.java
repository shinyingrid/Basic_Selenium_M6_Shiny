package Scroll_Bar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Coordinates;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll_withCoordinates {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		//address of career
	      WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
	      Point CoOrdinates = career.getLocation();
	      int x = CoOrdinates.getX();
	      int y = CoOrdinates.getY();
	      /* If we need to print the co-ordinates
	      System.out.println(x);
	      System.out.println(y);
	      */
	      //downcasting statement
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("window.scrollBy(" + x + "," + y + ")");
	      Thread.sleep(3000);
	      js.executeScript("arguments[0].click();", career);
	      Thread.sleep(7000);
	      //career.click();

	}

}
