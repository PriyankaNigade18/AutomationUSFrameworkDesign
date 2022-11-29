package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SwagLabs.Utility.ScreenshotUtil;

public class CheckOutPage 
{
	private WebDriver driver;
	
	//initialize driver
	public CheckOutPage(WebDriver driver)
	{
	this.driver=driver;
			
	}
	
	//identification
	private By firstname=By.id("first-name");
	private By lastname=By.id("last-name");
	private By zipcode=By.id("postal-code");
	
	private By continuebtn=By.id("continue");
	
	//actions
	
	public void doContinue(String fname,String lname,String zcode)
	{
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(zipcode).sendKeys(zcode);
		ScreenshotUtil.capture(driver);
		driver.findElement(continuebtn).click();
		System.out.println("You have click on Continue button!");
	}
	
	
	
	
	
	

}
