package com.qa.utils;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties pro;

//	public TestBase() throws Exception {
//		  FileInputStream reader=new FileInputStream("src/main/java/com/qa/config/config.properties");
//	       pro=new Properties();
//	        pro.load(reader);
//	}
	
	
	
	
public static void initialization() throws Exception {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	
  driver=new ChromeDriver(options);
  Thread.sleep(5000);
    driver.get("https://www.facebook.com/login/");
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.manage().deleteAllCookies();
	
}
	

public static WebDriver initialize(String browsername) throws Exception{
	if(browsername.equalsIgnoreCase("chrome")) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
	  driver=new ChromeDriver(options);
	  driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().deleteAllCookies();	
	
	}	
		
		    	else if(browsername.equalsIgnoreCase("firefox")) {
		    		
		    		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		    		
		    		driver = new FirefoxDriver();
		    		 driver.manage().window().maximize();
		    		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		    		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    		    driver.manage().deleteAllCookies();	
//		    	  Thread.sleep(5000);
//		    	    driver.get("https://www.facebook.com/login/");
//		    	    driver.manage().window().maximize();
//		    	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//		    	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		    	    driver.manage().deleteAllCookies();
	}
	return driver;

	
	
	
	
	
}
	
public static WebDriver getDriver() {
    return driver;
}
	
	
	
}
