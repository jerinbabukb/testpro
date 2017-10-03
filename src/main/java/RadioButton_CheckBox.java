import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_CheckBox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		//Radio Button-Selecting by id or value and clicking
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_6")).click();
		Thread.sleep(2000);
		
		
		//Checking checkbox or toggle box is clicked or not
		
		driver.get("http://demo.guru99.com/selenium/webform/radio.html");
		WebElement check = driver.findElement(By.id("vfb-6-0"));
		
		check.click();
		Thread.sleep(2000);
		
		if(check.isSelected())
		{
			System.out.println("Check box is selected");
		}
		
		else {
			System.out.println("check box is not selected");
		}
		
		check.click();
		
		Thread.sleep(2000);
		
		if(!check.isSelected()) {
			
			System.out.println("check box is now deselected");
		}
		
		driver.close();


	}

}
