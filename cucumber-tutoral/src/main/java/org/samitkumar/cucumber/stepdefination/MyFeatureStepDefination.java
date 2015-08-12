package org.samitkumar.cucumber.stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFeatureStepDefination {
	
	@Given("^this is my first step$")
	public void this_is_my_first_step() throws Throwable {
		System.out.println("this is my first step  - working fine");
	}

	@When("^THis is my second step$")
	public void this_is_my_second_step() throws Throwable {
		System.out.println("THis is my second step - working fine");
	}

	@Then("^THis is my final step$")
	public void this_is_my_final_step() throws Throwable {
		System.out.println("THis is my final step - working fine");
	}
}
