package WebElements;

import java.awt.Button;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verification_Enabled {

	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("soorya@gmail.com");
		//(By.id("email"))
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("password");
		WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
		if(button.isEnabled())
		{
			System.out.println("It is enabled");
			button.click();
		}
		else
		{
			System.out.println("Not enabled");
		}
	}

}
