package com.qz.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	//private locators
	private By userName = By.name("email");
	private By password = By.name("password");
	private By login = By.xpath("//input[@value='Login']");
	private By forgotPwLink = By.linkText("Forgotten Password");

	//Page constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//page actioc/methods
	public String getLoginPageTitle() {
		String title =driver.getTitle();
		System.out.println("Login page title is :" +  " "+ title);
		return title;
	}
	
	public String getLoginPageurl() {
		String url =driver.getCurrentUrl();
		System.out.println("Login page url is :" +  " "+ url);
		return url;
	}
	
	public boolean isForgotPwdLinkExists() {
		return driver.findElement(forgotPwLink).isDisplayed();
		
	}
	
	public void doLogin(String un, String pw) {
		driver.findElement(userName).sendKeys(un);
		driver.findElement(password).sendKeys(pw);
		driver.findElement(login).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
