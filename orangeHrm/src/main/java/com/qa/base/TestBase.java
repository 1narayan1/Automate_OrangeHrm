package com.qa.base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;

	public TestBase() {

		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\naray\\eclipse-workspace\\orangeHrm\\src\\main\\"
					+ "java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	}

}