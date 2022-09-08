package com.ecomm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecomm.qa.base.TestBase;
import com.ecomm.qa.utility.DropDownSelect;
import com.ecomm.qa.utility.SwitcToDifferentWindow;

public class TalentWatchGeneral extends TestBase {
	
	@FindBy(xpath="//a[text()='TalentWatch General']")
	WebElement talentWatch;
	
	@FindBy(xpath="//div[@id='modal-wrapper']")
	WebElement thingsINeedToKnowModal;
	
	@FindBy(xpath="//body/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
	WebElement closeButton;
	
	@FindBy(xpath="//tbody/tr[1]/td[1]/input[1]")
	WebElement continueButton;
	
	
	
	public TalentWatchGeneral() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void TalentWatchPage() throws InterruptedException {
		boolean isEnabled = thingsINeedToKnowModal.isEnabled();
		System.out.println("isEnabled" + isEnabled);
		closeButton.click();
		talentWatch.click();
		SwitcToDifferentWindow.switchToSpecificWindow(driver, 1);
		driver.switchTo().frame("pop_up_contents");
		
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[3]/td[3]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[4]/td[4]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[5]/td[5]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[8]/td[4]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[9]/td[5]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[11]/td[3]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[12]/td[4]/input[1]")).click();
		continueButton.click();
		
	}
	
	

}
