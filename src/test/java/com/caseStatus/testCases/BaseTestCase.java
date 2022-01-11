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
	/*
	 *When Running script on linux , set driver to chromedriver instead of chromedriver.exe
	 */

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
/* For setting chromedriver binary file permission when running in linux
		File file = new File("./Driver/chromedriver");
		file.setExecutable(true);
 
*/
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
