/**
 * 
 */
package com.xero.ExamMarch;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author Tulika
 *
 */

public class AutoScriptXero {
	static ExtentReports extent;
	static ExtentTest XeroTest;
	
public static void main(String[] args) throws InterruptedException {
	 extent = new ExtentReports (System.getProperty("user.dir")+"/test-output/XeroExtentReport.html", true);
	 
	
	//TC1D();
	//TC1A();
	//TC1B();
	//TC2A();
	//TC2B();
	//TC2C();
	//TC2D();
	//TC2E();
	//TC3A();
	//TC4A();
	//TC6A();
	//TC8A();
	//TC8B();
	// TC8F();
	 //TC8C();
	//TC10A();
	
}

/*
//Forgot Password
	public static void  TC1D() throws InterruptedException {
		XeroTest = extent.startTest("launch Test");	
	System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://login.xero.com/");
	driver.manage().window().maximize();
	XeroTest.log(LogStatus.PASS, "TC1D Browser launched Successfully");
	
	NavigateXEROPageModuleTC1 module=new NavigateXEROPageModuleTC1(driver);
	module.clickOnForgotpassword();
	Thread.sleep(3000);
	XeroTest.log(LogStatus.PASS, "TC1D Forgotpassword entered Successfully");
	
	module.clickOnsendlink();
	XeroTest.log(LogStatus.PASS, "TC1D sendlink click Successfully");
	//extent.endTest(XeroTest);
	//extent.flush();
	//extent.close();
	driver.close();
		}
		
	
//Enter Correct EmailId and Password. User HomePage will displayed(TC1A).
	public static void  TC1A() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		XeroTest.log(LogStatus.PASS, "TC1A Browser launched Successfully");
		
	NavigateXEROPageModuleTC1 module=new NavigateXEROPageModuleTC1(driver);
	module.typeUserName();
	XeroTest.log(LogStatus.PASS, "TC1A Username entered Successfully");
	module.typePassword();
	XeroTest.log(LogStatus.PASS, "TC1A Password entered Successfully");
	module.clickOnLoginButton();
	XeroTest.log(LogStatus.PASS, "TC1A Login click Successfully");
	
	driver.close();
		}
	
	
//Enter Incorrect EmailID and Password. Error Message should Displayed(TC1B).
		public static void  TC1B() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		driver.manage().window().maximize();
		XeroTest.log(LogStatus.PASS, "TC1B Browser launched Successfully");
		NavigateXEROPageModuleTC1 module=new NavigateXEROPageModuleTC1(driver);
		module.wrongUserName();
		XeroTest.log(LogStatus.PASS, "TC1B WRONG Username entered Successfully");
		module.wrongPwd();
		XeroTest.log(LogStatus.PASS, "TC1B WRONG Password entered Successfully");
		module.clickOnLoginButton();
		XeroTest.log(LogStatus.PASS, "TC1B Login click Successfully");
		driver.close();
			}
		
//Launch Application and Click on free trial (TC2A)	
	
	public static void  TC2A() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://xero.com/");
	driver.manage().window().maximize();
	XeroTest.log(LogStatus.PASS, "TC2A Browser launched Successfully");
	FreeTrialModuleTC2 module=new FreeTrialModuleTC2(driver);
	module.clickonfreetrial();
	XeroTest.log(LogStatus.PASS, "TC2A click on FREETRIAL Successfully");
	module.enterfirstname();
	XeroTest.log(LogStatus.PASS, "TC2A Enter FIRSTNAME Successfully");
	Thread.sleep(1500);
	module.enterlastname();
	XeroTest.log(LogStatus.PASS, "TC2A Enter LASTNAME Successfully");
	Thread.sleep(1500);
	module.enteremail();
	XeroTest.log(LogStatus.PASS, "TC2A Enter EMAIL Successfully");
	Thread.sleep(1500);
	module.enterphone();
	XeroTest.log(LogStatus.PASS, "TC2A Enter PHONE Successfully");
	Thread.sleep(1500);
	//module.enterlocation();
	//Thread.sleep(2000);
	module.clickonterms();
	XeroTest.log(LogStatus.PASS, "TC2A click on TERMS Successfully");
	Thread.sleep(1500);
	module.clickongetstarted();
	XeroTest.log(LogStatus.PASS, "TC2A click on GET STARTED");
	driver.close();
	}
	
	public static void  TC2B() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://xero.com/");
	driver.manage().window().maximize();
	XeroTest.log(LogStatus.PASS, "TC2B Browser launched Successfully");
	
	FreeTrialModuleTC2 module=new FreeTrialModuleTC2(driver);
	module.clickonfreetrial();
	XeroTest.log(LogStatus.PASS, "TC2B click on Free Trial Successfully");
	module.clickongetstarted();
	Thread.sleep(1500);
	XeroTest.log(LogStatus.PASS, "TC2B click on Get Started Successfully");
	module.enterwrongemail();
	Thread.sleep(1500);
	XeroTest.log(LogStatus.PASS, "TC2B enter wrong EMail Successfully");
	module.clickongetstarted();
	XeroTest.log(LogStatus.PASS, "TC2B click on Get Started Successfully");
	driver.close();
	}

	public static void  TC2C() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://xero.com/");
	driver.manage().window().maximize();
	XeroTest.log(LogStatus.PASS, "TC2C Browser launched Successfully");
	
	FreeTrialModuleTC2 module=new FreeTrialModuleTC2(driver);
	module.clickonfreetrial();
	XeroTest.log(LogStatus.PASS, "TC2C click on Free Trial Successfully");
	module.clickonterms();
	XeroTest.log(LogStatus.PASS, "TC2C click on Terms Successfully");
	Thread.sleep(1500);
	module.clickonprivacynotice();
	XeroTest.log(LogStatus.PASS, "TC2C click on Privacy Notice Successfully");
	Thread.sleep(1500);
	driver.close();
	}

	public static void  TC2D() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://xero.com/");
	driver.manage().window().maximize();
	XeroTest.log(LogStatus.PASS, "TC2D Browser launched Successfully");
	
	FreeTrialModuleTC2 module=new FreeTrialModuleTC2(driver);
	module.clickonfreetrial();
	Thread.sleep(1500);
	XeroTest.log(LogStatus.PASS, "TC2D click on Free Trial Successfully");
	module.clickonofferdetails();
	Thread.sleep(1500);
	XeroTest.log(LogStatus.PASS, "TC2D click on Offer Details Successfully");
	driver.close();
	}

	public static void  TC2E() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://xero.com/");
	driver.manage().window().maximize();
	XeroTest.log(LogStatus.PASS, "TC2E Browser launched Successfully");
	
	FreeTrialModuleTC2 module=new FreeTrialModuleTC2(driver);
	module.clickonfreetrial();
	Thread.sleep(1500);
	XeroTest.log(LogStatus.PASS, "TC2E click on Free Trial Successfully");
	module.clickonaccountant();
	Thread.sleep(1500);
	XeroTest.log(LogStatus.PASS, "TC2E click on Account Successfully");
	driver.close();
}


//Login and Test Tabs on Dashboard (TC3A).
	public static void  TC3A() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		driver.manage().window().maximize();
		XeroTest.log(LogStatus.PASS, "TC3A Browser launched Successfully");
		
		TestTabsModuleTC3A module=new TestTabsModuleTC3A(driver);
		module.loginsteps();
		XeroTest.log(LogStatus.PASS, "TC3A Login Steps Successful");
		module.clickondashboard();
		Thread.sleep(2500);
		XeroTest.log(LogStatus.PASS, "TC3A Click on Dashboard Successful");
		module.clickonaccounts();
		Thread.sleep(2500);
		XeroTest.log(LogStatus.PASS, "TC3A Click on Accounts Successful");
		module.clickonareports();
		Thread.sleep(2500);
		XeroTest.log(LogStatus.PASS, "TC3A Click on Reports Successful");
		module.clickoncontacts();
		Thread.sleep(2500);
		XeroTest.log(LogStatus.PASS, "TC3A Click on Contacts Successful");
		module.clickoncreatenew();
		Thread.sleep(2500);
		XeroTest.log(LogStatus.PASS, "TC3A Click on Create New Successful");
		module.clickontecarch();
		Thread.sleep(2500);
		XeroTest.log(LogStatus.PASS, "TC3A Click on TekArch Successful");
		module.clickonfiles();
		Thread.sleep(2500);
		XeroTest.log(LogStatus.PASS, "TC3A Click on Files Successful");
		module.clickonsearch();
		Thread.sleep(2500);
		XeroTest.log(LogStatus.PASS, "TC3A Click on Search Successful");
		module.clickonhelp();
		XeroTest.log(LogStatus.PASS, "TC3A Click on Help Successful");
		driver.close();
	}
	
//Logout to Xero (TC4A).
		public static void  TC4A() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		driver.manage().window().maximize();
		XeroTest.log(LogStatus.PASS, "TC4A Browser launched Successfully");
		
		LogOutModuleTCA4 module = new LogOutModuleTCA4(driver);
		module.loginsteps();
		Thread.sleep(2500);
		XeroTest.log(LogStatus.PASS, "TC4A Login Steps Successful");
		module.logoutsteps();
		Thread.sleep(2500);
		XeroTest.log(LogStatus.PASS, "TC4A Logout Steps Successful");
		driver.close();
}
		
//Upload ImageTC6
		public static void  TC6A() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		driver.manage().window().maximize();
		XeroTest.log(LogStatus.PASS, "TC6AA Browser launched Successfully");
		
		UploadImageModuleTC6  module = new UploadImageModuleTC6 (driver);
		module.loginsteps();
		Thread.sleep(2500);
		XeroTest.log(LogStatus.PASS, "TC6A Login Steps Successful");
		module.editprofilestep();
		Thread.sleep(3000);
		XeroTest.log(LogStatus.PASS, "TC6A Edit Profile Steps Successful");
		module.clickonuploadimage();
		Thread.sleep(3000);
		XeroTest.log(LogStatus.PASS, "TC6A Click On Upload Image Successful");
		module.popupuploadimage();
		XeroTest.log(LogStatus.PASS, "TC6A Click on Popup Load Image Successful");
		
		driver.close();
		
	}
		
//Add Organization Trail Version-1 (TC8A)
		public static void  TC8A() throws InterruptedException {
			XeroTest = extent.startTest("launch Test");	
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://login.xero.com/");
			driver.manage().window().maximize();
			XeroTest.log(LogStatus.PASS, "TC8A Browser launched Successfully");
			Thread.sleep(2500);
			
			AddOrganizationsTC8A module = new AddOrganizationsTC8A(driver);
			module.loginsteps();
			XeroTest.log(LogStatus.PASS, "TC8A Login Steps Successful");
			Thread.sleep(2500);
		
		module.clickOntecarch();
		XeroTest.log(LogStatus.PASS, "TC8A Tecarch Button click Successfully");
		Thread.sleep(2500);
		
		module.clickOnMyXero();
		XeroTest.log(LogStatus.PASS, "TC8A My Xero Button click Successfully");
		Thread.sleep(3500);
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		} 
		Thread.sleep(3500);
		
		module.clickOnAddOrganization();
		XeroTest.log(LogStatus.PASS, "TC8A Organization Green Button CLicked Successfully");
		Thread.sleep(2500);
		
		module.enterOrganizationname();
		XeroTest.log(LogStatus.PASS, "TC8A Organization Name Filled Successfully");
		Thread.sleep(4500);
		
		module.enterOrganizationDo();
		XeroTest.log(LogStatus.PASS, "TC8A Enter Organization Do Successfully");
		
		module.selectsoftware();
		XeroTest.log(LogStatus.PASS, "TC8A Software Selected from Dropdown Successfully");
		Thread.sleep(2500);
		
		module.clickstarttrial();
		XeroTest.log(LogStatus.PASS, "TC8A Organization Form Filled Successfully");
		Thread.sleep(2500);
			
		driver.close();
			}
//Add Organization Paid Version-1  (TC8B)
		public static void  TC8B() throws InterruptedException {
			XeroTest = extent.startTest("launch Test");	
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://login.xero.com/");
			driver.manage().window().maximize();
			XeroTest.log(LogStatus.PASS, "TC8A Browser launched Successfully");
			Thread.sleep(2500);
			
			AddOrganizationsTC8A module = new AddOrganizationsTC8A(driver);
			module.loginsteps();
			XeroTest.log(LogStatus.PASS, "TC8B Login Steps Successful");
			Thread.sleep(2500);
		
		module.clickOntecarch();
		XeroTest.log(LogStatus.PASS, "TC8B Tecarch Button click Successfully");
		Thread.sleep(2500);
		
		module.clickOnMyXero();
		XeroTest.log(LogStatus.PASS, "TC8B My Xero Button click Successfully");
		Thread.sleep(3500);
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		} 
		Thread.sleep(3500);
		
		module.clickOnAddOrganization();
		XeroTest.log(LogStatus.PASS, "TC8A Organization Green Button CLicked Successfully");
		Thread.sleep(2500);
		
		module.enterOrganizationname();
		XeroTest.log(LogStatus.PASS, "TC8B Organization Name Filled Successfully");
		Thread.sleep(4500);
		
		module.enterOrganizationDo();
		XeroTest.log(LogStatus.PASS, "TC8B Enter Organization Do Successfully");
		
		module.selectsoftware();
		XeroTest.log(LogStatus.PASS, "TC8B Software Selected from Dropdown Successfully");
		Thread.sleep(2500);
		
		module.clickbuynow();
		XeroTest.log(LogStatus.PASS, "TC8B Organization Form Filled Successfully");
		Thread.sleep(2500);
		
		//extent.endTest(XeroTest);
		
		driver.close();
			}
	
//Add Another Organizations With QuickBooks User (TC8F)
		public static void  TC8F() throws InterruptedException {
			XeroTest = extent.startTest("launch Test");	
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://login.xero.com/");
			driver.manage().window().maximize();
			XeroTest.log(LogStatus.PASS, "TC8F Browser launched Successfully");
			Thread.sleep(2500);
			
			AddOrganizationsTC8A module = new AddOrganizationsTC8A(driver);
			module.loginsteps();
			XeroTest.log(LogStatus.PASS, "TC8F Login Steps Successful");
			Thread.sleep(2500);
		
		module.clickOntecarch();
		XeroTest.log(LogStatus.PASS, "TC8F Tecarch Button click Successfully");
		Thread.sleep(2500);
		
		module.clickOnMyXero();
		XeroTest.log(LogStatus.PASS, "TC8F My Xero Button click Successfully");
		Thread.sleep(3500);
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		} 
		Thread.sleep(3500);
		
		module.clickOnAddOrganization();
		XeroTest.log(LogStatus.PASS, "TC8F Organization Green Button CLicked Successfully");
		Thread.sleep(2500);
		
		module.enterOrganizationname();
		XeroTest.log(LogStatus.PASS, "TC8F Organization Name Filled Successfully");
		Thread.sleep(4500);
		
		module.enterOrganizationDo();
		XeroTest.log(LogStatus.PASS, "TC8F Enter Organization Do Successfully");
		
		module.selectsoftware();
		XeroTest.log(LogStatus.PASS, "TC8F Software Selected from Dropdown Successfully");
		Thread.sleep(2500);
		
		module.clickconversionlink();
		XeroTest.log(LogStatus.PASS, "TC8F Conversion Link Clicked Successfully");
		Thread.sleep(2500);
		
		module.clickchkbox();
		XeroTest.log(LogStatus.PASS, "TC8F Conversion Checkbox Clicked Successfully");
		Thread.sleep(2500);
		
		module.clickbuynow();
		XeroTest.log(LogStatus.PASS, "TC8F Organization Form Filled Successfully");
		Thread.sleep(2500);
		
		//extent.endTest(XeroTest);
		//extent.flush();
		//extent.close();
		driver.close();
			}
			
//Check if users can lookout for their subscription billing  (TC10A)
		
	public static void  TC10A() throws InterruptedException {
		XeroTest = extent.startTest("launch Test");	
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		driver.manage().window().maximize();
		XeroTest.log(LogStatus.PASS, "TC10A Browser launched Successfully");
		Thread.sleep(2500);
		
		ChkBillingModuleTC10A module = new ChkBillingModuleTC10A(driver);
		module.loginsteps();
		XeroTest.log(LogStatus.PASS, "TC10A Login Steps Successful");
		Thread.sleep(3000);
		
		module.clickOnAccount();
		Thread.sleep(1500);
		XeroTest.log(LogStatus.PASS, "TC10A click on Account Successfully");
		
		module.clickOnAccountTransactions();
		Thread.sleep(1500);
		XeroTest.log(LogStatus.PASS, "TC10A click on Account Transactions Successfully");
		extent.flush();
		extent.close();
		driver.close();
		
	}
	
	*/
//Add Organizations Start Plan (TC8C)
		public static void  TC8C() throws InterruptedException {
			XeroTest = extent.startTest("launch Test");	
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://login.xero.com/");
			driver.manage().window().maximize();
			XeroTest.log(LogStatus.PASS, "TC8F Browser launched Successfully");
			Thread.sleep(2500);
			
			AddOrgStanderdPlanTC8C module = new AddOrgStanderdPlanTC8C(driver);
			module.loginsteps();
			XeroTest.log(LogStatus.PASS, "TC8F Login Steps Successful");
			Thread.sleep(2500);
		}
}
