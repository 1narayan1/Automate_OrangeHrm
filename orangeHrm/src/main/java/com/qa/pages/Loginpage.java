package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Loginpage extends TestBase{
	
	
	@FindBy(id="txtUsername")
	WebElement Username;
	

	@FindBy(id="txtPassword")
	WebElement Password;
	

	@FindBy(id="btnLogin")
	WebElement LoginButton;
	
	
	
	public Loginpage() {
	PageFactory.initElements(driver, this);
  }
    
	
	
    public Homepage login(String user, String password) {
    	
    	Username.sendKeys(user);
    	Password.sendKeys(password);
    	LoginButton.click();
    	return new Homepage();
    }
    
    
    
}
