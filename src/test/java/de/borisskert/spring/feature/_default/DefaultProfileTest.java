package de.borisskert.spring.feature._default;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = "classpath:features/default",
        plugin = {"pretty", "html:target/cucumber"},
        extraGlue = "de.borisskert.spring.feature.common"
)
public class DefaultProfileTest {
}
