import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestCase {

	public static void main(String[] args) {
		
		File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile ffProfile = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(ffBinary,ffProfile);
		
		driver.get("https://www.facebook.com/r.php");
		Select dropdown = new Select(driver.findElement(By.id("month")));
		dropdown.selectByValue("7");
		
		

	}

}
