import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();


		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ebilavarghese@gmil.com");
		driver.findElement(By.id("pass")).sendKeys("ilikerose22");
		driver.findElement(By.id("u_0_2")).submit();
		
		//Difference between click and submit
		
		//Submit() will submit the entire form whereas Click() is just to clicka button.
		
		

	}

}
