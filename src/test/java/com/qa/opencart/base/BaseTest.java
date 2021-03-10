package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.driverfactory.DriverFactory;
import com.qa.opencart.pages.AccountPage;
import com.qa.opencart.pages.LoginPage;

public class BaseTest 
{
	
	private WebDriver driver;
	DriverFactory df;
	public LoginPage loginPage;
	public AccountPage accountPage;
	public Properties prop;
	
	
	@BeforeTest
	public void setUp()
	{
		df = new DriverFactory();
		prop = df.init_prop();
		driver = df.init_driver(prop);
		loginPage = new LoginPage(driver);
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
