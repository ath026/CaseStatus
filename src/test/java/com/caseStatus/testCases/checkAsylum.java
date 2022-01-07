package com.caseStatus.testCases;

import org.testng.annotations.Test;

import com.caseStatus.pageObjects.CaseStatusLanding;

public class checkAsylum extends BaseTestCase {
	
	
	
	@Test
	public void checkAsyStatus() {
		CaseStatusLanding landing=new CaseStatusLanding(driver);
		landing.receiptInputBox.sendKeys("ZSF1500101050");
		landing.checkStatus.click();		
		System.out.println(landing.result.getText());
		text+="***************I-589*******************\n";
		text=text+=landing.result.getText()+"\n\n";
	
	}
	@Test
	public void checkTpsstatus() {
		CaseStatusLanding landing=new CaseStatusLanding(driver);
		landing.receiptInputBox.sendKeys("IOE0913178311");
		landing.checkStatus.click();		
		text+="****************I-821******************\n";
		text=text+=landing.result.getText()+"\n\n";
	}
	@Test
	public void checkEadstatus() {
		CaseStatusLanding landing=new CaseStatusLanding(driver);
		landing.receiptInputBox.sendKeys("IOE0911167343");
		landing.checkStatus.click();		
		text+="****************I-765*****************\n";
		text=text+=landing.result.getText()+"\n\n";
	}
	
	

}
