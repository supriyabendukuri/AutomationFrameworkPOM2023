package com.qa.opencart.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;



	public class AccountsPageTest extends BaseTest{
	
	@BeforeClass
	public  void accPageSetup(){
		accPage =loginPage.doLogin("supriya@oc.com", "Test@123");
	}
	
	@Test()
	public void accPageTitleTest() {
		String actTitle = accPage.getAccPageTitle();
		Assert.assertEquals(actTitle, AppConstants.ACCOUNT_PAGE_TITLE_VALUE);
		
	}

	@Test
	public void accPageURLTest() {
		String actURL = accPage.getAccPageURL();
		Assert.assertTrue(actURL.contains(AppConstants.ACCOUNT_PAGE_URL_FRACTION_VALUE));
	}

	@Test
	public void isLogoutLinkExistTest() {
		Assert.assertTrue(accPage.isLogoutLinkExist());
	}

	@Test
	public void accPageHeadersCountTest() {
		List<String> headersList =accPage.getAccountsPageHeadersList();
		Assert.assertEquals(headersList.size(), 4);
		System.out.println("Accounts page headers list" + headersList);
	}

	@Test
	public void accPageHeadersValueTest() {
	}
}
