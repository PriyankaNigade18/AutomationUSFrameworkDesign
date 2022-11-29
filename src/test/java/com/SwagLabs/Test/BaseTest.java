package com.SwagLabs.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.SwagLabs.Pages.*;
import com.SwagLabs.Utility.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class BaseTest 
{
	public WebDriver driver;
	public LoginPage lpage;
	public PropductPage ppage;
	public AddToCartPage apage;
	public CheckOutPage cpage;
	public OrderDescriptionPage opage;
	public PropertyFile prop;
	public ExcelUtil excel;
	public BrowserProvider br;
	public ScreenshotUtil sr;
	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	
	@BeforeSuite
	public void setupReport()
	{
		 extent = new ExtentReports();
		 spark = new ExtentSparkReporter("target/SwagLab.html");
		 extent.attachReporter(spark);
		 test=extent.createTest("SwagLabProject");
	}
	
	
	@BeforeTest
	public void setup()
	{
		Reporter.log("Browser started....", true);
		prop=new PropertyFile ();
		driver=BrowserProvider.browserSetup(PropertyFile.getProp("bname"));
		//driver=new ChromeDriver();
		lpage=new LoginPage(driver);
		ppage=new PropductPage(driver);
		apage=new AddToCartPage(driver);
		cpage=new CheckOutPage(driver);
		excel=new ExcelUtil();
		opage=new OrderDescriptionPage(driver);
		sr=new ScreenshotUtil();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.saucedemo.com/");
	}
	
	
	
	@BeforeClass
	public void pageSetup()
	{
		Reporter.log("SwagLab Application is Running on Browser", true);
		ScreenshotUtil.capture(driver);
		lpage.doLogin(ExcelUtil.getData(0, 0), ExcelUtil.getData(0, 1));
		test.pass("User login completed successfully!");
		Reporter.log("User Login is completed", true);
		waitForPage();
		ScreenshotUtil.capture(driver);
		ppage.getProductName(PropertyFile .getProp("pname"));
		test.pass("Product details captured and product selected");
		Reporter.log("Product page details and product selected", true);
		waitForPage();
		ScreenshotUtil.capture(driver);
		apage.doCheckout();
		test.pass("User checkout Process starts successfully");
		Reporter.log("User Checkout process in running", true);
		waitForPage();
		ScreenshotUtil.capture(driver);
		cpage.doContinue(PropertyFile.getProp("fname"),PropertyFile.getProp("lname"),PropertyFile.getProp("zcode"));
		ScreenshotUtil.capture(driver);
		test.pass("Product checkout process completed successfully!");
		Reporter.log("Process of checkout completed!", true);
		waitForPage();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	
	public void waitForPage()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterSuite
	public void closeProcess()
	{
		extent.flush();
	}
	
	
	
	

}
