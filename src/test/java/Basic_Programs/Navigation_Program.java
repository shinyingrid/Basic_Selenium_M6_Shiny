package Basic_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_Program {

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
		Thread.sleep(3000);
		//navigate to a different page from the current one
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		//navigate to back page
		driver.navigate().back();
		Thread.sleep(3000);
		//navigate to forward page
		driver.navigate().forward();
		Thread.sleep(3000);
		//to refresh the page
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
	}

}
