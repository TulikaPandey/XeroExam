package com.xero.ExamMarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutModuleTCA4 {
	WebDriver driver;
	public  LogOutModuleTCA4(WebDriver driver){
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
	public void logoutsteps(){
		By  usernameTP = By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-5']");
		driver.findElement(usernameTP).click();
		By logout = By.xpath("//a[contains(text(),'Log out')]");
		driver.findElement(logout).click();
		
	}
}
