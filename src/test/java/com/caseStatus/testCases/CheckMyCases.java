package com.caseStatus.testCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.caseStatus.pageObjects.CaseStatusLanding;
import com.caseStatus.pageObjects.ProcessingTimesPage;

public class CheckMyCases extends BaseTestCase {
	
	
	
	@Test
	public void checkAsyStatus() {
		CaseStatusLanding landing=new CaseStatusLanding(driver);
		landing.receiptInputBox.sendKeys("ZSF1500101050");
		landing.checkStatus.click();		
		
		text+="**********************************\n";
		text+=landing.result.getText()+"\n\n";
	
	}
	@Test(enabled=false)
	public void checkTpsStat() {
		CaseStatusLanding landing=new CaseStatusLanding(driver);
		landing.receiptInputBox.sendKeys("13178311");
		landing.checkStatus.click();		
		text+="****************I-821******************\n";
		text+=landing.result.getText()+"\n\n";
	}
	@Test(enabled=true)
	public void checkCaseWP() {
		CaseStatusLanding landing=new CaseStatusLanding(driver);
		landing.receiptInputBox.sendKeys("0911167343");
		landing.checkStatus.click();		
		text+="*********************************\n";
		text+=landing.result.getText()+"\n\n";
	}
	

	@Test	(enabled=false)
	public void checkCaseProcessingTimes() {
		driver.navigate().to("https://egov.uscis.gov/processing-times/");
		ProcessingTimesPage ptp=new ProcessingTimesPage(driver);
		Select form =new Select(ptp.selectForm);
		form.selectByVisibleText("I-765 | Application for Employment Authorization");
		Select office =new Select(ptp.selectOffice);
		office.selectByVisibleText("Potomac Service Center");		
		ptp.getProcessingtime.click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(ptp.formdesc));
		wait.until(ExpectedConditions.visibilityOf(ptp.runningdate));
		String running=ptp.runningdate.getText();
		text+="*****Potomac Processing***************\n";
		text+="Based on a pending case:A: "+running+"\n\n";
		driver.navigate().to("https://egov.uscis.gov/casestatus/landing.do");
	}

}
