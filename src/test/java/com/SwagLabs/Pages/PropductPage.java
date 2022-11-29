package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import java.util.List;


public class PropductPage
{
	private WebDriver driver;
	
	//initialize driver
	
	public PropductPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Identification By locator
	private By cart=By.xpath("//a[@class='shopping_cart_link']");
	private By products=By.xpath("//div[@id='inventory_container']//div//div[@class='inventory_item_name']");
	private By addtocartbtn=By.xpath("//button[text()='Add to cart']");
	
		//Actions
	
	public int getPropductCount()
	{
		return driver.findElements(products).size();
	}
	
	public void getProductName(String label)
	{
		List<WebElement> list=driver.findElements(products);
		for(WebElement i:list)
		{
			System.out.println(i.getText());
			if(i.getText().contains(label))
			{
				i.click();
				break;
							
			}
		}
		driver.findElement(addtocartbtn).click();
		System.out.println("Product get added into cart!");
		driver.findElement(cart).click();
		System.out.println("Cart page is open!");
	}
	
	
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	
	
	
	
	
	

}
