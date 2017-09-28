package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import enums.Environments;
import org.junit.Assert;
import pageObject.Amaze;
import webDriver.Driver;

/**
 * Created by steveyoung on 05/09/2017.
 */
public class AmazeStepdefs {

    public static String environment;

    @Given("^I am on the Amaze Environment of \"([^\"]*)\"$")
    public void i_am_on_the_MEE_portal_for(String environment) throws Throwable {
        AmazeStepdefs.environment = environment;
        Driver.loadPage(Environments.getUrl());
        Driver.maximise();

        if (environment=="UAT") {
            System.out.println(environment);

        }
    }


    @And("^I login to Amaze with credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iLoginToAmazeWithCredentialsAnd(String name, String password) throws Throwable {
        Amaze amaze = new Amaze();
        amaze.AmazeUATUserName().sendKeys(name);
        amaze.AmazeUATPassword().sendKeys(password);
        amaze.AmazeUATLogin().click();
    }

    @Then("^I sign in to My Account with credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iSignInToMyAccountWithCredentialsAnd(String email, String password) throws Throwable {
        Amaze amaze = new Amaze();
        amaze.AmazeUATLSignInRegisterLink().click();
        amaze.AmazeUATLEmailAddress().sendKeys(email);
        amaze.AmazeUATLEmailPassword().sendKeys(password);
        amaze.AmazeUATLEmailSignIn().click();
    }

    @And("^I choose an Outgoing Station of \"([^\"]*)\"$")
    public void iChooseAnOutgoingStationOf(String outgoing) throws Throwable {
        Amaze amaze = new Amaze();
        amaze.OutgoingStation().sendKeys(outgoing);
    }

    @And("^I choose an Inbound Station of \"([^\"]*)\"$")
    public void iChooseAnInboundStationOf(String inbound) throws Throwable {
        Amaze amaze = new Amaze();
        amaze.InboundStation().click();
        amaze.InboundStation().sendKeys(inbound);
    }

    @Then("^I select Find Trains button$")
    public void iSelectFindTrainsButton() throws Throwable {
        Amaze amaze = new Amaze();
        amaze.FindTrainsButton().click();
    }
}


