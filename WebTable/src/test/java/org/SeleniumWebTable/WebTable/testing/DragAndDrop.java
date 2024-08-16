package org.SeleniumWebTable.WebTable.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,600)", "");

		js.executeScript("arguments[0].value='JavaScriptTest';", driver.findElement(By.xpath("//input[@id=\"name\"]")));

//		js.executeScript("document.body.style.zoom = '50%'");
//		
//		Thread.sleep(2000);

		WebElement Source = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));

		WebElement Target = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));

		js.executeScript("arguments[0].scrollIntoView();", Source);

		Actions action = new Actions(driver);

		action.dragAndDrop(Source, Target).perform();
		Thread.sleep(2000);

		action.dragAndDropBy(driver.findElement(By.xpath("//div[@id=\"slider\"]")), 30, 0).perform();

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");

		driver.findElement(By.xpath("//input[@id=\"name\"]")).click();

		action.sendKeys().keyDown(Keys.CONTROL).keyDown("A").release().keyDown(Keys.CONTROL).keyDown("C").release()
				.build().perform();

		driver.findElement(By.xpath("//input[@id=\"email\"]")).click();

		action.sendKeys().keyDown(Keys.CONTROL).keyDown("V").release().build().perform();

	}

}
