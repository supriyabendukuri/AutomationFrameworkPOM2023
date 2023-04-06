package com.qz.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

public class LoginPage {

	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//private locators
	private By userName = By.name("email");
	private By password = By.name("password");
	private By login = By.xpath("//input[@value='Login']");
	private By forgotPwLink = By.linkText("Forgotten Password");

	//Page constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		eleUtil = new ElementUtil(driver);
	}
	
	//page action/methods
	public String getLoginPageTitle() {
		String title =eleUtil.waitForTitleIsAndFetch(AppConstants.DEFAULT_SHORT_TIMEOUT, AppConstants.LOGIN_PAGE_TITLE_VALUE);
		System.out.println("Login page title is :" +  " "+ title);
		return title;
	}
	
	public String getLoginPageurl() {
		String url = eleUtil.waitForURLContainsAndFetch(AppConstants.DEFAULT_SHORT_TIMEOUT, AppConstants.LOGIN_PAGE_URL_FRACTION_VALUE);
		System.out.println("Login page url is :" +  " "+ url);
		return url;
	}
	
	public boolean isForgotPwdLinkExists() {
		return eleUtil.waitForElementVisible(forgotPwLink, AppConstants.DEFAULT_MEDIUM_TIMEOUT).isDisplayed();
		
	}
	
	public AccountsPage doLogin(String un, String pw) {
		eleUtil.waitForElementVisible(userName, AppConstants.DEFAULT_MEDIUM_TIMEOUT).sendKeys(un);
		eleUtil.doSendKeys(password, pw);
		eleUtil.doClick(login);
		return new AccountsPage(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
