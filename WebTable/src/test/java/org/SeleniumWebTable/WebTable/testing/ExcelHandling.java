package org.SeleniumWebTable.WebTable.testing;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExcelHandling {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		//options.addArguments("--Incognito");
		
		options.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot sc = (TakesScreenshot)driver;
		
		File Source = sc.getScreenshotAs(OutputType.FILE);
		
		File target = new File(System.getProperty("user.dir")+ "\\ScreenShots\\FullPage.Png");
		
		System.out.println(System.getProperty("user.dir"));
		
		Source.renameTo(target);

	}

}
