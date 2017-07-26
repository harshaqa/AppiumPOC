package com.demo.Test;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.NetworkConnectionSetting;
import io.appium.java_client.android.AndroidDriver;

public class CommonTest {

	public DesiredCapabilities capabilities = new DesiredCapabilities();
	public AppiumDriver<MobileElement> driver;
	
	public AppiumDriver<MobileElement> getDriver() throws MalformedURLException {

		//		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "PNW8IVMJ5H99RGKV");
		capabilities.setCapability("device", "Android");
		capabilities.setCapability("version", "5.1");
		capabilities.setCapability("--full-reset", true);
		capabilities.setCapability("newCommandTimeout", 150);
		capabilities.setCapability("appPackage", "com.olx.southasia");
		  capabilities.setCapability("appActivity", "pl.tablica2.activities.MainActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	/*
	 * Script for enable and disable the network connections through appium
	 * settings
	 */
	public void PageNetworkConnections() throws InterruptedException {
		// Turn off the WI-fI connection
		enableInterNet(false);
		Thread.sleep(2000);
		// Turn On the WI-FI connection
		enableInterNet(true);
		Thread.sleep(2000);
	}

	// Setting the network connections
	public void enableInterNet(boolean isEnabled) {
		NetworkConnectionSetting networkConnection = new NetworkConnectionSetting(false, isEnabled, false);
		((AndroidDriver<MobileElement>) driver).setNetworkConnection(networkConnection);
	}
	
	
	Process P;
	public void AppiumStart() throws IOException, InterruptedException
	{
		String nodePath = "C:/Progra~2/Appium/node.exe";
		String appiumJSPath = "C:/Progra~2/Appium/node_modules/appium/bin/appium.js";
		String cmd = nodePath + " " + appiumJSPath;


		P = Runtime.getRuntime().exec(cmd);
		Thread.sleep(30000);
		if (P != null) {
			System.out.println("Appium server Is started now.");
		}
	}


	public void AppiumStop() throws InterruptedException
	{
		if (P != null) {
			P.destroy();
			
		}
		System.out.println("Appium server Is stopped now.");
	}
	
}
