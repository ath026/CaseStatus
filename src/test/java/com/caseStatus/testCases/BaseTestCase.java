package com.caseStatus.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestCase {
	
	public WebDriver driver;
	public String text="";
	SmsSender s= new SmsSender();
	@BeforeTest
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://egov.uscis.gov/casestatus/landing.do");
		driver.manage().window().maximize();
		
		
	}
	
	
	@AfterTest	
	public void Teardown() {		
		driver.quit();
		s.sendtext(text);
		
	}
}