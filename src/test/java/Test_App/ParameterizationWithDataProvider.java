package Test_App;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ParameterizationWithDataProvider {
	
	public WebDriver driver;
	
	String BaseURL = "https://www.facebook.com/";
	String FilePath = "C:\\Tools\\chromedriver_win32\\chromedriver.exe";
	
	
	
  @Test(dataProvider = "FaceBookTest")
  public void facebookTest(String email, String password) throws InterruptedException {
	  
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(email);
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("pass")).clear();
	  driver.findElement(By.id("pass")).sendKeys(password);
	  Thread.sleep(1000);
  }

  @DataProvider(name = "FaceBookTest")
  public Object[][] passValueToFB() {
    return new Object[][] {
    	
      new Object[] { "abc@gmail.com", "abc@123" },
      new Object[] { "efg@gmail.com", "efg@123" },
      new Object[] { "hij@gmail.com", "hij@123" },
      new Object[] { "klm@gmail.com", "klm@123" },
    };
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", FilePath);
	  driver= new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get(BaseURL);
  }
  
  

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
