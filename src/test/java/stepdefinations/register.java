package stepdefinations;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register {
	public WebDriver driver;

	 String URL = "https://dsportalapp.herokuapp.com/";

	 By getstarted = By.xpath("//button[text()='Get Started']");
	 By register = By.xpath("//a[text()=' Register ']");
	 By registerBtn = By.xpath("//input[@value='Register']");
	 By username = By.name("username");
	 By password = By.name("password1");
	 By password2 = By.name("password2");
	 By errorMessage = By.xpath("//div[@class='alert alert-primary']");
	 
	 //background  
	@Given("user opens DSportal app")
	public void user_opens_d_sportal_app() {
		System.getProperty("C:\\Users\\sheet\\eclipse-workspace\\Selenium_Project_01\\src\\test\\resources\\drivers");
		   driver = new ChromeDriver();
		   driver.get(URL);
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
	}

	@Given("user clicks get started button")
	public void user_clicks_get_started_button() {
		driver.findElement(getstarted).click();
	}

	@When("user clicks registration button")
	public void user_clicks_registration_button() {
		driver.findElement(register).click();
	}

	@Then("user navigates to register page")
	public void user_navigates_to_register_page() {
	}

	//@TC_reg_01
	@When("user clicks register button")
	public void user_clicks_register_button() {
		driver.findElement(registerBtn).click();
	}

	@Then("user should get an error message below username textbox")
	public void user_should_get_an_error_message_below_username_textbox() {
		String message = driver.findElement(username).getAttribute("validationMessage"); 
		System.out.println(message);
	}

	//@TC_reg_02
	@Then("user enters valid username")
	public void user_enters_valid_username() {
		driver.findElement(username).sendKeys("Jane");
	}

	@When("user clicks button")
	public void user_clicks_button() {
		driver.findElement(registerBtn).click();
	}

	@Then("user should get an error message below password textbox")
	public void user_should_get_an_error_message_below_password_textbox() {
		String message = driver.findElement(username).getAttribute("validationMessage"); 
		System.out.println(message);
	}

	//@TC_reg_03
	@Then("the user enters valid username")
	public void the_user_enters_valid_username() {
		driver.findElement(username).sendKeys("Mich");
	}

	@Then("user enters valid password")
	public void user_enters_valid_password() {
		driver.findElement(password).sendKeys("ilove134");
	}

	@When("the user clicks register button")
	public void the_user_clicks_register_button() {
		driver.findElement(registerBtn).click();
	}

	@Then("user should get an error message below password confirmation box")
	public void user_should_get_an_error_message_below_password_confirmation_box() {
		String message = driver.findElement(username).getAttribute("validationMessage"); 
		System.out.println(message);
	}
	//@TC_reg_04
	@Then("user enters symbols as username")
	public void user_enters_symbols_as_username() {
		driver.findElement(username).sendKeys("@/./+/-/_");
	}
	@Then("the user enters valid password and matching confirmatory password")
	public void the_user_enters_valid_password_and_matching_confirmatory_password() {
		driver.findElement(password).sendKeys("help2010");
		driver.findElement(password2).sendKeys("help2010");
	}

	@When("the user clicks registration button")
	public void the_user_clicks_registration_button() {
		driver.findElement(registerBtn).click();
	}

	@Then("user should get an error message")
	public void user_should_get_an_error_message() {
		WebElement displayErrorMessage = driver.findElement(errorMessage);
		System.out.println(displayErrorMessage.getText());
	}

	//@TC_reg_05
	@Then("user enter valid username")
	public void user_enter_valid_username() {
		driver.findElement(username).sendKeys("Janet");
	}

	@Then("user enters valid password and non-matching password")
	public void user_enters_valid_password_and_non_matching_password() {
		driver.findElement(password).sendKeys("pass3456");
		driver.findElement(password2).sendKeys("pass2345");
	}

	@When("user click register button")
	public void user_click_register_button() {
		driver.findElement(registerBtn).click();
	}

	@Then("user should get error message")
	public void user_should_get_error_message() {
		String printErrorMessage = driver.findElement(errorMessage).getText();
		System.out.println(printErrorMessage);
	}
	//@TC_reg_06
	@Then("the user enter valid username")
	public void the_user_enter_valid_username() {
		driver.findElement(username).sendKeys("Candy");
	}

	@Then("user enters password and confirmation password less than {int} characters")
	public void user_enters_password_and_confirmation_password_less_than_characters(Integer int1) {
		driver.findElement(password).sendKeys("gate");
		driver.findElement(password2).sendKeys("gate");
	}

	@When("user click registration button")
	public void user_click_registration_button() {
		driver.findElement(registerBtn).click();
	}

	@Then("the user should get an error message")
	public void the_user_should_get_an_error_message() {
		String printErrorMessage = driver.findElement(errorMessage).getText();
		System.out.println(printErrorMessage);
	}

	//@TC_reg_07
	@Then("user enters username")
	public void user_enters_username() {
		driver.findElement(username).sendKeys("Nicole");
	}

	@Then("user enters numerical password and confirmatory password")
	public void user_enters_numerical_password_and_confirmatory_password() {
		driver.findElement(password).sendKeys("12345678");
		driver.findElement(password2).sendKeys("12345678");
	}

	@When("user click button")
	public void user_click_button() {
		driver.findElement(registerBtn).click();
	}

	@Then("user should get an error msg")
	public void user_should_get_an_error_msg() {
		String printErrorMessage = driver.findElement(errorMessage).getText();
		System.out.println(printErrorMessage);
	}
	//@TC_reg_08
	@Then("the user enters username")
	public void the_user_enters_username() {
		driver.findElement(username).sendKeys("Indu");
	}

	@Then("user enters valid password and matching confirmatory password")
	public void user_enters_valid_password_and_matching_confirmatory_password() {
		driver.findElement(password).sendKeys("Selenium@123");
		driver.findElement(password2).sendKeys("Selenium@123");
	}

	@When("the user click button")
	public void the_user_click_button() {
		driver.findElement(registerBtn).click();
	}

	@Then("user should be redirected to homepage")
	public void user_should_be_redirected_to_homepage() {
	}
}