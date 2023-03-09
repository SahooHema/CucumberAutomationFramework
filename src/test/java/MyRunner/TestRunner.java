package MyRunner;









import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
        features = {"src/main/java/features"},
        glue = {"stepdefinitions","MyHooks"},
     //   tags= "@Smoke",
        		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner extends AbstractTestNGCucumberTests{
}
/*
In tags if we need to exclude scenario tag then  tags= "not @Smoke", 

  features = {"src/main/java/features/fb.feature"},
        glue = {"stepdefinitions","MyHooks"},

Note: 
1. if need to run parallel sceanrios , then create parallel package keep stepdefinition under it..
2. under src/test/resurces create folder and keep features file under it
3. create test runner :
@CucumberOptions(
        features = {"src/test/resources/AppFeatures"},
        glue = {"parallel","MyHooks"},
     //   tags= "@Smoke",
        		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestRunner extends AbstractTestNGCucumberTests{
	  @Override
	   @DataProvider(parallel = true)
	   public Object[][] scenarios() {
	   return super.scenarios();
	   }
}



*/