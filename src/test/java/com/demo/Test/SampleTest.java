package com.demo.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import com.demo.pages.OlxPage;




import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SampleTest extends CommonTest

{
	public AppiumDriver<MobileElement> driver;
	
	OlxPage samplePage ; 
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		this.driver = getDriver();
		samplePage=new OlxPage(driver);
	}

	
	/*@Test
	public void facebook() throws RuntimeException, InterruptedException{
		samplePage.logInUsingFacebook();
	}
	@Test
	public void google() throws ElementNotFoundException, InterruptedException {
		
		samplePage.logInUsingGoogle();

	}
	@Test
	public void phone() throws ElementNotFoundException, InterruptedException {
		
		samplePage.logInUsingPhone();

	}
	@Test
	public void login() throws ElementNotFoundException, InterruptedException {
		
		samplePage.logIn();

	}*/
	/* Script for open the notifications
		@Test(priority = 5)
		public void notifications() throws InterruptedException {
			samplePage.PageNotifications();


		}*/
	/*
	@Test(priority=1)
	public void register() throws InterruptedException{
		samplePage.register();
	}*/
	/*@Test
	public void swippingtopbottom() throws InterruptedException{
		samplePage.verticalswipping();
	}*/
	
	/*@Test
	public void logout() throws InterruptedException{
		samplePage.logout();
	}
	*/
	/*@Test(priority=1)
	public void seekbar() throws InterruptedException{
		samplePage.movingseeekingbar();
	}
	
	@Test(priority=2)
	public void internetconncetions() throws InterruptedException{
		enableInterNet(false);
		samplePage.connectioncheckingoff();
		enableInterNet(true);
		samplePage.connectioncheckingon();
	}*/
	
	/*@Test
	public void swippingrightleft() throws InterruptedException{
		samplePage.hor();
	}*/
	/*
	@Test(priority=1)
	public void itemselecting() throws InterruptedException{
		samplePage.itemselecting();
	}*/
	
	/*@Test
	public void searching() throws InterruptedException{
		//samplePage.searchValid();
		samplePage.searchInValid();
	}	*/
	
	/*@Test
	public void ordering() throws InterruptedException{
		samplePage.itemselecting();
	}*/
	/*@AfterClass
	public void exit(){
		driver.quit();
	}*/
	@Test(priority=1)
	public void view() throws InterruptedException{
		samplePage.PageswitchToGmailApp();
	}
	
}

