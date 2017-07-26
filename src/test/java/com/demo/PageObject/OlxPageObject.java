package com.demo.PageObject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OlxPageObject {
	// @AndroidFindBy(xpath = "//android.widget.Button")
	// public ArrayList<MobileElement> button;
	@AndroidFindBy(id = "com.olx.southasia:id/btn_fb")
	public MobileElement fbbutton;
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='0']")
	public MobileElement back;

	@AndroidFindBy(id = "com.olx.southasia:id/btn_google")
	public MobileElement googlebutton;
	
	@AndroidFindBy(name="Retry")
	public MobileElement retryButton;
	
	@AndroidFindBy(id = "com.olx.southasia:id/btn_phone_register")
	public MobileElement phonebutton;
	
	@AndroidFindBy(id = "com.olx.southasia:id/btn_legacy_login")
	public MobileElement registerbutton;
	
	@AndroidFindBy(id="com.olx.southasia:id/value")
	public MobileElement phonenumberinlogin;
	
	@AndroidFindBy(id="com.olx.southasia:id/errorMsg")
	public MobileElement invalid;

	@AndroidFindBy(id = "u_0_a")
	public MobileElement fbelement;
	
	
	@AndroidFindBy(id = "android:id/button2")
	public MobileElement gmailelement;

	@AndroidFindBy(id = "com.olx.southasia:id/tv_verify_otp")
	public MobileElement phoneelement;

	@AndroidFindBy(id = "com.olx.southasia:id/tv_verify_otp")
	public MobileElement loginelement;
	
	@AndroidFindBy(id = "u_0_b")
	public MobileElement fbelemntexplict;
	
	@AndroidFindBy(className = "android.widget.ImageButton")
	public MobileElement backfromlogin;
	
	@AndroidFindBy(name="Phone Number")
	public MobileElement phonenumber;
	
	@AndroidFindBy(name="Name")
	public MobileElement name;
	
	@AndroidFindBy(id="com.olx.southasia:id/tv_verify_otp")
	public MobileElement verify;
	
	@AndroidFindBy(id="com.olx.southasia:id/input1")
	public MobileElement otpindex1;
	
	@AndroidFindBy(id="com.olx.southasia:id/input2")
	public MobileElement otpindex2;
	
	@AndroidFindBy(id="com.olx.southasia:id/input3")
	public MobileElement otpindex3;
	
	@AndroidFindBy(id="com.olx.southasia:id/input4")
	public MobileElement otpindex4;
	
	@AndroidFindBy(id="android:id/big_text")
	public  MobileElement msg_Text;
	
	@AndroidFindBy(name="GOT IT")
	public MobileElement alertOkButton;
	
	@AndroidFindBy(name="All Categories")
	public MobileElement allcategoriesHomePage;
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@index='4']")
	public MobileElement profilebutton;
	
	@AndroidFindBy(name="Account and Payments")
	public MobileElement accountsandPayments;
	
	@AndroidFindBy(name="Logout")
	public MobileElement logoutbutton ;
	
	@AndroidFindBy(id="com.olx.southasia:id/btnMsg")
	public MobileElement chatbuttoninorder;
	
	@AndroidFindBy(id="com.olx.southasia:id/sendBtn")
	public MobileElement sendarrowbutton;
	
	@AndroidFindBy(name="Is it available?")
	public MobileElement avilable;
	
	@AndroidFindBy(id="com.olx.southasia:id/userName")
	public MobileElement username;
	
	@AndroidFindBy(id="com.olx.southasia:id/message")
	public MobileElement mssg;
	
	// allcategories
	@AndroidFindBy(id="com.olx.southasia:id/category")
	public MobileElement allcategories;
	
	@AndroidFindBy(name="All categories")
	public MobileElement allcategorieslink;
	
	@AndroidFindBy(name="Jobs & Services")
	public MobileElement jobsandserviceslink;
	
	
	//seekbar

	@AndroidFindBy(id="com.olx.southasia:id/filter")
	public MobileElement filterimage;
	
	@AndroidFindBy(id="com.olx.southasia:id/discrete_seek_bar")
	public MobileElement seekbarclicking;
	
/*	@AndroidFindBy(name="100")
	public MobileElement seekbar100;
	*/
	@AndroidFindBy(name="CLEAR FILTERS")
	public MobileElement clearfilterbutton;
	
	@AndroidFindBy(id="com.olx.southasia:id/distance_title")
	public MobileElement distancetext;
	
	//ordering
	
	@AndroidFindBy(id="com.olx.southasia:id/listitem_layout")
	public MobileElement item;
	
	@AndroidFindBy(id="com.olx.southasia:id/price")
	public MobileElement price;
	
	@AndroidFindBy(id="com.olx.southasia:id/userName")
	public MobileElement usernameclick;
	
	@AndroidFindBy(id="com.olx.southasia:id/card_ad_price")
	public MobileElement priceafter;
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@index='0']")
	public MobileElement discoverybutton;
	//network conncetions
	@AndroidFindBy(name="Chats")
	public MobileElement chatbutton;

	@AndroidFindBy(id="com.olx.southasia:id/errorTitle")
	public MobileElement internetoffmssg;
	
	@AndroidFindBy(id="com.olx.southasia:id/btnAction")
	public MobileElement startbuying;
	
	@AndroidFindBy(id="com.olx.southasia:id/errorButton")
	public MobileElement retrylink;
	
	@AndroidFindBy(id="com.olx.southasia:id/remove_container")
	public MobileElement cross;
	
	//search 
	@AndroidFindBy(id="com.olx.southasia:id/search")
	public MobileElement searchbutton;
	@AndroidFindBy(id="com.olx.southasia:id/searchEditText_input")
	public MobileElement searchTextFeild;
	@AndroidFindBy(id="com.olx.southasia:id/btnAction")
	public MobileElement modifySearch;
	
	@AndroidFindBy(id="com.olx.southasia:id/title")
	public MobileElement searchtitle;
	
	@AndroidFindBy(id="com.olx.southasia:id/card_ad_title")
	public MobileElement gettingSearchedtext;
	
	@AndroidFindBy(id="com.olx.southasia:id/subtext")
	public MobileElement invalidallCategories;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@index='0']")                        
	public MobileElement searchitem;  
	//horizontal swipping
	@AndroidFindBy(id="com.olx.southasia:id/recievers")
	public MobileElement all;
	@AndroidFindBy(id="com.olx.southasia:id/recievers")
	public MobileElement buying;
	@AndroidFindBy(name="Start Selling")
	public MobileElement selling;
	@AndroidFindBy(id="com.olx.southasia:id/lv_fragment_my_chat")
	public MobileElement keeponclicking;
	
	//webview
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@index='4']")
	public MobileElement profilebutton1;
	@AndroidFindBy(name="Feedback and Help")
	public MobileElement feedbacklink;
	@AndroidFindBy(name="Rate App")
	public MobileElement rateapp;
	@AndroidFindBy(name="Share App")
	public MobileElement Shareapp;
	@AndroidFindBy(name="SHAREit")
	public MobileElement Shareitapp;
	@AndroidFindBy(id="com.lenovo.anyshare.gps:id/s0")
	public MobileElement connectingtopc;
	@AndroidFindBy(id="com.olx.southasia:id/chat_item_outer_layout")
	public MobileElement chatXpath;
	
	//web view gmail
	@AndroidFindBy(id="com.google.android.gm:id/unseen_count_textView")
	public MobileElement gmailpromotion;
	
	@AndroidFindBy(xpath="//android.view.View[@index='0']")
	public MobileElement gmailpromotions;
	
	
	
}

