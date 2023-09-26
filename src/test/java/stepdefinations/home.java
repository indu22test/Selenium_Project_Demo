package stepdefinations;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;



	import io.cucumber.java.en.Given;

	import io.cucumber.java.en.Then;

	import io.cucumber.java.en.When;



	public class home {

		

		public WebDriver driver;

		 String URL = "https://dsportalapp.herokuapp.com/";

		 

		    //Background

		     By getstarted = By.xpath("//button[text()='Get Started']");

		 

		   //TESTCASE 001

		     By datastructurebtn = By.xpath("//*[contains(text(),'Data Structures-Introduction')]/../..//a");

		     By alert1  = By.xpath("//div[@class='alert alert-primary']");

		 

		   //TESTCASE002

			 By dropdown = By.xpath("//a[contains(text(),'Data Structures')]");

			 By linkedlist = By.xpath("//a[contains(text(),'Linked List')]");

			 By alert2  = By.xpath("//div[@class='alert alert-primary']");

			 

			 //TESTCASE004

			 By signin = By.xpath("//a[contains(text(),'Sign in')]");

			 

			 //TESTCASE005

			 By register = By.xpath("//a[contains(text(),'Register')]/../../.");

		 

			

		 



		@Given("user open the application of DSPortalapp")

		public void user_open_the_application_of_ds_portalapp() {

		 

			System.getProperty("C:\\Users\\sheet\\eclipse-workspace\\Selenium_Project_01\\src\\test\\resources\\drivers");

			   driver = new ChromeDriver();

		       driver.get(URL);

		}



		@When("user click to get Started to open the hoempage of the application")

		public void user_click_to_get_started_to_open_the_hoempage_of_the_application() {

		 

		   driver.findElement(getstarted).click();

		}



		@When("user clicks the Get Started button below the Datastructures-Introduction")

		public void user_clicks_the_get_started_button_below_the_datastructures_introduction() {

		 

		   driver.findElement(datastructurebtn).click();

		}



		@Then("user should get an Alert Message you are not logged in")

		public void user_should_get_an_alert_message_you_are_not_logged_in() {

		 

		   driver.findElement(alert1).click();

		}



		@When("user navigate to button from the DSportal homepage and select any options")

		public void user_navigate_to_button_from_the_d_sportal_homepage_and_select_any_options() {

		 

			driver.findElement(dropdown).click();

			driver.findElement(linkedlist).click();

		   

		}



		@Then("user shouls get an Alert Message you are not logged in")

		public void user_shouls_get_an_alert_message_you_are_not_logged_in() {

		 

		   driver.findElement(alert2).click();

		}



		@When("user click to signin button from DSportal homepage")

		public void user_click_to_signin_button_from_d_sportal_homepage() {

			

			driver.findElement(signin).click();

		  

		   

		}



		@Then("user should be directed to login page")

		public void user_should_be_directed_to_login_page() {

		 

		   

		}



		@When("user click to Register button from DSportal homepage")

		public void user_click_to_register_button_from_d_sportal_homepage() {

		 

		   driver.findElement(register).click();

		}



		@Then("user should be directed to Register form")

		public void user_should_be_directed_to_register_form() {

		 

		   

		}



	}



