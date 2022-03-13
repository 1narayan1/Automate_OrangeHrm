package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;


public class LeavePage extends TestBase{
	
	@FindBy(id="assignleave_txtEmployee_empName")
	WebElement empname;
	
	
	@FindBy(id="assignleave_txtLeaveType")
	WebElement leaveType;
	
	@FindBy(id="assignleave_txtFromDate")
	WebElement fromdate;
	
	@FindBy(id="assignleave_txtToDate")
	WebElement todate;
	
	@FindBy(id="assignleave_txtComment")
	WebElement comment;
	
	@FindBy(id="assignBtn")
	WebElement assignclick;
	
	@FindBy(id="confirmOkButton")
	WebElement okpopup;
	
	public LeavePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void formfilling() throws InterruptedException {
		
		empname.sendKeys("John Smith");
		
		Select sel = new Select(leaveType);
		sel.selectByValue("6");
		
		fromdate.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[3]/a")).click();
		
		todate.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[3]/a")).click();
		
		comment.sendKeys("Planned Leave for 5 days");
		
	}
	
	public void clickingonAssign() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(assignclick)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(okpopup)).click();
		
	}
	
	
	
	
	
	
	
	
}

