package com.screenshots;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaptureScreenshot extends MainTest{
	
	
  @Test
  public void f() {
	  
	 
	 String ActualTitle=driver.getTitle();
	 Assert.assertEquals("Facebook", ActualTitle);
  }
  
  @BeforeTest
   public void BeforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }
  
  @AfterTest
  public void AfterTest() {
	  
	  driver.close();
	  
  }
  
}


