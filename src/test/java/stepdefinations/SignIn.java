package stepdefinations;


	
		

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		import io.cucumber.java.After;
		import io.cucumber.java.en.Given;
		import io.cucumber.java.en.Then;
		import io.cucumber.java.en.When;

		public class SignIn {


		public WebDriver driver;

		String URL = "https://dsportalapp.herokuapp.com/";

		By getstarted = By.xpath("//button[text()='Get Started']");
		By signin = By.xpath("//a[contains(text(),'Sign in')]");

		By Username = By.xpath("//input[@name='username']");
		By Password = By.xpath("//input[@name='password']");
		By login    = By.xpath("//input[@type='submit']");


		@Given("user open the application of DSPortalapp page")
		public void user_open_the_application_of_ds_portalapp_page() {


		System.getProperty("C:\\Users\\sheet\\eclipse-workspace\\Selenium_Project_01\\src\\test\\resources\\drivers");

		driver = new ChromeDriver();

		 driver.get(URL);

		}
		   
		@When("user click to get Started of DSPortalapp page")
		public void user_click_to_get_started_of_ds_portalapp_page() {

		driver.findElement(getstarted).click();
		}

		@When("user click to sign in button from DSportal homepage")
		public void user_click_to_sign_in_button_from_d_sportal_homepage() {

		   driver.findElement(signin).click();
		}

		@When("user enters the user id as  {string}")
		public void user_enters_the_user_id_as(String username) {

		   driver.findElement(Username).sendKeys(toString());
		   
		}

		@When("user enter  password as  {string}")
		public void user_enter_password_as(String password) {

		   driver.findElement(Password).sendKeys(toString());
		}

		@When("user click the login button")
		public void user_click_the_login_button() {

		   driver.findElement(login).click();
		}

		@Then("user should get an alert message of Invalid Username and Password")
		public void user_should_get_an_alert_message_of_invalid_username_and_password() {

		   
		}
		}