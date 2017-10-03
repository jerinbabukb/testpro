package Test_App;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MetTest2_Upload {
	
	public WebDriver driver;
	
	String BaseURL = "http://demo.guru99.com/selenium/upload/";
	String filePath = 	"C:\\Tools\\chromedriver_win32\\chromedriver.exe";	
 
			@Test
  public void f() throws Exception {
				
				driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Asus\\Documents\\SQLWave\\profiles.xml");
				Thread.sleep(2000);
				
				
  }
			
			
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", filePath);
	  driver = new ChromeDriver();
	  driver.get(BaseURL);
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
