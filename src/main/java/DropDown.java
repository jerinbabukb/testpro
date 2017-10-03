import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	//Selecting single option from drop down
		
		//driver.get("https://www.facebook.com/");
		
		//Select dropdown = new Select(driver.findElement(By.id("month")));
		//dropdown.selectByVisibleText("Mar");
		
		//Select drop = new Select(driver.findElement(By.id("day")));
		//drop.selectByVisibleText("14");
	
//Selecting multiple options in a dropdown
		
		//driver.get("http://jsbin.com/osebed/2");
		//Select multiple = new Select(driver.findElement(By.id("fruits")));
		//multiple.selectByVisibleText("Banana");
		//Thread.sleep(2000);
		//multiple.selectByValue("apple");
		//Thread.sleep(2000);
		
//Checking Ismultiple condition, i.e, checking whether dropdown accepts multiple values
		
		driver.get("https://www.facebook.com/");
		
		Select mult = new Select(driver.findElement(By.id("month")));
		
		if(mult.isMultiple()) {
			
			mult.selectByVisibleText("Mar");
			Thread.sleep(2000);
			mult.selectByValue("4");
			
		}
		
		else {
			
			mult.selectByVisibleText("Jun");
			Thread.sleep(2000);
		}
		
		
		driver.close();
		
		

	}

}
