package Test_App;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TakeScreenshot {
	
	public WebDriver driver;
	String FilePath = "C:\\Tools\\chromedriver_win32\\chromedriver.exe";
	String BaseURL = "https://www.facebook.com/";
	
	@Test
	  public void beforeTest() throws IOException {
		  System.setProperty("webdriver.chrome.driver", FilePath);
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get(BaseURL);
		  this.TakeScreenshot(driver, "C:\\Users\\Asus\\FBScreen.png");
		  driver.close();
	  }

  public void TakeScreenshot(WebDriver webdriver, String ImagePath) throws IOException {
	  
	  TakesScreenshot scrshot = (TakesScreenshot)webdriver;
	  File scrFile = scrshot.getScreenshotAs(OutputType.FILE);
	  
	  File destfile = new File(ImagePath);
	  FileUtils.copyFile(scrFile, destfile);
	  
  }
  
  
 


 

}
