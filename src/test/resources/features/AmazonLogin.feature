#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regression
Feature: Amazon Login
I want to be able to login with a valid credentials.
I should not be logged in with invalid credentials.

  @amazonLogin @SmokeTests
  Scenario: User should be directed to log in page
  Given I am on the amazon home page
  And The sign in button displays
  When I click the sign in button
  Then I should be directed to log in page

  @amazonlogin @amazonInvalidUser
  Scenario: User should not be drirected to the password field
  Given the user is on the amazon log in page
  When the user enter an invalid email "jon.dow@gmail.com"
  And the user click on the continue button
  Then the user should get the error message, that says "We cannot find an account with that email address"
  And the user should not be directed to the password field
   
  