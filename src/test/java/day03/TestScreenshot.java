package day03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import library.Utility;



public class TestScreenshot {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\inpats52\\workspace\\sampletest\\src\\test\\resources\\browserexes\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/?p=us");
		driver.manage().window().maximize();
		Thread.sleep(4000);
Utility.getscreenshot(driver, "Sunil_1");
	}
}
