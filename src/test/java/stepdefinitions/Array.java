package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Array {
	
	public WebDriver driver;
	
	String URL = "https://dsportalapp.herokuapp.com/";
	
	By getstarted = By.xpath("//button[text()='Get Started']");
	By signIn = By.xpath("//*[text()='Sign in']");
	By username = By.name("username");
	By password = By.name("password");
	By loginBtn = By.xpath("//input[@value='Login']");
	By arrayGetStarted = By.xpath("//a[@href='array']");
	By arraysInPython = By.xpath("//a[text()='Arrays in Python']");
	By arraysUsingList = By.xpath("//a[text()='Arrays Using List']");
	By basicOperations = By.xpath("//a[text()='Basic Operations in Lists']");
	By applicationsOfArray = By.xpath("//a[text()='Applications of Array']");
	By tryEditor = By.xpath("//a[text()='Try here>>>']");
	By practiceQuestions = By.xpath("//a[text()='Practice Questions']");
	By searchTheArrayQ = By.xpath("//a[text()='Search the array']");
	By maxConsecutiveOnesQ = By.xpath("//a[text()='Max Consecutive Ones']");
	By findNumbersQ = By.xpath("//a[text()='Find Numbers with Even Number of Digits']");
	By squaresQ = By.xpath("//a[text()='Squares of  a Sorted Array']");
	
	//background
	@Given("the user opens DSportal app")
	public void the_user_opens_d_sportal_app() {
		System.getProperty("C:\\Users\\sheet\\eclipse-workspace\\Selenium_Project_01\\src\\test\\resources\\drivers");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("the user clicks get started button")
	public void the_user_clicks_get_started_button() {
		driver.findElement(getstarted).click();
	}

	@Given("user clicks the sign in link")
	public void user_clicks_the_sign_in_link() {
		driver.findElement(signIn).click();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(username).sendKeys("Zuby");
		driver.findElement(password).sendKeys("ilovecodes");
	}
	
	@When("user clicks login button")
	public void user_clicks_login_button() {
	    driver.findElement(loginBtn).click();
	}

	@When("user clicks array get started button")
	public void user_clicks_array_get_started_button() {
		driver.findElement(arrayGetStarted).click();
	}

	@Then("user navigates to array page")
	public void user_navigates_to_array_page() {
	}

	//@TC_array_01
	@When("user clicks arrays in python link")
	public void user_clicks_arrays_in_python_link() {
		driver.findElement(arraysInPython).click();
	}

	@Then("user should be redirected to arrays in python page")
	public void user_should_be_redirected_to_arrays_in_python_page() {		
	}

	@When("user clicks try here button")
	public void user_clicks_try_here_button() {
		driver.findElement(tryEditor).click();
	}

	@Then("user should be redirected to page with run button")
	public void user_should_be_redirected_to_page_with_run_button() {
	}

	//@TC_array_02
	@When("user clicks arrays using list link")
	public void user_clicks_arrays_using_list_link() {
		driver.findElement(arraysUsingList).click();
	}

	@Then("user should be redirected to arrays using list page")
	public void user_should_be_redirected_to_arrays_using_list_page() {
	}

	@When("the user clicks try here button")
	public void the_user_clicks_try_here_button() {
		driver.findElement(tryEditor).click();
	}

	@Then("the user should be redirected to page with run button")
	public void the_user_should_be_redirected_to_page_with_run_button() {
	}

	//@TC_array_03
	@When("user clicks basic operations in lists link")
	public void user_clicks_basic_operations_in_lists_link() {
		driver.findElement(basicOperations).click();
	}

	@Then("user should be redirected to basic operations in lists page")
	public void user_should_be_redirected_to_basic_operations_in_lists_page() {
	}

	@When("user click try here button")
	public void user_click_try_here_button() {
		driver.findElement(tryEditor).click();
	}

	@Then("user should be directed to page with run button")
	public void user_should_be_directed_to_page_with_run_button() {
	}

	//@TC_array_04
	@When("user clicks applications of array link")
	public void user_clicks_applications_of_array_link() {
		driver.findElement(applicationsOfArray).click();
	}

	@Then("user should be redirected to applications of array page")
	public void user_should_be_redirected_to_applications_of_array_page() {
	}

	@When("the user click try here button")
	public void the_user_click_try_here_button() {
		driver.findElement(tryEditor).click();
	}

	@Then("the user should be directed to page with run button")
	public void the_user_should_be_directed_to_page_with_run_button() {
	}

	//@TC_array_05
	@When("the user clicks arrays in python link")
	public void the_user_clicks_arrays_in_python_link() {
		driver.findElement(arraysInPython).click();
	}

	@Then("the user should be redirected to arrays in python page")
	public void the_user_should_be_redirected_to_arrays_in_python_page() {
	}

	@When("user clicks practice questions link")
	public void user_clicks_practice_questions_link() {
		driver.findElement(practiceQuestions).click();
	}

	@Then("user should be redirected to practice questions page")
	public void user_should_be_redirected_to_practice_questions_page() {
	}

	@When("user clicks search the array link")
	public void user_clicks_search_the_array_link() {
		driver.findElement(searchTheArrayQ).click();
	}

	@Then("user should be redirected to question page")
	public void user_should_be_redirected_to_question_page() {
	}

	//@TC_array_06
	@When("user click arrays in python link")
	public void user_click_arrays_in_python_link() {
		driver.findElement(arraysInPython).click();
	}

	@Then("user should be directed to arrays in python page")
	public void user_should_be_directed_to_arrays_in_python_page() {
	}

	@When("the user clicks practice questions link")
	public void the_user_clicks_practice_questions_link() {
		driver.findElement(practiceQuestions).click();
	}

	@Then("the user should be redirected to practice questions page")
	public void the_user_should_be_redirected_to_practice_questions_page() {
	}

	@When("user clicks max executive ones link")
	public void user_clicks_max_executive_ones_link() {
		driver.findElement(maxConsecutiveOnesQ).click();
	}

	@Then("the user should be redirected to question page")
	public void the_user_should_be_redirected_to_question_page() {
	}

	//@TC_array_07
	@When("the user click arrays in python link")
	public void the_user_click_arrays_in_python_link() {
		driver.findElement(arraysInPython).click();
	}

	@Then("the user should be directed to arrays in python page")
	public void the_user_should_be_directed_to_arrays_in_python_page() {
	}

	@When("user click practice questions link")
	public void user_click_practice_questions_link() {
		driver.findElement(practiceQuestions).click();
	}

	@Then("user should be directed to practice questions page")
	public void user_should_be_directed_to_practice_questions_page() {
	}

	@When("user clicks find numbers with even number of digits link")
	public void user_clicks_find_numbers_with_even_number_of_digits_link() {
		driver.findElement(findNumbersQ).click();
		
	}

	@Then("user should be directed to question page")
	public void user_should_be_directed_to_question_page() {
	}

	//@TC_array_08
	@When("user clicks arrays in python")
	public void user_clicks_arrays_in_python() {
		driver.findElement(arraysInPython).click();
	}

	@Then("user should be redirected to arrays in python with try it button")
	public void user_should_be_redirected_to_arrays_in_python_with_try_it_button() {
	}

	@When("the user click practice questions link")
	public void the_user_click_practice_questions_link() {
		driver.findElement(practiceQuestions).click();
	}

	@Then("the user should be directed to practice questions page")
	public void the_user_should_be_directed_to_practice_questions_page() {
	}

	@When("user clicks squares of a sorted array link")
	public void user_clicks_squares_of_a_sorted_array_link() {
		driver.findElement(squaresQ).click();	    
	}

	@Then("the user should be directed to question page")
	public void the_user_should_be_directed_to_question_page() {
	}



}
