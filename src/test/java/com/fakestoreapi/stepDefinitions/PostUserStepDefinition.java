package com.fakestoreapi.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

public class PostUserStepDefinition {
    private EnvironmentVariables environmentVariables;
    private String theRestApiBaseUrl;
    Actor user= Actor.named("user");

    @Before
    public void setUpBaseUrl() {
        theRestApiBaseUrl = environmentVariables.optionalProperty("restapi.baseurl")
                .orElse("https://fakestoreapi.com");
        user.whoCan(CallAnApi.at(theRestApiBaseUrl));
    }

    @When("I consume the endpoint {string} and I send the user information email {string}, username {string}, password {string}, firstname {string} ,lastname {string}")
    public void iConsumeTheEndpointAndISendTheUserInformationEmailUsernamePasswordFirstnameLastname(String string, String string2, String string3, String string4, String string5, String string6) {

    }
    @Then("I can validate the response services {int}")
    public void iCanValidateTheResponseServices(Integer int1) {

    }

}
