package com.caseStatus.testCases;

import org.testng.annotations.Test;

import com.caseStatus.pageObjects.CaseStatusLanding;

public class checkEad extends BaseTestCase {
	
	@Test
	public void checkEadstatus() {
		CaseStatusLanding landing=new CaseStatusLanding(driver);
		landing.receiptInputBox.sendKeys("IOE0911167343");
		landing.checkStatus.click();		
		System.out.println(landing.result.getText());
	}

}
