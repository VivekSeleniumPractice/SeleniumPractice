package org.SeleniumWebTable.WebTable.testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationWebTable {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		Thread.sleep(1000);

		String LastPage = driver.findElement(By.xpath("//ul//a[text()=\"4\"]")).getText();

		int PageLast = Integer.parseInt(LastPage);

		int RowSize = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tr")).size();

		int ColSize = driver.findElements(By.xpath("//table[@id=\"productTable\"]//th")).size();

		for (int i = 1; i <= PageLast; i++) {
			driver.findElement(By.xpath("(//ul[@id=\"pagination\"]//a)[" + i + "]")).click();
			for (int r = 1; r <= RowSize; r++) {
				for (int j = 1; j <= ColSize; j++) {
					List<WebElement> TableField = driver
							.findElements(By.xpath("//table[@id=\"productTable\"]//tr[" + r + "]//td[" + j + "]"));
					for (WebElement Field : TableField) {
						String FieldValues = Field.getText();
						System.out.printf("%-20s", FieldValues);
					}
				}
				System.out.println();
			}
		} 
		driver.quit();
	}
}
