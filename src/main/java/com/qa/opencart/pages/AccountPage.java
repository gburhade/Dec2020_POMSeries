package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.testutilities.Constants;
import com.qa.opencart.testutilities.ElementUtil;

public class AccountPage 
{

	ElementUtil eleutil;
	
	//Page Object     By Locators    -  Object Repository
	
	private By logo = By.id("logo");
	private By accntHeaders = By.cssSelector("#content h2");
	private By srcfield = By.name("search");
	private By srcbutton = By.cssSelector("div#search button");
	
	public AccountPage(WebDriver driver)
	{
		eleutil = new ElementUtil(driver);
	}
	
	public String getAccountPageTitle()
	{
		return eleutil.waitForTitleIs(10, Constants.ACCOUNT_PAGE_TITLE);
	}
	
	public boolean isLogoExist()
	{
		return eleutil.doIsDisplayed(logo);
	}
	
	public int getAccountPageHeadersCount()
	{
		return eleutil.getElements(accntHeaders).size();
	}
	
	public List<String> getAccountPageHeadersList()
	{
		List<WebElement> accList = eleutil.getElements(accntHeaders);
		List<String> accSectionList = new ArrayList<String>();
		
		for(WebElement e: accList)
		{
			accSectionList.add(e.getText());
		}
		
		return accSectionList;
	}
	
	
	public void doSearch(String productName)
	{
		eleutil.doSendKeys(srcfield, productName);
		eleutil.doClick(srcbutton);
	}
	
	
	
}
