import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("ebilavarghese@gmail.com");
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("ilikerose22");
		
		//driver.findElement(By.id("u_0_2")).clear();
		driver.findElement(By.id("u_0_2")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		alert.accept();
		
		driver.close();

	}

}
