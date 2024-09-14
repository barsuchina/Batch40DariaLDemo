package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pagefactory.MasterPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	
	public void getDropDown() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window();
		driver.navigate().to("https://demoqa.com/select-menu");
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		Select sc = new Select(mpf.getDropDown3());
		
		sc.selectByVisibleText("White");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
					
		sc.selectByIndex(3);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		sc.selectByValue("red");
	}

	public static void main(String[] args) {
		DropDown obj = new DropDown();
			obj.getDropDown();	
	}
	
}
