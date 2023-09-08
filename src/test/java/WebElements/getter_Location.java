package WebElements;
import org.openqa.selenium.Point;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class getter_Location {
	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//address of email text field
		WebElement ele = driver.findElement(By.id("email"));
		Point coOrdinates = ele.getLocation();
		System.out.println(coOrdinates.getX());
		System.out.println(coOrdinates.getY());
	} //co-ordinates get printed in the o/p console
}
