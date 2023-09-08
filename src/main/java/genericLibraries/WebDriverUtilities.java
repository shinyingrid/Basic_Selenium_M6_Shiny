package genericLibraries;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
		//generic method to mouseover
		public void mouseOvering(WebDriver driver,WebElement ele) 
		{
			Actions a = new Actions(driver);
			a.moveToElement(ele).perform();
		}
	
		//generic method rightclick
		public void rightClick(WebDriver driver,WebElement ele)
		{
			Actions a = new Actions(driver);
			a.contextClick(ele).perform();
		}
	
	    //generic method doubleclick
		public void doubleClick(WebDriver driver,WebElement ele)
		{
			Actions a = new Actions(driver);
			a.doubleClick(ele).perform();
		}
		
		//generic method dragAndDrop
		public void dragAndDrop(WebDriver driver,WebElement ele1,WebElement ele2)
		{
			Actions a = new Actions(driver);
			a.dragAndDrop(ele1,ele2).perform();
		}
			
		//generic method dropdown
		public void dropDown(WebElement ele,String value)
		{
			Select s= new Select(ele);
			s.selectByVisibleText(value);
		}	
			
		//generic method to handle a frame
		public void frame(WebDriver driver,String ele)
		{
			driver.switchTo().frame(ele);
		}
	
		//generic method to shift control back to normal web page
		public void frame(WebDriver driver)
		{
			driver.switchTo().defaultContent();
		}

		//generic method for implicit wait
		public void implicitWaitMethod(WebDriver driver, int time)
		{
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}
	
		//generic method for alter popup accept
		public void alterPopUpAccept(WebDriver driver)
		{
			driver.switchTo().alert().accept();
		}

		//generic method for alter popup Dismiss
		public void alterPopUpDismiss(WebDriver driver)
		{
			driver.switchTo().alert().dismiss();
		}

		//generic method for parent window
		public void parentWindow(WebDriver driver)
		{
			driver.getWindowHandle();
		}

		//generic method for child window
		public void childWindow(WebDriver driver)
		{
			driver.getWindowHandles();
		}
}
