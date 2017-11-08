package Test_App;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.lang.ref.PhantomReference;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.AfterTest;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;	

public class HeadlessBrowserTest {
	
	// To test the headless browsers like HtmlUntDriver and PantomJS
	// These are drivers without any GUI.It will work like IE or Chrome or Mozilla
	//But we cannot see the test execution on screen
	
	public WebDriver driver;
	
	String BaseURL = "https://www.facebook.com/";
	String FilePath = "C:\\Tools\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe";
	
  @Test
  public void f() {
	  
	  System.out.println(driver.getTitle());
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	 //System.setProperty("phantomjs.binary.path", FilePath);
	//File file = new File("C:\\Tools\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");				
    System.setProperty("phantomjs.binary.path", FilePath);
    driver = new PhantomJSDriver();
    
    
	  //driver = new HtmlUnitDriver();
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.get(BaseURL);
  }

  
  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
