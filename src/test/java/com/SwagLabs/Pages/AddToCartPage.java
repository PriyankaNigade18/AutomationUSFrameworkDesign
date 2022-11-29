package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage
{
	private WebDriver driver;
	
	//Initialize driver
	public AddToCartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//By locator
	private By removebtn=By.xpath("//button[text()='Remove']");
	private By Checkoutbtn=By.xpath("//button[text()='Checkout']");
	private By continuebtn=By.xpath("//button[text()='Continue Shopping']");
	
	
	//Action
	public void doCheckout()
	{
		driver.findElement(Checkoutbtn).click();
	}
	
	
	
	public void doRemove()
	{
		driver.findElement(removebtn).click();
	}
	
	
	public void doContinueShopping()
	{
		driver.findElement(continuebtn).click();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	
	

}
