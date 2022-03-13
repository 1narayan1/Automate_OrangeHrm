package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Homepage extends TestBase{
	
	@FindBy(xpath="//img[@alt='OrangeHRM']")
	WebElement OrangeHRMLogo;
	
	@FindBy(xpath="//span[contains(text(),'Assign Leave')]")
	WebElement assignleaveclick;
	
	
	
	public Homepage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean validatingOrangeHRMlogo() {
		
		return OrangeHRMLogo.isDisplayed();
	}
	
	public LeavePage clickingassignleave() {
		assignleaveclick.click();
		return new LeavePage();
	}
	
	

}
