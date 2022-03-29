@regression
Feature: To validate Login functionality of Facebook application

  Background: 
    Given User have to enter facebook through chrome Browser

  @sanity
  Scenario: 
     To validate login with invalid and valid values

    When User have to enter invalid email and valid password
      | username | Gowri            |
      | password |            45678 |
      | email    | greens@gmail.com |
    And User have to click login button
    Then user have to show credentials page

  @greens
  Scenario: 
    
    To validate login with valid and valid values

    When User have to enter valid emailadd and valid password
      | UserName | Email            | Password   |
      | Selenium | GreensTechnology |   12345678 |
      | java123  | python           |  908734566 |
      | manual   | Testing          | Automation |
    And User have to click login button
    Then user have to show credentials page
