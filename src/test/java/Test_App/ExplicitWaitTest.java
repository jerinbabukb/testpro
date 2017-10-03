package Test_App;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class ExplicitWaitTest {
	
	public WebDriver driver;
	
	String BaseURL = "http://demo.guru99.com/selenium/guru99home/";
	String filePath = "C:\\Tools\\chromedriver_win32\\chromedriver.exe";
	
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", filePath);
	  driver= new ChromeDriver();
	  WebDriverWait wait = new WebDriverWait(driver,20);
	  driver.get(BaseURL);
	  
	  WebElement ele;
		ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
	  ele.click();
		
		
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
