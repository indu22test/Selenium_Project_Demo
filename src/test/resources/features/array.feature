@array
Feature: array
  I want to use this feature to test the page functionality

  Background: user navigate to array page
    Given the user opens DSportal app
    And the user clicks get started button
    And user clicks the sign in link
    When user enters username and password
    And user clicks login button
    And user clicks array get started button
    Then user navigates to array page

  @TC_array_01
  Scenario: user navigates to arrays in python page
    When user clicks arrays in python link
    Then user should be redirected to arrays in python page
    When user clicks try here button
    Then user should be redirected to page with run button

  @TC_array_02
  Scenario: user navigates to arrays using list page
    When user clicks arrays using list link
    Then user should be redirected to arrays using list page
    When the user clicks try here button
    Then the user should be redirected to page with run button

  @TC_array_03
  Scenario: user navigates to basic operations in lists page
    When user clicks basic operations in lists link
    Then user should be redirected to basic operations in lists page
    When user click try here button
    Then user should be directed to page with run button

  @TC_array_04
  Scenario: user navigates to applications of array page
    When user clicks applications of array link
    Then user should be redirected to applications of array page
    When the user click try here button
    Then the user should be directed to page with run button

  @TC_array_05
  Scenario: user navigates to arrays in python page
    When the user clicks arrays in python link
    Then the user should be redirected to arrays in python page
    When user clicks practice questions link
    Then user should be redirected to practice questions page
    When user clicks search the array link
    Then user should be redirected to question page

  @TC_array_06
  Scenario: user navigates to arrays in python page
    When user click arrays in python link
    Then user should be directed to arrays in python page
    When the user clicks practice questions link
    Then the user should be redirected to practice questions page
    When user clicks max executive ones link
    Then the user should be redirected to question page

  @TC_array_07
  Scenario: user navigates to arrays in python page
    When the user click arrays in python link
    Then the user should be directed to arrays in python page
    When user click practice questions link
    Then user should be directed to practice questions page
    When user clicks find numbers with even number of digits link
    Then user should be directed to question page

  @TC_array_08
  Scenario: user navigates to arrays in python page
    When user clicks arrays in python
    Then user should be redirected to arrays in python with try it button
    When the user click practice questions link
    Then the user should be directed to practice questions page
    When user clicks squares of a sorted array link
    Then the user should be directed to question page
