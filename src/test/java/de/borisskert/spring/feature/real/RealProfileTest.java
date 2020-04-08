package de.borisskert.spring.feature.real;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = "classpath:features/real",
        plugin = {"pretty", "html:target/cucumber"},
        extraGlue = "de.borisskert.spring.feature.common"
)
public class RealProfileTest {
}
