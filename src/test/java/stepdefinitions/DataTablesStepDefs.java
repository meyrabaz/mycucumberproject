
package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DataTablesPage;;
import utilities.Driver;
import utilities.WaitUtils;

public class DataTablesStepDefs {
    DataTablesPage dataTablesPage = new DataTablesPage();
    @Given("user is on {string} page")
    public void user_is_on_page(String string) {
        Driver.getDriver().get(string);
    }
    @Given("user clicks on the new button")
    public void user_clicks_on_the_new_button() {
        WaitUtils.waitFor(2);
        dataTablesPage.newButton.click();
    }
    @Given("user enters the first name {string}")
    public void user_enters_the_first_name(String string) {
        WaitUtils.waitFor(2);
        dataTablesPage.firstName.sendKeys(string);
    }
    @Given("user enters the last name {string}")
    public void user_enters_the_last_name(String string) {

        WaitUtils.waitFor(2);
        dataTablesPage.lastName.sendKeys(string);
    }
    @Given("user enters the position {string}")
    public void user_enters_the_position(String string) {

        WaitUtils.waitFor(2);
        dataTablesPage.position.sendKeys(string);
    }
    @Given("user enters office {string}")
    public void user_enters_office(String string) {

        WaitUtils.waitFor(2);
        dataTablesPage.office.sendKeys(string);
    }
    @Given("user enters extension {string}")
    public void user_enters_extension(String string) {

        WaitUtils.waitFor(2);
        dataTablesPage.extension.sendKeys(string);
    }
    @Given("user enters start date {string}")
    public void user_enters_start_date(String string) {

        WaitUtils.waitFor(2);
        dataTablesPage.startDate.sendKeys(string);
    }
    @Given("user enters the salary {string}")
    public void user_enters_the_salary(String string) {
        WaitUtils.waitFor(2);
        dataTablesPage.salary.sendKeys(string);
    }
    @Given("click on create button")
    public void click_on_create_button() {
        WaitUtils.waitFor(2);
        dataTablesPage.createButton.click();
    }
    @Given("search for the first name {string}")
    public void search_for_the_first_name(String string) {
        WaitUtils.waitFor(2);
        dataTablesPage.searchBox.sendKeys(string);

    }
    @Then("verify the name field contains the first name {string}")
    public void verify_the_name_field_contains_the_first_name(String string) {
        WaitUtils.waitFor(2);
        Assert.assertTrue(dataTablesPage.nameColumn.getText().contains(string));
    }

}