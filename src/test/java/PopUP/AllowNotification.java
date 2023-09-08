package PopUP;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AllowNotification {
	
	public static void main(String[] args) throws Throwable
	{
		HashMap<String, Integer> contentStrings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		
		contentStrings.put("notifications", 0);
		//0-close option , 1 - allow, 2-dismiss according to the order of placement
		profile.put("managed_default_content_settings", contentStrings);
		prefs.put("profile", profile);
		
		//Handling notification popup in Edge Browser
		EdgeOptions options = new EdgeOptions(); //EdgeOptions is a default class
		options.setCapability("preferences", prefs); //In EdgeOptions class we use setCapability method
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.quikr.com/");
		
	}

}
