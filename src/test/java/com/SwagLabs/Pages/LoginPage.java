package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SwagLabs.Utility.ScreenshotUtil;

public class LoginPage
{
	//Encapsulation
	//Identification +Actions
	private WebDriver driver;
	
	//Initialize driver
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//By locator- Identification
	private By username=By.id("user-name");
	private By pasword=By.id("password");
	private By loginbtn=By.id("login-button");
	
	//Actions
	public void doLogin(String un,String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(pasword).sendKeys(psw);
		ScreenshotUtil.capture(driver);
		driver.findElement(loginbtn).click();
	}
	
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	
	
	
	

}
