package Explanation_GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import genericLibraries.WebDriverUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {

	public static void main(String[] args) 
	{
		WebDriverUtilities utilities = new WebDriverUtilities();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//Called methods from WebDriverUtilities class - generic methods
		utilities.implicitWaitMethod(driver, 10);
		driver.get("https://www.amazon.in/");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']")); 
		utilities.dropDown(dropDown, "Baby");;
	}
}
