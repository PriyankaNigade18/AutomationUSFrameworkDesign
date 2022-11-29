package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderDescriptionPage 
{
	
	
	private WebDriver driver;
	
	//initialization driver
	
	public OrderDescriptionPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	private By infolist=By.xpath("//div[@class='summary_info']//div[contains(@class,'summary')]");//7
	private By finishbtn=By.xpath("//button[text()='Finish']");
	private By msg=By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");
	
	
	
	public void getProductInfo()
	{
		System.out.println("******Product information is******");
		List<WebElement> list=driver.findElements(infolist);
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		
				
	}
	
	
	
	public void doFinish() 
	{
		driver.findElement(finishbtn).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(driver.findElement(msg).getText());
		
	}
	
	
	
	
	
	
	
}
