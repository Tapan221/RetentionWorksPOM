package com.ecomm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ecomm.qa.base.TestBase;
import com.ecomm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage obj ;

	public LoginPageTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void init() throws IOException {
		initilization();
		 obj = new LoginPage();
	}
	
	@Test(groups="Test1-login")
	public void testLogin() throws InterruptedException {
		obj.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
