package testapp;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class TestingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File pathtoBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");	
		
		FirefoxBinary ffBinary = new FirefoxBinary(pathtoBinary);
		FirefoxProfile ffProfile = new FirefoxProfile();
		
		WebDriver driver = new FirefoxDriver(ffBinary,ffProfile);
		
		driver.get("http://192.168.2.6:8080/TestWebAapp/");
		
		driver.findElement(By.xpath("//a[@name = 'login']")).click();
		
		//driver.findElement(By.linkText("login")).click();
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("ebila");
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Ebila123");
		
		//driver.findElement(By.)
	    driver.findElement(By.xpath("//input[@value='login' and @type='submit']")).click();

		
	//driver.close();

	}

}
