package com.automationpractice.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverHelper {
	static WebDriver driver = null;

	public static WebDriver createDriver(String Browser) {

		String browser = "Chrome";
		switch (browser) {

		case "Chrome":
			System.setProperty("webdriver.chrome.driver",
					"/Users/pdurgapal/Pooja-workspace/automationpractice/src/test/java/resources/drivers/chromedriver");
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com");
			break;
		case "FF":
			break;
		default:

			break;
		}
		return driver;

	}

}