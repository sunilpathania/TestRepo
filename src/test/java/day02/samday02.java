package day02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class samday02 {

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/inpats52/workspace/sampletest/src/test/resources/browserexes/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.makemytrip.com/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[contains(@id,'depart')]")).click();
			List<WebElement> dates = driver.findElements(
					By.xpath("(//div[@class='ui-datepicker-group ui-datepicker-group-first']//table)[1]//tr//td//a"));

			for (WebElement applicationdates : dates) {
				String dt =applicationdates.getText();
				System.out.println("The dates are "+dt);
				
				if (dt.equalsIgnoreCase("29")) {
					applicationdates.click();
					break;
				}
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
