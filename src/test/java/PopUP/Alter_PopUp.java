package PopUP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alter_PopUp {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training/");
		Thread.sleep(3000);
		//address of add to cart
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		//Shifting the control to pop-up
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(3000);
		al.accept();
		//al.dismiss();
	}

}
