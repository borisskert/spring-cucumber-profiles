package de.borisskert.spring.feature.common.steps;

import de.borisskert.spring.feature.common.world.CucumberHttpClient;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

public class MyTextSteps {

    @Autowired
    private CucumberHttpClient httpClient;

    @When("I ask for my text")
    public void iAskForMyText() {
        httpClient.get("/my");
    }

    @Then("I should get {string}")
    public void iShouldGet(String text) {
        httpClient.verifyLatestStatus(HttpStatus.OK);
        httpClient.verifyLatestBodyIsEqualTo(text);
    }
}
