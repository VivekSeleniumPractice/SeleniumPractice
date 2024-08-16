package org.SeleniumWebTable.WebTable.testing;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticWebTableDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		driver.get("https://blazedemo.com/");

		driver.manage().window().maximize();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//Select[@name=\"fromPort\"]")).click();

		WebElement Dep = driver.findElement(By.xpath("//Select[@name=\"fromPort\"]"));

		Select departure = new Select(Dep);

		departure.selectByVisibleText("Boston");

		driver.findElement(By.xpath("//Select[@name=\"toPort\"]")).click();

		WebElement Des = driver.findElement(By.xpath("//Select[@name=\"toPort\"]"));

		Select destination = new Select(Des);

		destination.selectByVisibleText("London");

		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

		ArrayList<String> PriceList = new ArrayList<String>();

		int PriceSize = driver.findElements(By.xpath("//table[@class=\"table\"]//tr")).size();

		System.out.println(PriceSize);

		int ColSize = driver.findElements(By.xpath("//table[@class=\"table\"]//td[6]")).size();

		for (int i = 1; i <= ColSize; i++) {

			String FlightPrice = driver
					.findElement(By.xpath("//table[@class=\"table\"]//tr[" + i + "]//td[" + PriceSize + "]")).getText();

			PriceList.add(FlightPrice);
		}

		Collections.sort(PriceList);

		String LowestPrice = PriceList.get(0);

		System.out.println(LowestPrice);

		for (int i = 1; i <= ColSize; i++) {

			String FlightPrice = driver
					.findElement(By.xpath("//table[@class=\"table\"]//tr[" + i + "]//td[" + PriceSize + "]")).getText();

			if (FlightPrice.equals(LowestPrice)) {
				System.out.println(FlightPrice);
				WebElement Element = driver.findElement(By.xpath("//table[@class=\"table\"]//tr[" + i + "]//td[1]"));

				Element.click();
				break;
			}
		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"inputName\"]")).sendKeys("Vivek Kumar");

		driver.findElement(By.xpath("//input[@id=\"address\"]")).sendKeys("NewTown");

		driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys("Kolkata");

		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

		String HeaderText = driver.findElement(By.xpath("//div//h1")).getText();

		if (HeaderText.equals("Thank you for your purchase today!")) {

			System.out.println("******Test Completed sucessfully*******");
		}

		Thread.sleep(2000);

		driver.quit();
	}
}
