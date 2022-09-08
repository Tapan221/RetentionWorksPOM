package com.ecomm.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ecomm.qa.base.TestBase;
import com.ecomm.qa.pages.FirstFit;
import com.ecomm.qa.pages.LoginPage;

public class FirstFitTest extends TestBase{
	LoginPage log;
	FirstFit home;

	public FirstFitTest() throws IOException {
		super();
		
	}
	
	@BeforeClass
	public void init() throws IOException, InterruptedException {
		TestBase.initilization();
		 log = new LoginPage();
		 home = new FirstFit();
		 log.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 0,groups="Test2-Home")
	public void dismissModal() {
		home.dismissThingsINeedToKnowModal();
	}
	
	@Test(priority = 1,groups="Test2.FirstFit")
	public void clickFirstFit() {
		home.clickFirstFit();
	}
	
	@Test(priority = 2,groups="Test2.FirstFit")
	public void FirstFitPage() throws InterruptedException {
		home.firstFitPage();
	}
	
	@Test(priority = 3 ,groups="Test2.FirstFit.FirstFitSection1")
	public void FirstFitQuestion1() throws InterruptedException {
		int option =1;
		int selectedOpt= home.FirstFitQuestion1(option);
		assertEquals(selectedOpt, 1);
	}
	@Test(priority = 4,groups="Test2.FirstFit.FirstFitSection1")
	public void FirstFitQuestion2() throws InterruptedException {
		int option =2;
		int selectedOpt= home.FirstFitQuestion2(option);
		assertEquals(selectedOpt, 2);
	}
	@Test(priority = 5,groups="Test2.FirstFit.FirstFitSection1")
	public void FirstFitQuestion3() throws InterruptedException {
		int option =3;
		int selectedOpt= home.FirstFitQuestion3(option);
		assertEquals(selectedOpt, 3);
	}
	@Test(priority = 6,groups="Test2.FirstFit.FirstFitSection1")
	public void FirstFitQuestion4() throws InterruptedException {
		int option =4;
		int selectedOpt= home.FirstFitQuestion4(option);
		assertEquals(selectedOpt, 4);
	}
	@Test(priority = 7,groups="Test2.FirstFit.FirstFitSection1")
	public void FirstFitQuestion5() throws InterruptedException {
		int option =5;
		int selectedOpt= home.FirstFitQuestion5(option);
		assertEquals(selectedOpt, 5);
	}
	@Test(priority = 8,groups="Test2.FirstFit.FirstFitSection1")
	public void FirstFitQuestion6() throws InterruptedException {
		int option =6;
		int selectedOpt= home.FirstFitQuestion6(option);
		assertEquals(selectedOpt, 6);
	}
	
	@Test(priority = 9,groups="Test2.FirstFit.FirstFitSection1")
	public void FirstFitQuestion7() throws InterruptedException {
		int option =7;
		int selectedOpt= home.FirstFitQuestion7(option);
		assertEquals(selectedOpt, 7);
	}
	
	@Test(priority = 10,groups="Test2.FirstFit.FirstFitSection1")
	public void FirstFitQuestion8() throws InterruptedException {
		int option =8;
		int selectedOpt= home.FirstFitQuestion8(option);
		assertEquals(selectedOpt, 8);
	}
	
	@Test(priority = 11,groups="Test2.FirstFit.FirstFitSection1")
	public void FirstFitQuestion9() throws InterruptedException {
		int option =9;
		int selectedOpt= home.FirstFitQuestion9(option);
		assertEquals(selectedOpt, 9);
	}
	
	@Test(priority = 12,groups="Test2.FirstFit.FirstFitSection1")
	public void FirstFitQuestion10() throws InterruptedException {
		int option =10;
		int selectedOpt= home.FirstFitQuestion10(option);
		assertEquals(selectedOpt, 10);
	}
	
	@Test(priority = 13,groups="Test2.FirstFit.FirstFitSection1")
	public void clickContinue() throws InterruptedException {
		home.continueButton();
	}
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
