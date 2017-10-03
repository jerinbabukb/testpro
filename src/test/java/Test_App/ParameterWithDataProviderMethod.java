package Test_App;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ParameterWithDataProviderMethod {
	
	public WebDriver driver;
	
	String FilePath = "C:\\Tools\\chromedriver_win32\\chromedriver.exe";
	
	
  @Test(dataProvider = "Testing")
  public void FBTest(String email, String password) throws InterruptedException {
	  
	  driver.get("https://www.facebook.com/");
	  
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(email);
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("pass")).clear();
	  driver.findElement(By.id("pass")).sendKeys(password);
	  Thread.sleep(1000);
	  
	  	  
  }
  
  @Test(dataProvider = "Testing")
  public void GTest(String email) throws InterruptedException {
	  
	  driver.get("https://www.google.com/");
	  
	  driver.findElement(By.id("lst-ib")).sendKeys(email);
	 // driver.findElement(By.id("email")).sendKeys(email);
	  Thread.sleep(1000);
	  
	 // driver.findElement(By.id("pass")).clear();
	//  driver.findElement(By.id("pass")).sendKeys(password);
	//  Thread.sleep(1000);
	  
	  	  
  }

  @DataProvider(name = "Testing")
  public Object[][] dp(Method m) {
	  
	  if(m.getName().equalsIgnoreCase("FBTest")) {
	  
    return new Object[][] {
      new Object[] { "efg@gmail.com", "efg@123" },
      new Object[] { "sdf@gmail.com", "sdf@123" },
    };
  }
	  else {
		  
		  return new Object[][] {
		      new Object[] {"Amsterdam" },
		      new Object[] {"Zeist" },
		    }; 
		  
	  }
	  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", FilePath);
	  driver = new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
