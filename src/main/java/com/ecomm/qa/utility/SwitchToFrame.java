package com.ecomm.qa.utility;

import org.openqa.selenium.WebDriver;

public class SwitchToFrame {
	public static void frameName(WebDriver driver, String name) {
		driver.switchTo().frame(name);
	}
}
