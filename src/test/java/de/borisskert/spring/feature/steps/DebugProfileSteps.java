package de.borisskert.spring.feature.steps;

import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;

@ActiveProfiles("debug")
public class DebugProfileSteps {

    @Autowired
    private Environment environment;

    @Given("Profile 'debug' is active")
    public void profileDebugIsActive() {
        assertThat(environment.getActiveProfiles(), arrayContaining("debug"));
    }
}
