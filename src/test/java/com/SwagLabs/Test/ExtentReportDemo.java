package com.SwagLabs.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo 
{
	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	public WebDriver driver;
	@BeforeClass
	public void setupReport()
	{
		 extent = new ExtentReports();
		 spark = new ExtentSparkReporter("target/GoogleTest.html");
		 extent.attachReporter(spark);
		 test=extent.createTest("ExtentReportDemo");
	}
	
	
	
	
  @Test(priority=1)
  public void testCase() 
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  if(driver.getTitle().equals("Google"))
	  {
		test.pass("Title is match ....Test Pass");  
	  }else
	  {
		  test.fail("Title is not matched...Test Fail!");
	  }
	  
  }
  
  @Test(priority=2)
  public void testcase2()
  {
	  String curl=driver.getCurrentUrl();
	  if(true)
	  {
		  test.fail("Curl is not match...TestFail");
	  Assert.assertTrue(curl.contains("GoogleApp"));
	  }
	  
  }
  
  
  
  @AfterClass
  public void closeReports()
  {
	  extent.flush();
  }
  
}
