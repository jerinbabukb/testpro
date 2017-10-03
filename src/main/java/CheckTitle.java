import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class CheckTitle {

	public static void main(String[] args) {
		
		File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile ffProfile = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(ffBinary,ffProfile);
		
		
		driver.get("https://www.yahoo.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		
		String ExpectedTitle = "Yahoo";
		String ActualTitle = driver.getTitle();
		
		System.out.println(ActualTitle);
		
		if(ActualTitle.contentEquals(ExpectedTitle)){
			
			System.out.println("Test Passed");	
		}
		else
		{
			System.out.println("Test Failed");
		}

		
		driver.close();
		//driver.quit();
	}

}
