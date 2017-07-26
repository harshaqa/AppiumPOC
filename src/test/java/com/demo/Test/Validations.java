package com.demo.Test;
import org.openqa.selenium.ElementNotVisibleException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import com.demo.pages.OlxPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
public class Validations extends CommonTest {
public AppiumDriver<MobileElement> driver;
	
	OlxPage samplePage ; 
	
	@BeforeClass
	public void setUp() throws IOException, InterruptedException {
		//this.AppiumStart();
		this.driver = getDriver();
		
	}
	
	@Test(priority=1)
	public void Invalidlogin() throws ElementNotVisibleException, InterruptedException {
		samplePage=new OlxPage(driver);
		samplePage.invalidlogin();

	}	
	@Test(priority=2)
	public void validloginAndLogOut() throws ElementNotVisibleException, InterruptedException {
		
		samplePage.register();

	}	
	
	@AfterClass
	public void exit() throws InterruptedException{
		//this.AppiumStop();
		driver.quit();
		//System.out.println("over 2 nd");
	}
}
