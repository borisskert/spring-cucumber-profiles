package de.borisskert.spring.feature.steps;

import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;

public class RealProfileSteps {

    @Autowired
    private Environment environment;

    @Given("Profile 'real' is active")
    public void profileRealIsActive() {
        assertThat(environment.getActiveProfiles(), arrayContaining("real"));
    }
}
