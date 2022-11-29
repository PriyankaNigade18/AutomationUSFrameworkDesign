package com.SwagLabs.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil 
{
	public static void capture(WebDriver driver)
	{
		//TakesScreenshot ts=(TakesScreenshot) driver;
		//File temp=ts.getScreenshotAs(OutputType.FILE);
		//File dest=new File("./"+"\\Screeshot\\SwagLab"+System.currentTimeMillis()+".png");
		try {
			FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File("./"+"\\Screeshot\\SwagLab"+System.currentTimeMillis()+".png"));
		} catch (WebDriverException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
