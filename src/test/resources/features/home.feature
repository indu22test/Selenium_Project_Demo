@Home

Feature: DSPortal HomePage

I want to use this template for my feature file


Background: user navigated to homepage

Given  user open the application of DSPortalapp 

When   user click to get Started to open the hoempage of the application

Then user navigate to homepage


@testcase001

Scenario: user get an Alert Message in DataStructure button

When user clicks the Get Started button below the Datastructures-Introduction

Then user should get an Alert Message you are not logged in


@testcase002

Scenario: user get Alert Message in Dropdown

When user navigate to button from the DSportal homepage and select any options 

Then user should get an Alert Message you are not logged in 



@testcase003

Scenario: Display of Login page 

When user click to signin button from DSportal homepage

Then user should be directed to login page



@testcase004

Scenario: Display of Register page 

When user click to Register button from DSportal homepage

Then user should be directed to Register form










