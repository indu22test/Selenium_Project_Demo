@Register

Feature: register
  
 @TC_reg_01
 Scenario Outline: User registration
    Given The user opens Register Page
    When The user clicks "Register" button with all fields empty
    Then It should display an error "Please fill out this field" below Username textbox

@TC_reg_02
Scenario Outline: User registration
    Given The user opens Register Page
    When The user clicks "Register" button after entering Username with other fields empty
    Then It should display an error "Please fill out this field" below Password textbox

@TC_reg_03
Scenario Outline: User registration
    Given The user opens Register Page
    When The user clicks "Register" button after entering Username and password with Password Confirmation field empty
    Then It should display an error "Please fill out this field" below Password Confirmation textbox

@TC_reg_04
Scenario Outline: User registration
    Given The user opens Register Page
    When The user enters a name with characters other than Letters, digits and @/./+/-/_
    Then It should display an error message "Please enter a valid username"
   
@TC_reg_05
Scenario Outline: User registration
    Given The user opens Register Page
    When The user clicks "Register" button after entering different passwords in Password and Password Confirmation fields 
    Then It should display an error message "password_mismatch:The two password fields didn’t match."
   
@TC_reg_06
Scenario Outline: User registration
    Given The user opens Register Page
    When The user enters a Password with characters less than 8
    Then It should display an error message "Password should contain atleast 8 characters"
  
@TC_reg_07
Scenario Outline: User registration
    Given The user opens Register Page
    When The user enters a Password with only numbers
    Then  It should display an error message "Password cannot be entirely numeric"
    
@TC_reg_08
Scenario Outline: User registration
    Given The user opens Register Page
    When The user enters username, matching password and password confirmation and clicks the register button
    Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as <username>"
   
    
    
    
