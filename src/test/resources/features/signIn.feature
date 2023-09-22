@SignIn
Feature: signIn

@TC_SI_01
  Scenario Outline: User sign in
    Given The user opens sign in Page
    When The user clicks "Login" button with all fields empty
    Then It should display an error "Please fill out this field" below Username textbox
    
@TC_SI_02
  Scenario Outline: User sign in
    Given The user opens sign in Page
    When The user clicks "Login" button after entering Username with other fields empty
    Then It should display an error "Please fill out this field" below Password textbox

@TC_SI_03
  Scenario Outline: User sign in
    Given The user opens sign in Page
    When The user clicks "Login" button after entering wrong username and password
    Then It should display an error "Invalid Username and Password"

@TC_SI_04
  Scenario Outline: User sign in
    Given The user opens sign in Page
    When The user clicks "Login" button after entering correct username and password
    Then The user should be redirected to Home Page with the message "You are logged in" and with the user name on the top

@TC_SI_05
  Scenario Outline: User sign in
    Given The user is in the Sign in page
    When The user enters an invalid user id + password combination
    Then System should alert user "Please check your user id"

@TC_SI_06
  Scenario Outline: User sign in
    Given The user is in the Sign in page
    When The user enters an valid user id + invalid password
    Then System should alert user "Please check your password"
    



