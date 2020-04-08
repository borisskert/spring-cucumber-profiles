package de.borisskert.spring.feature.steps;

import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyArray;
import static org.hamcrest.Matchers.is;

public class DefaultProfileSteps {

    @Autowired
    private Environment environment;

    @And("No profile is active")
    public void noProfileIsActive() {
        assertThat(environment.getActiveProfiles(), is(emptyArray()));
    }
}
