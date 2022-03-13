package com.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.base.TestBase;
import com.qa.pages.Homepage;
import com.qa.pages.Loginpage;

public class LoginpageTest extends TestBase {
	public Loginpage login;

	public LoginpageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		login = new Loginpage();
	}

	@Test
	public void loginTest() {

		Homepage home = login.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
