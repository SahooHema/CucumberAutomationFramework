package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;




import com.qa.pages.Homepage;
import com.qa.pages.LoginPage;
import com.qa.utils.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Login {
	WebDriver driver;
	
	LoginPage login =new LoginPage(TestBase.getDriver());
	Homepage home;

	
	@Given("user launch browser")
	public void user_launch_browser() {	
		TestBase.getDriver().get("https://www.facebook.com/login/");
	}
	@Then("user entered username and password")
	public void user_entered_username_and_password() throws Exception {
		login =new LoginPage(TestBase.getDriver());
		login.LoginApp("9752023235","Caparo@9100");
	}
	@Then("user click login button")
	public void user_click_login_button() {
		home= login.button();
	}
		

}
