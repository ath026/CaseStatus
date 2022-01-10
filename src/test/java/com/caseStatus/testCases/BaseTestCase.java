package com.caseStatus.testCases;

import java.util.concurrent.TimeUnit;

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
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://egov.uscis.gov/casestatus/landing.do");
		driver.manage().window().maximize();
		
		
	}
	
	
	@AfterTest	
	public void Teardown() {
		System.out.println(text);
		driver.quit();
		s.sendtext(text);
		
	}
}
