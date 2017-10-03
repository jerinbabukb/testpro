package Test_App;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DynamicTableTest {
	
	public WebDriver driver;
	
	String FilePath = "C:\\Tools\\chromedriver_win32\\chromedriver.exe";
	String BaseURL = "http://money.rediff.com/gainers/bsc/daily/groupa";
	
	
	
  @Test
  public void DynamicTableTest() throws InterruptedException {
	  
	  WebElement baseTable = driver.findElement(By.tagName("table"));
	    
	    //To fimd third row of table
	    WebElement tableRow = baseTable.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[2]"));
	    
   	    String rowtext = tableRow.getText();
	    System.out.println("Third row of table : "+rowtext);
	    

	    //To find column size
	    
	    List <WebElement> col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	    System.out.println("No of cols are : " +col.size()); 
	    
	   // System.out.println("Column Size is + "col.size());
	   
	    //List <WebElement> col1 = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	    
	  Thread.sleep(2000);
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
	  
	 // driver.close();
  }

}
