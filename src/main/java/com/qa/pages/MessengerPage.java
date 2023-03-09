package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class MessengerPage  extends TestBase{
	
	WebDriver driver;
	public MessengerPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
