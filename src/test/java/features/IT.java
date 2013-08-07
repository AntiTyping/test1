package features;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features={"classpath:features/Homepage.feature",})
public class IT {
}
