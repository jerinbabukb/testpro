package pageobjectmodel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class PomLogin {
	
	public WebDriver driver;
	
	By GuruUsername = By.name("uid");
	By GuruPassword = By.name("password");
	By GuruTitle= By.className("barone");
	By GuruLogin = By.name("btnLogin");
	
	public void setDriver(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public void setUsername(String Username) {
		
		driver.findElement(GuruLogin).sendKeys(Username);
		
		
	}
	
	public void setPassword(String Password) {
		
		driver.findElement(GuruPassword).sendKeys(Password);
	}
	
	public void clickLogin() {
		
		driver.findElement(GuruLogin).click();
	}
	
	public String getPageTitle() {
		
		return driver.findElement(GuruTitle).getText();
		
		
	}
	
	
	public void loginToHome(String Username, String Password) {
		this.setUsername(Username);
		this.setPassword(Password);
		this.clickLogin();
	}
	
	


}
