package com.qa.testcases;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Homepage;
import com.qa.pages.Loginpage;
import com.qa.pages.LeavePage;

public class LeavePageTest extends TestBase {

	Loginpage login;
	Homepage homepage;
	LeavePage leave;

	public LeavePageTest() {
		super();
	}

	@BeforeTest
	public void setUp() throws InterruptedException {
		initialization();
		Loginpage login = new Loginpage();
		homepage = login.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
		homepage.clickingassignleave();
		leave = new LeavePage();
	}

	@Test()
	public void completeformfill() throws InterruptedException {
		leave.formfilling();
		Thread.sleep(5000);
		leave.clickingonAssign();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
