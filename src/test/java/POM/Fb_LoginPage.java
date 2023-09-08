package POM;
import javax.management.loading.PrivateClassLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import WebElements.getter_Location;
public class Fb_LoginPage 
{
		// DECLARATION
		//Address of email textfield
		@FindBy(id ="email")
		private WebElement emailTF;
		
		//Address of email textfield
		@FindBy(id ="pass")
		private WebElement passwordTF;

		//Address of email textfield
		@FindBy(xpath ="//button[@name='login']")
		private WebElement loginBtn;
		
		
		//-----------------------------------------------------
		
		//INITIALIZATION
		public Fb_LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//-----------------------------------------------------
		
		//UTILIZATION
		public void emailTextField(String value)
		{
			emailTF.sendKeys(value);
		}

		public void passwordTextField(String value)
		{
			passwordTF.sendKeys(value);
		}
		
		public void loginButton()
		{
			loginBtn.click();
		}
		//-----------------------------------------------------
		
		//Getter and setter methods to practice
		public WebElement getEmailTf()
		{
			return emailTF;
		}
		public void setEmailTf(WebElement emailTF)
		{
			this.emailTF = emailTF;
		}
		
		public WebElement getPasswordTf()
		{
			return passwordTF;
		}
		public void setPasswordTf(WebElement passwordTF)
		{
			this.passwordTF = passwordTF;
		}
		
		public WebElement getLoginBtn()
		{
			return loginBtn;
		}
		public void setLoginBtn(WebElement loginBtn)
		{
			this.loginBtn = loginBtn;
		}
		//-----------------------------------------------------
}
