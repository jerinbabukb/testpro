package pageobjectmodel;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class POMTest {
	
	public WebDriver driver;
	
	String FilePath ="C:\\Tools\\chromedriver_win32\\chromedriver.exe";
	String BaseURL = "http://demo.guru99.com/V4/";
	
	PomLogin objLogin;
	
  @Test()
  public void f() {
	  
	  objLogin= new PomLogin();
	  objLogin.setDriver(driver);
	  
	 String LoginPageTitle= objLogin.getPageTitle();
	 Assert.assertEquals(LoginPageTitle, "Guru99 Bank");
	  
	 // Assert.assertTrue(LoginPageTitle.toLowerCase().contains("guru99 bank"));
		  System.out.println("Test Passed");
	 
  }


  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", FilePath);
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.get(BaseURL);
  }

  @AfterTest
  public void afterTest() {
  }

}
