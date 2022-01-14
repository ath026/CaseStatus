package com.caseStatus.testCases;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestCase {
	
	public WebDriver driver;
	public String text="Hello";
	SmsSender s= new SmsSender();
	@BeforeTest
	public void setup() {
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		if (os.contains("Windows")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver();
		}else {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
			File file = new File("./Driver/chromedriver");
			file.setExecutable(true);
			ChromeOptions options  = new ChromeOptions();			
			options .addArguments("window-size=1400,600");
			options.addArguments("--disable-extensions");
			options.addArguments("--headless");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--remote-debugging-port=9515");
			options.addArguments("--disable-setuid-sandbox");
			options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.4692.71 Safari/537.36;");
	        driver=new ChromeDriver(options);
		}
		

		
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
