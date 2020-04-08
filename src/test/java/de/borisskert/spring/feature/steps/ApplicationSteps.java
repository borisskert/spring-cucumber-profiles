package de.borisskert.spring.feature.steps;

import de.borisskert.spring.example.Application;
import de.borisskert.spring.feature.FeatureConfiguration;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.DirtiesContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

@SpringBootTest(
        classes = {
                Application.class,
                FeatureConfiguration.class
        }
        , webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
@DirtiesContext
public class ApplicationSteps {

    @Autowired
    private ApplicationContext applicationContext;

    @Given("The application is running")
    public void theApplicationIsRunningWithDebugProfile() {
        assertThat(applicationContext, is(notNullValue()));
    }
}
