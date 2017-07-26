					Appium Installation Steps

1. Install Java JDK  - (Install as per the Windows 64/32 bit )
	i.Add the location of the bin folder of the JDK installation for the PATH variable in System Variables.
	Note: Verify whether java is correctly installed or not by using: java -version in the command prompt

2. Install Android SDK - into the default location -  (Install Stand-Alone SDK Tools for your android mobile version)
	https://developer.android.com/studio/index.html

3. CREATE Environmental Variables 
	i.  ANDROID_HOME=C:\Users\username\AppData\Local\Android\android-sdk
	ii. Update path value with ;%ANDROID_HOME%\tools;%ANDROID_HOME%\platform-tools;%JAVA_HOME%\bin
      	Note: Verify the installation status by following these steps:
	i.  Connect device to the system (Verify Developer options & USB debugging should be enabled)(If device is not connected install devices usb drivers)
	ii. Type "adb" command in the command prompt
	iii. Type "adb devices" --- Your connected device name should be displayed
4. Install Eclipse ->Maven,testing
		TestNg: http://beust.com/eclipse
		Maven: http://download.eclipse.org/technology/m2e/milestone/1.0
5. Download and Install APPIUM server
6. Copy Required jar files to local drive: 
	i.  Selenium Standalone
	ii. Appium java client library
