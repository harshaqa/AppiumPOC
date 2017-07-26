package com.demo.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.demo.pages.OlxPage;

//show the use of @BeforeSuite and @BeforeTest
public class TestConfig extends CommonTest {
	
	public AppiumDriver<MobileElement> driver;
	OlxPage samplePage ; 
	
	@BeforeSuite
	public void testBeforeSuite() throws MalformedURLException {
			this.driver = getDriver();
			samplePage=new OlxPage(driver);
		}

	@AfterSuite
	public void exit(){
		driver.quit();
	}

	

}
