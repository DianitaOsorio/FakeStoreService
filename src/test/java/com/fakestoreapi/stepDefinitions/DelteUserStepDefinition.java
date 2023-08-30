package com.fakestoreapi.stepDefinitions;


import com.fakestoreapi.questions.DeleteResponse;
import com.fakestoreapi.tasks.DeleteUserTask;
import com.fakestoreapi.utils.Data;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;
import io.cucumber.java.en.*;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class DelteUserStepDefinition {
    private EnvironmentVariables environmentVariables;
    private String theRestApiBaseUrl;
    Actor user = Actor.named("user");

    @Before
    public void setUpBaseUrl() {
        theRestApiBaseUrl = environmentVariables.optionalProperty("restapi.baseurl")
                .orElse("https://fakestoreapi.com");

        user.whoCan(CallAnApi.at(theRestApiBaseUrl));
}
        @When("I consume the endpoint {string} and I send the user information id {string}")
        public void iConsumeTheEndpointAndISendTheUserInformationId(String string, String string2) {
            user.attemptsTo(
                    DeleteUserTask.on()
            );

        }
        @Then("I can validate response service {int}")
        public void iCanValidateResponseService(Integer int1) {
            Map<String, String> data = Data.extractTo().get(0);
            user.should(
                    seeThat("The server response was",
                            res-> DeleteResponse.was().answeredBy(user).getPhone(),
                            equalTo(data.get("Telefono"))
                    )
            );


        }

}

