@SignIN

Feature: Sign In Page

  I want to use this template for my feature file



  Background: 

    Given user open the application of DSPortalapp page
    When user click to get Started of DSPortalapp page
    When user click to sign in button from DSportal homepage
    Then user should be directed to login page



  @datadriven 

  Scenario Outline: Attempts login with specific credentials

    When user enters the user id as  "<User>" 
    When user enter  password as  "<Password1>" 
    And user click the login button 
    Then user should get an alert message of Invalid Username and Password



    Examples: 

      | User           | Password1    |
      
      | sheetal        | sheetalk1234 |
      | indu           | indu1234     |
      | priyanka       | priyankaa96  |
      | vivien         | vivien123669 |
      | soumya         | soumya1234   |

       