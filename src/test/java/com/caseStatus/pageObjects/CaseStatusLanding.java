package com.caseStatus.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CaseStatusLanding {
	
	public WebDriver Ldriver;
	
	public CaseStatusLanding(WebDriver driver) {
		this.Ldriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//div//input[@id='receipt_number']")
	public WebElement receiptInputBox;
	
	
	
	@FindBy(xpath="//div//input[@type='submit']")
	public WebElement checkStatus;
	
	
	@FindBy (xpath="//div[@class='rows text-center']")
	public WebElement result;
}
