package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pagefactory.MasterPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoExerciseLogin {
	
	MasterPageFactory mpf;
	@Test
	
		public void getLogin() {
			WebDriverManager.chromedriver().setup();
			//here we setup a driver that we are going to use drive the browser Chrome
			
			WebDriver driver = new ChromeDriver();
			//driver-object from sub sub class ChromDriver of Interface WebDriver
			//upcasting. opening the browser
			
			driver.manage().window().maximize();
			//maximized window size
			
			//driver.get("https://automationexercise.com/");
			//opening the URL, but it has less options
			
			driver.navigate().to(BaseConfig.getConfigValue("PROD_URL")); //open URL address
		
			mpf = new MasterPageFactory(driver); //object created
			
			//highlight
			Highlighter.addColor(driver, mpf.getSigninbtn_homepage());
			
			// navigate to link "login" and click
			mpf.getSigninbtn_homepage().click();
			
			Highlighter.addColor(driver, mpf.getEmail());
			
			mpf.getEmail().sendKeys(BaseConfig.getConfigValue("Email"));
			
			Highlighter.addColor(driver, mpf.getPassword());

			mpf.getPassword().sendKeys(BaseConfig.getConfigValue("Password"));
			
			Highlighter.addColor(driver, mpf.getLogin_btn());
			
			//Click login button
			mpf.getLogin_btn().click();
			
			//Logout
			if(mpf.getLogout_btn().isDisplayed()) {
				System.out.println("Opened");
			}
			else {
				System.out.println("Didn't login");
				
			}
				
				//screenshot
			Screenshot.getScreenShot(driver, "aaa");
				
							
			
		}
		


	}
	
