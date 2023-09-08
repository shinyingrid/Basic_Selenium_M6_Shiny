package Screenshot_Program;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotProgram 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		//downcasting
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/amazon.png");
		//function to copy from the source and paste in destination
		FileUtils.copyFile(src, dest);
	//after execution refresh the project to find the ScreenShots folder
	/*when you execute the program again with the same name, then the screenshot gets replaced. If you change the name another image will be created
		separately in the folder. change of folder name will create a new folder */
	}

}
