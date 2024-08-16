package org.SeleniumWebTable.WebTable.testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String inputYear = "2025";
		String inputMonth = "October";
		String inputdate = "12";

		driver.get("https://demo.automationtesting.in/Datepicker.html");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id= \"datepicker1\"]")).click();

		SelectFutureDate(driver, inputYear, inputMonth, inputdate);
	}

	public static void SelectFutureDate(WebDriver driver, String Year, String Month, String Date) {

		while (true) {
			String CurrentYear = driver.findElement(By.xpath("//span[@class= \"ui-datepicker-year\"]")).getText();

			String CurrentMonth = driver.findElement(By.xpath("//span[@class= \"ui-datepicker-month\"]")).getText();

			if (CurrentYear.equals(Year) && CurrentMonth.equals(Month)) {
				break;
			}
			driver.findElement(By.xpath("//span[contains(text(), \"Next\")]")).click();
		}

		driver.findElement(By.xpath("//span[contains(text(), '" + Month
				+ "')]/following-sibling::span[contains(text(), '" + Year
				+ "')]/ancestor::div/descendant::tbody/child::tr/child::td//a[contains(text(), '" + Date + "')]"))
				.click();
	}

	public static void SelectPastDate(WebDriver driver, String Year, String Month, String Date) {

		// using date picker Method

		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		while (true) {
			String CurrentMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();

			String CurrentYear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

			if (CurrentMonth.equals(Month) && CurrentYear.equals(Year)) {
				break;
			}

			driver.findElement(By.xpath("//a[@title=\"Next\"]")).click();
		}

		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//a"));

		for (WebElement dates : allDates) {
			if (dates.getText().equals(Date)) {
				dates.click();
			}
		}

	}

}
