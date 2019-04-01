package com.xero.ExamMarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestTabsModuleTC3A {
	WebDriver driver;
	By username = By.xpath("//input[@placeholder='Email address']"); 
	By password = By.xpath("//input[@id='password']");
	By loginButton = By.xpath("//button[@type='submit']");
	By dashboard = By.xpath("//a[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']");
	By accounts = By.xpath("//button[contains(text(),'Accounting')]");
	By reports = By.xpath("//div[@class='xrh-dropdown--body']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Reports')]");
	By contacts = By.xpath("//button[contains(text(),'Contacts')]");
	
	public  TestTabsModuleTC3A(WebDriver driver){
	this.driver=driver;
	}
	public void loginsteps(){
		driver.findElement(username).sendKeys("tulikapandey16@gmail.com");
		driver.findElement(password).sendKeys("tulika78");
		driver.findElement(loginButton).click();
	}
	public void clickondashboard(){
	       driver.findElement(dashboard).click();
	}
	public void clickonaccounts(){
	       driver.findElement(accounts).click();
	}
	public void clickonareports(){
	       driver.findElement(reports).click();
	}
	public void clickoncontacts(){
	       driver.findElement(contacts).click();
	}
	public void clickoncreatenew(){
		By createnew = By.xpath("//button[@title='Create new']//div[@class='xrh-focusable--child xrh-iconwrapper']");
	       driver.findElement(createnew).click();
	}
	public void clickontecarch(){
		By techarch = By.xpath("//span[contains(text(),'tecarch')]");
	       driver.findElement(techarch).click();
	}
		public void clickonfiles(){
		By files = By.xpath("//a[contains(text(),'Files')]");
	       driver.findElement(files).click();
	}
		public void clickonsearch(){
			By search = By.xpath("//button[@title='Search']//*[@class='xrh-icon xrh-icon-svg']");
		       driver.findElement(search).click();
		}
	public void clickonhelp(){
		By help = By.xpath("//button[@title='Help']//*[@class='xrh-icon xrh-icon-svg']");
	       driver.findElement(help).click();
	}
}
