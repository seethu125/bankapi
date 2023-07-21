package com.bank.api;

import io.cucumber.java.en.When;

public class BankControllerStepDefinitions extends ApiIntegrationTest{
	
	
	    String response = null;
	    String url = DEFAULT_URL ;

	    @When("the client calls \\\\/}")
	    public void the_client_calls_arithmetic_add_with_values_and() {
	        response = restTemplate.getForObject(url, String.class);
	    }

}
