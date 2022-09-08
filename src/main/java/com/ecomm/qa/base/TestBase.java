package com.ecomm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ecomm.qa.utility.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	//This is parent
	public static WebDriver driver;
	public static Properties prop;

	

	public static void initilization() throws IOException {
		
		prop = new Properties();
		FileInputStream myFile = new FileInputStream("src//main//java//com//ecomm//qa//config//config.properties");
		prop.load(myFile);

		String browserName = prop.getProperty("browser");
		

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}

}
