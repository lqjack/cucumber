package configuration;

import cucumber.api.CucumberOptions;
@CucumberOptions(plugin = {"pretty","json:target/"},features = {"src/main/java/fature"})
public class CucumberRunner {
	
}
