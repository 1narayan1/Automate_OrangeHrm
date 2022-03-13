package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Homepage;
import com.qa.pages.Loginpage;
import com.qa.pages.LeavePage;


public class HomePageTest extends TestBase {

	Loginpage login;
	Homepage homepage;
	LeavePage leave;
	
	public HomePageTest() {
		
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initialization();
		login = new Loginpage();
		homepage = new Homepage(); 
		homepage = login.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void validateLogo() {
		
		Boolean flag = homepage.validatingOrangeHRMlogo();
		Assert.assertTrue(flag,"Logo text doesnt match");
	}
	
	
	@Test(priority = 2)
    public void assignLeaveClick() {
    	
    	homepage.clickingassignleave();
    	
    }

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
