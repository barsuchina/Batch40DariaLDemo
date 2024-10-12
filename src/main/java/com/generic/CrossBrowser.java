package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pagefactory.MasterPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {

	WebDriver driver;
	
	MasterPageFactory mpf;
	public void getCrossBrowser(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			System.out.println("Browser opened="+browser);
			
		} else if(browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
			System.out.println("Browser opened="+browser);
			
		} else if(browser.equalsIgnoreCase("msEdge")) {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
			System.out.println("Browser opened="+browser);
				
		} else {
			System.out.println("Browser not found");
		}
		
		driver.navigate().to(BaseConfig.getConfigValue("PROD_URL")); //open URL address
		
		mpf = new MasterPageFactory(driver); 
		Highlighter.addColor(driver, mpf.getSigninbtn_homepage());
		
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
