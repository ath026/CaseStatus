package com.caseStatus.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcessingTimesPage {
	
	WebDriver ldriver;
	
	public  ProcessingTimesPage (WebDriver driver){
		this.ldriver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath="//select[@id='selectForm']")
	public WebElement selectForm;
	
	
	@FindBy (xpath="//select[@id='officeOrCenter']")
	public WebElement selectOffice;
	
	
	@FindBy (xpath="//a[@id='getProcTimes']")
	public WebElement getProcessingtime;
	
	
	@FindBy (xpath="//div[contains(text(),'Based on a pending asylum')]/following-sibling::div")
	public WebElement runningdate;
	
	
	@FindBy (xpath="//div[@id='avgFormPTDesc']")
	public WebElement formdesc;
	

}
