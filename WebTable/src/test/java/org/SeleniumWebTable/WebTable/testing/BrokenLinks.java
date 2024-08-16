package org.SeleniumWebTable.WebTable.testing;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		for (WebElement AllLinks: Links) {
			String BkLinks = AllLinks.getAttribute("href");
			
			if ((BkLinks == null) || (BkLinks.isEmpty())){
				System.out.println("Broken Links");
				continue;
			}
			URL LinkUrl = new URL(BkLinks);
			HttpURLConnection connections = (HttpURLConnection)LinkUrl.openConnection();
			
			connections.connect();
			
			if (connections.getResponseCode() >= 400) {
				System.out.println(LinkUrl + " Broken Link");
			}
			else {
				System.out.println(LinkUrl + " Not a Broken Link");
			}
		}

	}

}
