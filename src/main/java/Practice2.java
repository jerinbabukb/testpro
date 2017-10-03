import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {

	public static void main(String[] args) {
		
		File PathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(PathToBinary);
		FirefoxProfile ffProfile = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(ffBinary,ffProfile);
		
		driver.get("https://www.metlife.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class = 'homepage-nav__link']"));
		driver.findElement(By.xpath("//a[@id = 'homepage_tile-0_content-leftLinks4']")).click();
		
		driver.close();
		driver.quit();
	

	}

}
