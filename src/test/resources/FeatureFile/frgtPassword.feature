@smoke
Feature: To validate Forgot Password functionality of Facebook application

@greens 
  Scenario: To validate forget password
    Given User have to enter facebook through chrome Browser
    And user have to click forgot password
    When user have to enter email or phone number
    And User have to click login button
    Then user have to show credentials page
