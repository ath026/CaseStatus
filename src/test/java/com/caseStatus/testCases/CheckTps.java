package com.caseStatus.testCases;

import org.testng.annotations.Test;

import com.caseStatus.pageObjects.CaseStatusLanding;

public class CheckTps extends BaseTestCase {
	
	@Test
	public void checkTpsstatus() {
		CaseStatusLanding landing=new CaseStatusLanding(driver);
		landing.receiptInputBox.sendKeys("IOE0913178311");
		landing.checkStatus.click();		
		System.out.println(landing.result.getText());
	}


}
 