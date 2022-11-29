package com.SwagLabs.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddToCartPageTest extends BaseTest
{
	
	@BeforeClass
	public void setupPage()
	{
		lpage.doLogin("standard_user", "secret_sauce");
		ppage.getProductName("Sauce Labs Fleece Jacket");
		
	}
	
	
  @Test(priority=1)
  public void verifyTitle()
  {
	  String title=apage.getAppTitle();
	  System.out.println("Add to cart page Title is: "+title);
  }
  
  @Test(priority=2)
  public void verifyCheckOutProcess()
  {
	  apage.doCheckout();
  }
  
  
  @Test(enabled=false)
  public void verifyContinueShoopingProcess()
  {
	  apage.doContinueShopping();
  }
  
  
  @Test(enabled=false)
  public void verifyRemoveProduct()
  {
	  apage.doRemove();
  }
  
  
}
