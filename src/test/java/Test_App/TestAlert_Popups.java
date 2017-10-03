package Test_App;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestAlert_Popups {
	
	public WebDriver driver;
	String BaseURL = "http://demo.guru99.com//selenium//delete_customer.php";
	String filePath = "C:\\Tools\\chromedriver_win32\\chromedriver.exe";
	
	
  @Test
  public void f() throws Exception {
	  driver.findElement(By.name("cusid")).sendKeys("64566");
	  Thread.sleep(3000);
	  driver.findElement(By.name("submit")).submit();
	  Thread.sleep(3000);
	  
	  Alert alert = driver.switchTo().alert();
	 System.out.println( alert.getText());
	 
	 alert.accept();
	 Thread.sleep(3000);
	
	  
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", filePath);
	  
	  driver = new ChromeDriver();
	  
	  driver.get(BaseURL);
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
