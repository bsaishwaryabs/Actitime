package StepDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
		@FindBy(id="username")
		WebElement login_username;
		
		@FindBy(name="pwd")
		WebElement login_password;
		
		@FindBy(id="loginButton")
		WebElement button_login;
		
		WebDriver driver;
		
		public Login(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
			
		}
		
		public void enterusername(String username)
		{
			login_username.sendKeys("venkatreddyuded12@gmail.com");
		}
		public void enterpassword(String password)
		{
			login_password.sendKeys("Reddy@143");
		}
		public void clicklogin()
		{
			button_login.click();
		}
}