package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.pagefactory.MasterPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoExerciseLogin {
	WebDriver driver;
	MasterPageFactory mpf;
	@Test
	
		public void getLogin() {
			WebDriverManager.chromedriver().setup();	
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(BaseConfig.getConfigValue("PROD_URL")); //open URL address
			mpf = new MasterPageFactory(driver); //object created
			Highlighter.addColor(driver, mpf.getSigninbtn_homepage());
			mpf.getSigninbtn_homepage().click();
			Highlighter.addColor(driver, mpf.getEmail());
			mpf.getEmail().sendKeys(BaseConfig.getConfigValue("Email"));
			Highlighter.addColor(driver, mpf.getPassword());
			mpf.getPassword().sendKeys(BaseConfig.getConfigValue("Password"));
			Highlighter.addColor(driver, mpf.getLogin_btn());
			mpf.getLogin_btn().click();
			
			if(mpf.getLogout_btn().isDisplayed()) {
				System.out.println("Opened");
			}
			else {
				System.out.println("Didn't login");
				
			}
						
			Assert.assertTrue(mpf.getLogout_btn().isDisplayed(), "Login successful");
			
			
			//driver.quit();
							
			
		}
		
	@AfterTest
	public void tearDown() {
		driver.quit();
	}


	}
	
