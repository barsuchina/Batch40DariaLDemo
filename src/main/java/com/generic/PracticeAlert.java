package com.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagefactory.MasterPageFactory;
import com.util.BaseConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAlert {
	
	MasterPageFactory mpf;

	public void getAlert() {
		

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(BaseConfig.getConfigValue("Alert_URL"));
		
	mpf = new MasterPageFactory(driver);
	
	mpf.getAlertBtn2().click();
	
	Alert alert = driver.switchTo().alert();
	alert.getText();
	System.out.println(alert.getText());
	
	alert.accept();
	
	}
	
	public static void main(String[] args) {
		PracticeAlert obj = new PracticeAlert();
		obj.getAlert();
	}
}
