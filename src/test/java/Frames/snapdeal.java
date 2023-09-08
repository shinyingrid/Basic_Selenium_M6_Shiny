package Frames;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.asn1.ess.SigningCertificate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapdeal {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(3000);
		//address of signIn
		WebElement SignIn = driver.findElement(By.xpath("(//span[text()='Sign In'])"));
		//Object for Action Class
		Actions a = new Actions(driver);
		a.moveToElement(SignIn).perform();
		//address of Register
		driver.findElement(By.xpath("//span[text()='Register'])[1]")).click();
		//switching the control to frame
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.xpath("input[@placeholder='Mobile Number/ Email']")).sendKeys("123");
		Thread.sleep(3000);
		//Clicking on Cancel
		driver.findElement(By.xpath("//div[@id='close-pop']")).click();
		//Shifting control to normal web page
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("hello");
	}

}
