package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class NewsLetterPage 
{
	//By Locator
	By letter = By.id("letter");

	public NewsLetterPage()
	{
		System.out.println("news letter Page");
	}
	
	//Page Actionss
	public void clickonLetter()
	{
		System.out.println("click on Letter");
	}
}
