package cucumber_practice;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\QA\\AT Project\\src\\test\\java\\cucumber_practice\\features\\", glue = {"MyStepdefs"})

public class Runner {
}




