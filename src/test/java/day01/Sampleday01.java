package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sampleday01 {

	public WebDriver driver;

	@Test(priority = 1)
	public void LaunchWebsite() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/inpats52/workspace/sampletest/src/test/resources/browserexes/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/");

	}

	@Test(priority = 2)
	public void Registration() {
		driver.findElement(By.linkText("Registration")).click();
		String title = driver.getTitle();
		if (!title.equalsIgnoreCase("http://demoqa.com/registration/")) {
			System.out.println("User is on the correct landing page" + title);
		}
		String message = driver.findElement(By.xpath("//div[@class='textwidget']")).getText();
		System.out.println("Print the About Us Section Message" + message);

	}

}
