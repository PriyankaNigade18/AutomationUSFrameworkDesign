package com.SwagLabs.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLabs.Utility.ExcelUtil;
import com.SwagLabs.Utility.PropertyFile;
import com.SwagLabs.Utility.ScreenshotUtil;

public class OraderDescriptionPageTest extends BaseTest
{
//	@BeforeClass
//	public void pageSetup()
//	{
//		lpage.doLogin(ExcelUtil.getData(0, 0), ExcelUtil.getData(0, 1));
//		ppage.getProductName(PropertyFile .getProp("pname"));
//		apage.doCheckout();
//		cpage.doContinue(PropertyFile.getProp("fname"),PropertyFile.getProp("lname"),PropertyFile.getProp("zcode"));
//		
//	}
	
	
	
  @Test(priority=1)
  public void verifyProductInfo() 
  {
	  opage.getProductInfo();
  }
  
  @Test(priority=2)
  public void doFinishProcess()
  {
	  opage.doFinish();
	  test.pass("Product Purchase process completed!");
	  ScreenshotUtil.capture(driver);
  }
}
