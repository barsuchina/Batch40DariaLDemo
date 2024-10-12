package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-lock']")
	private WebElement signinbtn_homepage;
	
	@FindBy(xpath="(//input[@name='email'])[1]")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="(//button[@class='btn btn-default'])[1]")
	private WebElement login_btn;
	
	@FindBy(xpath="//*[contains(text(), 'Logout')]")
	private WebElement logout_btn;
	
	@FindBy(xpath="//*[@aria-label='Services']")
	private WebElement services;
	
	@FindBy(xpath="//*[@id='oldSelectMenu']")
	private WebElement dropDown3;
	
	@FindBy(xpath="//*[@id='confirmBox']")
	private WebElement alertBtn2;
	
	@FindBy(xpath="(//*[text()='Bottled Water Delivery'])[2]")
	private WebElement bottledWaterDelivery_bus;
	
	@FindBy(xpath="//*[text()=' Logout']")
	private WebElement Logoutbtn;
	
	
	public WebElement getLogoutbtn() {
		return Logoutbtn;
	}

	
	
	public WebElement getAlertBtn2() {
		return alertBtn2;
	}

	public WebElement getDropDown3() {
		return dropDown3;
	}

	public WebElement getServices() {
		return services;
	}

	public WebElement getBottledWaterDelivery_bus() {
		return bottledWaterDelivery_bus;
	}

	public WebElement getSigninbtn_homepage() {
		return signinbtn_homepage;
	}
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLogin_btn() {
		return login_btn;
	}
	
	public WebElement getLogout_btn() {
		return logout_btn;
	}
		

}
