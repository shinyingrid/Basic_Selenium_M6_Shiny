package Pom_Practice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import POM.Fb_LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Fb_LoginPage fbLogin = new Fb_LoginPage(driver);
		//Whenever we create an object for the POM class, we need to pass the driver in the argument
		fbLogin.emailTextField("shinyingrid@gmail.com");
		fbLogin.passwordTextField("password");
		fbLogin.loginButton();
	}
}
