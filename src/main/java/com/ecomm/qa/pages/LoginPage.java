package com.ecomm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecomm.qa.base.TestBase;

public class LoginPage extends TestBase{
	//OR Object Repository
	
	@FindBy(xpath="//input[@id='login']")
	WebElement loginId;

	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Log In')]")
	WebElement loginButton;
	

	//How to initialize page factory

	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	//Actions , features
	
//	public String getPageTitle() {
//		return driver.getTitle();
//	}
//	
//	public boolean validateLogo() {
//		return logo.isDisplayed();
//	}
	
	public void login(String un, String pwd) {
		
		loginId.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
	}

}
