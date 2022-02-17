package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Driver;
import utilities.PropertiesReader;

public class TradeAppTrades {

	@Given("I am on the Trade App log in page")
	public void i_am_on_the_trade_app_log_in_page() {
		
	}
	
	@When("I enter username {string} password {string}")
	public void i_enter_username_password(String username, String pasword) {
		
	    
	}
	@When("I click on Trade login button")
	public void i_click_on_trade_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("I should be on Trade home page")
	public void i_should_be_on_trade_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("I click on Add Trade button")
	public void i_click_on_add_trade_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("I should be on Add Save Trade page")
	public void i_should_be_on_add_save_trade_page() {
	    
	}
	@When("I select {string} and I enter symbol {string} entryDate {string} entryPrice {string} exitDate {string} exitPrice {string}")
	public void i_select_and_i_enter_symbol_entry_date_entry_price_exit_date_exit_price(String buyOrsell, String symbol, String entryDate, String entryPrice, String exitDate, String exitPrice) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("I click Save button")
	public void i_click_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("The trade is displayed on the trade table")
	public void the_trade_is_displayed_on_the_trade_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
