package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.pagefactory.MasterPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HoverOver {

	MasterPageFactory mpf; 
	
	public void getHover() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.costco.com/");
		
		mpf = new MasterPageFactory(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(mpf.getServices()).perform();
	}
	
	public static void main(String[] args) {
		HoverOver obj = new HoverOver();
		obj.getHover();
	}
	
}
