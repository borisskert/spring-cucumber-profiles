Feature: My Feature

  Scenario: Get my text with debug profile
    Given The application is running with 'debug' profile
    When I ask for my text
    Then I should get 'This is for debug'
