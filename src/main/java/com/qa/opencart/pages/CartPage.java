package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class CartPage 
{
	//By Locator
	By un = By.id("username");

	public CartPage()
	{
		System.out.println("Cart Page");
	}
	
	//Page Actionss
	public void clickonCart()
	{
		System.out.println("click on Cart");
	}
}
