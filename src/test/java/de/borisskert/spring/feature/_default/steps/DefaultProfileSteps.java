package de.borisskert.spring.feature._default.steps;

import de.borisskert.spring.example.Application;
import de.borisskert.spring.feature.FeatureConfiguration;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyArray;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

@SpringBootTest(
        classes = {
                Application.class,
                FeatureConfiguration.class
        }
        , webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class DefaultProfileSteps {

    @Autowired
    private Environment environment;

    @Autowired
    private ApplicationContext applicationContext;

    @Given("The application is running with default profile")
    public void theApplicationIsRunningWithDebugProfile() {
        assertThat(applicationContext, is(notNullValue()));
        assertThat(environment.getActiveProfiles(), is(emptyArray()));
    }
}
