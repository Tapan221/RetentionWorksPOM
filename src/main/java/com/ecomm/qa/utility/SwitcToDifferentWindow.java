package com.ecomm.qa.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwitcToDifferentWindow {
	
	public static void switchToSpecificWindow(WebDriver driver ,int id){
		Set<String> allWindow = driver.getWindowHandles();
		List<String> listOfWindow = new ArrayList<>(allWindow);
		driver.switchTo().window(listOfWindow.get(id)).manage().window().maximize();
	}

}
