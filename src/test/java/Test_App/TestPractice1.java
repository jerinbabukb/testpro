package Test_App;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestPractice1 {
	

	  String BaseURL = "https://www.facebook.com";
	  String DriverPath= "C:\\Tools\\chromedriver_win32\\chromedriver.exe";
	  
	  public WebDriver driver;
	  
  @Test
  public void Initialization() {
	  
	 
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", DriverPath);
	   driver = new ChromeDriver();
	   driver.get(BaseURL);
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
