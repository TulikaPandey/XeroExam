package com.xero.ExamMarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChkBillingModuleTC10A {
	WebDriver driver;
	public   ChkBillingModuleTC10A(WebDriver driver){
		this.driver=driver;
		}
	
	public void loginsteps(){
		By username = By.xpath("//input[@placeholder='Email address']"); 
		driver.findElement(username).sendKeys("tulikapandey16@gmail.com");
		By password = By.xpath("//input[@id='password']");
		driver.findElement(password).sendKeys("tulika78");
		By loginButton = By.xpath("//button[@type='submit']");
		driver.findElement(loginButton).click();
}
		public void clickOnAccount(){
		By account = By.xpath("//button[contains(text(),'Accounting')]");
		driver.findElement(account).click();
}
		public void clickOnAccountTransactions(){
			By transactions = By.xpath("//a[contains(text(),'Account Transactions')]");
			driver.findElement(transactions).click();
	}
}
