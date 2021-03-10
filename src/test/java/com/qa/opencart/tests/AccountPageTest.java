package com.qa.opencart.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.testutilities.Constants;
import com.qa.opencart.testutilities.Error;

public class AccountPageTest extends BaseTest
{
	@BeforeClass
	public void accountSetUp()
	{
		accountPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority =1)
	public void getAccountPageTitleTest() 
	{
		String title = accountPage.getAccountPageTitle();
		System.out.println("Account Page Title is : " + title);
	    Assert.assertEquals(title, Constants.ACCOUNT_PAGE_TITLE, Error.ACCOUNT_PAGE_TITLE_ERROR);
	}
	
	@Test(priority = 2)
	public void accPageLogoExist()
	{
		Assert.assertTrue(accountPage.isLogoExist(), Error.ACCOUNT_PAGE_LOGO_ERROR);
	}
	
	@Test(priority = 3)
	public void accPageHeadersCount()
	{
		int headerCount = accountPage.getAccountPageHeadersCount();
		Assert.assertEquals(headerCount, Constants.ACCOUNT_PAGE_HEADERS_COUNT, Error.ACCOUNT_PAGE_HEADERS_COUNT__ERROR);
	}
	
    @Test(priority = 4)
    public void accPageHeadersList()
    {
    	List<String> accntList = accountPage.getAccountPageHeadersList();
    	Assert.assertEquals(accntList, Constants.ACCOUNT_PAGE_HEADER_SECTIONS(), Error.ACCOUNT_PAGE_HEADERS_LIST__ERROR);
    }
    
    @Test(priority = 5)
    public void searchTest()
    {
    	accountPage.doSearch("macbook");
    }
	
	
}
