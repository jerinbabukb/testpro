package com.screenshots;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class GetScreenshot extends MainTest {

	
	//public static WebDriver driver;
	
	public static String capture(String screenshotName) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+"\\ErrorScreenshot\\"+screenshotName+".png";
		File destination = new File(dest);
		FileUtils.copyFile(source,destination);
		return dest;
	}
	
}
