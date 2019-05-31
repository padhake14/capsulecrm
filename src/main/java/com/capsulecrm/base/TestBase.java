package com.capsulecrm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.capsulecrm.util.WebEventListener;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;

	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;

	public TestBase() {
		log = Logger.getLogger(this.getClass());
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(".\\src\\main\\java\\com\\capsulecrm\\config\\config.properties");

			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String OS = prop.getProperty("OS");

		if (OS.equalsIgnoreCase("windows")) {
			System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (OS.equalsIgnoreCase("mac")) {
			System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver");
			driver = new ChromeDriver();

		} else {
			System.out.println("Unable to launch the browser=" + OS);

		}

		e_driver = new EventFiringWebDriver(driver);

		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}

}
