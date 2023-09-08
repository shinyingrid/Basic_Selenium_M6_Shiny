package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import POM.AddToCartPage;
import POM.skillraryPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class skillraryDemo_Encapsulation {

	public static void main(String[] args) throws Throwable 
	{
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		skillraryPage homPage = new skillraryPage(driver);
		//Actions actions = new Actions(homPage);		
		AddToCartPage cartPage = new AddToCartPage(driver);
		cartPage.addingOption();
		cartPage.addToCartOption();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

}
