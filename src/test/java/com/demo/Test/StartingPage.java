package com.demo.Test;
import org.openqa.selenium.ElementNotVisibleException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.IOException;
import com.demo.pages.OlxPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class StartingPage extends CommonTest {
	public AppiumDriver<MobileElement> driver;
	
	OlxPage samplePage ; 
	
	@BeforeClass
	public void setUp() throws IOException, InterruptedException {
		this.AppiumStart();
		this.driver = getDriver();
	}
	
	@Test(priority=1)
	public void login() throws ElementNotVisibleException, InterruptedException {
		samplePage=new OlxPage(driver);
		samplePage.logIn();

	}	
	/*@Test(priority=4)
	public void facebook() throws RuntimeException, InterruptedException{
		samplePage.logInUsingFacebook();
	}*/
	@Test(priority = 2)
	public void google() throws ElementNotVisibleException, InterruptedException {
		
		samplePage.logInUsingGoogle();

	}
	@Test(priority=3)
	public void phone() throws ElementNotVisibleException, InterruptedException {
		
		samplePage.logInUsingPhone();

	}
	
	
	@AfterClass
	public void exit() throws InterruptedException{
		//this.AppiumStop();
		driver.quit();
	}
}
