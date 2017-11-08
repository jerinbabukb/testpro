package Test_App;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;

public class CrossBrowserTesting {
	
	
	public WebDriver driver;
	String BaseURL = "https://www.facebook.com/";
	String ChromePath = "C:\\Tools\\chromedriver_win32\\chromedriver.exe";
	String FirefoxPath = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
	String EdgePath = "C:\\Tools\\MicrosoftWebDriver.exe";
	
	
  @Test
  public void CrossBrowserTest() throws InterruptedException {
	  
	  driver.get(BaseURL);
	Thread.sleep(2000);
	  
	 
  }
  
  
  @BeforeTest
  
  @Parameters("browser")
  public void beforeTest(String browser) throws Exception {
	  
	  if(browser.equalsIgnoreCase("Chrome")) {
		  
		  System.setProperty("webdriver.chrome.driver", ChromePath);
		  driver = new ChromeDriver();
	  }
	  
	  else if(browser.equalsIgnoreCase("Firefox")) {
		  File path = new File(FirefoxPath);
		  FirefoxBinary pathToBinary = new FirefoxBinary(path);
		  FirefoxProfile ffProfile = new FirefoxProfile();
		  driver = new FirefoxDriver(pathToBinary,ffProfile);
	  }
	  
	  else if(browser.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.edge.driver", EdgePath);
		  driver = new EdgeDriver();
		  
	  }
	  
	  else
	  {
		  throw new Exception("Invalid Browser");
	  }
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
