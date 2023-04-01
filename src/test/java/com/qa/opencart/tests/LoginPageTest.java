package com.qa.opencart.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;


public class LoginPageTest extends BaseTest{

	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String actTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(actTitle, "Account Login");
	
	}
	@Test(priority = 2)
	public void loginPageUrlTest() {
		String actUrl = loginPage.getLoginPageurl();
		Assert.assertTrue(actUrl.contains("route=account/login"));
	}
	
	@Test(priority = 3)
	public void forgotPwdLinkExistsTest() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExists());
	}
	
	@Test(priority = 4)
	public void doLoginTest() {
		loginPage.doLogin("supriya@oc.com", "Test@123");
	}
}
