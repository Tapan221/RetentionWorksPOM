package com.ecomm.qa.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollFeatures {
	
	public static void scrollDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}
