package com.qz.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	
	private WebDriver driver;
	
	
	private By logoutLink = By.linkText("Logout");
	private By accsHeaders = By.cssSelector("div#content h2");
	private By search = By.name("search");
	private By searchIcon = By.cssSelector("#search button");
	
	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getAccPageTitle() {
		String title = driver.getTitle();
		System.out.println("Acc page title is : " + title);
		return title;
	}

	public String getAccPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("Acc page url : " + url);
		return url;
	}

	public boolean isLogoutLinkExist() {
		return driver.findElement(logoutLink).isDisplayed();
		 
	}
	
	public boolean isSearchExist() {
		return driver.findElement(search).isDisplayed();
	}
	
	public List<String> getAccountsPageHeadersList() {
		List<WebElement> list=  driver.findElements(accsHeaders);
		List<String> headersList = new ArrayList<String>();
		
		for(WebElement e : list) {
			String text =e.getText();
			headersList.add(text);
		}
		return headersList;
	}
		
	
}
