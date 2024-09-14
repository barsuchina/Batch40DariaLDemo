package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {

	public void getDragDrop() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window();
		driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
		
		WebElement columnA = driver.findElement(By.xpath("//*[@id='column-a']"));
		WebElement columnB = driver.findElement(By.xpath("//*[@id='column-b']"));
		
		Actions ac = new Actions(driver);
		
		ac.dragAndDrop(columnA, columnB).perform();
                     //drag      drop
		
	}
	
	public static void main(String[] args) {
		DragDrop obj = new DragDrop();
		obj.getDragDrop();
	}
	
}
