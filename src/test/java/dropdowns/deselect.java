package dropdowns;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import com.fasterxml.jackson.annotation.OptBoolean;

import io.github.bonigarcia.wdm.WebDriverManager;

public class deselect {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		WebElement box = driver.findElement(By.id("multiselect1"));
		Select s = new Select(box);
		s.selectByVisibleText("Volvo");
		s.selectByVisibleText("Swift");
		s.selectByVisibleText("Hyundai");
		s.selectByVisibleText("Audi");
		Thread.sleep(3000);
		List<WebElement> options = s.getAllSelectedOptions();
		for(WebElement b:options)
		{
		System.out.println(b.getText());
		}
		
		
		System.out.println("---------------------");
		
		s.deselectByVisibleText("Audi");
		List<WebElement> newOptions = s.getAllSelectedOptions();
		for(WebElement c:newOptions)
		{
			System.out.println(c.getText());
		}
	}

}
