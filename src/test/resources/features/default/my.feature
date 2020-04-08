Feature: My Feature

  Scenario: Get my text with default profile
    Given The application is running with default profile
    When I ask for my text
    Then I should get 'This is default'
