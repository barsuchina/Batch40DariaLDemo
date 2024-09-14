package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLogin {

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
		
		driver.navigate().to("https://automationexercise.com/"); //open URL address
		
		driver.findElement(By.xpath("//i[@class='material-icons card_travel']")).click();
		// navigate to link "login" and click
		
		driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
		// navigate to link "login" and click
		
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("rezwanislam857@gmail.com");
		//select input field for email. Extra () means grouping of the same elemets
		//[1] means we are using the first one in the group.
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Boston2023");
		
		//Click login button
		driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]")).click();
		
		//check if logged in
		if(driver.findElement(By.xpath("//*[contains(text(), 'Logout')]")).isDisplayed()) {
			System.out.println("Opened");
		}
		else {
			System.out.println("Didn't login");
			
			
			
			
		
		}
		driver.quit();	
		
	}
	
}
