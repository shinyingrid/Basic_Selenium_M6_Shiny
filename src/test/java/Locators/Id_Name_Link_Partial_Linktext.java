package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Id_Name_Link_Partial_Linktext 
{
public static void main(String[] args) throws Throwable
	{
		// Driver related statement
				WebDriverManager.chromedriver().setup();
				//opening the chromeBrowser
				WebDriver driver = new ChromeDriver();
				//Maximize the browser
				driver.manage().window().maximize();
				//enter the url
				driver.get("https://www.facebook.com/");
				//Fetching the address of email text field and sending data
				driver.findElement(By.id("email")).sendKeys("shiny");
				//address of password
				driver.findElement(By.name("pass")).sendKeys("shinypassword");
                Thread.sleep(3000);
                //address of link using LinkText()
                driver.findElement(By.linkText("Forgotten password?")).click();
                Thread.sleep(3000);
                //address of link using partialLinkText()
                //driver.findElement(By.partialLinkText("Forgotten")).click();
                 driver.quit();
	}
}
