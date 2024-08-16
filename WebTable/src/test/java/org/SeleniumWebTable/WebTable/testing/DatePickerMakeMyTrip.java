package org.SeleniumWebTable.WebTable.testing;

import java.time.Duration;
import java.time.Month;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class DatePickerMakeMyTrip {

	public static void main(String[] args) throws InterruptedException {

		String year = "2025";
		String month = "March";
		String day = "15";

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		int YearEnd = Integer.parseInt(year);

		if (YearEnd < (YearEnd + 1)) {
			SelectDate(driver, year, month, day);
		}
	}

	public static void SelectDate(WebDriver driver, String Year, String Month, String Date) {

		driver.findElement(By.xpath("//div[@class=\"flt_fsw_inputBox dates inactiveWidget \"]")).click();

		while (true) {

			String CalYearText = driver.findElement(By.xpath("//div[@class=\"DayPicker-Caption\"]/div[1]"))
					.getText();


			String[] CalMonthYearText = CalYearText.split(" ");

			if (CalMonthYearText[0].equals(Month) && CalMonthYearText[1].equals(Year)) {
				break;
			}
			driver.findElement(By.xpath(
					"//div[@class=\"DayPicker-NavBar\"]//span[@class=\"DayPicker-NavButton DayPicker-NavButton--next\"]"))
					.click();
		}
		
	driver.findElement(By.xpath(
				"//div[contains(text(),'"+Month+" "+Year+"')]/../..//div[@class=\"DayPicker-Day\"]//p[not(@class)][text()='"+Date+"']")).click();

	}

}
