package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static void getscreenshot(WebDriver driver, String ScreenshotName)
	{
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(source, new File("./Screenshots"+ScreenshotName+".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
}
