import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		driver.switchTo().frame("classFrame");
		//The page is divided into 3 frames. So if we go by selecting the frame in which 
		//the hyperlink exists, it can easily find the element.If we just go with linktext,
		// it may take time to find that particular element.
		//To found out the frame name, in mozilla firepath, open HTML tab, open frameset tag, chck the name of frame. 
		driver.findElement(By.linkText("Deprecated")).click();
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Actions")).click();
		
		driver.close();
		
		
	}

}
