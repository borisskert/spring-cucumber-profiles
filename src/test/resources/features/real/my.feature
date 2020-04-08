Feature: My Feature

  Scenario: Get my text with real profile
    Given The application is running with 'real' profile
    When I ask for my text
    Then I should get 'This is for real!'
