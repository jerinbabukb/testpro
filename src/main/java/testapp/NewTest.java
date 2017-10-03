package testapp;



import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest{
	

	
  @Test(priority=0)
  public void f() {
	  
		System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    System.out.println("############### before ############");
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys("hasgdjashgd@gmail.com");
	  
	  driver.findElement(By.id("pass")).clear();
	  driver.findElement(By.id("pass")).sendKeys("hgahsgdashd");
//	  driver.quit();
  }
  
  
  @BeforeMethod
  public void beforeMethod() {

  }
  
  
  

  @AfterMethod
  public void afterMethod() {
	  

  }

}
