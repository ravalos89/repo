package com.seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;  

public class SeleniumTest {
	
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
//		driver.close();
		
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/drivers/firefox/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.close();
		
		
		
	}
	

}
