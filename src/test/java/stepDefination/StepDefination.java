package stepDefination;

import java.util.Collection;
import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class StepDefination {
	@Given("^User is on Netbanking landing page$")
	public void user_is_on_netbanking_landing_page() {
	    System.out.println("user_is_on_netbanking_landing_page");
	    
	}
	
	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() {
	    System.out.println("user_login_into_application_with_username_and_password");
		
	  
	}
	@Then("^Home page is populated$")
	public void home_page_is_populated() {
	  System.out.println("home_page_is_populated");
	   
	}
	@Then("^Cards are displayed$")
	public void cards_are_displayed() {
	System.out.println("cards_are_displayed");
	   
	}
	
	@When("User login into application with {string} and {string}")
	public void user_login_into_application_with_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("user_login_into_application_with_and(String string, String string2)");
	}
	@Then("Cards are not displayed")
	public void cards_are_not_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("cards_are_not_displayed");
	}
	@When("User sign up fallowing details")
	public void user_sign_up_fallowing_details(DataTable dataTable) {
		Iterable<String> obj=dataTable.asList();
		for (String o:obj)
		{
			System.out.println(o);
		}
		
		
		
	    throw new io.cucumber.java.PendingException();
	}

	@When("^User login in to application with (.+) and (.+)$")
	public void user_login_in_to_application_with_and(String string1, String string2) throws Exception
	{
		System.out.println(string1 +"  "+string2);
	}

	
	@Given("validate the browser")
	public void validate_the_browser() {
	   System.out.println("Validate the browser");
	}
	@When("Browser is triggered")
	public void browser_is_triggered() {
		System.out.println("browser is triggered");
	}
	@Then("check if browser is started")
	public void check_if_browser_is_started() {
		System.out.println("check if browser is started");
	    
	}

}
