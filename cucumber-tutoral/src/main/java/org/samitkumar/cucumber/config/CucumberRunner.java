package org.samitkumar.cucumber.config;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			plugin = {"pretty","json:target/"},
			features = {"src/main/java"}
		)
public class CucumberRunner {

}
