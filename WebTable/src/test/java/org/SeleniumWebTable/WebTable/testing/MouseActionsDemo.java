package org.SeleniumWebTable.WebTable.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://testsigma.com/blog/action-class-in-selenium/");

		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		
		WebElement Products = driver.findElement(By.xpath("//div//p[contains(text(),\"Products\")]"));
		
		action.moveToElement(Products).build().perform();
		
		Thread.sleep(1000);

		WebElement Cloud = driver.findElement(By.xpath("//a[contains(text(),\"Cloud Edition\")]"));

		action.moveToElement(Cloud).click().build().perform();

	}

}
