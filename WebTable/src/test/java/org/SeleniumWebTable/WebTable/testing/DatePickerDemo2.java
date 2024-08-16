package org.SeleniumWebTable.WebTable.testing;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {

	public static void main(String[] args) throws InterruptedException {

		String requiredYear = "2019";
		String requiredMonth = "October";
		String requiredDay = "8";

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.switchTo().frame("frame-one796456169");

		driver.findElement(By.xpath("//span[@class=\"icon_calendar\"]")).click();

		WebElement DropDown = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"));

		Select CurrentYear = new Select(DropDown);

		CurrentYear.selectByVisibleText(requiredYear);

		while (true) {

			String displayMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();

			Month expectedMonth = ConvertMonth(requiredMonth);
			Month currentMonth = ConvertMonth(displayMonth);

			int result = expectedMonth.compareTo(currentMonth);

			if (result == 0) {
				// Select date
				List<WebElement> AllDates = driver
						.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//a"));

				for (WebElement date : AllDates) {
					if (date.getText().equals(requiredDay)) {
						date.click();
						break;
					}
				}
			} else if (result > 0) {

				driver.findElement(By.xpath("//a[@title=\"Next\"]")).click();
			} else if (result < 0) {
				driver.findElement(By.xpath("//a[@title=\"Prev\"]")).click();
			}

		}

	}

	static Month ConvertMonth(String month) {
		HashMap<String, Month> monthMap = new HashMap<String, Month>();

		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);

		Month vmonth = monthMap.get(month);

		if (vmonth == null) {
			System.out.println("Invalid Month.....");
		}

		return vmonth;
	}

}
