package com.stepdef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.generic.DriverManager;
import com.pagefactory.MasterPageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefenition {
	
	WebDriver driver;
	DriverManager dm;
	MasterPageFactory mpf;
	WebDriverWait wait;
	@Given("Open the browser")
	public void open_the_browser() {
		
		DriverManager dm = new DriverManager();
		driver = dm.getChromeDriver(driver);
	    
	    }

	@Given("pass the Automation Exercise URL")
	public void pass_the_automation_exercise_url(String aeURL) {
	 
		driver.navigate().to(aeURL);

	}

	@When("Click on Login button in the home page")
	public void click_on_login_button_in_the_home_page() {
	    
	   mpf = new MasterPageFactory(driver);
	   mpf.getSigninbtn_homepage().click();
		
	}

	@When("Enter the email in the email field")
	public void enter_the_email_in_the_email_field(String email) {
	   
		mpf.getEmail().sendKeys(email);

	}

	@When("Enter the password in the password field")
	public void enter_the_password_in_the_password_field(String password) {
	
		mpf.getPassword().sendKeys(password);
	}

	@When("Click on Login button in the Login page")
	public void click_on_login_button_in_the_login_page() {
	    
	    mpf.getLogin_btn().click();
	}

	@Then("Validate login is successful")
	public void validate_login_is_successful() {
	    
	    Assert.assertTrue(mpf.getLogoutbtn().isDisplayed(), "Login successful");
	}
	
	@Given("pass the Automation Exercise URL {string}")
	public void pass_URL(String URL) {
	 
		driver.navigate().to(URL);
		
	}
	
	@When("Enter the email in the email field {string}")
	public void enter_email(String email) {
	   
		mpf.getEmail().sendKeys(email);

	}

	@When("Enter the password in the password field {string}")
	public void enter_password(String password) {
	
		mpf.getPassword().sendKeys(password);
		
	}

	@When("Click on Logout button")
	public void click_on_logout_button() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getLogout_btn()));
		mpf.getLogout_btn().click();
	   
	}

	@Then("Validate logout is successful")
	public void validate_logout_is_successful() {
		
		Assert.assertTrue(mpf.getSigninbtn_homepage().isDisplayed(), "Logout successful");
	   
	}
	
	@Then("Quit all browsers")
	public void quit_all_browsers() {
		
		driver.quit();
		
	}

}
