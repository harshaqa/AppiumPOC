package com.demo.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import com.demo.pages.OlxPage;
public class HomePage extends CommonTest {
	OlxPage samplePage ; 
	
	@BeforeClass
	public void setUp() throws IOException, InterruptedException {
		//this.AppiumStart();
		this.driver = getDriver();
		
	}
	
	@Test(priority=1)
	public void homepageAllCatTopToBot() throws InterruptedException{
		samplePage=new OlxPage(driver);
		//samplePage.page3login();
		samplePage.verticalswipping();
	}
	@Test(priority=2)
	public void search() throws InterruptedException{
		samplePage.searchValid();
		samplePage.searchInValid();
	}
	@Test(priority=7)
	public void Webview() throws InterruptedException{
		samplePage.webview();
	}
	
	@Test(priority=3)
	public void seekbar() throws InterruptedException{
		samplePage.movingseeekingbar();
	}
	@Test(priority=4)
	public void itemselecting() throws InterruptedException{
		samplePage.itemselecting();
	}
	@Test(priority=5)
	public void internetconncetions() throws InterruptedException{
		enableInterNet(false);
		samplePage.connectioncheckingoff();
		enableInterNet(true);
		samplePage.connectioncheckingon();
	}
	@Test(priority=6)
	public void swippingrightleft() throws InterruptedException{
		samplePage.swippingvertical();
	}
	
	@Test(priority=8)
	public void signout() throws InterruptedException{
		samplePage.logout();
	}
	
	
	@AfterClass
	public void end() throws InterruptedException {
		
		driver.quit();
		this.AppiumStop();
		
	}
}
