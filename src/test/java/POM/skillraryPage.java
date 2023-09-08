package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryPage 
{
	   //Declaration
		@FindBy(id="course")
		private WebElement course;
		
		@FindBy(xpath = "//a[text()='Selenium Training']")
		private WebElement selenium;
		
		
		//Initialization
		public skillraryPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//Utilization
		public WebElement getCourseOption()
		{
			return course;
		}
		public void seleniumOption()
		{
			selenium.click();
		}
		
}
