package stepdefinitions;
import io.cucumber.java.en.Given;
import pages.BRHomePage;
import pages.BRLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.WaitUtils;
import java.util.List;
import java.util.Map;
public class ExcelStepDefs {
    BRLoginPage brLoginPage;
    BRHomePage brHomePage;
    ExcelUtils excelUtils;//Used to call Excel Utils methods
    List<Map<String,String>> dataList;//Data will be coming as List of Map and we will store them in this object
    @Given("user tries to login as {string}")
    public void user_tries_to_login_as(String sheet) {
        String path = "./src/test/resources/testdata/mysmoketestdata.xlsx";
//        String sheetName =  "customer_info";
        String sheetName = sheet;
        Driver.getDriver().get(ConfigReader.getProperty("br_url"));
        brHomePage= new BRHomePage();
        brLoginPage = new BRLoginPage();
        WaitUtils.waitFor(1);
        brHomePage.homeLoginLink.click();//clicking home page login link to navigate login page
        brLoginPage.userEmail.sendKeys();//WE GET THE DATA FROM EXCEL SHEET
    }
}