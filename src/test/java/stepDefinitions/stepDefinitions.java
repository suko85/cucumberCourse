package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Cucumber.class)
public class stepDefinitions {

    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("@Given -> deciding the browser to open");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
        System.out.println("@When -> Browser is triggered");
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
        System.out.println("@Then -> Checking if browser is started");
    }

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_NetBanking_landing_page() throws Throwable {
        System.out.println("@Given -> Navigated to login url");
    }

    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("@When -> " + strArg1 + " and " + strArg2 + " arguments.");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
       //home page validation
        System.out.println("@Then -> Validating home page");
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("@And -> " + arg1);
    }

    @When("^User sign up with foollowing details$")
    public void user_sign_up_with_foollowing_details(DataTable data) throws Throwable {
       List<List<String>> obj = data.raw();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));
    }

    @When("^User login in to application with username (.+) and password (.+)$")
    public void user_login_in_to_application_with_username_and_password(String username, String password) throws Throwable {
        System.out.println(username + " <--> " + password);
    }

}