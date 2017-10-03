import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitAndExplicitWait {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		//ImplicitWait
		//It will set the default waiting time throughout the program
		
		//ExplicitWait
		//Used to set the waiting time for a particular instance only
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		//Explicit wait
		
		//Here it will search for an element with "email" id until 30 seconds. If it couldn't find that element
		//within that time frame it will throw timeout exception
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		driver.findElement(By.id("email")).sendKeys("Ebila");
		Thread.sleep(3000);
		
		driver.close();
	}
}