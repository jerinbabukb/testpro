import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertOrPopupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://jsbin.com/usidix/1");
		//driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
	    driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
	    String alertmessage = driver.switchTo().alert().getText();
	    driver.switchTo().alert().accept();
	    System.out.println(alertmessage);

	}

}
