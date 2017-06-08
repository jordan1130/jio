package jio.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class Util {
	static WebDriver driver = null;

	@DataProvider(name = "browser")
	public void getBrowser(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./resourse/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}

	}
}
