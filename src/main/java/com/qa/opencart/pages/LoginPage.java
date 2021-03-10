package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.testutilities.Constants;
import com.qa.opencart.testutilities.ElementUtil;

public class LoginPage 
{
	private ElementUtil elementUtil;
	private WebDriver driver;
	
	//Page Objects - By Locators - Object Repository
	private By username = By.id("input-email");
	private By password = By.id("input-password");
	private By loginBtn = By.xpath("//input[@value='Login']");
	private By frgtpwdlink = By.xpath("//div[@class='form-group']/a");
	
	//Constructor
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}

	
	//Page Actions
	public String getLoginPageTitle()
	{
		return elementUtil.waitForTitleContains(5, Constants.LOGIN_PAGE_TITLE);
	}
	
	public boolean isForgorPwdLinkExists()
	{
		return elementUtil.doIsDisplayed(frgtpwdlink);
	}
	
	public AccountPage doLogin(String un, String pwd)
	{
		System.out.println("login with : " + un + " : " + pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginBtn);
		return new AccountPage(driver);
	}
	
}
