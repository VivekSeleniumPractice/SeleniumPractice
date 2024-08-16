package org.SeleniumWebTable.WebTable.testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		// For all Fields of Web table
		/*
		 * List<WebElement> fields =
		 * driver.findElements(By.xpath("//table[@id=\"customers\"]//tr//td"));
		 * 
		 * System.out.println(fields.size());
		 * 
		 * for (WebElement allFields : fields) {
		 * System.out.println(allFields.getText()); }
		 */

		// For specific column of Web table
		List<WebElement> Colfields = driver
				.findElements(By.xpath("//div[@class=\"widget HTML\" and @id = \"HTML1\"]//tr[3]//td"));
		
		System.out.println(Colfields.size());

		for (WebElement allFields : Colfields) {
			System.out.println(allFields.getText());
		}
	}

}
