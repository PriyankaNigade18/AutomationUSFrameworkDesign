package com.SwagLabs.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLabs.Utility.PropertyFile;

public class CheckOutPageTest extends BaseTest
{
	@BeforeClass
	public void pageSetup()
	{
		lpage.doLogin("standard_user", "secret_sauce");
		ppage.getProductName("Sauce Labs Fleece Jacket");
		apage.doCheckout();
	}
	
	
	
	
  @Test
  public void VerifyCheckoutProcess() 
  {
	  cpage.doContinue(PropertyFile.getProp("username"),PropertyFile.getProp("password"),PropertyFile.getProp("zcode"));
  }
  
  
}
