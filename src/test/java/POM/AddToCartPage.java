package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage 

{	//Declaration
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	private WebElement adding;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement addToCart;
	
	//Initialization
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public void addingOption()
	{
		adding.click();
		adding.click();
	}
	
	public void addToCartOption()
	{
		addToCart.click();
	}
	
	
}
