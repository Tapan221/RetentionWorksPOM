package com.ecomm.qa.utility;

import java.util.List;

import org.openqa.selenium.WebElement;

public class DropDownSelect {
	
	public static int selectSpecificOption( int index, List<WebElement> elements) {
		String selectedIndex = "";		
		for(WebElement ele: elements) {
			if(ele.getText().equals(Integer.toString(index))) {
				selectedIndex= ele.getText();
				ele.click();
				
				break;
			}
		}
		return Integer.parseInt(selectedIndex);
	}

}
