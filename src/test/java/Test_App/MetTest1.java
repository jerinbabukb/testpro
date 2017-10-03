package Test_App;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class MetTest1 {
	
	public WebDriver driver;
	String BaseURL = "https://eforms.metlife.com/";
	String FilePath= "C:\\Tools\\chromedriver_win32\\chromedriver.exe";
	
	//WebDriverWait wait = new WebDriverWait(driver,20);
	
	
  @Test
  public void f() throws Exception {
	  
	  driver.findElement(By.linkText("Annuities - Individual")).click();
	  
	  
	  //Selecting value from a dropdown
	  
	  //WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("whatToDo")));
	  //ele.click();
	  
	  Select dropdown = new Select(driver.findElement(By.id("whatToDo")));
	  dropdown.selectByValue("surwdrw");
	  Thread.sleep(2000);
	  
	  
	  Select drop1 = new Select(driver.findElement(By.id("surwdrw1")));
	  drop1.selectByValue("Partial or Full Withdrawal");
	  Thread.sleep(2000);
	  
	  Select drop2 = new Select(driver.findElement(By.id("surwdrw2")));
	  drop2.selectByValue("GIB - Guaranteed Income Builder");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("ezSearchSubmit")).click();
	  
	  //Check box testing
	  
	 // driver.findElement(By.id("addchkbx0")).click();
	 // Thread.sleep(4000);
	  
	 // driver.findElement(By.xpath("//tbody//tr[2]//td[2]//input[@id='addchkbx0']")).click();
	//  driver.findElement(By.xpath("//input[@value='||NURSINGCAREFORM||133||pdf||NA||Nursing Care Withdrawal Form#@']")).click();
	 // driver.findElement(By.xpath("//*[@id='contactTable']/tbody/tr[3]/td[2]/a")).click();
	  
	//  Thread.sleep(4000);
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @BeforeTest
  public void Initialization() {
	  
	  System.setProperty("webdriver.chrome.driver", FilePath);
	  driver=new ChromeDriver();
	  
	  driver.get(BaseURL);
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
	  
	  
  }

  @AfterTest
  public void LogoutApp() {
	  
	  driver.close();
  }

}
