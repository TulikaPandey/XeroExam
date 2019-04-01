package com.xero.ExamMarch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Module Created By Tulika
//This class will store all the locator and methods of login page


public class NavigateXEROPageModuleTC1  {
	
	WebDriver driver;
			
	By forgotpassword = By.xpath("//a[@class='forgot-password-advert']");
	By sendlink = By.xpath("//span[@class='text']"); 
	By username = By.xpath("//input[@placeholder='Email address']"); 
	By password = By.xpath("//input[@id='password']");
	By loginButton = By.xpath("//button[@type='submit']");
	
	public  NavigateXEROPageModuleTC1(WebDriver driver){
	this.driver=driver;
	}
	
		public static void LaunchURL(){
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
	}
	
	public void clickOnForgotpassword(){
	       driver.findElement(forgotpassword).click();
	}
	
	public void clickOnsendlink(){
	       driver.findElement(sendlink).click();
	}
	
	public void clickOnLoginButton(){
	       driver.findElement(loginButton).click();
	}

	public void typeUserName(){
		driver.findElement(username).sendKeys("tulikapandey16@gmail.com");
	}
		
	public void typePassword(){
	driver.findElement(password).sendKeys("tulika78");
}
	public void wrongUserName(){
		driver.findElement(username).sendKeys("user@gmail.com");
}
	public void wrongPwd(){
		driver.findElement(password).sendKeys("pwd");
	}
}
	


