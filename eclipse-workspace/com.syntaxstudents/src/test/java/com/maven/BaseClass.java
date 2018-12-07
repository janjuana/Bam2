package com.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class BaseClass {

	
	@Test 
	public void SetUp() {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\com.syntaxstudents\\Drivers\\chromedriver.exe");
		WebDriver driver = new HtmlUnitDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
}
