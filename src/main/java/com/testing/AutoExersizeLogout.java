package com.testing;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generic.LoginTest;
import com.pagefactory.MasterPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoExersizeLogout {
	
	WebDriver driver;
	MasterPageFactory mpf;
	@Test
	public void getLogout() {
		
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
		
		//logout
		mpf = new MasterPageFactory(driver);
		mpf.getLogoutbtn().click();
		
		//validate
		Assert.assertTrue(mpf.getSigninbtn_homepage().isDisplayed(), "Logged out");
		if (mpf.getLogin_btn().isDisplayed()) {
			System.out.println("Logged out");
			
		}
		
	}

}
