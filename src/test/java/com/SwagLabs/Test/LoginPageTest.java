package com.SwagLabs.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest
{
  @Test
  public void verifyLogin()
  {
	  lpage.doLogin("standard_user","secret_sauce");
  }
  
  
  @Test
  public void verifyTitle()
  {
	  String actTitle=lpage.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Swag Labs"));
	  System.out.println("Title verification is Completed!");
  }
  
  
  @Test
  public void verifyCurrentUrl()
  {
	 String curl= lpage.getCurrentUrl();
	  Assert.assertTrue(curl.contains("sauce"));
	  System.out.println("Currenturl is Verified!");
  
  }
  
}
