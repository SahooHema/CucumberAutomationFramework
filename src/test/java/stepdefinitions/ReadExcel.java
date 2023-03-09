//package stepdefinitions;
//
//import java.util.List;
//
//import java.util.Map;
//
//import com.qa.pages.Homepage;
//import com.qa.pages.LoginPage;
//import com.qa.utils.ExcelReader;
//import com.qa.utils.TestBase;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//
//public class ReadExcel  extends TestBase{
//
//	LoginPage login;
//	Homepage home;
//	
//	@Given("user open browser")
//	public void user_open_browser() throws Exception {
//		TestBase.initialization();
//	}
//
//	@Then("user enter data from sheetname {string} and rownumber {int}")
//	public void user_enter_data_from_sheetname_and_rownumber(String string, Integer int1) throws Exception {
//		ExcelReader read= new ExcelReader();
//		List<Map<String, String>> testdata=	read.getData("C:\\Users\\ADMIN\\Desktop\\Automation.xlsx",0);
//		
//	String name=testdata.get(0).get("Username");
//	String pass=testdata.get(0).get("Password");
//		
//		login =new LoginPage(driver);
//		login.LoginApp(name,pass);
//		
//	}
//
//	
//	@Then("user clicks login button")
//	public void user_clicks_login_button() {
//		home= login.button();
//	}
//	
//}
