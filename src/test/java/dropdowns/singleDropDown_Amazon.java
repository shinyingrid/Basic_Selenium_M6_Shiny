package dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class singleDropDown_Amazon {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		//address of dropdown
		//WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		//create an object for select class
		Select s = new Select(dropdown);
		Thread.sleep(3000);
		s.selectByIndex(4);
		Thread.sleep(3000);
		s.selectByValue("search-alias=baby");
		Thread.sleep(3000);
		s.selectByVisibleText("Electronics");
		Thread.sleep(3000);
		//checking the type of drop down
		System.out.println(s.isMultiple());
		List<WebElement> allOptions = s.getOptions();
		for (WebElement b : allOptions)
		{
			System.out.println(b.getText());
		}
	}
}
