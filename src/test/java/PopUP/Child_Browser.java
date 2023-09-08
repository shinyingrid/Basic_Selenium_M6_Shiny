package PopUP;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Browser {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/");
		Thread.sleep(3000);
		String parent = driver.getWindowHandle(); //parent window
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		//Shifting control to the child browser
		Set<String> child = driver.getWindowHandles();
		//return type is Set<String> for child bcoz is dependent on parent 
		for (String b:child)//storing child window in variable b
		{
			driver.switchTo().window(b); //switching to child window 
		}
		driver.findElement(By.xpath("//input[@placeholder='Enter name to continue']")).sendKeys("Shiny");
		//just entering name and not clicking
		Thread.sleep(3000);
		//Shifting control to parent window
		driver.switchTo().window(parent);
		//selecting catergories
		driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
	}

}
