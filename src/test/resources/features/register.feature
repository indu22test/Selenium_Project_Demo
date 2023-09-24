Feature: Registration page functionality
  I want to test the functionality of the registration page

  Background: user navigate to registration page
    Given user opens DSportal app
    And user clicks get started button
    When user clicks registration button
    Then user navigates to register page
    
	@TC_reg_01
  Scenario: check if user can successfully register without filling fields
    When user clicks register button
    Then user should get an error message below username textbox

	@TC_reg_02
  Scenario: check if user can register successfully with only username
    And user enters valid username
    When user clicks button
    Then user should get an error message below password textbox

	@TC_reg_03
  Scenario: check if user can register successfully when only confirmatory password field is blank
    And the user enters valid username
    And user enters valid password
    When the user clicks register button
    Then user should get an error message below password confirmation box

	@TC_reg_04
  Scenario: check if user can register successfully when username has only symbols
    And user enters symbols as username
    And the user enters valid password and matching confirmatory password
    When the user clicks registration button
    Then user should get an error message
	
	@TC_reg_05
  Scenario: check is user can register successfully with different passwords
    And user enter valid username
    And user enters valid password and non-matching password
    When user click register button
    Then user should get error message

	@TC_reg_06
  Scenario: check if user can register successfully with less than 8 characters
    And the user enter valid username
    And user enters password and confirmation password less than 8 characters
    When user click registration button
    Then the user should get an error message

	@TC_reg_07
  Scenario: check if user can register successfully with numerical password
    And user enters username
    And user enters numerical password and confirmatory password
    When user click button
    Then user should get an error msg

	@TC_reg_08
  Scenario: user successfully registers
    And the user enters username
    And user enters valid password and matching confirmatory password
    When the user click button
    Then user should be redirected to homepage
