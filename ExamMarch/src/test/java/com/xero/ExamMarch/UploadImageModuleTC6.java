package com.xero.ExamMarch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadImageModuleTC6 {
	WebDriver driver;
	public   UploadImageModuleTC6(WebDriver driver){
		this.driver=driver;
		}
	public void loginsteps(){
		
		By username = By.xpath("//input[@placeholder='Email address']"); 
		driver.findElement(username).sendKeys("tulikapandey16@gmail.com");
		By password = By.xpath("//input[@id='password']");
		driver.findElement(password).sendKeys("tulika78");
		By loginButton = By.xpath("//button[@type='submit']");
		driver.findElement(loginButton).click();
		
		By  usernameTP = By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-5']");
		driver.findElement(usernameTP).click();
		}
	
		public void editprofilestep(){
		By  editprofile = By.className("xrh-verticalmenuitem--heading");
		driver.findElement(editprofile).click();
		}
		public void clickonuploadimage(){
			By uploadimg = By.xpath("//span[contains(text(),'Upload Image')]");
			driver.findElement(uploadimg).click();
		}
	   public void popupuploadimage(){
		   
		 WebElement photoframe=driver.findElement(By.id("ext-comp-1195"));
			driver.switchTo().frame(photoframe);
			System.out.println("Alert text is " + photoframe);
		
			By browse= By.xpath("//input[@id='filefield-1174-button-fileInputEl']");
		driver.findElement(browse).click();
		
			
			
		}
	}


