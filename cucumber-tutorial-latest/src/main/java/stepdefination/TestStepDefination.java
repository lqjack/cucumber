package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepDefination {
	@Given("^My first test$")
	public void my_first_test() throws Throwable {
		System.out.println("HAY : My first test");
	}

	@When("^my second test$")
	public void my_second_test() throws Throwable {
		System.out.println("HAY : my second test");
	}

	@Then("^my last test$")
	public void my_last_test() throws Throwable {
		System.out.println("HAY : my last test");
	}

}
