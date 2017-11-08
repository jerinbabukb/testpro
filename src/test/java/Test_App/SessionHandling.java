package Test_App;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SessionHandling {
	
	public WebDriver driver;
	
	public WebDriver driver2;
	
	String FilePath = "C:\\Tools\\chromedriver_win32\\chromedriver.exe";
	String BaseURL = "https://www.facebook.com/";
	
  @Test(priority = 0)
  
  //Adding Priority will make the function "f" to execute first
  public void f() {
	  
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.get(BaseURL);
	  
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	  
	  driver.findElement(By.id("pass")).clear();
	  driver.findElement(By.id("pass")).sendKeys("Abc@123");
  }
  
  
  @Test(priority = 1)
  //Since priority is 1,it will execute after function "f"
  public void SecondFn() {
	  driver2 = new ChromeDriver();
	  //This will create a new session ID.Whenever a new instance of WebDriver object is created, 
	  //a new session id will also be generated
	  driver2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver2.get(BaseURL);
	  driver2.findElement(By.id("email")).clear();
	  driver2.findElement(By.id("email")).sendKeys("efg@gmail.com");
	  
	  driver2.findElement(By.id("pass")).clear();
	  driver2.findElement(By.id("pass")).sendKeys("Efg@123");
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", FilePath);
	 
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  driver2.close();
  }

}
