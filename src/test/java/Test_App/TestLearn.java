package Test_App;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestLearn {
	
	
	public WebDriver driver;
	
	String BaseURL = "https://development.lincsafe.com/login";
	String FilePath = "C:\\Tools\\chromedriver_win32\\chromedriver.exe";
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.className("el-input__inner")).sendKeys("jerin@lincsafe.com");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='el-input__inner' and @type='password']")).sendKeys("Crown@01");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//button[@class='el-button submit button--right el-button--primary' and @type='submit']")).click();
	  Thread.sleep(1000);

	  	driver.findElement(By.xpath("//*[@id='wrapper']/div/div[1]/nav/ul/li[3]/a/i")).click();
	  	Thread.sleep(1000);
	  	driver.findElement(By.xpath(".//*[@id='wrapper']/div/div[4]/div/div[2]/div/div/div[1]/input")).sendKeys("jerin");
	  		Thread.sleep(1000);

	  		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[4]/div/div[2]/div/div/div[2]/div[2]/table/tbody/tr[1]/td[5]/a[1]/i")).click();
	  		Thread.sleep(1000);
	  		
	  		//driver.findElement(By.className("el-input__inner")).clear();
	  		//driver.findElement(By.className("el-input__inner")).sendKeys("123");
	  		
	  		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[4]/div/div[2]/div/form/div[4]/div/div/div/input")).clear();
	  		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[4]/div/div[2]/div/form/div[4]/div/div/div/input")).sendKeys("1234");
	  		Thread.sleep(1000);
	  		
	  		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[4]/div/div[2]/div/form/div[13]/button")).click();
	 
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", FilePath);
	  driver= new ChromeDriver();
	  driver.get(BaseURL);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	//driver.close();
  }

}
