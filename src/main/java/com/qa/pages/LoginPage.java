package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;


public class LoginPage extends TestBase{
	
	WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	
	@FindBy(xpath="//*[@placeholder=\"Email address or phone number\"]")
	public WebElement email;
	
	
	
	@FindBy(xpath="//*[@placeholder=\"Password\"]")
	public WebElement password;
	
	
	@FindBy(xpath="//*[@name=\"login\"]")
	public WebElement button;
	
	
	public void LoginApp(String user,String pwd) throws Exception {
		Thread.sleep(5000);
	email.click();
	email.sendKeys(user);
	password.click();
	password.sendKeys(pwd);
	}
	
	public Homepage button() {
		button.click();
		return new Homepage(driver);
	}
	
	
	
	
	

}
