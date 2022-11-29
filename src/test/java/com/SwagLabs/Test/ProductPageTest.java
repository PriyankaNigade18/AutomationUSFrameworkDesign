package com.SwagLabs.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseTest
{
	@BeforeClass
	public void productPageSetup()
	{
		lpage.doLogin("standard_user", "secret_sauce");
	}
	
	

	  @Test(priority=1)
	  public void verifyProductPageTitle()
	  {
		  String act=ppage.getAppTitle();
		  Assert.assertTrue(act.contains("Labs"));
		  System.out.println("Title verified!");
	  }
	
	
	
  @Test(priority=2)
  public void verifyProductCount()
  {
	 int count= ppage.getPropductCount();
	 System.out.println("Total count is: "+count);
  }
  
  @Test(priority=3)
  public void verifyAddProduct()
  {
	  ppage.getProductName("Sauce Labs Fleece Jacket");
  }
  
  
  
}
