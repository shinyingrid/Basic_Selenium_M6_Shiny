package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Assertion 
{
	@Test
	public void assertions() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		//Using Hard Assert
		//Assert.assertEquals(title, "shiny");
		//soft assert
		SoftAssert s = new SoftAssert();
		s.assertEquals(title, "Ingrid");
		System.out.println(driver.getCurrentUrl());
	}
}
