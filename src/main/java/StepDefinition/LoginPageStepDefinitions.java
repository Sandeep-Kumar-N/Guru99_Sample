package StepDefinition;

import Utils.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Before;

public class LoginPageStepDefinitions extends TestBase {

    @Before()
    public void before_test(){
        System.out.println("----------------Begin------------------");
        System.out.println("-------LoginPageStepDefinitions--------");
        System.out.println("---------------------------------------");
    }

    @After()
    public void after_test(){
        System.out.println("---------------------------------------");
        System.out.println("-------LoginPageStepDefinitions--------");
        System.out.println("---------------End---------------------");

    }

    @Given("^User is in Login Page$")
    public void user_is_in_Login_Page(){
        Initialization();
    }

    @When("^UserName and Password fields are visible$")
    public void username_and_Password_fields_are_visible(){

    }

    @Then("^Enter username and password and Click on Login Button$")
    public void enter_username_and_password_and_Click_on_Login_Button(){

    }

    @Then("^Users Should be able to go HomePage$")
    public void users_Should_be_able_to_go_HomePage() {

    }
}
