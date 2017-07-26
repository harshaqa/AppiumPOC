package com.demo.pages;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.demo.PageObject.OlxPageObject;
import com.demo.Test.CommonTest;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
public class OlxPage extends CommonTest {
	public AppiumDriver<MobileElement> driver;
	
	public OlxPageObject olxObject ;
	
	public Dimension size;
	public String destDir;
	 public DateFormat dateFormat;
	
	public OlxPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		olxObject=new OlxPageObject();
		PageFactory.initElements(new AppiumFieldDecorator(driver), olxObject);

	}
	

	
	public void logInUsingFacebook() throws ElementNotFoundException, InterruptedException{
		
		/*System.out.println("size " + olxObject.button.size());
		olxObject.button.get(1).click();*/
		waitForScreenToLoad(driver, olxObject.fbbutton, 30);
		
		olxObject.fbbutton.click();
	//	Thread.sleep(10000);
		waitForScreenToLoad(driver, olxObject.fbelemntexplict, 500);
		
		
		boolean sucess = olxObject.fbelement.isDisplayed();
		if(sucess){
			System.out.println("fb logging page is opening sucessfully");
		}
		else{
			System.out.println("fb logging page is not opening sucessfully");
		}
		driver.navigate().back();
		
	}
	public void logInUsingGoogle()throws ElementNotFoundException, InterruptedException{
		
		/*System.out.println("size " + olxObject.button.size());
		olxObject.button.get(2).click();*/
		
		Thread.sleep(1000);
		olxObject.googlebutton.click();
		takescreenshots();
		boolean sucess = olxObject.gmailelement.isDisplayed();
		if(sucess){
			System.out.println("gmail logging page is opening sucessfully");
		}
		else{
			System.out.println("gmail logging page is not opening sucessfully");
		}
		driver.navigate().back();
		
	}
	public void logInUsingPhone() throws ElementNotFoundException, InterruptedException{
		
		
		/*System.out.println("size " + olxObject.button.size());
		olxObject.button.get(3).click();*/
		
		Thread.sleep(5000);
		olxObject.phonebutton.click();
		Thread.sleep(3000);
		boolean sucess = olxObject.phoneelement.isDisplayed();
		if(sucess){
			System.out.println("register logging page is opening sucessfully");
		}
		else{
			System.out.println("register logging page is not opening sucessfully");
		}
		
		olxObject.back.click();
	}
	public void logIn() throws ElementNotFoundException, InterruptedException{
		/*System.out.println("size " + olxObject.button.size());
		olxObject.button.get(5).click();*/
		Thread.sleep(10000);
		olxObject.registerbutton.click();
		boolean sucess = olxObject.loginelement.isDisplayed();
		if(sucess){
			System.out.println(" logging page is opening sucessfully");
		}
		else{
			System.out.println(" logging page is not opening sucessfully");
		}	
		olxObject.backfromlogin.click();
		
	}
	public void invalidlogin() throws InterruptedException{
		waitForScreenToLoad(driver, olxObject.registerbutton, 20);
		olxObject.registerbutton.click();
		olxObject.phonenumberinlogin.sendKeys("54545154784");
		olxObject.loginelement.click();
		waitForScreenToLoad(driver, olxObject.invalid, 200);
		String mssg = olxObject.invalid.getText();
		System.out.println(mssg);
		String mssg1 = "Account does not exist with this phone number";
		Assert.assertEquals(mssg1, mssg);
		olxObject.back.click();
	}
	public void page3login() throws InterruptedException{
		Thread.sleep(5000);
		olxObject.phonebutton.click();
		Thread.sleep(5000);
		olxObject.phonenumber.sendKeys("9553062067");
		olxObject.name.sendKeys("saiphani");	
		olxObject.verify.click();
		Thread.sleep(3000);
		String Text = PageNotifications();
		System.out.println(Text);
		waitForScreenToLoad(driver, olxObject.alertOkButton,15);
		olxObject.alertOkButton.click();
		waitForScreenToLoad(driver, olxObject.allcategoriesHomePage, 100);
		verticalswipping();
	}
	
	public void register() throws InterruptedException{
		Thread.sleep(5000);
		olxObject.phonebutton.click();
		Thread.sleep(5000);
		olxObject.phonenumber.sendKeys("9553062067");
		olxObject.name.sendKeys("saiphani");	
		olxObject.verify.click();
		Thread.sleep(3000);
		String Text = PageNotifications();
		System.out.println(Text);
		waitForScreenToLoad(driver, olxObject.alertOkButton,35);
		olxObject.alertOkButton.click();
		waitForScreenToLoad(driver, olxObject.allcategoriesHomePage, 100);
		boolean sucess = olxObject.allcategoriesHomePage.isDisplayed();
		if(sucess){
			System.out.println("reg sucessfully");
		}
		else{
			System.out.println("not sucessful registration");
		}
		
		//logout();
		
		//logoutcalling
		/*char Text1=  Text.charAt(0);
		String temp1 = Character.toString(Text1);
		
		char Text2 = Text.charAt(1);
		String temp2 = Character.toString(Text2);
		
		char Text3 = Text.charAt(2);
		String temp3 = Character.toString(Text3);
		
		char Text4 = Text.charAt(3);
		String temp4 = Character.toString(Text4);
		
		Thread.sleep(5000);
		
		String otp1 = olxObject.otpindex1.getText();
		String otp2 = olxObject.otpindex2.getText();
		String otp3 = olxObject.otpindex3.getText();
		String otp4 = olxObject.otpindex4.getText();
		
		if((otp1.equals(temp1)) && (otp2.equals(temp2)) && (otp3.equals(temp3)) && (otp4.equals(temp4))){
			System.out.println("getting correctly");
		}
		else{
			System.out.println("not correct retriving wrong password");
		}
		
		//comparing each and every index with that string return by 
	* first way/
		/*String otp1 = olxObject.otpindex1.getText();
		String otp2 = otp1.concat(olxObject.otpindex2.getText());
		String otp3 = otp2.concat(olxObject.otpindex3.getText());
		String otp4 = otp3.concat(olxObject.otpindex4.getText());
		System.out.println(otp4);
		if(otp4.equals(Text)){
			System.out.println("retreving ri8 otp");
		}
		else{
			System.out.println("generasting wrong otp");
		} 2nd way*/
	}
	
	public String PageNotifications() throws InterruptedException {
		
		((AndroidDriver<MobileElement>)driver).openNotifications();
		waitForScreenToLoad(driver, olxObject.msg_Text, 30);
		String Text = olxObject.msg_Text.getText();
		String Otp = Text.replaceAll("\\D+","");
		System.out.println(Otp);
		//returns otp of 4 number and keeping in one string
		driver.navigate().back();
		return Otp;
	}
	public void waitForScreenToLoad(AppiumDriver<MobileElement> lDriver, WebElement element, int seconds){

        WebDriverWait wait = new WebDriverWait(lDriver,seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
}
	

	public void verticalswipping() throws InterruptedException {
				waitForScreenToLoad(driver, olxObject.allcategories, 300);
		
			olxObject.allcategories.click();
			
			Thread.sleep(5000);
			
			verticalSwippingBottomToTop();
		  
		  boolean sucess = olxObject.jobsandserviceslink.isDisplayed();
		  if(sucess){
			  System.out.println("sucessfully swipped up");
		  }
		  else{
			  System.out.println(" not sucessfully swipped down");
		  }
		  
		  Thread.sleep(2000);
		  
		  
		verticalSwippingTopToBottom();
		  Thread.sleep(2000);
		  
		  boolean sucess1 = olxObject.allcategorieslink.isDisplayed();
		  if(sucess1){
			  System.out.println("sucessfully swipped down");
		  }
		  else{
			  System.out.println(" not sucessfully swipped down");
		  }
		  driver.navigate().back();
	}
	
	public void logout() throws InterruptedException{
		waitForScreenToLoad(driver, olxObject.profilebutton, 30);
		olxObject.profilebutton.click();
		waitForScreenToLoad(driver, olxObject.accountsandPayments, 30);
		olxObject.accountsandPayments.click();
		waitForScreenToLoad(driver, olxObject.logoutbutton, 30);
		olxObject.logoutbutton.click();
		System.out.println("clicked on logout button");
		Thread.sleep(5000);
		waitForScreenToLoad(driver, olxObject.phonebutton, 50);
		boolean sucess = olxObject.phonebutton.isDisplayed();
		if(sucess){
			System.out.println("loggged out sucessfully");
		}
		else{
			System.out.println("not logged out some thing went wrong");
		}
		
		
	}
	
	public void movingseeekingbar() throws InterruptedException{
		 
		 olxObject.filterimage.click();
	
		  
		 
		 Thread.sleep(5000);
		 
		  WebElement seekBar= olxObject.seekbarclicking;
		  
		  
		  
		  int startX = seekBar.getLocation().getX();
		  
		  System.out.println(startX);
		  
		 
		  
		  int endX = seekBar.getSize().getWidth();
		  
		  System.out.println(endX);
		  
		  
		  
		  int yAxis = seekBar.getLocation().getY();
		  
		  
		  
		  
		  int moveToXDirectionAt = (int) (endX * 0.5);
		  
		  System.out.println("Moving seek bar at " + moveToXDirectionAt+" In X direction.");
		  
		  
		  
		  TouchAction act=new TouchAction(driver);  
		  
		  act.press(startX,yAxis).moveTo(moveToXDirectionAt,yAxis).release().perform(); 
		  
		  String text = olxObject.distancetext.getText();
		  
		  System.out.println(text);
		  
		  Thread.sleep(5000);
		  
		  olxObject.clearfilterbutton.click();
		  
		  String text1 = olxObject.distancetext.getText();
		  
		  System.out.println(text1);
		  
		  Thread.sleep(2000);
		  
		  driver.navigate().back();
		  
		
	}
	public void itemselecting() throws InterruptedException{
		
		waitForScreenToLoad(driver, olxObject.price, 30);
		
		String price =olxObject.price.getText();
		System.out.println(price);
		Thread.sleep(15000);
		olxObject.price.click();
		Thread.sleep(15000);
		//olxObject.usernameclick.click();
		//Thread.sleep(5000);
		/*String username = olxObject.username.getText();
		  System.out.println(username);
		*/
	  
	  Thread.sleep(2000);
	  
	  
	  String price1=olxObject.priceafter.getText();
	  
	  System.out.println(price1);
	  
	  if(price1.equals(price)){
		  System.out.println("coming ri8 price");
	  }
	  else{
		  System.out.println("wrong price");
	  }
	  verticalSwippingBottomToTop();
	  olxObject.chatbuttoninorder.click();
	  waitForScreenToLoad(driver, olxObject.sendarrowbutton, 20);
	  olxObject.avilable.click();
	  Thread.sleep(2000);
	  driver.navigate().back();
	  driver.navigate().back();
	}
	public void connectioncheckingoff() throws InterruptedException{
		olxObject.chatbutton.click();
		Thread.sleep(5000);
		String mssg1="Oops! No internet. Check your connection.";
		String mssg = olxObject.internetoffmssg.getText();
		System.out.println(mssg);
		Assert.assertEquals(mssg1, mssg);
		
	}
	public void connectioncheckingon() throws InterruptedException{
		//olxObject.retrylink.click();
		//Thread.sleep(20000);
		/*waitForScreenToLoad(driver, olxObject.startbuying, 25);
		String mssg1="Start Buying";
		String mssg = olxObject.startbuying.getText();
		System.out.println(mssg);
		Assert.assertEquals(mssg1, mssg);*/
		//waitForScreenToLoad(driver, olxObject.mssg, 25);
		//String mssg = olxObject.mssg.getText();
		//String mssg1= "By any chance is it still available?";
		//Assert.assertEquals(mssg, mssg1);
		waitForScreenToLoad(driver, olxObject.chatXpath, 30);
		boolean sucess = olxObject.chatXpath.isDisplayed();
		Assert.assertEquals(true, sucess);
		driver.navigate().back();
		
	}
	public void horizontalSwippingRightToLeft() throws InterruptedException{
		 size = driver.manage().window().getSize();
			  System.out.println(size);
			  
			  int startx = (int) (size.width * 0.70);
			 
			  int endx = (int) (size.width * 0.30);
			 
			  int starty = size.height / 2;
			  System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

			
			  driver.swipe(startx, starty, endx, starty,10000);
			  
	}
	public void horizontalSwippingLeftToRight() throws InterruptedException{
		 size = driver.manage().window().getSize();
		  System.out.println(size);
		  
		
		  int startx = (int) (size.width * 0.70);
		  
		  int endx = (int) (size.width * 0.30);
		  int starty = size.height / 2;
		  System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);
		 driver.swipe(endx, starty, startx, starty, 10000);
		 

}
	public void swippingvertical() throws InterruptedException{
		olxObject.chatbutton.click();
		Thread.sleep(5000);
		horizontalSwippingRightToLeft();
		horizontalSwippingRightToLeft();
		horizontalSwippingRightToLeft();
		horizontalSwippingRightToLeft();
		horizontalSwippingRightToLeft();
		 Thread.sleep(5000);
		 String startbuying = olxObject.selling.getText();
		  String Star = "Start Selling";
		  Assert.assertEquals(startbuying,Star);
		  Thread.sleep(5000);
		  horizontalSwippingLeftToRight();
		  horizontalSwippingLeftToRight();
		  horizontalSwippingLeftToRight();
		  horizontalSwippingLeftToRight();
		  horizontalSwippingLeftToRight();
		  Thread.sleep(8000);
		  waitForScreenToLoad(driver, olxObject.chatXpath, 30);
			boolean sucess = olxObject.chatXpath.isDisplayed();
			Assert.assertEquals(true, sucess);
		  driver.navigate().back();
		  
		
		
	}
	public void takescreenshots() throws InterruptedException{
		
		  destDir = "screenshots";
		  
		  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  
		  dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		  
		  new File(destDir).mkdirs();
		 
		  String destFile = dateFormat.format(new Date()) + ".png";

		  try {
		  
		   FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
	}
	public void searchValid() throws InterruptedException{
		waitForScreenToLoad(driver, olxObject.searchbutton, 30);
		olxObject.searchbutton.click();
	    String SearchText1 = "Lenovo";
		olxObject.searchTextFeild.sendKeys(SearchText1);
		//olxObject.searchTextFeild.sendKeys(Keys.ENTER);
		//olxObject.searchtitle.click();
		Thread.sleep(10000);
		olxObject.searchitem.click();
		waitForScreenToLoad(driver, olxObject.searchtitle, 30);
		
		olxObject.searchtitle.click();
		verticalSwippingBottomToTop();
		waitForScreenToLoad(driver, olxObject.gettingSearchedtext, 30);
		String text = olxObject.gettingSearchedtext.getText();
		System.out.println(text);
		if(text.contains(SearchText1)){
			System.out.println("retriving ri8 brand");
		}
		else{
			System.out.println("coming diff brand");
		}
		driver.navigate().back();
		takescreenshots();
		
		
	}
	public void searchInValid() throws InterruptedException{
		Thread.sleep(20000);
		olxObject.searchbutton.click();
		olxObject.searchTextFeild.clear();
		String InavalidText = "fasdfsdf";
		
		olxObject.searchTextFeild.sendKeys(InavalidText);
		//Thread.sleep(5000);
		//olxObject.searchTextFeild.sendKeys(Keys.ENTER);
//		waitForScreenToLoad(driver, olxObject.searchitem, 10);
		//olxObject.invalidallCategories.click();
		driver.hideKeyboard();
		Thread.sleep(15000);
		//olxObject.searchitem.click();
		olxObject.invalidallCategories.click();
		Thread.sleep(20000);
		
		waitForScreenToLoad(driver, olxObject.modifySearch, 25);
		String compare = olxObject.modifySearch.getText();
		String compare1="MODIFY SEARCH";
		Assert.assertEquals(compare, compare1);
		olxObject.cross.click();
		//driver.navigate().back();	
	}
	public void verticalSwippingBottomToTop() {

		size = driver.manage().window().getSize();
		
		System.out.println(size);
	   
	  
		
	  int starty = (int) (size.height * 0.80);
	  
	  
	  
	  int endy = (int) (size.height * 0.20);
	  
	
	  
	  int startx = size.width / 2;
	  
	  System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
	  
	
	  driver.swipe(startx, starty, startx, endy, 3000);

}

public void verticalSwippingTopToBottom() throws InterruptedException{
	size = driver.manage().window().getSize();
		
		System.out.println(size);
	   
	  
		
	  int starty = (int) (size.height * 0.80);
	  
	  
	  
	  int endy = (int) (size.height * 0.20);
	  
	 
	  
	  int startx = size.width / 2;
	  
	  System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
	  
	    Thread.sleep(2000);
	  
	  
	 
	  
	  driver.swipe(startx, endy, startx, starty, 3000);

}
public void webview() throws InterruptedException{
	waitForScreenToLoad(driver, olxObject.profilebutton, 30);
	//verticalSwippingBottomToTop();
	waitForScreenToLoad(driver, olxObject.profilebutton, 30);
	olxObject.profilebutton1.click();
	waitForScreenToLoad(driver, olxObject.feedbacklink, 30);
	verticalSwippingBottomToTop();
	olxObject.feedbacklink.click();
	waitForScreenToLoad(driver, olxObject.Shareapp, 30);
	olxObject.Shareapp.click();
	Thread.sleep(5000);
	//verticalSwippingBottomToTop();
	//verticalSwippingBottomToTop();
	Thread.sleep(5000);
	olxObject.Shareitapp.click();
	Thread.sleep(5000);
	/*waitForScreenToLoad(driver, olxObject.connectingtopc, 30);
	String text = "Connect to PC";
	String text1=olxObject.connectingtopc.getText();
	Assert.assertEquals(text1, text);*/
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
}
		
	

	//script for Open the gmail application.
	// Switch to native code to webview

	public void PageswitchToGmailApp() throws InterruptedException {
		// navigation of Calculator application to gamil application
		((AndroidDriver<MobileElement>) driver).startActivity("com.google.android.gm", "com.google.android.gm.ConversationListActivityGmail");
		Thread.sleep(3000);
		olxObject.gmailpromotion.click();
		Thread.sleep(5000);
		olxObject.gmailpromotion.click();

		// Switch native to Webview
		Set<String> contextHandles = driver.getContextHandles();
		for (String context1 : contextHandles) {

			if (context1.contains("WEBVIEW")) {
				driver.context(context1);
			}
		}
		//calcuObject.search_box_text1.click();
		Thread.sleep(8000);
		// navigation back to the calculator application
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();

		Thread.sleep(10000);
	}
}
