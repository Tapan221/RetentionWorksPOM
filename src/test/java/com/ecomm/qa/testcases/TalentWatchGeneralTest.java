package com.ecomm.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ecomm.qa.base.TestBase;
import com.ecomm.qa.pages.FirstFit;
import com.ecomm.qa.pages.LoginPage;
import com.ecomm.qa.pages.TalentWatchGeneral;

public class TalentWatchGeneralTest extends TestBase {
	
	LoginPage log;
	TalentWatchGeneral talentWatch;

	public TalentWatchGeneralTest() throws IOException {
		super();
		
	}
	
	@BeforeClass
	public void init() throws IOException, InterruptedException {
		initilization();
		 log = new LoginPage();
		 talentWatch = new TalentWatchGeneral();
		 log.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 0,groups="Test3-TalentWatch")
	public void dismissModal() throws InterruptedException {
		talentWatch.TalentWatchPage();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
