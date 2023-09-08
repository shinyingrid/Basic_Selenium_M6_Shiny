package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification_IsSelected {

	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement radiobtn = driver.findElement(By.xpath("//label[text()='Female']"));
		radiobtn.click();
		if (radiobtn.isSelected())
		{
			System.out.println("Pass");
		}
		else //O/P is giving false instead of true due to some issue in isSelected() - Selenium internal binding issue 
		{
			System.out.println("Fail");
		}
		driver.close();

	}

}
