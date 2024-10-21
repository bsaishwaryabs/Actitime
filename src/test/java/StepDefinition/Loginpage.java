package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpage
{
	
	WebDriver driver;
	Login lg;
	@Given("Browser is open")
	public void browser_is_open() {
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
	driver.manage().window().maximize();
}

	@And("User is on login page")
	public void user_is_on_login_page() {
	driver.navigate().to("https://online.actitime.com/osinfoteck1/timetrack/enter.do");
}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
	   lg = new Login(driver);
	   lg.enterusername(username);
	   lg.enterpassword(password);
	   Thread.sleep(3000);
}

	@And("user clicks login")
	public void user_clicks_login() {
	lg.clicklogin();
}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() {
	System.out.println("Welcome to actiTIME!");
	//driver.close();
	driver.quit();
}
}
