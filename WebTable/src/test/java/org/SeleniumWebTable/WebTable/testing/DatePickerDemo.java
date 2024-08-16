package org.SeleniumWebTable.WebTable.testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) throws InterruptedException {

		String year = "2020";
		String month = "January";
		String day = "25";

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://jqueryui.com/datepicker");

		driver.manage().window().maximize();

		Thread.sleep(1000);

		driver.switchTo().frame(0);

		// SelectFutureDate(driver, year, month, day);

		SelectPastDate(driver, year, month, day);

	}

	public static void SelectFutureDate(WebDriver driver, String Year, String Month, String Date) {

		// using date picker Method

		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();

		while (true) {
			String CalYear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

			String CalMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();

			if (CalMonth.equals(Month) && CalYear.equals(Year)) {
				break;
			}
			driver.findElement(By.xpath("//a[@title = \"Next\"]")).click();
		}

		// Select date
		List<WebElement> AllDates = driver
				.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//a"));

		for (WebElement date : AllDates) {
			if (date.getText().equals(Date)) {
				date.click();
				break;
			}
		}
	}

	public static void SelectPastDate(WebDriver driver, String Year, String Month, String Date) {

		// using date picker Method

		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();

		while (true) {
			String CalYear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

			String CalMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();

			if (CalMonth.equals(Month) && CalYear.equals(Year)) {
				break;
			}
			driver.findElement(By.xpath("//a[@title = \"Prev\"]")).click();
		}

		// Select date
		List<WebElement> AllDates = driver
				.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//a"));

		for (WebElement date : AllDates) {
			if (date.getText().equals(Date)) {
				date.click();
				break;
			}
		}
	}

}
