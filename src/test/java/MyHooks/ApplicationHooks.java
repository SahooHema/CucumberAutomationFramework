package MyHooks;


import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.qa.utils.ConfigReader;
import com.qa.utils.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;




public class ApplicationHooks {
public WebDriver driver;

public ConfigReader configReader;
Properties prop;

	@Before(order = 0)
	public void getProperty() {
		configReader= new ConfigReader();
		prop = configReader.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser() throws Exception {
		String browserName = prop.getProperty("browser");
driver=TestBase.initialize(browserName);				
		
	}

//	@After(order = 0)
//	public void quitBrowser() {
//		driver.quit();
//	}
//
//	@After(order = 1)
//	public void tearDown(Scenario scenario) {
//		if (scenario.isFailed()) {
//			// take screenshot:
//			String screenshotName = scenario.getName().replaceAll(" ", "_");
//			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(sourcePath, "image/png", screenshotName);
//
//		}
//	}
}
