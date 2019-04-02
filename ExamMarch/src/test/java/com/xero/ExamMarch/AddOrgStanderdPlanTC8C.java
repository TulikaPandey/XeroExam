package com.xero.ExamMarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddOrgStanderdPlanTC8C {
	WebDriver driver;
	public   AddOrgStanderdPlanTC8C(WebDriver driver){
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

}
