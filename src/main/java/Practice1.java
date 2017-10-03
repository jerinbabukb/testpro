import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Practice1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();       
		WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
		
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).sendKeys("jerinbabukb@gmail.com");
		
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("src")).sendKeys("coim");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='search']/div/div[1]/div/ul/li")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("dest")).sendKeys("bang");
		driver.findElement(By.xpath("//*[@id='search']/div/div[2]/div/ul/li[1]")).click();
		driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[5]/td[2]")).click();
		driver.findElement(By.id("search_btn")).click();
	

	}

}
