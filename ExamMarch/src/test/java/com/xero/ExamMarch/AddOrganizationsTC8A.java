package com.xero.ExamMarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddOrganizationsTC8A {
	WebDriver driver;
	public   AddOrganizationsTC8A(WebDriver driver){
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

		public void clickOntecarch(){
		By tecarch = By.xpath("//span[contains(text(),'tecarch')]");
	       driver.findElement(tecarch).click();
		}
	       public void clickOnMyXero(){
	   		By myxero = By.xpath("//a[contains(text(),'My Xero')]");
	   	       driver.findElement(myxero).click();
		}      
	       public void clickOnAddOrganization(){
		   		By myxero = By.xpath("//a[@class='x-btn green']");
		   	       driver.findElement(myxero).click();
			}      
	       
	       public void enterOrganizationname(){
		   		By orgname = By.xpath("//input[@name='OrganisationName']");
		   	       driver.findElement(orgname).sendKeys("self");
	       }
	       public void enterOrganizationDo(){
		   	    By orgdo = By.xpath("//input[@id='industrysearchcombofield-1025-inputEl']");
		   	    driver.findElement(orgdo).sendKeys("Accommodation Provider");
	       }
	       public void selectsoftware(){
		   	       By software = By.xpath("//input[@placeholder='Select one of the below']");
		   	       driver.findElement(software).click();
		   	       //Select software = new Select(driver.findElement(By.xpath("//input[@placeholder='Select one of the below']")));
		   	      // software.selectByIndex(5);
		   	 }
	       
		   	public void clickstarttrial(){
		   	    By starttrial = By.xpath("//a[@id='simplebutton-1035']");
		   	       driver.findElement(starttrial).click();
		   	}
		   	
		   	public void clickconversionlink(){
		   	    By conversionlink = By.xpath("//a[@class='x-component x-conversion-panel-link x-component-default']");
		   	       driver.findElement(conversionlink).click();
		   	}
		   	
		   	public void clickchkbox(){
		   	    By chkbox = By.xpath("//table[@class='x-field x-conversion-panel-checkbox x-table-plain x-form-item x-field-default x-autocontainer-form-item']//input[@type='button']");
		   	       driver.findElement(chkbox).click();
		   	}
		   	public void clickbuynow(){
			   	    By buynow = By.xpath("//a[@class='x-simple-button x-btn blue x-box-item x-toolbar-item x-simple-button-default']");
			   	       driver.findElement(buynow).click();
}
	       
}