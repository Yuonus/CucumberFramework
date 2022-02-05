package step_definitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonLoginPage;
import utilities.Driver;
import utilities.PropertiesReader;

public class AmazonLoginSteps {

	AmazonLoginPage amazonlp = new AmazonLoginPage();
	
	@Given("I am on the amazon home page")
	public void i_am_on_the_amazon_home_page() {
		Driver.getDriver().get(PropertiesReader.getProperty("amazonUrl"));
		System.out.println("It took me to the amazon homepage");
	}
	
	@Given("The sign in button displays")
	public void the_sign_in_button_displays() {
		Assert.assertTrue(amazonlp.signinBtn.isDisplayed());
		System.out.println("Sign in button was there");
	}
	
	@When("I click the sign in button")
	public void i_click_the_sign_in_button() {
		amazonlp.signinBtn.click();
		System.out.println("I could click on sign in button ");
	}
	
	@Then("I should be directed to log in page")
	public void i_should_be_directed_to_log_in_page() {
		Assert.assertTrue(amazonlp.emailBox.isDisplayed());
		System.out.println("I am landed on login page");	}
	
	//Invalid User test #STARTS

	@Given("the user is on the amazon log in page")
	public void the_user_is_on_the_amazon_log_in_page() {
		Driver.getDriver().get(PropertiesReader.getProperty("amazonUrl"));
		amazonlp.signinBtn.click();
		Assert.assertTrue(amazonlp.emailBox.isDisplayed());
	}

	@When("the user enter an invalid email {string}")
	public void the_user_enter_an_invalid_email(String email) {
		amazonlp.emailBox.sendKeys(email);

	}

	@When("the user click on the continue button")
	public void the_user_click_on_the_continue_button() {
		amazonlp.continueBtn.click();

	}

	@Then("the user should get the error message, that says {string}")
	public void the_user_should_get_the_error_message_that_says(String expectedErrorMessage) {
		Assert.assertTrue(amazonlp.errorMessage.isDisplayed());
		String actualText = amazonlp.errorMessage.getText().trim();
		Assert.assertEquals(actualText, expectedErrorMessage);
	}

	@Then("the user should not be directed to the password field")
	public void the_user_should_not_be_directed_to_the_password_field() {
		Assert.assertTrue(amazonlp.emailBox.isDisplayed());

	}

	// Invalid Test user #ENDS
}
