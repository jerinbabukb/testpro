package Test_App;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Parameterization_Gmail {
	
	public WebDriver driver;
	String BaseURL = "https://www.facebook.com/";
	String FilePath = "C:\\Tools\\chromedriver_win32\\chromedriver.exe";
	
	
	
	
	
  @Test
  @Parameters({"email","password"})
  public void ParameterGmailTest(@Optional("abc") String email, @Optional("Abc")String password) throws InterruptedException {
	  
	  driver.findElement(By.id("email")).sendKeys(email);
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("pass")).sendKeys(password);
	  Thread.sleep(2000);
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", FilePath);
	  driver = new ChromeDriver();
	  driver.get(BaseURL);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
