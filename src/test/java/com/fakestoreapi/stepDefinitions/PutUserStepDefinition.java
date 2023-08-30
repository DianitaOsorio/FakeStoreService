package com.fakestoreapi.stepDefinitions;

import com.fakestoreapi.questions.ServerResponse;
import com.fakestoreapi.tasks.PutUserTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class PutUserStepDefinition {
    private EnvironmentVariables environmentVariables;
    private String theRestApiBaseUrl;
    Actor user = Actor.named("user");
    @Before
    public void setUpBaseUrl() {
        theRestApiBaseUrl = environmentVariables.optionalProperty("restapi.baseurl")
                .orElse("https://fakestoreapi.com");
        user.whoCan(CallAnApi.at(theRestApiBaseUrl));

    }
    @When("I consume  endpoint {string} and I send the user information email {string}, username {string}, password {string}, firstname {string} ,lastname {string}")
    public void iConsumeEndpointAndISendTheUserInformationEmailUsernamePasswordFirstnameLastname(String string, String string2, String string3, String string4, String string5, String string6) {
        user.attemptsTo(
                PutUserTask.on()
        );
    }
    @Then("I can validate the response service {int}")
    public void iCanValidateTheResponseService(Integer resServer) {
        user.should(
                seeThat(
                        "The response code was: ",
                        ServerResponse.was(),
                        equalTo(resServer)
                )
        );
    }



}
