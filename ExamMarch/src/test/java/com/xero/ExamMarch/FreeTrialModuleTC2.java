package com.xero.ExamMarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FreeTrialModuleTC2 {
	WebDriver driver;
	
	By freetrial = By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']");
	By firstname = By.xpath("//input[@name='FirstName']");
	By lastname = By.xpath("//input[@name='LastName']");
	By email = By.xpath("//input[@name='EmailAddress']");
	By phone = By.xpath("//input[@name='PhoneNumber']");
	//By location = By.xpath("//select[@name='LocationCode']");
	By terms = By.xpath("//input[@value='true']");
	By getstarted = By.xpath("//span[@class='g-recaptcha-submit']");
	By wrongemail = By.xpath("//input[@name='EmailAddress']");
	By privacynotice = By.xpath("//a[contains(text(),'privacy notice')]");
	By offerdetails = By.xpath("//a[contains(text(),'offer details')]");
	By accountant = By.xpath("//a[contains(text(),'accountant or bookkeeper')]");
	
	public  FreeTrialModuleTC2(WebDriver driver){
	this.driver=driver;
	}
	public void clickonfreetrial(){
	       driver.findElement(freetrial).click();
	}
	public void enterfirstname(){
		driver.findElement(firstname).sendKeys("Tulika");
	}
	public void enterlastname(){
		driver.findElement(lastname).sendKeys("Pandey");
	}
	public void enteremail(){
		driver.findElement(email).sendKeys("tulikapandey16@gmail.com");
	}
	public void enterphone(){
		driver.findElement(phone).sendKeys("3522263450");
	}
	//public void enterlocation(){
		//driver.findElement(location).selectByVisibleText("India");
	
	public void clickonterms(){
	       driver.findElement(terms).click();
	}
	public void clickongetstarted(){
	       driver.findElement(getstarted).click();
	}
	public void enterwrongemail(){
		driver.findElement(wrongemail).sendKeys("tulikapandey16gmail.com");
	}
	public void clickonprivacynotice(){
	       driver.findElement(privacynotice).click();
	}
	public void clickonofferdetails(){
	       driver.findElement(offerdetails).click();
	}
	public void clickonaccountant(){
	       driver.findElement(accountant).click();
	}
}