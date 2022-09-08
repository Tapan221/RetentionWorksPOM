package com.ecomm.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecomm.qa.base.TestBase;
import com.ecomm.qa.utility.DropDownSelect;
import com.ecomm.qa.utility.ScrollFeatures;
import com.ecomm.qa.utility.SwitcToDifferentWindow;
import com.ecomm.qa.utility.SwitchToFrame;

public class FirstFit extends TestBase {
	
	//OR Object Repository
	
	@FindBy(xpath="//div[@id='modal-wrapper']")
	WebElement thingsINeedToKnowModal;
	
	@FindBy(xpath="//body/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
	WebElement closeButton;
	
	@FindBy(xpath="//a[text()='FirstFit']")
	WebElement firstFit;
	
	@FindBy(xpath="//tbody/tr[1]/td[3]/select[1]/option")
	List<WebElement> allOptions1;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/select[1]/option")
	List<WebElement> allOptions2;
	
	@FindBy(xpath="//tbody/tr[3]/td[3]/select[1]/option")
	List<WebElement> allOptions3;
	
	@FindBy(xpath="//tbody/tr[4]/td[3]/select[1]/option")
	List<WebElement> allOptions4;
	
	@FindBy(xpath="//tbody/tr[5]/td[3]/select[1]/option")
	List<WebElement> allOptions5;
	
	@FindBy(xpath="//tbody/tr[6]/td[3]/select[1]/option")
	List<WebElement> allOptions6;
	
	@FindBy(xpath="//tbody/tr[7]/td[3]/select[1]/option")
	List<WebElement> allOptions7;
	
	@FindBy(xpath="//tbody/tr[8]/td[3]/select[1]/option")
	List<WebElement> allOptions8;
	
	@FindBy(xpath="//tbody/tr[9]/td[3]/select[1]/option")
	List<WebElement> allOptions9;
	
	@FindBy(xpath="//tbody/tr[10]/td[3]/select[1]/option")
	List<WebElement> allOptions10;
	
	@FindBy(xpath="//tbody/tr[1]/td[1]/input[1]")
	WebElement continueButton;
	
	
	
	
	
	
	
	

	

	//How to initialize page factory

	public FirstFit() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void dismissThingsINeedToKnowModal() {
		
		boolean isEnabled = thingsINeedToKnowModal.isEnabled();
		System.out.println("isEnabled" + isEnabled);
		closeButton.click();
	}
	
	public void clickFirstFit() {
		firstFit.click();
	}
	
	public void firstFitPage() throws InterruptedException {
		firstFit.click();
		SwitcToDifferentWindow.switchToSpecificWindow(driver, 1);
		
	}
	
	public int FirstFitQuestion1(int index) throws InterruptedException {
		driver.switchTo().frame("pop_up_contents");
		int selectedIndex = DropDownSelect.selectSpecificOption(index, allOptions1);
		return selectedIndex;
	}
	
	public int FirstFitQuestion2(int index) throws InterruptedException {
		int selectedIndex = DropDownSelect.selectSpecificOption(index, allOptions2);
		return selectedIndex;
	}
	
	public int FirstFitQuestion3(int index) throws InterruptedException {
		int selectedIndex = DropDownSelect.selectSpecificOption(index, allOptions3);
		return selectedIndex;
	}
	public int FirstFitQuestion4(int index) throws InterruptedException {
		int selectedIndex = DropDownSelect.selectSpecificOption(index, allOptions4);
		return selectedIndex;
	}
	public int FirstFitQuestion5(int index) throws InterruptedException {
		int selectedIndex = DropDownSelect.selectSpecificOption(index, allOptions5);
		return selectedIndex;
	}
	public int FirstFitQuestion6(int index) throws InterruptedException {
		int selectedIndex = DropDownSelect.selectSpecificOption(index, allOptions6);
		return selectedIndex;
	}
	public int FirstFitQuestion7(int index) throws InterruptedException {
		int selectedIndex = DropDownSelect.selectSpecificOption(index, allOptions7);
		return selectedIndex;
	}
	
	public int FirstFitQuestion8(int index) throws InterruptedException {
		int selectedIndex = DropDownSelect.selectSpecificOption(index, allOptions8);
		return selectedIndex;
	}
	
	public int FirstFitQuestion9(int index) throws InterruptedException {
		int selectedIndex = DropDownSelect.selectSpecificOption(index, allOptions9);
		return selectedIndex;
	}
	
	public int FirstFitQuestion10(int index) throws InterruptedException {
		int selectedIndex = DropDownSelect.selectSpecificOption(index, allOptions10);
		return selectedIndex;
	}
	
	public void continueButton() throws InterruptedException {
		continueButton.click();
	}

}
